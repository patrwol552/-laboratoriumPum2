package com.example.user.pum_lab2;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button lista_miejsc_btn;
    Button zmien_miejsce_btn;
    TextView miasto;
    TextView dodatkowe_info;
    EditText podanemiejsce;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista_miejsc_btn = (Button) findViewById(R.id.lista_miejsc_btn);
        zmien_miejsce_btn = (Button) findViewById(R.id.zmien_miejsce_btn);
        miasto = (TextView) findViewById(R.id.miasto);
        dodatkowe_info = (TextView) findViewById(R.id.dodatkowe_info);
        podanemiejsce = (EditText) findViewById(R.id.podanemiejsce);


        final Intent i = new Intent(this, ActivityOfCities.class);

        lista_miejsc_btn.setOnClickListener(new View.OnClickListener()

            {
                @Override
                public void onClick (View view){

                    startActivity(i);


            }
            });

        zmien_miejsce_btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {


                miasto.setText(podanemiejsce.getText().toString());


            }
        });
        Bundle bundle = new Bundle();
        bundle.putString("Nasze miasto", podanemiejsce.getText().toString());
        i.putExtras(bundle);

    }




}
