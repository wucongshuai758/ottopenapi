package com.youku.ott.openapi.sdk.request;

import com.youku.ott.openapi.sdk.OttOpenapiRequest;
import com.youku.ott.openapi.sdk.response.ChangeMessageResponse;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午6:21 2019/8/22 Modifyby:
 **/
public class ChangeMessageRequest extends BaseOttOpenapiRequest implements OttOpenapiRequest<ChangeMessageResponse> {
    @Override
    public String getApiMethodName() {
        return "ott.vmac.changemessage.get";
    }

    @Override
    public Class<ChangeMessageResponse> getResponseClass() {
        return ChangeMessageResponse.class;
    }
}
