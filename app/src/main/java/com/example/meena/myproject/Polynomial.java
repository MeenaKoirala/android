package com.example.meena.myproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Polynomial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_polynomial);

        Button polyVideo = (Button) findViewById(R.id.polyVideo_button);
        Button polySolve = (Button) findViewById(R.id.solve_polynomials);
        Button polyBack = (Button) findViewById(R.id.polynomial_back);

        polyVideo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Polynomial.this, learnPolynomial.class));
            }
        });

        polySolve.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Polynomial.this, PolyCalculate.class));
            }
        });

        polyBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Polynomial.this, MainActivity.class));
            }
        });
    }

}
