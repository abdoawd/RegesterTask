package com.example.abdulrahman.regestertask.ui.view;


import com.example.abdulrahman.regestertask.beans.City;
import com.example.abdulrahman.regestertask.beans.Model;

import java.util.List;

/**
 * Created by abdulrahman on 7/12/2018.
 */

public interface HomeView {
    void showConnectionError();

    void setSpinnerCities(List<City> listCity);

    void setAabicLanguage();

    void setEnglishLanguage();

    void setCodeAndCountryAdapter(List<Model> countriesAr);
}
