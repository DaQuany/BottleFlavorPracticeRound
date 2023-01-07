package com.example.practiceround;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Hospital1 extends AppCompatActivity {
    ImageView background;
    ImageView character;
    Button text;
    Button choice1, choice2, choice3, choice4;

    Story story = new Story(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital1);

        background = (ImageView)findViewById(R.id.background);
        character = (ImageView)findViewById(R.id.character);
        text = (Button)findViewById(R.id.talking);
        choice1 = (Button)findViewById(R.id.choice1);
        choice2 = (Button)findViewById(R.id.choice2);
        choice3 = (Button)findViewById(R.id.choice3);
        choice4 = (Button)findViewById(R.id.choice4);
        story.start();
    }

    public void choice1(View view){
        story.selectNext(story.c1);
    }
    public void choice2(View view){
        story.selectNext(story.c2);
    }
    public void choice3(View view) { story.selectNext(story.c3); }
    public void choice4(View view) { story.selectNext(story.c4); }
    public void text(View view) {story.selectNext(story.t);}
}


