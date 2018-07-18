package com.example.abdulrahman.regestertask.network;


import com.example.abdulrahman.regestertask.beans.City;
import com.example.abdulrahman.regestertask.beans.Model;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by abdulrahman on 5/9/2018.
 */

public interface ApiService {
    @GET("GetCountries")
    Call<List<Model>> getCountriesCode();

    @GET("GetCities?")
    Call<List<City>> getCities(@Query("countryId") int id);

}
