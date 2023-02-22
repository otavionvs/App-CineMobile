package com.example.cine;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FilmeAdapter extends RecyclerView.Adapter<FilmeViewHolder> {
    public Context context;
    public static List<Filme> listaFilmes;
    public SelectListener listener;

    public FilmeAdapter(Context context, List<Filme> listaFilme, SelectListener listener) {
        this.context = context;
        this.listaFilmes = listaFilme;
        this.listener = listener;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
        return new FilmeViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_filme, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder filmeViewHolder, @SuppressLint("RecyclerView") int position) {
        filmeViewHolder.nomeFilme.setText(listaFilmes.get(position).getTitulo());
        filmeViewHolder.sinopseFilme.setText(listaFilmes.get(position).getSinopse());
        filmeViewHolder.entradaFilme.setText(listaFilmes.get(position).getEntrada());
        filmeViewHolder.fotoFilme.setImageURI(listaFilmes.get(position).getImagem());

        MainActivity.filmeClicado = position;
        filmeViewHolder.quadrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onItemClicked(listaFilmes.get(position));
            }

            ;
        });
    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }
}
