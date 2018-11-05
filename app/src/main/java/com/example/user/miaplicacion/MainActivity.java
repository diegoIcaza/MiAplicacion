package com.example.user.miaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void DatosPersonal(View view){

        Intent datosPersonal = new Intent(this, DatosPersonales.class);
        startActivity(datosPersonal);
    }
    public void DatoAcademico(View view){

        Intent academico = new Intent(this, DatosAcademicos.class);
        startActivity(academico);
    }
    public void Experiencia(View view){

        Intent laboral = new Intent(this, ExperienciasLaborales.class);
        startActivity(laboral);
    }
    public void Cerrar(View view){


        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        finish();
        startActivity(intent);
}
}
