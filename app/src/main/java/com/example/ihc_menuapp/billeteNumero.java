package com.example.ihc_menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class billeteNumero extends AppCompatActivity {
    TextView tvResultado;
    float a;
    float b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billete_numero);
        tvResultado=findViewById(R.id.tvResultado);
    }

    public void EscribirQuinientos(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+500;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirDoscientos(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+200;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirCien(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+100;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirCincuenta(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+50;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirVeinte(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+20;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirDiez(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+10;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirCinco(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+5;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirDos(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+2;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirUno(View view) {
        b=a;
        a= Float.parseFloat(tvResultado.getText().toString());
        a=a+1;
        tvResultado.setText(Float.toString(a));
    }
    public void EscribirClear(View view) {

        tvResultado.setText(Float.toString(0));
    }
    public void EscribirBack(View view) {

        tvResultado.setText(Float.toString(b));
    }
}