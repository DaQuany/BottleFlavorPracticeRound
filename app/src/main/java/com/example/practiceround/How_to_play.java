package com.example.practiceround;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class How_to_play extends AppCompatActivity {
    ImageView background;
    Button text,button;
    Button text1, text2;

    story_how_to_play how_play = new story_how_to_play(this);

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.how_to_play);
        text = (Button)findViewById(R.id.next_how_to_play);
        background = (ImageView)findViewById(R.id.imageView);
        how_play.start();

    }
    public void text(View view) {how_play.storyNext(how_play.t); }


}
