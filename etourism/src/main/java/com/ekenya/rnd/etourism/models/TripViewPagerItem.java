package com.ekenya.rnd.etourism.models;

public class TripViewPagerItem {
    int bg;
    String title;
    String region;
    String date;

    public TripViewPagerItem(int bg, String title, String region, String date) {
        this.bg = bg;
        this.title = title;
        this.region = region;
        this.date = date;
    }

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
