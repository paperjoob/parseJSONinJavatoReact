package com.jbsinternational.safeshop;

public class Recall {

    private String brand;
    private String company;
    private String date;
    private String productDescription;
    private String reason;
    private String url;

    // empty constructor
    public Recall() {

    }

    // constructor
    public Recall(String brand, String company, String date, String productDescription,
                  String reason, String url) {
        this.brand = brand;
        this.company = company;
        this.date = date;
        this.productDescription = productDescription;
        this.reason = reason;
        this.url = url;
    }

    // GETTERS
    public String getBrand() {
        return brand;
    }

    public String getCompany() {
        return company;
    }

    public String getDate() {
        return date;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public String getReason() {
        return reason;
    }

    public String getUrl() {
        return url;
    }
    // End Getters

    // SETTERS
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    // End Setters


//    @Override
//    public String toString() {
//        return "{" +
//                "Brand: " + this.brand +
//                ", Company: " + this.company +
//                ", Date: " + this.date +
//                ", Reason: " + this.reason +
//                ", Url: " + this.url;
//    }
}
