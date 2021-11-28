package com.example.ihc_menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SalidaDinero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salida_dinero);
    }

    public void REgre (){
        Intent anterior = new Intent(this,menu_inicial.class);
        startActivity(anterior);
    }
}