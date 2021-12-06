package com.example.ihc_menuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

public class NumeroBillete extends AppCompatActivity {
    EditText TNumeros;
    float a;
    float b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero_billete);
        TNumeros=findViewById(R.id.Numeros);
    }

    private static final DecimalFormat df = new DecimalFormat("0.00");
    public void Agregar1(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        a=(float) (a+.1);;
        TNumeros.setText( String.format("%.1f",Float.toString(a)));

    }

    private void CheckVacio() {

        if (TNumeros.getText().length() == 0){
            TNumeros.setText("0.0");
        }

    }


    public void Agregar(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        a=(float) (a+.1);;
        TNumeros.setText(Float.toString(a));

    }
    public void Restar(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        if((float) (a-.1)<0){
            TNumeros.setText(Float.toString(0));
            return;
        }
        a= (float) (a-.1);
        TNumeros.setText(Float.toString(a));

    }
    public void Restar1(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        if(a-1<0){
            TNumeros.setText(Float.toString(0));
            return;
        }
        a=a-1;
        TNumeros.setText(Float.toString(a));

    }
    public void Agregar10(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        a=a+10;
        TNumeros.setText(Float.toString(a));
    }
    public void Agregar100(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        a=a+100;
        TNumeros.setText(Float.toString(a));
    }
    public void Agregar1000(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        a=a+1000;
        TNumeros.setText(Float.toString(a));
    }
    public void Restar10(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        if(a-10<0){
            TNumeros.setText(Float.toString(0));
            return;
        }
        a=a-10;
        TNumeros.setText(Float.toString(a));
    }
    public void Restar100(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        if(a-100<0){
            TNumeros.setText(Float.toString(0));
            return;
        }
        a=a-100;

        TNumeros.setText(Float.toString(a));
    }
    public void Restar1000(View view) {
        CheckVacio();
        b=a;
        a= Float.parseFloat(TNumeros.getText().toString());
        if(a-1000<0){
            TNumeros.setText(Float.toString(0));
            return;
        }
        a=a-1000;

        TNumeros.setText(Float.toString(a));
    }
    public void EscribirClear(View view) {
        CheckVacio();

        TNumeros.setText(Float.toString(0));
    }
    public void EscribirBack(View view) {
        CheckVacio();

        TNumeros.setText(Float.toString(b));
    }
    public void Siguiente (View View){
        String valor= TNumeros.getText().toString();
        Intent next = new Intent(this,SalidaDinero.class);
        next.putExtra("valor",valor);
        startActivity(next);

    }
}