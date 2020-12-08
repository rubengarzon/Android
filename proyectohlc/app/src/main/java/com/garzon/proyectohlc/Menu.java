package com.garzon.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Menu extends AppCompatActivity implements View.OnClickListener{
    private Intent intent1;
    private Intent intent2;
    private Intent intent3;
    private Intent intent4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        intent1 = new Intent(Menu.this, SumarMultiplicar.class);
        intent2 = new Intent(Menu.this, ListaCompra.class);
        intent3 = new Intent(Menu.this, Sobremi.class);
        intent4 = new Intent(Menu.this, MainActivity.class);

        Button button1 = findViewById(R.id.btnSumarMultiplicar);
        Button button2 = findViewById(R.id.btnListaCompra);
        Button button3 = findViewById(R.id.btnSobreMi);
        Button button4 = findViewById(R.id.btnInicio);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnSumarMultiplicar:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                startActivity(intent1);
                break;
            case R.id.btnListaCompra:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                startActivity(intent2);
                break;
            case R.id.btnSobreMi:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                startActivity(intent3);
                break;
            case R.id.btnInicio:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                startActivity(intent4);
                break;
            case View.NO_ID:
            default:
                // TODO Auto-generated method stub
                break;
        }
    }
}