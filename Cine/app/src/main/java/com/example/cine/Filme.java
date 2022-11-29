package com.example.cine;

public class Filme {
    private String Titulo, sinopse, entrada;
    private int imagem;

    public Filme(String titulo, String sinopse, String entrada, int imagem) {
        Titulo = titulo;
        this.sinopse = sinopse;
        this.entrada = entrada;
        this.imagem = imagem;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
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

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }
}
