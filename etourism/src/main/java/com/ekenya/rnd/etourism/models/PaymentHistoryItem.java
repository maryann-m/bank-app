package com.ekenya.rnd.etourism.models;

public class PaymentHistoryItem {
    int logo;
    String merchant;
    String account;
    String amount;

    public PaymentHistoryItem(int logo, String merchant, String account, String amount) {
        this.logo = logo;
        this.merchant = merchant;
        this.account = account;
        this.amount = amount;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getMerchant() {
        return merchant;
    }

    public void setMerchant(String merchant) {
        this.merchant = merchant;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
