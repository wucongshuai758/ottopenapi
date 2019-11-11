package com.youku.ott.openapi.sdk.request;

import com.youku.ott.openapi.sdk.OttOpenapiRequest;
import com.youku.ott.openapi.sdk.response.ShowInfoResponse;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午6:15 2019/8/22 Modifyby:
 **/
public class ShowInfoRequest extends BaseOttOpenapiRequest implements OttOpenapiRequest<ShowInfoResponse> {
    @Override
    public String getApiMethodName() {
        return "ott.vmac.showinfo.get";
    }

    @Override
    public Class<ShowInfoResponse> getResponseClass() {
        return ShowInfoResponse.class;
    }
}
