package com.awakelab.oskar.pantallasejercicio7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListeners();
        Toast.makeText(getBaseContext(), "Bienvenido a la App", Toast.LENGTH_SHORT).show();
    }

    private void initListeners() {
        Switch  switchTem = (Switch) findViewById(R.id.switchTema);

        switchTem.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(!isChecked) {
                    Toast.makeText(getBaseContext(), "Modo Noche", Toast.LENGTH_SHORT).show();
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
                }

                if (isChecked){
                    Toast.makeText(getBaseContext(), "Modo Dia", Toast.LENGTH_SHORT).show();
                    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
                }




            }
        });



      //  Toast.makeText(getBaseContext(), "Bienvenido a la App", Toast.LENGTH_SHORT).show();
    }



}