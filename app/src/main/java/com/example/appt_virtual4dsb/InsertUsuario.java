package com.example.appt_virtual4dsb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class InsertUsuario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insert_usuario);

        Button agregar_user = findViewById(R.id.btnGuardarUsuario);
        Button limpiar_campos = findViewById(R.id.btnLimpiar);
        Button cancelar = findViewById(R.id.btnCancelar);
        EditText nroIdentificacion = findViewById(R.id.etNroIdentificacion);
        EditText apellido =  findViewById(R.id.etApellido);
        EditText nroTelefono =  findViewById(R.id.etNroTelefomo);
        EditText email =  findViewById(R.id.etEmail);
        EditText direccion = findViewById(R.id.etDireccion);
        Spinner spinner = (Spinner) findViewById(R.id.listStatus);

    }
}