package com.example.user.pum_lab2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity
{

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @BindView(R.id.lista_miejsc_btn)
    Button lista_miejsc_btn;

    @BindView(R.id.zmien_miejsce_btn)
    Button zmien_miejsce_btn;

    @BindView(R.id.miasto)
    TextView miasto;

    @BindView(R.id.dodatkowe_info)
    TextView dodatkowe_info;

    @BindView(R.id.podanemiejsce)
    EditText podanemiejsce;

    @OnClick(R.id.lista_miejsc_btn)
    void onClickLista()
    {
        final Intent i = new Intent(this, ActivityOfCities.class);

        Bundle bundle = new Bundle();
        bundle.putString("klucz", "miasto");
        i.putExtras(bundle);
        startActivity(i);

    }

    @OnClick(R.id.zmien_miejsce_btn)
    void onClickZmiana()
    {

        miasto.setText(podanemiejsce.getText().toString());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place("Szczecin", 16,"Częściowe zachmurzenie"));
        places.add(new Place("Kraków", 12, "Możliwe opady"));

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);


        PlaceAdapter placeAdapter = new PlaceAdapter(places);
        recyclerView.setAdapter(placeAdapter);


    }


}
