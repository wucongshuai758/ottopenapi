package com.youku.ott.openapi.sdk.response;

import com.youku.ott.openapi.sdk.OttOpenapiResponse;

import java.util.List;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午9:16 2019/8/21 Modifyby:
 **/
public class HelloServiceResponse extends OttOpenapiResponse {
    private List<String> key;

    public List<String> getKey() {
        return key;
    }

    public void setKey(List<String> key) {
        this.key = key;
    }
}
