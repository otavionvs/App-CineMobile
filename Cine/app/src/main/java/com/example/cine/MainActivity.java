package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener{

    private RecyclerView recycler;
    private FilmeAdapter adapter;
    public static List<Filme> listaFilmes = new ArrayList<Filme>();
    private int [] imagens = {R.drawable.pantera, R.drawable.addams, R.drawable.jurassic};


//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        recycler = findViewById(R.id.recyclerView);
//
//        listaFilmes.add(new Filme("Wakanda Forever", "Um filme da Marvel", "R$20,00", R.drawable.pantera));
//        listaFilmes.add(new Filme("Familia Addams", "Um Otimo filme", "R$20,00", R.drawable.addams));
//        listaFilmes.add(new Filme("Jurrasic Park", "Tem dinossauro", "R$20,00", R.drawable.jurassic));
////        listaFilmes.add(new Filme("Diario de um banana", "Um filme da Marvel", "R$20,00", R.drawable.pantera));
////        listaFilmes.add(new Filme("Familia Addams", "Um Otimo filme", "R$20,00", R.drawable.addams));
////        listaFilmes.add(new Filme("Jurrasic Park", "Tem dinossauro", "R$20,00", R.drawable.jurassic));
//
//        adapter = new FilmeAdapter(MainActivity.this, listaFilmes, this);
//        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);
//
//        recycler.setLayoutManager(layoutManager);
//        recycler.setItemAnimator(new DefaultItemAnimator());
//        recycler.setAdapter(adapter);
//
//        Button cadastrar = (Button) findViewById(R.id.cadastro);
//
//
//    cadastrar.setOnClickListener(new View.OnClickListener() {
//        public void onClick(View view) {
//            Intent it = new Intent(MainActivity.this, Cadastro.class);
//            startActivity(it);
//        }
//    });
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String titulo = extras.getString("titulo");
            String sinopse = extras.getString("sinopse");
            String entrada = extras.getString("entrada");
//            String ano = extras.getString("ano");
            String imagem = extras.getString("imagem");
            Uri fotoconvetida = Uri.parse(imagem);
            listaFilmes.add(new Filme(titulo, sinopse, entrada, fotoconvetida));
        }else {
//            listaFilmes.add(new Filme("Wakanda Forever", "Um filme da Marvel","123", R.drawable.addams));
//            listaFilmes.add(new Filme("Familia Addams", "Um Otimo filme@gmail.com","123", R.drawable.addams));
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);



        Button botao = findViewById(R.id.cadastro);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Cadastro.class);
                startActivity(i);
            }

        });

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new FilmeAdapter(getApplicationContext(), listaFilmes, this));
    }

    @Override
    public void onItemClicked(Filme filme) {
        Intent i = new Intent(MainActivity.this, SinopseFilme.class);
        i.putExtra("titulo", filme.getTitulo());
        i.putExtra("sinopse", filme.getSinopse());
        i.putExtra("entrada", filme.getEntrada());
        i.putExtra("imagem", filme.getImagem());
        startActivity(i);
    }

//    @Override
//    public void onItemClicked(Item item) {
//        Intent i = new Intent(MainActivity.this, DetalhesActivity.class);
//        i.putExtra("nome", item.getNome());
//        i.putExtra("sinopse",  item.getSinopse());
//        i.putExtra("editora", item.getEditora());
//        i.putExtra("ano", item.getAno());
//        i.putExtra("foto", item.getFoto());
//        startActivity(i);
//    }
}