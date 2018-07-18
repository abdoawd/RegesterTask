package com.example.abdulrahman.regestertask.utils;

import android.content.Context;
import android.net.ConnectivityManager;

import com.example.abdulrahman.regestertask.applicatoin.App;


/**
 * Created by abdulrahman on 7/5/2018.
 */

public class NetworkUtils {

    public static boolean isOnline() {
        ConnectivityManager cm = (ConnectivityManager) App.getContext().getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

}