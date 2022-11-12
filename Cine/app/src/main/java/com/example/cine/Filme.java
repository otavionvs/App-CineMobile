package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Filme extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filme);
    }

    String Titulo, sinopse;
}