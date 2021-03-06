package com.example.abdulrahman.regestertask.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.abdulrahman.regestertask.R;
import com.example.abdulrahman.regestertask.applicatoin.App;
import com.example.abdulrahman.regestertask.beans.City;
import com.example.abdulrahman.regestertask.utils.LanguageUtils;

import java.util.List;

/**
 * Created by abdulrahman on 7/18/2018.
 */

public class SpinnerCitiesAdapter extends BaseAdapter {
    List<City> list ;


    public SpinnerCitiesAdapter( List<City> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            LayoutInflater inflater = (LayoutInflater) App.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.item_spinner_code_layout, null);
        }
        TextView textView = convertView.findViewById(R.id.tv_spinner);
        if (LanguageUtils.isEnglishLanguage()){
            textView.setText(list.get(position).getTitleEN());
        }
        else {
            textView.setText(list.get(position).getTitleAR());

        }
        return convertView ;
    }
}
