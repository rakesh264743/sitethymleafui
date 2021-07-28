package com.site.ui.entities;

import java.util.Date;

public class Site {
    private int siteid ;
    private String sitename;
    private int feeds;
    private int counties;
    private String status;
    //private Date date;


    public Site(int siteid, String sitename, int feeds, int counties, String status) {
        super();
        this.siteid = siteid;
        this.sitename = sitename;
        this.feeds = feeds;
        this.counties = counties;
        this.status = status;
    }

    public Site() {
        super();
    }

    public int getSiteid() {
        return siteid;
    }

    public void setSiteid(int siteid) {
        this.siteid = siteid;
    }

    public String getSitename() {
        return sitename;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public int getFeeds() {
        return feeds;
    }

    public void setFeeds(int feeds) {
        this.feeds = feeds;
    }

    public int getCounties() {
        return counties;
    }

    public void setCounties(int counties) {
        this.counties = counties;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Site{" +
                "siteid=" + siteid +
                ", sitename='" + sitename + '\'' +
                ", feeds=" + feeds +
                ", counties=" + counties +
                ", status='" + status + '\'' +
                '}';
    }
}
