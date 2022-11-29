package com.example.cine;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Cadastro extends AppCompatActivity {

    FloatingActionButton voltar;
    Button adicionarLista;
    private EditText inputNome;
    private EditText inputSinopse;
    private EditText inputPreco;
    private int fotoLivro;

    private RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

//        recycler = findViewById(R.id.recyclerView);
        adicionarLista = findViewById(R.id.buttonCadastrar);

        adicionarLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNome = findViewById(R.id.inputTitulo);
                inputSinopse = findViewById(R.id.inputSinopse);
                inputPreco = findViewById(R.id.inputEntrada);

                Filme filme = new Filme(inputNome.getText().toString(), inputSinopse.getText().toString(), inputPreco.getText().toString(), 2131165343);
                MainActivity.listaFilmes.add(filme);
                System.out.println("Livro Cadastrado");
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });



        voltar = findViewById(R.id.voltar2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }

}
