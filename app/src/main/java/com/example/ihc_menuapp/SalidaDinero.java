package com.example.ihc_menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SalidaDinero extends AppCompatActivity {
    float total=0.0f;
    TextView tvQuinientos;
    TextView tvTotal;
    TextView tvDoscientos;
    TextView tvCien;
    TextView tvCincuenta;
    TextView tvCincuentac;
    TextView tvVeinte;
    TextView tvDiez;
    TextView tvCinco;
    TextView tvDos;
    TextView tvUno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salida_dinero);
        Bundle extras = getIntent().getExtras();
        String newString;
        tvQuinientos=findViewById(R.id.tvquinientos);
        tvTotal=findViewById(R.id.tvtotal);
        tvDoscientos=findViewById(R.id.tvdoscientos);
        tvCien=findViewById(R.id.tvcien);
        tvCincuenta=findViewById(R.id.tvcincuenta);
        tvCincuentac=findViewById(R.id.tvcincuentac);
        tvVeinte=findViewById(R.id.tvbeinte);
        tvDiez=findViewById(R.id.tvdiez);
        tvCinco=findViewById(R.id.tvcinco);
        tvDos=findViewById(R.id.tvdos);
        tvUno=findViewById(R.id.tvuno);

        if(extras == null) {
            newString= null;
        } else {
            newString= extras.getString("valor");
        }

        total= Float.parseFloat(newString.replace(',', '.'));
        tvTotal.setText(Float.toString(total));
        float total3= total;
        int total2= (int) total;

        int quinientos= (int) (total/500);
        total%=500;
        tvQuinientos.setText(Integer.toString(quinientos));
        int doscientos= (int) (total/200);
        total%=200;
        tvDoscientos.setText(Integer.toString(doscientos));
        int cien= (int) (total/100);
        total%=100;
        tvCien.setText(Integer.toString(cien));
        int cincuenta= (int) (total/50);
        total%=50;
        tvCincuenta.setText(Integer.toString(cincuenta));
        int veinte= (int) (total/20);
        total%=20;
        total%=50;
        tvVeinte.setText(Integer.toString(veinte));
        int diez= (int) (total/10);
        total%=20;
        tvDiez.setText(Integer.toString(diez));
        int cinco= (int) (total/5);
        total%=5;
        tvCinco.setText(Integer.toString(cinco));
        int dos= (int) (total/2);
        total%=2;
        tvDos.setText(Integer.toString(dos));
        int uno= (int) (total/1);
        total%=1;
        tvUno.setText(Integer.toString(uno));
        int cincuentac= (int) ((total3-total2)*10);
        cincuentac%=5;
        tvCincuentac.setText(Integer.toString(cincuentac));
    }

    public void REgre (){
        Intent anterior = new Intent(this,menu_inicial.class);
        startActivity(anterior);
    }
}