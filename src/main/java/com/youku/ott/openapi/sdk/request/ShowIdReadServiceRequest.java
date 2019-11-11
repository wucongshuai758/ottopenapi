package com.youku.ott.openapi.sdk.request;

import com.youku.ott.openapi.sdk.OttOpenapiRequest;
import com.youku.ott.openapi.sdk.response.ShowIdServiceResponse;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:08 2019/8/22 Modifyby:
 **/
public class ShowIdReadServiceRequest extends BaseOttOpenapiRequest implements OttOpenapiRequest<ShowIdServiceResponse> {

    @Override
    public String getApiMethodName() {
        return "ott.vmac.showid.get";
    }

    @Override
    public Class<ShowIdServiceResponse> getResponseClass() {
        return ShowIdServiceResponse.class;
    }
}
