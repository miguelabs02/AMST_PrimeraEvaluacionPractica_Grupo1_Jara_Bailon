package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class P_Acierto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p__acierto);
    }

    public void salir(View view){
        Intent menu = new Intent(P_Acierto.this, MainActivity.class);
        startActivity(menu);
    }
}