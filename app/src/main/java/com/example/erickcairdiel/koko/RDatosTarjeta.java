package com.example.erickcairdiel.koko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RDatosTarjeta extends AppCompatActivity
{

    Button continuar;
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdatos_tarjeta);

        continuar = findViewById(R.id.btn_continuar);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent continuar = new Intent(RDatosTarjeta.this,RTipoDeCuenta.class);
                startActivity(continuar);

            }
        });

        regresar = findViewById(R.id.btn_regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent regresar = new Intent(RDatosTarjeta.this,RMetodoDePago.class);
                startActivity(regresar);

            }
        });

    }
}
