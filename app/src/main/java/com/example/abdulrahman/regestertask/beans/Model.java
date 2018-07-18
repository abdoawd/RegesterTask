package com.example.abdulrahman.regestertask.beans;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abdulrahman on 7/16/2018.
 */

public class Model implements Parcelable {
    public static final Parcelable.Creator<Model> CREATOR = new Parcelable.Creator<Model>() {
        @Override
        public Model createFromParcel(Parcel source) {
            return new Model(source);
        }

        @Override
        public Model[] newArray(int size) {
            return new Model[size];
        }
    };
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

    protected Model(Parcel in) {
        this.currencyId = in.readString();
        this.codeEN = in.readString();
        this.currencyEN = in.readString();
        this.titleAR = in.readString();
        this.titleEN = in.readString();
        this.currencyAR = in.readString();
        this.id = in.readString();
        this.codeAR = in.readString();
        this.code = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.currencyId);
        dest.writeString(this.codeEN);
        dest.writeString(this.currencyEN);
        dest.writeString(this.titleAR);
        dest.writeString(this.titleEN);
        dest.writeString(this.currencyAR);
        dest.writeString(this.id);
        dest.writeString(this.codeAR);
        dest.writeString(this.code);
    }
}



