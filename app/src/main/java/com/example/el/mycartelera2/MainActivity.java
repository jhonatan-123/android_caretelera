package com.example.el.mycartelera2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button txt_ingresar;
    EditText txt_usuario;
    EditText txt_clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_usuario = findViewById(R.id.edit_usuario);
        txt_usuario.setText("hola 1");
    }

    public void onclickIngresar(View target){
       // txt_usuario.setText("hola 2");
       // txt_usuario.getText();
        Intent ingreso = new Intent(MainActivity.this,Menu.class);
        MainActivity.this.startActivity(ingreso);
    }
}
