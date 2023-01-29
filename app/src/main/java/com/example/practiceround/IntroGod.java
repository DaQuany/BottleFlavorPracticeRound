package com.example.practiceround;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class IntroGod extends AppCompatActivity {

    ImageView background;
    ImageView character;
    Button text, start, skip;
    StoryGod storyGod = new StoryGod(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.introgod);

        background = (ImageView)findViewById(R.id.background);
        character = (ImageView)findViewById(R.id.character);
        text = (Button)findViewById(R.id.talking);
        start = (Button)findViewById(R.id.startgame);
        skip = (Button)findViewById(R.id.skip);
        storyGod.start();

        findViewById(R.id.startgame).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroGod.this, NextDoor4.class));
            }
        });

        findViewById(R.id.skip).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(IntroGod.this, NextDoor4.class));
            }
        });
    }
    public void text(View view) {storyGod.selectNext(storyGod.t);}
}