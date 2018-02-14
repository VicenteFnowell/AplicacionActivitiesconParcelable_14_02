package com.example.aplicacionactivitiesconparcelable_14_02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    TextView tvNombre,tvValoracion;
    EditText etOpinion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        tvNombre = (TextView)findViewById(R.id.restvnombre);
        tvValoracion = (TextView)findViewById(R.id.restvvaloracion);
        etOpinion = (EditText) findViewById(R.id.resetopinion);

        Bundle b=getIntent().getExtras();

        if(b!=null){

            Restaurante restaurante=b.getParcelable(MainActivity.EXTRA_RESTAURANTE);
            tvNombre.setText(restaurante.getNombre());
            tvValoracion.setText(restaurante.getValoracion()+(""));
            etOpinion.setText(restaurante.getOpinion());




        }










    }





}
