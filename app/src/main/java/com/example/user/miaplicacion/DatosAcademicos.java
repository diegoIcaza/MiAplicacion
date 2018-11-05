package com.example.user.miaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DatosAcademicos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_academicos);
    }
    public void Regresar(View view){

        Intent regresa = new Intent(this, MainActivity.class);
        startActivity(regresa);
    }
}
