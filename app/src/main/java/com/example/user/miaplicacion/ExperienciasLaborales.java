package com.example.user.miaplicacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ExperienciasLaborales extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experiencias_laborales);
    }
    public void Retro(View view){

        Intent regre = new Intent(this, MainActivity.class);
        startActivity(regre);
    }
}
