package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.widget.ImageView;


import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
    ImageView im1;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;

    void crearPreguntas() {
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        ArrayList<String> pp1 = new ArrayList<String>();
        pp1.add("");
        im1.setImageResource(R.drawable.emoji);
        Pregunta p1 = new Pregunta(im1, "¿Quien es este personaje?", "Chewbacca", pp1);
    }



    //Pregunta p1 = new Pregunta();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}