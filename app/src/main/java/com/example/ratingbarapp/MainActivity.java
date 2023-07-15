package com.example.ratingbarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    RatingBar rb;
    Button b;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb=findViewById(R.id.ratingBar);
        t1=findViewById(R.id.t1);
        b=findViewById(R.id.rate);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String r=String.valueOf(rb.getRating());
                t1.setText(r);
            }
        });



    }
}