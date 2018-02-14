package com.example.aplicacionactivitiesconparcelable_14_02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    static final String EXTRA_RESTAURANTE = "RESTAURANTE";

    EditText etNombre,etOpinion;
    Spinner spValoracion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNombre = (EditText)findViewById(R.id.mainetnombre);
        etOpinion = (EditText)findViewById(R.id.mainetopinion);
        spValoracion = (Spinner) findViewById(R.id.mainspvaloracion);

        String[] notavaloracion={"Selecciona","1","2","3","4","5","6","7","8","9","10"};
        ArrayAdapter<String> nota = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1,notavaloracion);
        spValoracion.setAdapter(nota);





    }//FIN ON CREATE


public void mainclickbtnver (View view){

String nombre = etNombre.getText().toString();
String opinion = etOpinion.getText().toString();
String notaspinner= spValoracion.getSelectedItem().toString();


if (nombre.equals("")||opinion.equals("")||notaspinner.equals("Selecciona")){
    Toast.makeText(getApplicationContext(),"Rellena el formulario",Toast.LENGTH_LONG).show();
}else{

    int valoracion = Integer.parseInt(notaspinner);

    //Creamos el objeto tipo persona con los valores recogidos del formulario
    Restaurante restaurante = new Restaurante(nombre,opinion,valoracion);
    //Creamos el objeto Intent para enviar nuestra persona a otra activity
    Intent i=new Intent(getApplicationContext(),ResultadoActivity.class);
    //Añadimos el objeto Persona que queremos enviar al activity de destino
    i.putExtra(EXTRA_RESTAURANTE, restaurante);
    //Iniciamos el nuevo activiti
    startActivity(i);



}


}








}//FIN MAINACTIVITY

