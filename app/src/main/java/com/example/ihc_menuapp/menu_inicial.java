package com.example.ihc_menuapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class menu_inicial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void muestraBilletes(View view){
        Intent mostrarBilletes = new Intent(this,prueba.class);
        startActivity(mostrarBilletes);
    }

    public void abreCalc(View view) {
        Intent calculadora = new Intent(this,NumeroBillete.class);
        startActivity(calculadora);
    }

    public void voz(View view){
        Intent reconvoz = new Intent(this,recon_voz.class);
        startActivity(reconvoz);
    }
}