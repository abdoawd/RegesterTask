package com.example.abdulrahman.regestertask.ui.pressenter;


import com.example.abdulrahman.regestertask.beans.City;
import com.example.abdulrahman.regestertask.beans.Model;
import com.example.abdulrahman.regestertask.ui.model.HomeModel;
import com.example.abdulrahman.regestertask.ui.model.HomeModelImpl;
import com.example.abdulrahman.regestertask.ui.view.HomeView;
import com.example.abdulrahman.regestertask.utils.LanguageUtils;
import com.example.abdulrahman.regestertask.utils.NetworkUtils;
import com.example.abdulrahman.regestertask.utils.ToastUtils;

import java.lang.ref.WeakReference;
import java.util.List;


/**
 * Created by abdulrahman on 7/12/2018.
 */

public class HomePressenterImpl implements HomePressenter, HomeModel.GetCodeAndCountryCallback, HomeModel.GetCountryCitiesCallback {
    private HomeModel model;
    private WeakReference<HomeView> viewReference;

    public HomePressenterImpl(HomeView viewReference) {
        this.viewReference = new WeakReference<>(viewReference);
        model = new HomeModelImpl();
    }
    @Override
    public void init() {
        // check connection
        if (NetworkUtils.isOnline()) {
            model.getCodeAndCountries(this);
        } else {
            ToastUtils.showErrorConnecrionToast();
            getView().showConnectionError();
        }
    }

    @Override
    public void clear() {
        model.cancelAllRequest();
        viewReference.clear();
        viewReference = null;
    }

    @Override
    public void spinnerCountrieslicked(int countryId) {
        model.getCities(countryId, this);
    }

    @Override
    public void onChangeLanguageClicked() {
        if (LanguageUtils.isEnglishLanguage()) {
            LanguageUtils.updateLanguage("ar");
            getView().setAabicLanguage();
        } else {
            LanguageUtils.updateLanguage("en");
            getView().setEnglishLanguage();

        }

    }

    private boolean isViewCleared() {
        return viewReference == null;
    }

    @Override
    public void onGettingSuccess(List<Model> countriesAr) {
        getView().setCodeAndCountryAdapter(countriesAr);
    }


    @Override
    public void onGettingCitiesSuccess(List<City> listCityEn) {
        if (isViewCleared())
            return;
        getView().setSpinnerCities(listCityEn);

    }

    @Override
    public void onGettingCitiesFailure(Throwable t) {

    }

    private HomeView getView() {
        return viewReference.get();
    }

    @Override
    public void onGettingCodeFailure(Throwable t) {
        viewReference.get().showConnectionError();
    }
}
