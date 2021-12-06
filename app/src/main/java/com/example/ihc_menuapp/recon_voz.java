package com.example.ihc_menuapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Locale;

public class recon_voz extends AppCompatActivity {
    float total;
    float valor;
    private static final  int REQ_CODE_SPEECH_INPUT=100;
    private TextView mEntradaVoz;
    private ImageButton mBotonHablar;
    private ImageButton mBotonContinuar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String newString;
        setContentView(R.layout.activity_recon_voz);

        mEntradaVoz=findViewById(R.id.textoEntrada);
        mBotonHablar=findViewById(R.id.botonHablar);
        mBotonContinuar=findViewById(R.id.ButtonContinuar);
        mBotonContinuar.setVisibility(View.INVISIBLE);




        mBotonHablar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                iniciarEntradaVoz();
            }
        });
    }

    private void iniciarEntradaVoz(){
        Intent intent=new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,"Hola dime el costo ");
        try {
            startActivityForResult(intent,REQ_CODE_SPEECH_INPUT);
        }catch(ActivityNotFoundException e){
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode){
            case REQ_CODE_SPEECH_INPUT:{
                if (resultCode==RESULT_OK && null!=data){
                    ArrayList<String> result= data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    String Resultado=result.get(0);
                    if(isNumeric(Resultado)){
                        valor=  Float.parseFloat(Resultado.replace(',', '.'));;
                        mEntradaVoz.setText(Resultado);
                        result.clear();
                        mBotonContinuar.setVisibility(View.VISIBLE);
                        mEntradaVoz.setText("$"+Resultado+"Presiona el boton para continuar");

                    }else{
                        Resultado = Resultado.substring(1);
                        if(isNumeric(Resultado)){
                            valor= Float.parseFloat(Resultado.replace(',', '.'));
                            mEntradaVoz.setText("$"+Resultado);

                            result.clear();


                            mBotonContinuar.setVisibility(View.VISIBLE);
                            mEntradaVoz.setText("$"+Resultado+"Presiona el boton para continuar");




                        }else{
                            mEntradaVoz.setText("Ingresa de nuevo un costo valido");
                        }

                    }



                }
            }
            break;
        }
    }
    public static boolean isNumeric(String string) {
        float intValue;



        if(string == null || string.equals("")) {

            return false;
        }

        try {
            intValue = Float.parseFloat(string.replace(',', '.'));
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Input String cannot be parsed to Integer.");
        }
        return false;
    }
    public void Siguiente2 (View View){
        String valor2= String.valueOf((valor));
        Intent next = new Intent(this,SalidaDinero.class);
        next.putExtra("valor",valor2);
        startActivity(next);

    }
}