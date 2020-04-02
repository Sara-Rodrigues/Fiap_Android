package br.com.fiap.desafiosoma;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

   EditText edtUm;
   EditText edtDois;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtUm = findViewById(R.id.edtUm);
        edtDois = findViewById(R.id.edtDois);
    }

    public void somar (View view) {
      try {
          String strUm = edtUm.getText().toString();
          String strDois = edtDois.getText().toString();

          Double um = Double.parseDouble(strUm);
          Double dois = Double.parseDouble(strDois);

          Double soma =  um + dois;

          Toast.makeText(
                  this,
                  "A soma é" + soma,
                  Toast.LENGTH_SHORT
          ).show();

      } catch (Exception e) {
          Toast.makeText(this,"Verifique os dados informados", Toast.LENGTH_SHORT).show();
          e.printStackTrace();
      }

    }

}
