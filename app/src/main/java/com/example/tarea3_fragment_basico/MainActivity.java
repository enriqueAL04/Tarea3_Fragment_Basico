package com.example.tarea3_fragment_basico;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {

    private EditText campoTexto;
    private Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        campoTexto = findViewById(R.id.editTextText);
        boton = findViewById(R.id.button);
        boton.setOnClickListener(new View.OnClickListener() {

    @Override
    public void onClick(View v) {
    String textoIngresado = campoTexto.getText().toString();
    BlankFragment fragmento = BlankFragment.nuevaInstancia(textoIngresado, "");
    FragmentTransaction transaccion = getSupportFragmentManager().beginTransaction();
    transaccion.replace(R.id.FrameLayout, fragmento);
    transaccion.commit();
        }
      });
    }
}
