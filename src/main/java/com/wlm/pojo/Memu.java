package com.wlm.pojo;

public class Memu {
    private Integer memuid;

    private Integer subid;

    private String title;

    private String url;

    private Integer memuRole;

    private String createTime;

    private String updateTime;

    public Integer getMemuid() {
        return memuid;
    }

    public void setMemuid(Integer memuid) {
        this.memuid = memuid;
    }

    public Integer getSubid() {
        return subid;
    }

    public void setSubid(Integer subid) {
        this.subid = subid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getMemuRole() {
        return memuRole;
    }

    public void setMemuRole(Integer memuRole) {
        this.memuRole = memuRole;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }
}