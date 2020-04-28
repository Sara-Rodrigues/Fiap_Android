package br.com.fiap.nac;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void trocaFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.containerFragment, fragment)
                .addToBackStack(null)
                .commit();
    }


    public void trocarParaDodge(View view) {
        trocaFragment(new DodgeActivity());
    }

    public void trocarParaFord(View view) {
        trocaFragment(new FordActivity());
    }

    public void trocarParaFusca(View view) {
        trocaFragment(new FuscaActivity());
    }
}
