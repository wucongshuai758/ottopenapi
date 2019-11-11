package com.youku.ott.openapi.sdk.response;

import com.youku.ott.openapi.sdk.OttOpenapiResponse;

import java.util.Date;
import java.util.List;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午6:17 2019/8/22 Modifyby:
 **/
public class ChangeMessageResponse extends OttOpenapiResponse {

    private MediaMessagePageResultDTO value;

    private boolean success;

    private String detailMessage;

    public MediaMessagePageResultDTO getValue() {
        return value;
    }

    public void setValue(MediaMessagePageResultDTO value) {
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

    public static class MediaMessagePageResultDTO {
        private Long minOffset;

        private Long maxOffset;

        private List<MediaMessageOuterDTO> messageList;

        private Long offset;

        private Boolean hasNextPage;

        public Long getMinOffset() {
            return minOffset;
        }

        public void setMinOffset(Long minOffset) {
            this.minOffset = minOffset;
        }

        public Long getMaxOffset() {
            return maxOffset;
        }

        public void setMaxOffset(Long maxOffset) {
            this.maxOffset = maxOffset;
        }

        public List<MediaMessageOuterDTO> getMessageList() {
            return messageList;
        }

        public void setMessageList(
            List<MediaMessageOuterDTO> messageList) {
            this.messageList = messageList;
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

    public static class MediaMessageOuterDTO {
        private Long offset;

        private String type;

        private String showId;

        private String videoSourceType;

        private String videoId;

        private Date timeStamp;

        public Long getOffset() {
            return offset;
        }

        public void setOffset(Long offset) {
            this.offset = offset;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getShowId() {
            return showId;
        }

        public void setShowId(String showId) {
            this.showId = showId;
        }

        public String getVideoSourceType() {
            return videoSourceType;
        }

        public void setVideoSourceType(String videoSourceType) {
            this.videoSourceType = videoSourceType;
        }

        public String getVideoId() {
            return videoId;
        }

        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }

        public Date getTimeStamp() {
            return timeStamp;
        }

        public void setTimeStamp(Date timeStamp) {
            this.timeStamp = timeStamp;
        }
    }
}
