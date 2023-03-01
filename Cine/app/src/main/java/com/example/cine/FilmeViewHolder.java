package com.example.cine;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FilmeViewHolder extends RecyclerView.ViewHolder {
    TextView nomeFilme, sinopseFilme, entradaFilme;
    ImageView fotoFilme;
    ConstraintLayout quadrado;
    Button deletar;

    public FilmeViewHolder(@NonNull View itemView) {
        super(itemView);
        this.nomeFilme = itemView.findViewById(R.id.nomeFilme);
        this.sinopseFilme = itemView.findViewById(R.id.sinopseFilme);
        this.entradaFilme = itemView.findViewById(R.id.entrada);
        this.fotoFilme = itemView.findViewById(R.id.fotoFilme);
        this.quadrado = itemView.findViewById(R.id.quadrado);
        this.deletar = itemView.findViewById(R.id.deletar);
    }
}
