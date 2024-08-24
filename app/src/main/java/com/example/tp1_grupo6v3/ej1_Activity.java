package com.example.tp1_grupo6v3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class ej1_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        NUMERO1 = (EditText)findViewById(R.id.Numero1);
        NUMERO2 = (EditText)findViewById(R.id.Numero2);
        RESULTADO = (TextView)findViewById(R.id.Resultado);
    }

  private EditText NUMERO1, NUMERO2;
  private TextView RESULTADO;

  //Nos paramos sobre la clase y le damos ALT + ENTER para importar la clase (view)
  public void sumar (View view){

    String valor1 = NUMERO1.getText().toString();
    String valor2 = NUMERO2.getText().toString();
    int nro1 = Integer.parseInt(valor1);
    int nro2 = Integer.parseInt(valor2);
    int suma = nro1 + nro2;
    String resu = String.valueOf(suma);
    RESULTADO.setText(resu);
  }

  public void VolverMain(View view){
      Intent volverMain = new Intent(this, MainActivity.class);
      startActivity(volverMain);
  }





}