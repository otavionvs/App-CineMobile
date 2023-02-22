package com.example.cine;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.List;

public class SinopseFilme extends AppCompatActivity {

//    FloatingActionButton voltar;
//    MainActivity mainActivity;
//    TextView nomeFilme2;
//    TextView sinopseFilme2;
//    TextView entradaFilme2;
//    Filme filme;
//    int pos = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinopse_filme);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String nome = extras.getString("titulo");
            TextView nometxt = (TextView) findViewById(R.id.titulo);
            nometxt.setText(nome);
            String sinopse = extras.getString("sinopse");
            TextView sinopsetxt = (TextView) findViewById(R.id.sinopse);
            sinopsetxt.setText(sinopse);
            String entrada = extras.getString("entrada");
            TextView entradatxt = (TextView) findViewById(R.id.entrada);
            entradatxt.setText(entrada);
            String imagem = extras.getString("imagem");
            Uri imagemConvertida = Uri.parse(imagem);

            ImageView imageview = (ImageView) findViewById(R.id.imagem);
            imageview.setImageURI(imagemConvertida);
        }

        FloatingActionButton botaoVoltar = findViewById(R.id.voltarDetalhes);
        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                finish();
            }
        });

        Button deletar = findViewById(R.id.deleta);
        deletar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.listaFilmes.remove(MainActivity.filmeClicado);
                MainActivity.adapter.notifyItemRemoved(MainActivity.filmeClicado);
                System.out.println("Aqui: " + savedInstanceState);
                finish();
            }
        });
    }


//    private void updateLabel() {
//        Filme  filme = MainActivity.listaFilmes.get(this.pos);
//
//        nomeFilme2 = findViewById(R.id.nomeFilme);
//        nomeFilme2.setText(filme.getTitulo());
//
//        sinopseFilme2 = findViewById(R.id.sinopseFilme);
//        sinopseFilme2.setText(filme.getSinopse());
//
//        entradaFilme2 = findViewById(R.id.entrada);
//        entradaFilme2.setText(filme.getEntrada());
//    }
}

//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_sinopse_filme);
//
//        Intent intent = getIntent();
//        pos = intent.getIntExtra("filme", 0);
//
//        voltar = findViewById(R.id.voltar2);
//
//        voltar.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), MainActivity.class);
//                startActivity(i);
//            }
//        });
//
//        this.updateLabel();
//    }