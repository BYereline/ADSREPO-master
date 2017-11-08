package com.example.erickcairdiel.koko;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RdatosUsuarioGeneral extends AppCompatActivity
{

    Button continuar;
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rdatos_usuario_general);

        continuar = findViewById(R.id.btn_continuar);
        continuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent continuar = new Intent(RdatosUsuarioGeneral.this,RImagenPerfilUsuario.class);
                startActivity(continuar);

            }
        });

        regresar = findViewById(R.id.btn_regresar);
        regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent regresar = new Intent(RdatosUsuarioGeneral.this,CodigoDeVerificacion.class);
                startActivity(regresar);

            }
        });
    }
}
