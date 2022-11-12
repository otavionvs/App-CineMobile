package com.example.cine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            Button cadastrar = (Button) findViewById(R.id.cadastro);


    cadastrar.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent it = new Intent(MainActivity.this, Cadastro.class);
            startActivity(it);
        }
    });
    }



//    public void proximaTela(View view){
//        Intent intent = new Intent(MainActivity.this, Cadastro.class);
//        startActivity(intent);
//    }
}