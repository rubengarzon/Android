package com.garzon.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Lista extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        Articulos articulos = new Articulos();
        TextView textView;
        LinearLayout linearLayout = findViewById(R.id.LinearLayout);

        for (int i = 0; i < articulos.articulosList.size(); i++) {
            textView = new TextView(this);

            textView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
            textView.setTextSize(20);
            textView.setTextColor(Color.parseColor("white"));
            textView.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
            textView.setText(articulos.articulosList.get(i));

            textView.setId(View.generateViewId());
            linearLayout.addView(textView);

        }

        if(savedInstanceState != null){
            Toast.makeText(getApplicationContext(), "Restableciendo estado", Toast.LENGTH_LONG).show();
            for (int i = 0; i < articulos.articulosList.size(); i++) {
                articulos.articulosList.get(i);
            }
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        Articulos articulos = new Articulos();

        savedInstanceState.putStringArrayList("articulos", articulos.articulosList);

        super.onSaveInstanceState(savedInstanceState);
    }
}