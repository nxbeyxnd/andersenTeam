package ru.andersen.app.user_patterns.alexey.structural.facade.site.model;
/* 
17.01.2022: Alexey created this file inside the package: ru.andersen.app.user_patterns.alexey.structural.facade.site.model 
*/

public class SiteModel {
    private String title;
    private int siteId;
    private String logo;
    private String backgroundImg;
    private String adminOs;
    private String adminName;
    private String adminPass;
    private String tag;

    public SiteModel(String title, int siteId, String logo, String backgroundImg, String adminOs, String adminName, String adminPass, String tag) {
        this.title = title;
        this.siteId = siteId;
        this.logo = logo;
        this.backgroundImg = backgroundImg;
        this.adminOs = adminOs;
        this.adminName = adminName;
        this.adminPass = adminPass;
        this.tag = tag;
    }

    public SiteModel() {
    }

    public String getAdminPass() {
        return adminPass;
    }

    public void setAdminPass(String adminPass) {
        this.adminPass = adminPass;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSiteId() {
        return siteId;
    }

    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getBackgroundImg() {
        return backgroundImg;
    }

    public void setBackgroundImg(String backgroundImg) {
        this.backgroundImg = backgroundImg;
    }

    public String getAdminOs() {
        return adminOs;
    }

    public void setAdminOs(String adminOs) {
        this.adminOs = adminOs;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return "SiteModel{" +
                "\ntitle= " + title + '\n' +
                "url= " + siteId + '\n' +
                "logo= " + logo + '\n' +
                "backgroundImg= " + backgroundImg + '\n' +
                "adminIp= " + adminOs + '\n' +
                "adminName= " + adminName + '\n' +
                "tag= " + tag + "\n" + '}';
    }
}
