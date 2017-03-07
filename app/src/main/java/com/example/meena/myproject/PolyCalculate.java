package com.example.meena.myproject;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PolyCalculate extends AppCompatActivity {

    EditText poly1;
    EditText poly2;
    int[] coef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poly_calculate);

        poly1 = (EditText) findViewById(R.id.editPoly1);
        poly2 = (EditText) findViewById(R.id.editText2);
        Button solve_poly_btn = (Button) findViewById(R.id.poly_calculate);

        solve_poly_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String first = poly1.getText().toString();
                String second = poly2.getText().toString();



                Context context = getApplicationContext();
                CharSequence text = first+second;
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }

}
