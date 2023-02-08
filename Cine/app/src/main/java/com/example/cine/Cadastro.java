package com.example.cine;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class Cadastro extends AppCompatActivity {
    public static final int PICK_IMAGE = 1;
    Uri uri;

    public void pickImage() {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, 3);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            Uri selectedImagem = data.getData();
            uri =selectedImagem;
            ImageView imageView = findViewById(R.id.imageView);
            imageView.setImageURI(selectedImagem);
        }else{
            System.out.println("oi");
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cadastro);

        Button imageButton = findViewById(R.id.buttonImagem);
        imageButton.setOnClickListener((v -> pickImage()));

        Button botaoCadastro = findViewById(R.id.buttonCadastrar);
        botaoCadastro.setOnClickListener((v -> {
            Intent i = new Intent(Cadastro.this, MainActivity.class);
            EditText nome = (EditText)  findViewById(R.id.inputTitulo);
            i.putExtra("nome", nome.getText().toString());
            EditText sinopse = (EditText)  findViewById(R.id.inputSinopse);
            i.putExtra("sinopse", sinopse.getText().toString());
            EditText editora = (EditText)  findViewById(R.id.inputEntrada);
            i.putExtra("editora", editora.getText().toString());
            if(uri != null){
                i.putExtra("imagem", uri.toString());
            }else{
                i.putExtra("imagem", "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAADIAAAAyCAYAAAAeP4ixAAAACXBIWXMAAAsTAAALEwEAmpwYAAAAAXNSR0IArs4c6QAAAARnQU1BAACxjwv8YQUAAAITSURBVHgB7Zg7SANBFEU3fgkoBC1SpEmTQiux0EKstBIxmo+aOq12KbW1TSfYCDZiayUWYiFWVlqIhY0kfgtB8P8b75AFl9nRjHnxbYo5cAlJzs7elw277DqOxWKxWCyWxkIIMYlcIefIhIF7iZSruaygzADyKL65qIfLCorE3KPgpUR1WUGJMHKgFPtEchSXFRQIIevCzxLFZQclFjTFNpEmissKCkwhH0qxI6ST4rKCAn3IvVLsBolTXFZQIIqcKcVekGGKywoKtCF7wk+e4rKDEquaYkWqywpKFDTFtpEWissKCowh70qxEyRCcVlBgR7kTil2iyQoLiso0IWcKsXekBGKywoKtCI7ws88xWUHJZY1xVaoLisoMacptit/eYpbbadJUbnLkkk7RLDGqPvf9iL/+90U12THZc8ictFZp0awbUJUzjJe5Fmol+Ka7rykLFbTMNgmghwra8nrwTjF/UuBFPJKGQZuM7Il/BQobi3DZCjDwCtqiq1RXdZh8H1eU2wfaae4rMPg8yHkWfHl/UOU4rIOg/dx5FrxHpB+zZrGLusweO1ADpXv5WOZjGYtY/e/hpkR/ouVfJ8TlacXKovudt4LbPY3lw3scFpzZHRsICF3m7Kpyz1MVviPjBf55C/s8UumbhDD/HRk5NPwmOKmTN1AEP4TwBMySHUDAWXS7i8rk6yXa7FYLBZL0HwBYmOUou1TWSkAAAAASUVORK5CYII=");
            }
            startActivity(i);
        }));

        FloatingActionButton voltar = findViewById(R.id.voltar2);

        voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });

    }

}
