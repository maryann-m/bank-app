package com.ekenya.rnd.etourism.models;

public class UpcomingTrip {
    private int bg;
    private int hearticon;
    private String tripTitle;
    private String date;

    public UpcomingTrip(int bg, int hearticon, String tripTitle, String date) {
        this.bg = bg;
        this.hearticon = hearticon;
        this.tripTitle = tripTitle;
        this.date = date;
    }

    public int getBg() {
        return bg;
    }

    public void setBg(int bg) {
        this.bg = bg;
    }

    public int getHearticon() {
        return hearticon;
    }

    public void setHearticon(int hearticon) {
        this.hearticon = hearticon;
    }

    public String getTripTitle() {
        return tripTitle;
    }

    public void setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
