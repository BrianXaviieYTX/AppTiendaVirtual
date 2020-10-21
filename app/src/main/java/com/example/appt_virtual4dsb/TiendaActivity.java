package com.example.appt_virtual4dsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TiendaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);

        Button dashboard = findViewById(R.id.btnDashboard);
        Button perfil = findViewById(R.id.btnPerfil);
        Button categorias = findViewById(R.id.btnCategoria);
        Button compras = findViewById(R.id.btnCompras);
        Button carrito = findViewById(R.id.btnCarrito);
        Button pedidos = findViewById(R.id.btnPedidos);
        ImageButton imageButton = findViewById(R.id.btnLogo);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        dashboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,DashboardActivity.class);
                startActivity(intent);
            }
        });

        perfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,PerfilActivity.class);
                startActivity(intent);
            }
        });

        categorias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,CategoriasActivity.class);
                startActivity(intent);
            }
        });

        compras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,ComprasActivity.class);
                startActivity(intent);
            }
        });

        carrito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,CarritoActivity.class);
                startActivity(intent);
            }
        });

        pedidos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TiendaActivity.this,PedidosActivity.class);
                startActivity(intent);
            }
        });
    }
}