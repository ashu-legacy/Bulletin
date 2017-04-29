package com.bulletin.theinvincible.bulletin;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BusinessDetail extends Fragment {


    StringList mstringList;
    private TextView headlineSecond;
    private TextView authorSecond;
    private TextView detailsSecond;

    public BusinessDetail() {

    }

    public void receiveValue(StringList value, int positionValue) {
        mstringList = value;
        Log.d("ashu", "BusinessDe string is: " + mstringList.authorName);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_business_detail, container, false);
        return view;
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        headlineSecond = (TextView) view.findViewById(R.id.id_headline_second);
        authorSecond = (TextView) view.findViewById(R.id.id_author_second);
        detailsSecond = (TextView) view.findViewById(R.id.id_details_second);

    }
}




