package com.garzon.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "centerCrop", Toast.LENGTH_LONG).show();
        Button btn = findViewById(R.id.btnBienvenido);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, Menu.class);
                startActivity(intent);
            }
        });
    }
}