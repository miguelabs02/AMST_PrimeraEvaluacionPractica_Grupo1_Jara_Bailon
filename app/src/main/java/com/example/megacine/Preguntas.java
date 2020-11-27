package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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
    //ArrayList<Integer> preguntas_expuestas;
    //Boolean Ganador;
    //Boolean respuesta_correcta;
    public int aciertos;
    ArrayList<Integer> random;
    ArrayList<Pregunta> p;

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
        //preguntas_expuestas = new ArrayList<>();
        //Ganador = false;
        //respuesta_correcta = true;
        aciertos = 0;
        p = crearPreguntas();
        random = crearRandom();
        mostrarPreguntas(p,random.get(aciertos));

    }

    void mostrarPreguntas(ArrayList<Pregunta> p,int n){
            imagenMostrar.setImageResource(p.get(n).getImv());
            opcion_1.setText(p.get(n).getResp().get(0));
            opcion_2.setText(p.get(n).getResp().get(1));
            opcion_3.setText(p.get(n).getResp().get(2));
            opcion_4.setText(p.get(n).getResp().get(3));

    }

    ArrayList<Integer> crearRandom(){
        ArrayList<Integer> lista = new ArrayList<>();
        while(lista.size()<5){
            Random rand = new Random();
            Integer n = rand.nextInt(5);
            if (!lista.contains(n)){
                lista.add(n);
            }
        }
        return lista;
    }

    public void onClick(View view){
        System.out.println(random.toString());
        if(opcion_1.isPressed()) {
            if (opcion_1.getText().equals(p.get(random.get(aciertos)).getRespCorr())) {
                aciertos += 1;
                if (aciertos == 5) {
                    aciertos=0;
                    Intent victoria = new Intent(Preguntas.this, P_Acierto.class);
                    startActivity(victoria);
                }
                mostrarPreguntas(p, random.get(aciertos));
            }else{
                Intent fallo = new Intent(Preguntas.this, P_Fallo.class);
                Bundle bund = new Bundle();
                bund.putSerializable("aciertos",aciertos);
                fallo.putExtras(bund);
                startActivity(fallo);
                aciertos=0;
            }
        }
        else if(opcion_2.isPressed()){
            if (opcion_2.getText().equals(p.get(random.get(aciertos)).getRespCorr())) {
                aciertos += 1;
                if (aciertos == 5) {
                    aciertos=0;
                    Intent victoria = new Intent(Preguntas.this, P_Acierto.class);
                    startActivity(victoria);
                }
                mostrarPreguntas(p, random.get(aciertos));
            }else{
                Intent fallo = new Intent(Preguntas.this, P_Fallo.class);
                Bundle bund = new Bundle();
                bund.putSerializable("aciertos",aciertos);
                fallo.putExtras(bund);
                startActivity(fallo);
                aciertos=0;
            }
        }
        else if(opcion_3.isPressed()){
            if (opcion_3.getText().equals(p.get(random.get(aciertos)).getRespCorr())) {
                aciertos += 1;
                if (aciertos == 5) {
                    aciertos=0;
                    Intent victoria = new Intent(Preguntas.this, P_Acierto.class);
                    startActivity(victoria);
                }
                mostrarPreguntas(p, random.get(aciertos));
            }else{
                Intent fallo = new Intent(Preguntas.this, P_Fallo.class);
                Bundle bund = new Bundle();
                bund.putSerializable("aciertos",aciertos);
                fallo.putExtras(bund);
                startActivity(fallo);
                aciertos=0;
            }
        }
        else if(opcion_4.isPressed()){
            if (opcion_4.getText().equals(p.get(random.get(aciertos)).getRespCorr())) {
                aciertos += 1;
                if (aciertos == 5) {
                    aciertos=0;
                    Intent victoria = new Intent(Preguntas.this, P_Acierto.class);
                    startActivity(victoria);
                }
                mostrarPreguntas(p, random.get(aciertos));
            }else{
                Intent fallo = new Intent(Preguntas.this, P_Fallo.class);
                Bundle bund = new Bundle();
                bund.putSerializable("aciertos",aciertos);
                fallo.putExtras(bund);
                startActivity(fallo);
                aciertos=0;
            }
        }


    }


}