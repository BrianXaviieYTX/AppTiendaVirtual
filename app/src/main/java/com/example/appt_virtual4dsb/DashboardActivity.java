package com.example.appt_virtual4dsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button irTienda = findViewById(R.id.btnIrTienda);
        Button usuarios = findViewById(R.id.btnUsuarios);
        Button clientes = findViewById(R.id.btnClientes);
        Button productos = findViewById(R.id.btnProductosDashboard);
        Button pedidos = findViewById(R.id.btnPedidos);

        irTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,MainActivity.class);
                startActivity(intent);

            }
        });
        usuarios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,UsuariosActivity.class);
                startActivity(intent);

            }
        });
        clientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,ClientesActivity.class);
                startActivity(intent);

            }
        });
        productos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,ProductosDashboardActivity.class);
                startActivity(intent);

            }
        });
        pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this,PedidosDashboardActivity.class);
                startActivity(intent);

            }
        });

    }
}