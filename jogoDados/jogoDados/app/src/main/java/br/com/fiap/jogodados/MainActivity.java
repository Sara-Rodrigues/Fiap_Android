package br.com.fiap.jogodados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Integer[] imagens = new Integer[]{
            R.drawable.dado_1,
            R.drawable.dado_2,
            R.drawable.dado_3,
            R.drawable.dado_4,
            R.drawable.dado_5,
            R.drawable.dado_6
    };

    ImageView primeiroDado;
    ImageView segundoDado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    primeiroDado = findViewById(R.id.primeiroDado);
    segundoDado = findViewById(R.id.segundoDado);

    }

    public void jogar(View view) {
        Random r = new Random();

        int sorteiaPrimeiroDado = r.nextInt(imagens.length);
        int sorteiaSegundoDado = r.nextInt(imagens.length);

        primeiroDado.setImageResource(imagens[sorteiaPrimeiroDado]);
        segundoDado.setImageResource(imagens[sorteiaSegundoDado]);

        if (sorteiaPrimeiroDado > sorteiaSegundoDado){
            Toast.makeText(this, "Primeiro ganhou", Toast.LENGTH_SHORT).show();
        }else if (sorteiaPrimeiroDado == sorteiaSegundoDado){
            Toast.makeText(this, "Temos um empate", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "Segundo ganhou", Toast.LENGTH_SHORT).show();
        }
    }

}
