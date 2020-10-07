package com.example.HolaMundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class HolaMundo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i("Tag ciclo vida", "Ciclovida: onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Tag ciclo vida", "Ciclovida: onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Tag ciclo vida", "Ciclovida: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Tag ciclo vida", "Ciclovida: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Tag ciclo vida", "Ciclovida: onStop");
    }
}