package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Random;


public class Preguntas extends AppCompatActivity {

    ImageView imagenMostrar;
    Button opcion_1;
    Button opcion_2;
    Button opcion_3;
    Button opcion_4;
    Random rand;
    ArrayList<Integer> preguntas_expuestas;
    Boolean Ganador;
    Boolean respuesta_correcta;
    /*ImageView im1;
    ImageView im2;
    ImageView im3;
    ImageView im4;
    ImageView im5;*/

    ArrayList<Pregunta> crearPreguntas() {
        ArrayList<Pregunta> preguntas = new ArrayList<>();
        // Pregunta 1
        ArrayList<String> pp1 = new ArrayList<String>();
        pp1.add("Chewbacca");
        pp1.add("Mickey Mouse");
        pp1.add("Harry Potter");
        pp1.add("Bob Esponja");
        //im1.setImageResource(R.drawable.chewbacca);
        Pregunta p1 = new Pregunta(R.drawable.chewbacca, "¿Quien es este personaje?", "Chewbacca", pp1);

        // Pregunta 2
        ArrayList<String> pp2 = new ArrayList<String>();
        pp2.add("Arenita");
        pp2.add("Calamardo");
        pp2.add("Patricio");
        pp2.add("Bob Esponja");
        //im2.setImageResource(R.drawable.bob_esponja);
        Pregunta p2 = new Pregunta(R.drawable.bob_esponja, "¿Quien es este personaje?", "Bob Esponja", pp2);

        // Pregunta 3
        ArrayList<String> pp3 = new ArrayList<String>();
        pp3.add("Thor");
        pp3.add("Iron Man");
        pp3.add("Spiderman");
        pp3.add("Hulk");
        //im3.setImageResource(R.drawable.thor);
        Pregunta p3 = new Pregunta(R.drawable.thor, "¿Quien es este personaje?", "Thor", pp3);

        // Pregunta 4
        ArrayList<String> pp4 = new ArrayList<String>();
        pp4.add("Brian O'Conner");
        pp4.add("Dominic Toretto");
        pp4.add("Mia Toretto");
        pp4.add("Arturo Braga");
        //im4.setImageResource(R.drawable.brian_oconner);
        Pregunta p4 = new Pregunta(R.drawable.brian_oconner, "¿Quien es este personaje?", "Brian O'Conner", pp4);

        // Pregunta 5
        ArrayList<String> pp5 = new ArrayList<String>();
        pp5.add("Sonic");
        pp5.add("Tales");
        pp5.add("Amy");
        pp5.add("Dark Sonic");
        //im5.setImageResource(R.drawable.tales);
        Pregunta p5 = new Pregunta(R.drawable.tales, "¿Quien es este personaje?", "Tales", pp5);

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
        //Instancias de Widgets utilizadas.
        imagenMostrar = (ImageView) findViewById(R.id.pelicula);
        opcion_1 = (Button) findViewById(R.id.btn_op_1);
        opcion_2 = (Button) findViewById(R.id.btn_op_2);
        opcion_3 = (Button) findViewById(R.id.btn_op_3);
        opcion_4 = (Button) findViewById(R.id.btn_op_4);
        preguntas_expuestas = new ArrayList<>();
        Ganador = false;
        respuesta_correcta = true;
        ArrayList<Pregunta> p = crearPreguntas();
        mostrarPreguntas(p);

    }

    void mostrarPreguntas(ArrayList<Pregunta> p){
        rand = new Random();
        Integer n = rand.nextInt(4)+1;
        if(!(preguntas_expuestas.contains(n))){
            imagenMostrar.setImageResource(p.get(n).getImv());
            opcion_1.setText(p.get(n).getResp().get(0));
            opcion_2.setText(p.get(n).getResp().get(1));
            opcion_3.setText(p.get(n).getResp().get(2));
            opcion_4.setText(p.get(n).getResp().get(3));
            preguntas_expuestas.add(n);
        }
    }
}