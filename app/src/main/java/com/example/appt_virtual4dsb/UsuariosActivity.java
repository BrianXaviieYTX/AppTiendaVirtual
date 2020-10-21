package com.example.appt_virtual4dsb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UsuariosActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuarios);

        FloatingActionButton AgregarUser = findViewById(R.id.fbaAgregarUser);
        FloatingActionButton EditarUser = findViewById(R.id.fbaEditarUser);
        FloatingActionButton DeleteUser = findViewById(R.id.fabEliminarUser);

        AgregarUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent
                        = new Intent(UsuariosActivity.this, InsertUsuario.class);
                startActivity(intent);
            }

        });
    }



}