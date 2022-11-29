package com.example.cine;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeViewHolder> {
    private Context context;
    private ArrayList<Filme> listaFilmes;
    private int[] imagens;

    public FilmeAdapter(Context context, ArrayList<Filme> listaFilme, int[] imagem) {
        this.context = context;
        this.listaFilmes = listaFilme;
        this.imagens = imagem;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_filme, parent, false);
        FilmeViewHolder viewHolder = new FilmeViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder filmeViewHolder, int position) {
        Filme livroPadrao = listaFilmes.get(position);
        filmeViewHolder.nomeFilme.setText(livroPadrao.getTitulo());
        filmeViewHolder.sinopseFilme.setText(livroPadrao.getSinopse());
        filmeViewHolder.entradaFilme.setText(livroPadrao.getEntrada());
        filmeViewHolder.fotoFilme.setImageResource(livroPadrao.getImagem());
        filmeViewHolder.quadrado.setOnClickListener(v -> {
            Intent intent = new Intent(context, SinopseFilme.class);
            intent.putExtra("livro", position);
            context.startActivity(intent);
        });

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }
}
