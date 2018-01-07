package com.example.user.pum_lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {


    @BindView(R.id.recycler)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);


        //ArrayList<Place> places = new ArrayList<>();
        final ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("Szczecin", 16, "Częściowe zachmurzenie"));
        places.add(new Place("Kraków", 12, "Możliwe opady"));
        places.add(new Place("Warszawa", 7, "Pochmurnie"));
        places.add(new Place("Poznań", 10, "Częściowe zachmurzenie"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);

        placeAdapter.setOnItemClickListener(new PlaceAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View itemView, int position) {
                String name = places.get(position).getPlaceName();
                int temperature = places.get(position).getTemperature();
                String information = places.get(position).getInformation();
                MiastoZListy(name, temperature, information);


            }
        });


    }

    public void MiastoZListy(String name, int temperature, String info) {
        Intent AktListy = new Intent(this, MainActivity.class);
        Bundle DoListy = new Bundle();

        DoListy.putString("miasto", name);
        DoListy.putString("info", info);
        DoListy.putInt("temp", temperature);
        AktListy.putExtras(DoListy);

        startActivity(AktListy);
    }


}
