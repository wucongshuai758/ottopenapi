package com.youku.ott.openapi.sdk.response;

import com.youku.ott.openapi.sdk.OttOpenapiResponse;

import java.util.List;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午6:24 2019/8/22 Modifyby:
 **/
public class VideoPageResponse extends OttOpenapiResponse {

    private VideoPageResultDTO value;
    private boolean success;
    private String detailMessage;

    public VideoPageResultDTO getValue() {
        return value;
    }

    public void setValue(VideoPageResultDTO value) {
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

    public static class VideoPageResultDTO {
        private List<VideoOuterDTO> videoList;
        private Long offset;
        private Boolean hasNextPage;

        public List<VideoOuterDTO> getVideoList() {
            return videoList;
        }

        public void setVideoList(List<VideoOuterDTO> videoList) {
            this.videoList = videoList;
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

    public static class VideoOuterDTO {
        private String videoId;

        private String sourceType;

        private String videoType;

        private Integer videoStage;

        private String showId;
        /**
         * 标题
         */
        private String title;
        /**
         * 推荐标题
         */
        private String rcTitle;
        /**
         * 分类
         */
        private String category;

        private String description;

        private String thumbUrl;
        private String smallThumbUrl;

        private Double duration;

        private Integer paid;

        private String sequence;

        private String status;

        private String webUrl;

        private String releaseDate;

        private List<String> licenseList;

        private List<String> languageList;

        private Boolean panorama;

        private List<String> definitionList;

        private String mediaUrl;

        private Long playFeature;

        private String tags;

        /**
         * 直播间信息
         */
        private String liveInfo;

        private Integer drm;

        /**
         * 可播状态，json数组，包含大屏和小屏状态
         */
        private String playState;
        /**
         * 启播参数
         */
        private String prepare;
        /**
         * 片头时间，秒
         */
        private String head;
        /**
         * 片尾时间，秒
         */
        private String tail;
        /**
         * 下载状态
         */
        private String downloadStatus;

        public String getVideoId() {
            return videoId;
        }

        public void setVideoId(String videoId) {
            this.videoId = videoId;
        }

        public String getSourceType() {
            return sourceType;
        }

        public void setSourceType(String sourceType) {
            this.sourceType = sourceType;
        }

        public String getVideoType() {
            return videoType;
        }

        public void setVideoType(String videoType) {
            this.videoType = videoType;
        }

        public Integer getVideoStage() {
            return videoStage;
        }

        public void setVideoStage(Integer videoStage) {
            this.videoStage = videoStage;
        }

        public String getShowId() {
            return showId;
        }

        public void setShowId(String showId) {
            this.showId = showId;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getRcTitle() {
            return rcTitle;
        }

        public void setRcTitle(String rcTitle) {
            this.rcTitle = rcTitle;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public String getSmallThumbUrl() {
            return smallThumbUrl;
        }

        public void setSmallThumbUrl(String smallThumbUrl) {
            this.smallThumbUrl = smallThumbUrl;
        }

        public Double getDuration() {
            return duration;
        }

        public void setDuration(Double duration) {
            this.duration = duration;
        }

        public Integer getPaid() {
            return paid;
        }

        public void setPaid(Integer paid) {
            this.paid = paid;
        }

        public String getSequence() {
            return sequence;
        }

        public void setSequence(String sequence) {
            this.sequence = sequence;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getWebUrl() {
            return webUrl;
        }

        public void setWebUrl(String webUrl) {
            this.webUrl = webUrl;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public List<String> getLicenseList() {
            return licenseList;
        }

        public void setLicenseList(List<String> licenseList) {
            this.licenseList = licenseList;
        }

        public List<String> getLanguageList() {
            return languageList;
        }

        public void setLanguageList(List<String> languageList) {
            this.languageList = languageList;
        }

        public Boolean getPanorama() {
            return panorama;
        }

        public void setPanorama(Boolean panorama) {
            this.panorama = panorama;
        }

        public List<String> getDefinitionList() {
            return definitionList;
        }

        public void setDefinitionList(List<String> definitionList) {
            this.definitionList = definitionList;
        }

        public String getMediaUrl() {
            return mediaUrl;
        }

        public void setMediaUrl(String mediaUrl) {
            this.mediaUrl = mediaUrl;
        }

        public Long getPlayFeature() {
            return playFeature;
        }

        public void setPlayFeature(Long playFeature) {
            this.playFeature = playFeature;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getLiveInfo() {
            return liveInfo;
        }

        public void setLiveInfo(String liveInfo) {
            this.liveInfo = liveInfo;
        }

        public Integer getDrm() {
            return drm;
        }

        public void setDrm(Integer drm) {
            this.drm = drm;
        }

        public String getPlayState() {
            return playState;
        }

        public void setPlayState(String playState) {
            this.playState = playState;
        }

        public String getPrepare() {
            return prepare;
        }

        public void setPrepare(String prepare) {
            this.prepare = prepare;
        }

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public String getTail() {
            return tail;
        }

        public void setTail(String tail) {
            this.tail = tail;
        }

        public String getDownloadStatus() {
            return downloadStatus;
        }

        public void setDownloadStatus(String downloadStatus) {
            this.downloadStatus = downloadStatus;
        }
    }
}
