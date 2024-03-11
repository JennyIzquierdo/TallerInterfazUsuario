package com.example.activity_iudigital_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        /*Construir una pantalla de tipo Splash como entrada o inicio de la aplicación.*/
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimerTask inicio = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, LoginIUD.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(inicio, 3000);

        /*Interfaz para el registro de un usuario si no esta registrado y se pueda logear.*/
       /* setContentView(R.layout.activity_login_iud);
        Button registerButton = findViewById(R.id.registerButton);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cuando se hace clic en el botón de registro, se inicia la actividad de registro
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });*/
    }
}