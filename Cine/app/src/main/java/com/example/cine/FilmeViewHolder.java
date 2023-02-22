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
        this.nomeFilme = itemView.findViewById(R.id.nomeFilme);
        this.sinopseFilme = itemView.findViewById(R.id.sinopseFilme);
        this.entradaFilme = itemView.findViewById(R.id.entrada);
        this.fotoFilme = itemView.findViewById(R.id.fotoFilme);
        this.quadrado = itemView.findViewById(R.id.quadrado);
    }
}
