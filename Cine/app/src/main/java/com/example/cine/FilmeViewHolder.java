package com.example.cine;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class FilmeViewHolder extends RecyclerView.ViewHolder {
        TextView nomeFilme, sinopseFilme, entradaFilme;
        ImageView fotoFilme;
        ConstraintLayout quadrado;

public FilmeViewHolder(@NonNull View itemView) {
        super(itemView);
        nomeFilme = itemView.findViewById(R.id.nomeFilme);
        sinopseFilme = itemView.findViewById(R.id.sinopseFilme);
        entradaFilme = itemView.findViewById(R.id.entrada);
        fotoFilme = itemView.findViewById(R.id.fotoFilme);
        quadrado = itemView.findViewById(R.id.quadrado);
        }
}
