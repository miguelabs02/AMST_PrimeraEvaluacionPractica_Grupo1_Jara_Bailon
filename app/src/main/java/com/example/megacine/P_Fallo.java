package com.example.megacine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class P_Fallo extends AppCompatActivity {
    TextView tv;
    int ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p__fallo);
        Bundle bun = this.getIntent().getExtras();
        ac = (Integer) bun.getSerializable("aciertos");

        tv = (TextView) findViewById(R.id.textView4);

        tv.setText("Numero de aciertos: "+ac);
    }

    public void volverJugar(View view){
        Intent inicio = new Intent(P_Fallo.this, MainActivity.class);
        startActivity(inicio);
    }

    public void salir(View view){
        Intent menu = new Intent(P_Fallo.this, MainActivity.class);
        startActivity(menu);
    }
}