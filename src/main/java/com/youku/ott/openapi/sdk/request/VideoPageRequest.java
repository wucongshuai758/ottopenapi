package com.youku.ott.openapi.sdk.request;

import com.youku.ott.openapi.sdk.OttOpenapiRequest;
import com.youku.ott.openapi.sdk.response.VideoPageResponse;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午7:15 2019/8/22 Modifyby:
 **/
public class VideoPageRequest extends BaseOttOpenapiRequest  implements OttOpenapiRequest<VideoPageResponse> {
    @Override
    public String getApiMethodName() {
        return "ott.vmac.videopage.get";
    }

    @Override
    public Class<VideoPageResponse> getResponseClass() {
        return VideoPageResponse.class;
    }
}
