package com.ekenya.rnd.etourism.models;

public class HistoryItem {
    private int id;
    private String tripTitle;
    private int tripAmount;
    private String date;

    public HistoryItem(int id, String tripTitle, int tripAmount, String date) {
        this.id = id;
        this.tripTitle = tripTitle;
        this.tripAmount = tripAmount;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTripTitle() {
        return tripTitle;
    }

    public void setTripTitle(String tripTitle) {
        this.tripTitle = tripTitle;
    }

    public int getTripAmount() {
        return tripAmount;
    }

    public void setTripAmount(int tripAmount) {
        this.tripAmount = tripAmount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
