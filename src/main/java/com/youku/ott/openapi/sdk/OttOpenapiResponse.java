package com.youku.ott.openapi.sdk;

import java.io.Serializable;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:12 2019/8/21 Modifyby:
 **/
public class OttOpenapiResponse implements Serializable {
    private static final long   serialVersionUID = 5014379068811962022L;

    private String code;

    private String msg;

    private String traceId;

    private String subCode;

    private String subMsg;

    private Object bizResp;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSubCode() {
        return subCode;
    }

    public void setSubCode(String subCode) {
        this.subCode = subCode;
    }

    public String getSubMsg() {
        return subMsg;
    }

    public void setSubMsg(String subMsg) {
        this.subMsg = subMsg;
    }

    public Object getBizResp() {
        return bizResp;
    }

    public void setBizResp(Object bizResp) {
        this.bizResp = bizResp;
    }
}
