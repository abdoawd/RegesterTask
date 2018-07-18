package com.example.abdulrahman.regestertask.ui.model;


import com.example.abdulrahman.regestertask.beans.City;
import com.example.abdulrahman.regestertask.beans.Model;
import com.example.abdulrahman.regestertask.network.ApiClient;
import com.example.abdulrahman.regestertask.network.ApiService;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by abdulrahman on 7/12/2018.
 */

public class HomeModelImpl implements HomeModel {
    ApiService service = ApiClient.getClient().create(ApiService.class);
    Call<List<Model>> codeCall;
    Call<List<City>> cityCall;
    List<Model> codes;
    List<City> cities;

    ArrayList<String> listCityEn = new ArrayList<>();
    ArrayList<String> listCityAr = new ArrayList<>();

    @Override
    public void getCodeAndCountries(final GetCodeAndCountryCallback callback) {
        codeCall = service.getCountriesCode();
        codeCall.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {
                if (response.isSuccessful()) {
                    codes=response.body();
                    callback.onGettingSuccess(codes);
                }
            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {
                callback.onGettingCodeFailure(t);
            }
        });
    }

    @Override
    public void cancelAllRequest() {
        codeCall.cancel();
    }

    @Override
    public void getCities(int position, final GetCountryCitiesCallback callback) {
        cityCall = service.getCities(1);
        cityCall.enqueue(new Callback<List<City>>() {
            @Override
            public void onResponse(Call<List<City>> call, Response<List<City>> response) {
                if (response.isSuccessful()) {
                    cities = response.body();

                    callback.onGettingCitiesSuccess(cities);
                }
            }

            @Override
            public void onFailure(Call<List<City>> call, Throwable t) {

            }
        });

    }
}