package com.example.ejercicio1_1_1p;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {
    TextView txtResultado;
    Button btnVolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        Matematicas mat = new Matematicas();

        Bundle resultado=getIntent().getExtras();
        btnVolver = (Button) findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        txtResultado =(TextView) findViewById(R.id.txtResultado);
        txtResultado.setText("El resultado de la operacion es "+mat.getResp().toString());

    }
}