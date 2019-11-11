package com.youku.ott.openapi.sdk;

import com.alibaba.fastjson.JSON;
import com.youku.ott.openapi.sdk.util.HttpUtil;
import com.youku.ott.openapi.sdk.util.OttOpenapiSignatureUtil;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:47 2019/8/21 Modifyby:
 **/
public class DefaultOttOpenapiClient implements OttOpenapiClient {

    private String serverUrl;

    private String appKey;

    private String appSecret;

    private String signType;

    private List<String> baseFieldName = Arrays.asList("code", "msg", "traceId", "subCode", "subMsg", "bizResp");

    public DefaultOttOpenapiClient(String serverUrl, String appKey, String appSecret, String signType) {
        this.serverUrl = serverUrl;
        this.appKey = appKey;
        this.appSecret = appSecret;
        this.signType = signType;
    }

    @Override
    public <T extends OttOpenapiResponse> T execute(OttOpenapiRequest<T> request) throws Exception {
        T response = null;
        OttOpenapiResponse ottOpenapiResponse;
        try {
            String responStr = doPost(request);
            response = JSON.parseObject(responStr, request.getResponseClass());
            if (response.getBizResp() == null) {
                return response;
            }
            //如果返回的业务参数是Map
            else if (response.getBizResp() instanceof Map) {
                T tempResponse = JSON.parseObject(JSON.toJSONString(response.getBizResp()),
                    request.getResponseClass());
                tempResponse.setSubMsg(response.getSubMsg());
                tempResponse.setSubCode(response.getSubCode());
                tempResponse.setMsg(response.getMsg());
                tempResponse.setCode(response.getCode());
                tempResponse.setTraceId(response.getTraceId());
                tempResponse.setBizResp(response.getBizResp());
                return tempResponse;
            } else {
                Field[] fields = response.getClass().getDeclaredFields();
                for (Field field : fields) {
                    if (!baseFieldName.contains(field.getName())) {
                        if (field.getGenericType().toString().equals("class java.lang.String")) {
                            Method m = response.getClass().getMethod("set" + getMethodName(field.getName()),String.class);
                            m.invoke(response,response.getBizResp());
                        } else if (field.getGenericType().toString().equals("class java.lang.Long")) {
                            Method m = response.getClass().getMethod("set" + getMethodName(field.getName()),Long.class);
                            m.invoke(response,response.getBizResp());
                        } else if (field.getGenericType().toString().equals("class java.lang.Double")) {
                            Method m = response.getClass().getMethod("set" + getMethodName(field.getName()),Double.class);
                            m.invoke(response,response.getBizResp());
                        } else if (field.getGenericType().toString().equals("class java.lang.Float")) {
                            Method m = response.getClass().getMethod("set" + getMethodName(field.getName()),Float.class);
                            m.invoke(response,response.getBizResp());
                        } else if (field.getGenericType().toString().contains("java.util.List")) {
                            Method m = response.getClass().getMethod("set" + getMethodName(field.getName()),List.class);
                            m.invoke(response,response.getBizResp());
                        } else if (field.getGenericType().toString().equals("class java.lang.Object")) {
                            Method m = response.getClass().getMethod("set" + getMethodName(field.getName()),Object.class);
                            m.invoke(response,response.getBizResp());
                        }
                    }
                }
            }
            return response;
        } catch (Exception e) {
            throw e;
        }
    }

    private String doPost(OttOpenapiRequest request) throws Exception {
        Map<String, Object> param = new TreeMap<>();
        param.put("appKey", this.appKey);
        if (StringUtils.isBlank(signType)) {
            param.put("signType", "MD5");
        } else {
            param.put("signType", this.signType);
        }
        param.put("timestamp", System.currentTimeMillis() / 1000L);
        param.put("actionName", request.getApiMethodName());
        param.put("bizParam", request.getBizParam());
        if (StringUtils.isBlank(request.getApiVersion())) {
            param.put("version", request.getApiVersion());
        } else {
            param.put("version", "1.0");
        }
        String signStr = OttOpenapiSignatureUtil.getSignStr(param);
        signStr = OttOpenapiSignatureUtil.md5Sign(signStr,this.appSecret);
        param.put("sign", signStr);
        try {
           return HttpUtil.doOkHttpPostJson(serverUrl,JSON.toJSONString(param));
        } catch (Exception e) {
            throw e;
        }
    }

    private static String getMethodName(String fildeName) throws Exception {
        byte[] items = fildeName.getBytes();
        items[0] = (byte)((char)items[0] - 'a' + 'A');
        return new String(items);
    }

}
