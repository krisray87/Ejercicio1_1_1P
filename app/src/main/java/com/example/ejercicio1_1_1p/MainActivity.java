package com.example.ejercicio1_1_1p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    EditText n1;
    EditText n2;
    Button sumar;
    Button restar;
    Button multi;
    Button div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n1 = (EditText) findViewById(R.id.txtn1);
        n2 = (EditText) findViewById(R.id.txtn2);
        sumar = (Button) findViewById(R.id.btnsum);
        restar = (Button) findViewById(R.id.btnrest);
        multi = (Button) findViewById(R.id.btnmulti);
        div = (Button) findViewById(R.id.btndiv);

        Matematicas matematicas = new Matematicas();
        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                String respuesta = String.valueOf(matematicas.Sumar(numero1,numero2));
                Intent intent=new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado",respuesta);
                startActivity(intent);
            }
        });
        restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                String respuesta = String.valueOf(matematicas.Restar(numero1,numero2));
                Intent intent=new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado",respuesta);
                startActivity(intent);
            }
        });
        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                String respuesta = String.valueOf(matematicas.Multiplicar(numero1,numero2));
                Intent intent=new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado",respuesta);
                startActivity(intent);
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1=Integer.parseInt(n1.getText().toString());
                int numero2=Integer.parseInt(n2.getText().toString());
                String respuesta = String.valueOf(matematicas.Dividir(numero1,numero2));
                Intent intent=new Intent(getApplicationContext(),ActivityResultado.class);
                intent.putExtra("resultado",respuesta);
                startActivity(intent);
            }
        });


    }
}