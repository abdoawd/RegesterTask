package com.example.abdulrahman.regestertask.beans;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abdulrahman on 7/16/2018.
 */

public class City {
    @SerializedName("countryId")
    private String countryId;

    @SerializedName("titleAR")
    private String titleAR;

    @SerializedName("titleEN")
    private String titleEN;

    @SerializedName("id")
    private String id;

    public City(String countryId, String titleAR, String titleEN, String id) {
        this.countryId = countryId;
        this.titleAR = titleAR;
        this.titleEN = titleEN;
        this.id = id;
    }

    public String getCountryId() {

        return countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getTitleAR() {
        return titleAR;
    }

    public void setTitleAR(String titleAR) {
        this.titleAR = titleAR;
    }

    public String getTitleEN() {
        return titleEN;
    }

    public void setTitleEN(String titleEN) {
        this.titleEN = titleEN;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
