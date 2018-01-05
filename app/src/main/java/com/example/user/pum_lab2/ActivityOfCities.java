package com.example.user.pum_lab2;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;


public class ActivityOfCities extends MainActivity {

   // @BindView(R.id.recycler)
   // RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_of_cities);
       // ButterKnife.bind(this);




       // RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        //recyclerView.setLayoutManager(layoutManager);

        //PlaceAdapter placeAdapter = new PlaceAdapter(places);
        //recyclerView.setAdapter(placeAdapter);
    }
}
