package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseIntArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;
import java.util.Random;


public class Preguntas extends AppCompatActivity {

    ImageView imagenMostrar;
    TextView txtv;
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
        Pregunta p1 = new Pregunta(R.drawable.chewbacca, "¿Quien es este personaje de Star Wars?", "Chewbacca", pp1);

        // Pregunta 2
        ArrayList<String> pp2 = new ArrayList<String>();
        pp2.add("Anakin Skywalker");
        pp2.add("Luke Skywalker");
        pp2.add("Obi Wan Kenobi");
        pp2.add("R2D2");
        //im2.setImageResource(R.drawable.bob_esponja);
        Pregunta p2 = new Pregunta(R.drawable.darth, "¿Cual es el nombre de Darth Vader?", "Anakin Skywalker", pp2);

        // Pregunta 3
        ArrayList<String> pp3 = new ArrayList<String>();
        pp3.add("solo");
        pp3.add("Yoda");
        pp3.add("C3PO");
        pp3.add("Darth Maw");
        //im3.setImageResource(R.drawable.thor);
        Pregunta p3 = new Pregunta(R.drawable.han, "¿Con quien vivía Han Solo?", "C3PO", pp3);

        // Pregunta 4
        ArrayList<String> pp4 = new ArrayList<String>();
        pp4.add("Halcon 1");
        pp4.add("The Lorian");
        pp4.add("Halcon Milenario");
        pp4.add("Megazord");
        //im4.setImageResource(R.drawable.brian_oconner);
        Pregunta p4 = new Pregunta(R.drawable.halcon, "¿Como se llamaba la nave en la que viajaba Han Solo?", "Halcon Milenario", pp4);

        // Pregunta 5
        ArrayList<String> pp5 = new ArrayList<String>();
        pp5.add("Princesa Leia");
        pp5.add("Luke Skywalker");
        pp5.add("Bruce Wayne");
        pp5.add("Chespirito");
        //im5.setImageResource(R.drawable.tales);
        Pregunta p5 = new Pregunta(R.drawable.anakin, "¿Cual es el hijo mayor de Anakin Skywalker?", "Luke Skywalker", pp5);

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
        txtv = (TextView) findViewById(R.id.textView2);
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
            txtv.setText(p.get(n).getPreg());

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

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if ((keyCode == KeyEvent.KEYCODE_BACK)) {
            super.finishAffinity();
        }
        return super.onKeyDown(keyCode, event);
    }
}