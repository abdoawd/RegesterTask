package com.example.abdulrahman.regestertask.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.DisplayMetrics;

import com.example.abdulrahman.regestertask.applicatoin.App;


/**
 * Created by abdulrahman on 7/5/2018.
 */

public class NetworkUtils {

    public static boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) App.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    public static int calculateNoOfColumns() {
        DisplayMetrics displayMetrics = App.getContext().getResources().getDisplayMetrics();
        float dpWidth = displayMetrics.widthPixels / displayMetrics.density;
        int noOfColumns = (int) (dpWidth / 180);
        return noOfColumns;
    }
}