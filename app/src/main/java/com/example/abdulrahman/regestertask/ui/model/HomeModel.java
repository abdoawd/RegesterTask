package com.example.abdulrahman.regestertask.ui.model;

import com.example.abdulrahman.regestertask.beans.City;
import com.example.abdulrahman.regestertask.beans.Model;

import java.util.List;

/**
 * Created by abdulrahman on 7/12/2018.
 */

public interface HomeModel {
    void getCodeAndCountries(GetCodeAndCountryCallback callback);

    void cancelAllRequest();

    void getCities(int countryId, GetCountryCitiesCallback callback);

    interface GetCodeAndCountryCallback {
        void onGettingSuccess( List<Model> countriesAr);

        void onGettingCodeFailure(Throwable t);
    }
    interface GetCountryCitiesCallback {
        void onGettingCitiesSuccess(List<City> listCityEn);

        void onGettingCitiesFailure(Throwable t);
    }
}
