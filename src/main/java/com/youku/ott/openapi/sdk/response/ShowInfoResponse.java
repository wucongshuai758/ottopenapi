package com.youku.ott.openapi.sdk.response;

import com.youku.ott.openapi.sdk.OttOpenapiResponse;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author 吴聪帅
 * @Description
 * @Date : 下午6:08 2019/8/22 Modifyby:
 **/
public class ShowInfoResponse extends OttOpenapiResponse {

    private SingleShowResultDTO value;

    private boolean success;

    private String detailMessage;

    public SingleShowResultDTO getValue() {
        return value;
    }

    public void setValue(SingleShowResultDTO value) {
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

    public static class SingleShowResultDTO {
        public ShowOuterDTO getShow() {
            return show;
        }

        public void setShow(ShowOuterDTO show) {
            this.show = show;
        }

        private ShowOuterDTO show;

    }

    public static class ShowOuterDTO {
        private String showId;

        private String title;

        private String description;

        private String category;

        private String subCategory;

        private String episodeCount;

        private String thumbUrl;
        private String smallThumbUrl;

        private String vthumbUrl;
        private String smallVthumbUrl;

        private String hugeThumbUrl;
        private String hugeVthumbUrl;

        private Boolean vod_fullprice;

        private String area;

        private Integer paid;

        private String tryType;

        private Integer tryTime;

        private Integer tryEpisodes;

        private String status;

        private String webUrl;

        private String keyword;

        private String releaseDate;

        private Integer price;

        private List<String> keywordList;

        private List<String> payTypeList;

        private List<String> languageList;

        private String tags;

        private String releasedateYouku;

        private List<String> licenseList;

        private List<String> checkStateList;

        private List<ShowReadServiceResponse.PersonOuterDTO> directorList;

        private List<ShowReadServiceResponse.PersonOuterDTO> starringList;

        private List<ShowReadServiceResponse.PersonOuterDTO> performerList;

        private List<ShowReadServiceResponse.PersonOuterDTO> guestList;

        private List<ShowReadServiceResponse.PersonOuterDTO> hostList;

        private List<String> alias;

        private BigDecimal reputation;

        private String youkuRating;

        private Boolean exclusive;

        private String licenseNum;

        private Boolean vodTicket;

        private String showKind;

        private Boolean completed;

        private String liveid;
        /**
         * 可播状态，json数组，包含大屏和小屏状态
         */
        private String playState;

        private String subTitle;

        private String updateNotice;

        private Integer episodeLast;

        private String ageGroup;

        private Integer kidsAgeMax;

        private Integer kidsAgeMin;

        private List<ShowMaterialDTO> materials;

        private String distributor;

        private String production;

        private Long programId;

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

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getSubCategory() {
            return subCategory;
        }

        public void setSubCategory(String subCategory) {
            this.subCategory = subCategory;
        }

        public String getEpisodeCount() {
            return episodeCount;
        }

        public void setEpisodeCount(String episodeCount) {
            this.episodeCount = episodeCount;
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

        public String getVthumbUrl() {
            return vthumbUrl;
        }

        public void setVthumbUrl(String vthumbUrl) {
            this.vthumbUrl = vthumbUrl;
        }

        public String getSmallVthumbUrl() {
            return smallVthumbUrl;
        }

        public void setSmallVthumbUrl(String smallVthumbUrl) {
            this.smallVthumbUrl = smallVthumbUrl;
        }

        public String getHugeThumbUrl() {
            return hugeThumbUrl;
        }

        public void setHugeThumbUrl(String hugeThumbUrl) {
            this.hugeThumbUrl = hugeThumbUrl;
        }

        public String getHugeVthumbUrl() {
            return hugeVthumbUrl;
        }

        public void setHugeVthumbUrl(String hugeVthumbUrl) {
            this.hugeVthumbUrl = hugeVthumbUrl;
        }

        public Boolean getVod_fullprice() {
            return vod_fullprice;
        }

        public void setVod_fullprice(Boolean vod_fullprice) {
            this.vod_fullprice = vod_fullprice;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public Integer getPaid() {
            return paid;
        }

        public void setPaid(Integer paid) {
            this.paid = paid;
        }

        public String getTryType() {
            return tryType;
        }

        public void setTryType(String tryType) {
            this.tryType = tryType;
        }

        public Integer getTryTime() {
            return tryTime;
        }

        public void setTryTime(Integer tryTime) {
            this.tryTime = tryTime;
        }

        public Integer getTryEpisodes() {
            return tryEpisodes;
        }

        public void setTryEpisodes(Integer tryEpisodes) {
            this.tryEpisodes = tryEpisodes;
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

        public String getKeyword() {
            return keyword;
        }

        public void setKeyword(String keyword) {
            this.keyword = keyword;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public Integer getPrice() {
            return price;
        }

        public void setPrice(Integer price) {
            this.price = price;
        }

        public List<String> getKeywordList() {
            return keywordList;
        }

        public void setKeywordList(List<String> keywordList) {
            this.keywordList = keywordList;
        }

        public List<String> getPayTypeList() {
            return payTypeList;
        }

        public void setPayTypeList(List<String> payTypeList) {
            this.payTypeList = payTypeList;
        }

        public List<String> getLanguageList() {
            return languageList;
        }

        public void setLanguageList(List<String> languageList) {
            this.languageList = languageList;
        }

        public String getTags() {
            return tags;
        }

        public void setTags(String tags) {
            this.tags = tags;
        }

        public String getReleasedateYouku() {
            return releasedateYouku;
        }

        public void setReleasedateYouku(String releasedateYouku) {
            this.releasedateYouku = releasedateYouku;
        }

        public List<String> getLicenseList() {
            return licenseList;
        }

        public void setLicenseList(List<String> licenseList) {
            this.licenseList = licenseList;
        }

        public List<String> getCheckStateList() {
            return checkStateList;
        }

        public void setCheckStateList(List<String> checkStateList) {
            this.checkStateList = checkStateList;
        }

        public List<ShowReadServiceResponse.PersonOuterDTO> getDirectorList() {
            return directorList;
        }

        public void setDirectorList(
            List<ShowReadServiceResponse.PersonOuterDTO> directorList) {
            this.directorList = directorList;
        }

        public List<ShowReadServiceResponse.PersonOuterDTO> getStarringList() {
            return starringList;
        }

        public void setStarringList(
            List<ShowReadServiceResponse.PersonOuterDTO> starringList) {
            this.starringList = starringList;
        }

        public List<ShowReadServiceResponse.PersonOuterDTO> getPerformerList() {
            return performerList;
        }

        public void setPerformerList(
            List<ShowReadServiceResponse.PersonOuterDTO> performerList) {
            this.performerList = performerList;
        }

        public List<ShowReadServiceResponse.PersonOuterDTO> getGuestList() {
            return guestList;
        }

        public void setGuestList(List<ShowReadServiceResponse.PersonOuterDTO> guestList) {
            this.guestList = guestList;
        }

        public List<ShowReadServiceResponse.PersonOuterDTO> getHostList() {
            return hostList;
        }

        public void setHostList(List<ShowReadServiceResponse.PersonOuterDTO> hostList) {
            this.hostList = hostList;
        }

        public List<String> getAlias() {
            return alias;
        }

        public void setAlias(List<String> alias) {
            this.alias = alias;
        }

        public BigDecimal getReputation() {
            return reputation;
        }

        public void setReputation(BigDecimal reputation) {
            this.reputation = reputation;
        }

        public String getYoukuRating() {
            return youkuRating;
        }

        public void setYoukuRating(String youkuRating) {
            this.youkuRating = youkuRating;
        }

        public Boolean getExclusive() {
            return exclusive;
        }

        public void setExclusive(Boolean exclusive) {
            this.exclusive = exclusive;
        }

        public String getLicenseNum() {
            return licenseNum;
        }

        public void setLicenseNum(String licenseNum) {
            this.licenseNum = licenseNum;
        }

        public Boolean getVodTicket() {
            return vodTicket;
        }

        public void setVodTicket(Boolean vodTicket) {
            this.vodTicket = vodTicket;
        }

        public String getShowKind() {
            return showKind;
        }

        public void setShowKind(String showKind) {
            this.showKind = showKind;
        }

        public Boolean getCompleted() {
            return completed;
        }

        public void setCompleted(Boolean completed) {
            this.completed = completed;
        }

        public String getLiveid() {
            return liveid;
        }

        public void setLiveid(String liveid) {
            this.liveid = liveid;
        }

        public String getPlayState() {
            return playState;
        }

        public void setPlayState(String playState) {
            this.playState = playState;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public String getUpdateNotice() {
            return updateNotice;
        }

        public void setUpdateNotice(String updateNotice) {
            this.updateNotice = updateNotice;
        }

        public Integer getEpisodeLast() {
            return episodeLast;
        }

        public void setEpisodeLast(Integer episodeLast) {
            this.episodeLast = episodeLast;
        }

        public String getAgeGroup() {
            return ageGroup;
        }

        public void setAgeGroup(String ageGroup) {
            this.ageGroup = ageGroup;
        }

        public Integer getKidsAgeMax() {
            return kidsAgeMax;
        }

        public void setKidsAgeMax(Integer kidsAgeMax) {
            this.kidsAgeMax = kidsAgeMax;
        }

        public Integer getKidsAgeMin() {
            return kidsAgeMin;
        }

        public void setKidsAgeMin(Integer kidsAgeMin) {
            this.kidsAgeMin = kidsAgeMin;
        }

        public List<ShowMaterialDTO> getMaterials() {
            return materials;
        }

        public void setMaterials(List<ShowMaterialDTO> materials) {
            this.materials = materials;
        }

        public String getDistributor() {
            return distributor;
        }

        public void setDistributor(String distributor) {
            this.distributor = distributor;
        }

        public String getProduction() {
            return production;
        }

        public void setProduction(String production) {
            this.production = production;
        }

        public Long getProgramId() {
            return programId;
        }

        public void setProgramId(Long programId) {
            this.programId = programId;
        }
    }

    public static class ShowMaterialDTO {
        private String url;

        private Date updateTime;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Date getUpdateTime() {
            return updateTime;
        }

        public void setUpdateTime(Date updateTime) {
            this.updateTime = updateTime;
        }
    }
}
