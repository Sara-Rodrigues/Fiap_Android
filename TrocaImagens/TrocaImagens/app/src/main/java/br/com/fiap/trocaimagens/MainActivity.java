package br.com.fiap.trocaimagens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Integer[] imagens = new Integer[]{
            R.drawable.jorel,
            R.drawable.juju,
            R.drawable.darwin
    };

    ImageView imgDesenho;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imgDesenho = findViewById(R.id.imgDesenho);
    }

    public void trocarImagem(View view) {
        Random r = new Random();

        int sorteado = r.nextInt(imagens.length);

        imgDesenho.setImageResource(imagens[sorteado]);
    }
}
