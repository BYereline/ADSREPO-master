package com.example.erickcairdiel.koko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RTipoDeCuenta extends AppCompatActivity {

    Button conductor;
    Button estudiante;
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rtipo_de_cuenta);

        conductor = findViewById(R.id.btnConductor);
        estudiante = findViewById(R.id.btnEstudiante);


        conductor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent siguientePantalla = new Intent(RTipoDeCuenta.this,RConductorDatosAutomovil.class);
                startActivity(siguientePantalla);
            }
        });

        estudiante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent siguientePantalla2 = new Intent(RTipoDeCuenta.this,PrincipalEstudiante.class);
                startActivity(siguientePantalla2);
            }
        });

        regresar = findViewById(R.id.btn_regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent regresar = new Intent(RTipoDeCuenta.this,RMetodoDePago.class);
                startActivity(regresar);

            }
        });
    }
}