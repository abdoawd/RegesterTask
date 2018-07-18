package com.example.abdulrahman.regestertask.utils;

import android.widget.Toast;

import com.example.abdulrahman.regestertask.R;
import com.example.abdulrahman.regestertask.applicatoin.App;

/**
 * Created by abdulrahman on 6/19/2018.
 */

public class ToastUtils {
    public static void showErrorConnecrionToast() {
        Toast.makeText(App.getContext(), R.string.no_connection, Toast.LENGTH_LONG).show();
    }

    public static void showToast(String message) {
        Toast.makeText(App.getContext(), message, Toast.LENGTH_LONG).show();
    }


}