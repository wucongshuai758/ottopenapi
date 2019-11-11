package com.youku.ott.openapi.sdk.exception;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:41 2019/8/21 Modifyby:
 **/
public class OttOpenapiException extends Exception {

    private static final long serialVersionUID = -238091758285157331L;

    private String            errCode;
    private String            errMsg;

    public OttOpenapiException() {
        super();
    }

    public OttOpenapiException(String message, Throwable cause) {
        super(message, cause);
    }

    public OttOpenapiException(String message) {
        super(message);
    }

    public OttOpenapiException(Throwable cause) {
        super(cause);
    }

    public OttOpenapiException(String errCode, String errMsg) {
        super(errCode + ":" + errMsg);
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public String getErrCode() {
        return this.errCode;
    }

    public String getErrMsg() {
        return this.errMsg;
    }

}
