package com.example.user.pum_lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void PobierzDane (View view) {
        Button listamiejsc = (Button) findViewById(R.id.listamiejsc);
        Button zmianamiejsca = (Button) findViewById(R.id.zmianamiejsca);
        TextView miasto = (TextView) findViewById(R.id.miasto);
        TextView dodatkowe_info = (TextView) findViewById(R.id.dodatkowe_info);
        EditText podanemiejsce = (EditText) findViewById(R.id.podanemiejsce);

        


        if(zmianamiejsca.isPressed())
        {
            miasto.setText(podanemiejsce.getText());
        }
    }

}
