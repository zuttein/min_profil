package com.example.min_profil;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton linkedin_btn = findViewById(R.id.linkedin_btn);


        linkedin_btn.setOnClickListener(new View.OnClickListener() {
            Intent linkedinIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.linkedin.com/in/dennis-nilsson-953045290/"));
            @Override
            public void onClick(View view) {
                startActivity(linkedinIntent);



            }
        });
    }
}