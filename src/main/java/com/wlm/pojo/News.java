package com.wlm.pojo;

public class News {
    private Integer newsid;

    private String newTitle;

    private String newImg;

    private String memuTitle;

    private String createTime;

    private String updateTime;

    private String newContent;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewTitle() {
        return newTitle;
    }

    public void setNewTitle(String newTitle) {
        this.newTitle = newTitle == null ? null : newTitle.trim();
    }

    public String getNewImg() {
        return newImg;
    }

    public void setNewImg(String newImg) {
        this.newImg = newImg == null ? null : newImg.trim();
    }

    public String getMemuTitle() {
        return memuTitle;
    }

    public void setMemuTitle(String memuTitle) {
        this.memuTitle = memuTitle == null ? null : memuTitle.trim();
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

    public String getNewContent() {
        return newContent;
    }

    public void setNewContent(String newContent) {
        this.newContent = newContent == null ? null : newContent.trim();
    }
}