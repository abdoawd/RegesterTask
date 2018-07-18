package com.example.abdulrahman.regestertask.beans;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by abdulrahman on 7/16/2018.
 */

public class City implements Parcelable {
    public static final Parcelable.Creator<City> CREATOR = new Parcelable.Creator<City>() {
        @Override
        public City createFromParcel(Parcel source) {
            return new City(source);
        }
        @Override
        public City[] newArray(int size) {
            return new City[size];
        }
    };
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

    protected City(Parcel in) {
        this.countryId = in.readString();
        this.titleAR = in.readString();
        this.titleEN = in.readString();
        this.id = in.readString();
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

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.countryId);
        dest.writeString(this.titleAR);
        dest.writeString(this.titleEN);
        dest.writeString(this.id);
    }
}
