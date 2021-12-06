package com.example.ihc_menuapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.cepheuen.elegantnumberbutton.view.ElegantNumberButton;

public class prueba extends AppCompatActivity {
    public ElegantNumberButton btn500 ;
    public ElegantNumberButton btn200;
    public ElegantNumberButton btn100;
    public ElegantNumberButton btn50;
    public ElegantNumberButton btn20;
    public ElegantNumberButton btn10;
    public ElegantNumberButton btn5;
    public ElegantNumberButton btn2;
    public ElegantNumberButton btn1;
    public ElegantNumberButton btn5c;

    public TextView tvResultado;
    public static final String TAG = prueba.class.getSimpleName();
    public Float A=0.0f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba);
        tvResultado= (TextView) findViewById(R.id.tvResult);
        btn500 = (ElegantNumberButton) findViewById(R.id.Button500);

        btn500.setRange(0,10);



        btn500.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            String Numero;
            A =Float.parseFloat( btn500.getNumber().toString())*500;

            tvResultado.setText(A.toString());

        });

        btn200 = (ElegantNumberButton) findViewById(R.id.Button200);
        btn200.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn200.getNumber())*200;
            tvResultado.setText(A.toString());

        });
        btn100 = (ElegantNumberButton) findViewById(R.id.Button100);
        btn100.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn100.getNumber())*100;
            tvResultado.setText(A.toString());

        });
        btn50 = (ElegantNumberButton) findViewById(R.id.button50);
        btn50.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn50.getNumber())*50;
            tvResultado.setText(A.toString());


        });
        btn20 = (ElegantNumberButton) findViewById(R.id.button20);
        btn20.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn20.getNumber())*20;
            tvResultado.setText(A.toString());

        });
        btn10 = (ElegantNumberButton) findViewById(R.id.button10 );
        btn10.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn20.getNumber())*10;
            tvResultado.setText(A.toString());

        });
        btn5 = (ElegantNumberButton) findViewById(R.id.button5 );
        btn5.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn5.getNumber())*5;
            tvResultado.setText(A.toString());

        });
        btn2 = (ElegantNumberButton) findViewById(R.id.button2);
        btn2.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn2.getNumber())*2;
            tvResultado.setText(A.toString());

        });
        btn1 = (ElegantNumberButton) findViewById(R.id.button1);
        btn1.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn1.getNumber());
            tvResultado.setText(A.toString());

        });
        btn5c = (ElegantNumberButton) findViewById(R.id.button8);
        btn5c.setOnClickListener((ElegantNumberButton.OnClickListener) view -> {
            A =A + Float.parseFloat(btn5c.getNumber())/2;
            tvResultado.setText(A.toString());

        });
        btn500.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn200.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn100.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn50.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn20.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn10.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn5.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn2.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn1.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });
        btn5c.setOnValueChangeListener((view, oldValue, newValue) -> {
            Log.d(TAG, String.format("oldValue: %d   newValue: %d", oldValue, newValue));
        });


    }
    public void Borrar(View view) {

        tvResultado.setText(Float.toString(0));
        A=0.0f;
        btn500.setNumber(String.valueOf(0)); ;
        btn200.setNumber(String.valueOf(0));;
        btn100.setNumber(String.valueOf(0));;
        btn50.setNumber(String.valueOf(0));;
        btn20.setNumber(String.valueOf(0));;
        btn10.setNumber(String.valueOf(0));;
        btn5.setNumber(String.valueOf(0));;
        btn2.setNumber(String.valueOf(0));;
        btn1.setNumber(String.valueOf(0));;
        btn5c.setNumber(String.valueOf(0));;

    }
    public void Siguiente (View View){
        String valor= A.toString();
        Intent next = new Intent(this,prueba.class);
        next.putExtra("valor",valor);
        startActivity(next);

    }
}