package com.example.abdulrahman.regestertask.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import com.example.abdulrahman.regestertask.R;
import com.example.abdulrahman.regestertask.utils.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by abdulrahman on 7/16/2018.
 */

public class TermsAndConditionWebViewFragment extends Fragment {
    @BindView(R.id.web_view)
    WebView webView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_terms_condition, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        webView.loadUrl(Constants.TERMS_AND_CONSITION_URL);


    }
}
