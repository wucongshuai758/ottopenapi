package com.youku.ott.openapi.sdk.request;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:10 2019/8/22 Modifyby:
 **/
public abstract class BaseOttOpenapiRequest {

    private String apiVersion = "1.0";

    private String apiMethodName;

    private Object bizParam;

    public String getApiMethodName() {
        return apiMethodName;
    }

    public void setApiMethodName(String apiMethodName) {
        this.apiMethodName = apiMethodName;
    }

    public Object getBizParam() {
        return bizParam;
    }

    public void setBizParam(Object bizParam) {
        this.bizParam = bizParam;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion  = apiVersion;
    }
}
