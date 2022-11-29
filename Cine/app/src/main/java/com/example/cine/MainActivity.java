package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    private FilmeAdapter adapter;
    public static ArrayList<Filme> listaFilmes = new ArrayList<>();
    private int [] imagens = {R.drawable.pantera, R.drawable.addams, R.drawable.jurassic};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler = findViewById(R.id.recyclerView);

        listaFilmes.add(new Filme("Diario de um banana", "Um filme da Marvel", "R$20,00", R.drawable.pantera));
        listaFilmes.add(new Filme("Familia Addams", "Um Otimo filme", "R$20,00", R.drawable.addams));
        listaFilmes.add(new Filme("Jurrasic Park", "Tem dinossauro", "R$20,00", R.drawable.jurassic));
        listaFilmes.add(new Filme("Diario de um banana", "Um filme da Marvel", "R$20,00", R.drawable.pantera));
        listaFilmes.add(new Filme("Familia Addams", "Um Otimo filme", "R$20,00", R.drawable.addams));
        listaFilmes.add(new Filme("Jurrasic Park", "Tem dinossauro", "R$20,00", R.drawable.jurassic));

        adapter = new FilmeAdapter(MainActivity.this, listaFilmes, imagens);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false);

        recycler.setLayoutManager(layoutManager);
        recycler.setItemAnimator(new DefaultItemAnimator());
        recycler.setAdapter(adapter);

        Button cadastrar = (Button) findViewById(R.id.cadastro);


    cadastrar.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent it = new Intent(MainActivity.this, Cadastro.class);
            startActivity(it);
        }
    });
    }

}