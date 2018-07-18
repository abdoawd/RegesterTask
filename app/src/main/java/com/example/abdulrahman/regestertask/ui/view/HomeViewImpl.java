package com.example.abdulrahman.regestertask.ui.view;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.abdulrahman.regestertask.R;
import com.example.abdulrahman.regestertask.adapter.SpinnerCitiesAdapter;
import com.example.abdulrahman.regestertask.adapter.SpinnerCodeAdapter;
import com.example.abdulrahman.regestertask.adapter.SpinnerCountryAdapter;
import com.example.abdulrahman.regestertask.beans.City;
import com.example.abdulrahman.regestertask.beans.Model;
import com.example.abdulrahman.regestertask.fragments.TermsAndConditionWebViewFragment;
import com.example.abdulrahman.regestertask.ui.pressenter.HomePressenter;
import com.example.abdulrahman.regestertask.ui.pressenter.HomePressenterImpl;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomeViewImpl extends AppCompatActivity implements HomeView, AdapterView.OnItemSelectedListener {
    @BindView(R.id.spinner_code)
    Spinner spinnerCode;
    @BindView(R.id.spinner_countries)
    Spinner spinnerCountries;
    @BindView(R.id.spinner_cities)
    Spinner spinnerCites;
    @BindView(R.id.terms_and_conditions)
    TextView tvTermsAndCondition;
    @BindView(R.id.tv_change_language)
    TextView tvChangeLanguage;
    ArrayAdapter<String> adapterCities;
    private SpinnerCodeAdapter spinnerCodeAdapter;
    private SpinnerCountryAdapter spinnerCountryAdapter;
    private SpinnerCitiesAdapter spinnerCitiesAdapter;
    private HomePressenter pressenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        pressenter = new HomePressenterImpl(this);
        pressenter.init();
        spinnerCountries.setOnItemSelectedListener(this);
    }

    @Override
    public void showConnectionError() {
    }

    @OnClick(R.id.tv_change_language)
    void chaneLanguage() {
        pressenter.onChangeLanguageClicked();
    }

    @Override
    public void setSpinnerCities(List<City> listCity) {
        spinnerCitiesAdapter = new SpinnerCitiesAdapter(listCity);
        spinnerCites.setAdapter(adapterCities);

    }

    @Override
    public void setAabicLanguage() {
        recreate();
    }

    @Override
    public void setEnglishLanguage() {
        recreate();
    }

    @Override
    public void setCodeAndCountryAdapter(List<Model> list) {
        spinnerCodeAdapter = new SpinnerCodeAdapter(list);
        spinnerCountryAdapter = new SpinnerCountryAdapter(list);
        spinnerCode.setAdapter(spinnerCodeAdapter);
        spinnerCountries.setAdapter(spinnerCountryAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        pressenter.spinnerCountrieslicked(position);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @OnClick(R.id.terms_and_conditions)
    void termsAndCondition() {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.main_activity, new TermsAndConditionWebViewFragment());
        fragmentTransaction.addToBackStack("add");
        fragmentTransaction.commit();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        pressenter.clear();
    }
}
