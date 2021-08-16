package com.ekenya.rnd.etourism.models;

public class LiveTrip {
    int background;
    String title;

    public LiveTrip(int background, String title) {
        this.background = background;
        this.title = title;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
