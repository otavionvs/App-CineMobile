package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class SinopseFilme extends AppCompatActivity {

    FloatingActionButton voltar;
    MainActivity mainActivity;
    TextView nomeFilme2;
    TextView sinopseFilme2;
    TextView entradaFilme2;
    Filme filme;
    int pos = 0;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopse_filme);

        Intent intent = getIntent();
        pos = intent.getIntExtra("livro", 0);

        voltar = findViewById(R.id.voltar2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

        this.updateLabel();
    }

    private void updateLabel() {
        Filme  filme = MainActivity.listaFilmes.get(this.pos);

        nomeFilme2 = findViewById(R.id.nomeFilme);
        nomeFilme2.setText(filme.getTitulo());

        sinopseFilme2 = findViewById(R.id.sinopseFilme);
        sinopseFilme2.setText(filme.getSinopse());

        entradaFilme2 = findViewById(R.id.entrada);
        entradaFilme2.setText(filme.getEntrada());
    }
}