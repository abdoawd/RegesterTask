package com.example.abdulrahman.regestertask.beans;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abdulrahman on 7/16/2018.
 */

public class Model {
    @SerializedName("CurrencyId")
    private String currencyId;

    @SerializedName("CodeEN")
    private String codeEN;

    @SerializedName("CurrencyEN")
    private String currencyEN;

    @SerializedName("TitleAR")
    private String titleAR;

    @SerializedName("TitleEN")
    private String titleEN;

    @SerializedName("CurrencyAR")
    private String currencyAR;

    @SerializedName("Id")
    private String id;

    @SerializedName("CodeAR")
    private String codeAR;

    @SerializedName("Model")

    private String code;

    public Model(String currencyId, String codeEN, String currencyEN,
                 String citleAR, String citleEN, String currencyAR, String id, String codeAR, String code) {
        this.currencyId = currencyId;
        this.codeEN = codeEN;
        this.currencyEN = currencyEN;
        titleAR = citleAR;
        titleEN = citleEN;
        this.currencyAR = currencyAR;
        this.id = id;
        this.codeAR = codeAR;
        this.code = code;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {

        this.currencyId = currencyId;
    }

    public String getCodeEN() {
        return codeEN;
    }

    public void setCodeEN(String codeEN) {
        this.codeEN = codeEN;
    }

    public String getCurrencyEN() {
        return currencyEN;
    }

    public void setCurrencyEN(String currencyEN) {
        this.currencyEN = currencyEN;
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

    public String getCurrencyAR() {
        return currencyAR;
    }

    public void setCurrencyAR(String currencyAR) {
        this.currencyAR = currencyAR;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodeAR() {
        return codeAR;
    }

    public void setCodeAR(String codeAR) {
        this.codeAR = codeAR;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


}



