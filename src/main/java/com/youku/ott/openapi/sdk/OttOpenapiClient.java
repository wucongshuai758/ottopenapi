package com.youku.ott.openapi.sdk;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:40 2019/8/21 Modifyby:
 **/
public interface OttOpenapiClient {
    public <T extends OttOpenapiResponse> T execute(OttOpenapiRequest<T> request) throws Exception;
}
