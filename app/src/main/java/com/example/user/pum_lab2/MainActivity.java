package com.example.user.pum_lab2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.lista_miejsc_btn)
    Button listaMiejscBtn;

    @BindView(R.id.zmien_miejsce_btn)
    Button zmien_miejsce_btn;

    @BindView(R.id.miasto)
    TextView miasto;

    @BindView(R.id.dodatkowe_info)
    TextView dodatkowe_info;

    @BindView(R.id.podanemiejsce)
    EditText podanemiejsce;

    @BindView(R.id.stopnie)
    TextView stopnie;

    //@OnClick(R.id.lista_miejsc_btn)
    //void onClickLista() {
    // final Intent i = new Intent(this, Main2Activity.class);

    //  Bundle bundle = new Bundle();
    // bundle.putString("klucz", "miasto");
    //  i.putExtras(bundle);
    //  startActivity(i);

    // }

    @OnClick(R.id.lista_miejsc_btn)
    public void WyswietlListe() {
        Intent aktywnoscListy = new Intent(this, Main2Activity.class);
        startActivity(aktywnoscListy);

    }

    @OnClick(R.id.zmien_miejsce_btn)
    void onClickZmiana() {


        miasto.setText(podanemiejsce.getText().toString());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Bundle wybranemiasto = getIntent().getExtras();
        if (wybranemiasto != null) {
            String miasto = wybranemiasto.getString("miasto");
            this.miasto.setText(miasto);

            String informacje = wybranemiasto.getString("info");
            this.dodatkowe_info.setText(informacje);

            int temperatura = wybranemiasto.getInt("temp");
            this.stopnie.setText(temperatura + "stopni Celsjusza");

        }


    }


}
