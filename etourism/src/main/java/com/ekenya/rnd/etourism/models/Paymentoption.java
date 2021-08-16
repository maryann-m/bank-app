package com.ekenya.rnd.etourism.models;

public class Paymentoption {
    int icon;
    String option;

    public Paymentoption(int icon, String option) {
        this.icon = icon;
        this.option = option;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }
}
