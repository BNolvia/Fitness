package com.example.berenice.fitness;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * Created by Berenice on 17/03/2017.
 */

public class Calorias extends Activity {
    Spinner Fruta; //1.-Declarar el Spinner
    Spinner Bebida;
    Spinner Comida;

    String[] datosfruta = {"Seleccione una fruta...", "Manzana", "Pera", "Plátano", "Uva", "Naranja"}; //3.- Selección de datos
    String [] datosbebida = {"Selecciona una bebida...", "Coca-cola", "Agua", "Horchata", "Coca-cola Light", "Cerveza"};
    String[] datoscomida = {"Selecciona una comida...", "Sabritas", "Chocolate", "Galletas", "Caramelos", "Frituras"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorias);

        Fruta = (Spinner)findViewById(R.id.FrutaSpinn); //2.-Indicar que hace fruta.
        Bebida = (Spinner)findViewById(R.id.BebidaSpinn);
        Comida = (Spinner)findViewById(R.id.ComidaSpinn);

        //Esto se hace con la clase ArrayAdapter.
        ArrayAdapter<String> frutaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,datosfruta);
        Fruta.setAdapter(frutaadaptador); //5.-vINCULAR NUESTRA LISTA CON EL ADAPTADOR.

        ArrayAdapter<String> bebidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datosbebida);
        Bebida.setAdapter(bebidaadaptador);

        ArrayAdapter<String> comidaadaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, datoscomida);
        Comida.setAdapter(comidaadaptador);

        Fruta.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {

                    case 0:
                        Toast to = Toast.makeText(getApplicationContext(), "Selecciona una fruta", Toast.LENGTH_LONG);
                        to.show();
                        break;

                    case 1:
                        Intent mz = new Intent(Calorias.this, Manzana.class);
                        startActivity(mz);
                        break;


                }


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }


        });

    }

}