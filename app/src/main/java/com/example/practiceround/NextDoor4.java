package com.example.practiceround;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class NextDoor4 extends AppCompatActivity {
    ImageView background;
    ImageView character;
    Button text;
    Button choice1, choice2, choice3;

    NextDoor4Story nextDoor4Story = new NextDoor4Story(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nextdoor4);

        background = (ImageView) findViewById(R.id.background);
        character = (ImageView) findViewById(R.id.character);
        text = (Button) findViewById(R.id.talking);
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        nextDoor4Story.start();
    }

    public void choice1(View view){ nextDoor4Story.selectNext(nextDoor4Story.c1); }
    public void choice2(View view){ nextDoor4Story.selectNext(nextDoor4Story.c2); }
    public void choice3(View view) { nextDoor4Story.selectNext(nextDoor4Story.c3); }
    public void text(View view) { nextDoor4Story.selectNext(nextDoor4Story.t); }
}
