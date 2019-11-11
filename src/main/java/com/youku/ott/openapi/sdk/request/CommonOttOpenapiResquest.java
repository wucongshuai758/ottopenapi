package com.youku.ott.openapi.sdk.request;

import com.youku.ott.openapi.sdk.OttOpenapiRequest;
import com.youku.ott.openapi.sdk.OttOpenapiResponse;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午12:12 2019/9/16 Modifyby:
 **/
public class CommonOttOpenapiResquest extends BaseOttOpenapiRequest implements OttOpenapiRequest<OttOpenapiResponse> {

    @Override
    public Class<OttOpenapiResponse> getResponseClass() {
        return OttOpenapiResponse.class;
    }
}
