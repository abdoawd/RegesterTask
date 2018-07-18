package com.example.abdulrahman.regestertask.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.DisplayMetrics;

import com.example.abdulrahman.regestertask.applicatoin.App;

import java.util.Locale;

public class LanguageUtils {

    public static boolean isEnglishLanguage() {
        return Locale.getDefault().getLanguage().equals("en");
    }

    public static void updateLanguage( String selectedLanguage) {
        if (!"".equals(selectedLanguage)) {
            Locale locale = new Locale(selectedLanguage);
            Locale.setDefault(locale);
            Resources res = App.getContext().getResources();
            Configuration config = new Configuration();
            DisplayMetrics dm = res.getDisplayMetrics();
            config.locale = locale;
            App.getContext().getResources().updateConfiguration(config, dm);
        }
    }
}
