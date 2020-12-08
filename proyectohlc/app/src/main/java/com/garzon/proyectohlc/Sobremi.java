package com.garzon.proyectohlc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Sobremi extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobremi);

        Button btnShareText = findViewById(R.id.btnShareText);
        Button btnLugar = findViewById(R.id.btnLugar);
        Button btnTwitter = findViewById(R.id.btnTwitter);

        btnShareText.setOnClickListener(this);
        btnLugar.setOnClickListener(this);
        btnTwitter.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnTwitter:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                String url = "https://twitter.com/rubengrzon";

                Uri webpage = Uri.parse(url);
                Intent intent = new Intent(Intent.ACTION_VIEW, webpage);

                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Log.d("ImplicitIntents", "No se puede manejar esta intención");
                }
                break;
            case R.id.btnLugar:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                Uri gmmIntentUri = Uri.parse("geo:37.8789881,-4.7804544");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if (mapIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(mapIntent);
                }
                break;
            case R.id.btnShareText:
                Toast.makeText(getApplicationContext(), "OnClickListener", Toast.LENGTH_LONG).show();
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "El proyecto me ha parecido entretenido porque su finalidad era aprender todos los conceptos de android de una manera divertida.");
                sendIntent.setType("text/plain");

                Intent shareIntent = Intent.createChooser(sendIntent, null);
                startActivity(shareIntent);
                break;
            case View.NO_ID:
            default:
                // TODO Auto-generated method stub
                break;
        }
    }
}