package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;


public class Preguntas extends AppCompatActivity {
    ImageView im1;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;

    ArrayList<Pregunta> crearPreguntas() {
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        // Pregunta 1
        ArrayList<String> pp1 = new ArrayList<String>();
        pp1.add("Chewbacca");
        pp1.add("Mickey Mouse");
        pp1.add("Harry Potter");
        pp1.add("Bob Esponja");
        im1.setImageResource(R.drawable.emoji);
        Pregunta p1 = new Pregunta(im1, "¿Quien es este personaje?", "Chewbacca", pp1);

        // Pregunta 2
        ArrayList<String> pp2 = new ArrayList<String>();
        pp2.add("Arenita");
        pp2.add("Calamardo");
        pp2.add("Patricio");
        pp2.add("Bob Esponja");
        im2.setImageResource(R.drawable.emoji);
        Pregunta p2 = new Pregunta(im2, "¿Quien es este personaje?", "Bob Esponja", pp2);

        // Pregunta 3
        ArrayList<String> pp3 = new ArrayList<String>();
        pp3.add("Thor");
        pp3.add("Iron Man");
        pp3.add("Spiderman");
        pp3.add("Hulk");
        im3.setImageResource(R.drawable.emoji);
        Pregunta p3 = new Pregunta(im3, "¿Quien es este personaje?", "Thor", pp3);

        // Pregunta 4
        ArrayList<String> pp4 = new ArrayList<String>();
        pp4.add("Brian O'Conner");
        pp4.add("Dominic Toretto");
        pp4.add("Mia Toretto");
        pp4.add("Arturo Braga");
        im4.setImageResource(R.drawable.emoji);
        Pregunta p4 = new Pregunta(im4, "¿Quien es este personaje?", "Brian O'Conner", pp4);

        // Pregunta 5
        ArrayList<String> pp5 = new ArrayList<String>();
        pp5.add("Sonic");
        pp5.add("Tales");
        pp5.add("Amy");
        pp5.add("Dark Sonic");
        im5.setImageResource(R.drawable.emoji);
        Pregunta p5 = new Pregunta(im5, "¿Quien es este personaje?", "Tales", pp5);

        preguntas.add(p1);
        preguntas.add(p2);
        preguntas.add(p3);
        preguntas.add(p4);
        preguntas.add(p5);

        return preguntas;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preguntas);

        ArrayList<Pregunta> p = crearPreguntas();
    }
}