package com.example.meena.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button polynomial_button = (Button) findViewById(R.id.polynomial_button);
        Button gcd_button = (Button) findViewById(R.id.gcd_button);
        Button matrix_button = (Button) findViewById(R.id.matrix_button);
        Button primefactor_button = (Button) findViewById(R.id.primefactor_button);

        polynomial_button.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, Polynomial.class));
            }
        });

        gcd_button.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, GCD.class));
            }
        });

        matrix_button.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, Matrix.class));
            }
        });

        primefactor_button.setOnClickListener(new OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(MainActivity.this, PrimeFactor.class));
            }
        });
    }

}
