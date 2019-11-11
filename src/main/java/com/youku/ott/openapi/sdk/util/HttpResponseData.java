package com.youku.ott.openapi.sdk.util;

import java.util.List;
import java.util.Map;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午2:06 2019/8/22 Modifyby:
 **/
public class HttpResponseData {
    private String body;

    private Map<String, List<String>> headers;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Map<String, List<String>> getHeaders() {
        return headers;
    }

    public void setHeaders(Map<String, List<String>> headers) {
        this.headers = headers;
    }
}
