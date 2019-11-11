package com.youku.ott.openapi.sdk.response;

import com.youku.ott.openapi.sdk.OttOpenapiResponse;

import java.util.List;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午5:06 2019/8/22 Modifyby:
 **/
public class ShowIdServiceResponse extends OttOpenapiResponse {

    private ShowIdResultDTO value;

    private boolean success;

    private String detailMessage;

    public ShowIdResultDTO getValue() {
        return value;
    }

    public void setValue(ShowIdResultDTO value) {
        this.value = value;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getDetailMessage() {
        return detailMessage;
    }

    public void setDetailMessage(String detailMessage) {
        this.detailMessage = detailMessage;
    }

    public static class ShowIdResultDTO {
        private List<String> showIds;

        private Long offset;

        private Boolean hasNextPage;

        public List<String> getShowIds() {
            return showIds;
        }

        public void setShowIds(List<String> showIds) {
            this.showIds = showIds;
        }

        public Long getOffset() {
            return offset;
        }

        public void setOffset(Long offset) {
            this.offset = offset;
        }

        public Boolean getHasNextPage() {
            return hasNextPage;
        }

        public void setHasNextPage(Boolean hasNextPage) {
            this.hasNextPage = hasNextPage;
        }
    }

}
