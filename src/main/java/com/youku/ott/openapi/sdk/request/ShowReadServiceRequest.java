package com.youku.ott.openapi.sdk.request;

import com.youku.ott.openapi.sdk.OttOpenapiRequest;
import com.youku.ott.openapi.sdk.response.ShowReadServiceResponse;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午4:29 2019/8/22 Modifyby:
 **/
public class ShowReadServiceRequest  extends BaseOttOpenapiRequest  implements OttOpenapiRequest<ShowReadServiceResponse> {

    @Override
    public String getApiMethodName() {
        return "ott.vmac.showpage.get";
    }

    @Override
    public Class<ShowReadServiceResponse> getResponseClass() {
        return ShowReadServiceResponse.class;
    }
}
