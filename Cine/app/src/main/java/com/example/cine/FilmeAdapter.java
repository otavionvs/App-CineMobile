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

public class FilmeAdapter extends RecyclerView.Adapter<FilmeViewHolder> {
    private Context context;
    private ArrayList<Filme> listaFilmes;
//    private int[] imagens;
    public SelectListener listener;


    public FilmeAdapter(Context context, ArrayList<Filme> listaFilme, SelectListener listener) {
        this.context = context;
        this.listaFilmes = listaFilme;
//        this.imagens = imagem;
        this.listener = listener;
    }

    @NonNull
    @Override
    public FilmeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int typeView) {
//        View view = LayoutInflater.from(context).inflate(R.layout.activity_filme, parent, false);
//        FilmeViewHolder viewHolder = new FilmeViewHolder(view);
//        return viewHolder;
        return new FilmeViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_filme,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FilmeViewHolder filmeViewHolder, @SuppressLint("RecyclerView") int position) {
//        Filme filmes = listaFilmes.get(position);
        filmeViewHolder.nomeFilme.setText(listaFilmes.get(position).getTitulo());
        filmeViewHolder.sinopseFilme.setText(listaFilmes.get(position).getSinopse());
        filmeViewHolder.entradaFilme.setText(listaFilmes.get(position).getEntrada());
        filmeViewHolder.fotoFilme.setImageResource(listaFilmes.get(position).getImagem());

        filmeViewHolder.quadrado.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                listener.onItemClicked(listaFilmes.get(position));
            };
        });
//        filmeViewHolder.quadrado.setOnClickListener(v -> {
//            Intent intent = new Intent(context, SinopseFilme.class);
////            intent.putExtra("filme", position);
//            context.startActivity(intent);
//        });

    }

    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }
}
