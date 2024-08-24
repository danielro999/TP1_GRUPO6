package com.example.tp1_grupo6v3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class ej2_Activity extends AppCompatActivity {

    private EditText pantalla;
    private String operador;
    private double valor1;
    private boolean operacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);

        pantalla = findViewById(R.id.Pantalla);

        // Initialize buttons
        Button btnBorrarTodo = findViewById(R.id.BorrarTodo);
        Button btnSiete = findViewById(R.id.Siete);
        Button btnOcho = findViewById(R.id.Ocho);
        Button btnNueve = findViewById(R.id.Nueve);
        Button btnMas = findViewById(R.id.Mas);
        Button btnCuatro = findViewById(R.id.Cuatro);
        Button btnCinco = findViewById(R.id.Cinco);
        Button btnSeis = findViewById(R.id.Seis);
        Button btnMenos = findViewById(R.id.Menos);
        Button btnUno = findViewById(R.id.Uno);
        Button btnDos = findViewById(R.id.Dos);
        Button btnTres = findViewById(R.id.Tres);
        Button btnMultiplicacion = findViewById(R.id.Multiplicacion);
        Button btnDividido = findViewById(R.id.Dividido);
        Button btnCero = findViewById(R.id.Cero);
        Button btnIgual = findViewById(R.id.Igual);

        // Set up button listeners
        btnBorrarTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pantalla.setText("");
                operador = "";
                valor1 = 0;
                operacion = false;
            }
        });

        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("7");
            }
        });

        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("8");
            }
        });

        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("9");
            }
        });

        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepararOperacion("+");
            }
        });

        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("4");
            }
        });

        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("5");
            }
        });

        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("6");
            }
        });

        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepararOperacion("-");
            }
        });

        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("1");
            }
        });

        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("2");
            }
        });

        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("3");
            }
        });

        btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepararOperacion("*");
            }
        });

        btnDividido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prepararOperacion("/");
            }
        });

        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                agregarNumero("0");
            }
        });

        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularResultado();
            }
        });
    }

    private boolean agregarNumero(String numero) {
        if (!operacion && pantalla.getText().toString().equals(String.valueOf(valor1))) {
            pantalla.setText(numero);
        } else {
            String textoActual = pantalla.getText().toString();
            pantalla.setText(textoActual + numero);
        }
        return true;
    }

    private void prepararOperacion(String operacion) {
        this.operador = operacion;
        this.valor1 = Double.parseDouble(pantalla.getText().toString());
        pantalla.setText("");
        this.operacion = true;
    }

    private void calcularResultado() {
        double valor2 = Double.parseDouble(pantalla.getText().toString());
        double resultado = 0;
        switch (operador) {
            case "+":
                resultado = valor1 + valor2;
                break;
            case "-":
                resultado = valor1 - valor2;
                break;
            case "*":
                resultado = valor1 * valor2;
                break;
            case "/":
                if (valor2 != 0) {
                    resultado = valor1 / valor2;
                } else {
                    pantalla.setText("Error");
                    return;
                }
                break;
        }
        pantalla.setText(String.valueOf(resultado));
        valor1 = resultado;
        operador = "";
        operacion = false;
    }
}
