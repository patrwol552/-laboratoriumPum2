package com.example.user.pum_lab2;

import android.os.Bundle;
import java.util.ArrayList;
import butterknife.ButterKnife;


public class ActivityOfCities extends MainActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_of_cities);
        //ButterKnife.bind(this);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Szczecin", 16, "Częściowe zachmurzenie"));
        places.add(new Place("Kraków", 12, "Możliwe opady"));

    }
}
