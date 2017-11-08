package com.example.erickcairdiel.koko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RConductorDatosAutomovil extends AppCompatActivity {

    Button continuar;
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rconductor_datos_automovil);

        continuar = findViewById(R.id.btn_continuar);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent continuar = new Intent(RConductorDatosAutomovil.this,PrincipalConductor.class);
                startActivity(continuar);

            }
        });

        regresar = findViewById(R.id.btn_regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent regresar = new Intent(RConductorDatosAutomovil.this,RTipoDeCuenta.class);
                startActivity(regresar);

            }
        });
    }
}
