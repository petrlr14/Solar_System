package com.pdm00057616.solarsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class Main2Activity extends AppCompatActivity {

    TextView textViewContent;
    TextView textViewName;
    ImageView imageView;
    Serializable planet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textViewName = findViewById(R.id.textViewName);
        imageView=findViewById(R.id.image_planet);
        textViewContent=findViewById(R.id.textViewContent);
        Intent callingIntent = getIntent();
        if (callingIntent.getSerializableExtra("Planet") instanceof Serializable){
            handleRecivedObject(callingIntent);
        }
    }

    private void handleRecivedObject(Intent intent){
        planet=intent.getSerializableExtra("Planet");
        Planet planet1=(Planet)planet;
        String textName = planet1.getName();
        textViewName.setText(textName);
        textViewContent.setText(planet1.getContent());
        imageView.setImageResource(planet1.getImageView());
        textViewName.setTextColor(planet1.getColor());

    }

}
