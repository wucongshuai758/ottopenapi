package com.youku.ott.openapi.sdk;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:29 2019/8/21 Modifyby:
 **/
public interface OttOpenapiRequest<T extends OttOpenapiResponse>  {

     String getApiMethodName();

     String getApiVersion();

     void setApiVersion(String apiVersion);

     Object getBizParam();

     void setBizParam(Object bizParam);
     /**
      * 获取具体响应实现类的定义。
      */
     public  Class<T> getResponseClass();
}
