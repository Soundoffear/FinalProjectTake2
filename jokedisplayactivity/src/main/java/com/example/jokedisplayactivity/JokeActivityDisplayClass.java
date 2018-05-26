package com.example.jokedisplayactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivityDisplayClass extends AppCompatActivity {

    public static final String JOKE_DATA = "provided_joke_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display_class);

        Intent intent = getIntent();
        String jokeReceived = intent.getStringExtra(JOKE_DATA);

        TextView textView = findViewById(R.id.textView_joke_providing_activity);
        textView.setText(jokeReceived);

    }
}
