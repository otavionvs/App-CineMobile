package com.example.cine;

import android.net.Uri;

public class Filme {
    String titulo, sinopse, entrada;
    Uri imagem;

    public Filme(String titulo, String sinopse, String entrada, Uri imagem) {
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.entrada = entrada;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public Uri getImagem() {
        return imagem;
    }

    public void setImagem(Uri imagem) {
        this.imagem = imagem;
    }
}
