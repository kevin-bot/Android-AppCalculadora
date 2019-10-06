package com.example.primeraapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Se declaran las variables objetos
    EditText campo1,campo2;
    TextView etResultado;
    int numero1,numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //se enlazan las variables declaradas y los objetos de las interfaces por medio de sus id

        setContentView(R.layout.activity_main);
        campo1=findViewById(R.id.txtCampo1);
        campo2=findViewById(R.id.txtCampo2);
        etResultado=findViewById(R.id.tvresultado);


    }

    //en el xml en los btn suma,res.... se crea un metodo on click y este metodo se crea aca, en la
    // logica, luego con el switch validamos que btn fue presionado
    public void onclick(View view) {


        //se captura el valor de la cajas de texto

        if(campo1.getText().toString().equals("") || campo2.getText().toString().equals("")){
            Toast.makeText(this,"Los campos son obligatorios",Toast.LENGTH_LONG).show();
        }else{
        numero1=Integer.parseInt(campo1.getText().toString());
        numero2=Integer.parseInt(campo2.getText().toString());

        //operaciones segun el btn presionado
        switch (view.getId()){
            case R.id.btnsum: sumar();break;
            case R.id.btnResta: restar();break;
            case R.id.btnMul: multiplicar();break;
            case R.id.btnDivi: dividir();break;
        }}
    }


    // metodos que hacen las operaciones
    private void dividir() {
        if(numero2>0) {
            etResultado.setText("" + (numero1 / numero2));
        }else{
            etResultado.setText("Error,no se puede dividir por 0");
        }
    }

    private void multiplicar() {
        etResultado.setText(""+(numero1*numero2));
    }


    private void restar() {
        etResultado.setText(""+(numero1-numero2));
    }

    private void sumar() {
        etResultado.setText(""+(numero1+numero2));
    }
}
