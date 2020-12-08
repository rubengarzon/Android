package com.garzon.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumarMultiplicar extends AppCompatActivity implements View.OnClickListener {
    private EditText editText1;
    private EditText editText2;
    private TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar_multiplicar);

        editText1 = findViewById(R.id.etNumero1);
        editText2 =findViewById(R.id.etNumero2);

        textView2 = findViewById(R.id.tvResultado);

        Button button1 = findViewById(R.id.btnSumar);
        Button button2 = findViewById(R.id.btnMultiplicar);
        Button button3 = findViewById(R.id.btnVolver);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);


        if(savedInstanceState != null){
            Toast.makeText(getApplicationContext(), "Restableciendo estado", Toast.LENGTH_LONG).show();
            textView2.setText(savedInstanceState.getString("resultado"));
        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("resultado", textView2.getText().toString());

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onClick(View v) {
        String numero1 = editText1.getText().toString();
        String numero2 = editText2.getText().toString();

        switch (v.getId()) {
            case R.id.btnSumar:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                int resultado = Integer.parseInt(numero1) + Integer.parseInt(numero2);
                textView2.setText(String.valueOf(resultado));
                break;
            case R.id.btnMultiplicar:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                int resultado2 = Integer.parseInt(numero1) * Integer.parseInt(numero2);
                textView2.setText(String.valueOf(resultado2));
                break;
            case R.id.btnVolver:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(SumarMultiplicar.this, Menu.class);
                startActivity(intent);
                break;
            case View.NO_ID:
            default:
                // TODO Auto-generated method stub
                break;
        }
    }
}