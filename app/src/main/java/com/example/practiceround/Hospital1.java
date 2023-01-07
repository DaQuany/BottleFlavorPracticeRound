package com.example.practiceround;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Collections;

public class Hospital1 extends AppCompatActivity {

    ImageView background;
    ImageView character;
    Button text;
    Button choice1, choice2, choice3, choice4;
    Button savebt;
    static TextView savenumber;

    int game = 1;

    //세이브 관련
    String savehere;
    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String SAVES = "text";

    //connecting story and mainActivity
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
        savebt = (Button)findViewById(R.id.savebt);
        savenumber = (TextView)findViewById(R.id.savenumber);
        story.start();

        if(getIntent().hasExtra("msg")){
            savenumber.setText("0");
        }
        else{
            loadData();
            savenumber.setText(savehere);
        }

        story.selectNext(savenumber.getText().toString());

        //button for save
        savebt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                System.out.println(savenumber.getText().toString());
                saveData();
            }
        });
    }

    public void choice1(View view){story.selectNext(story.c1);}
    public void choice2(View view){story.selectNext(story.c2);}
    public void choice3(View view){story.selectNext(story.c3);}
    public void choice4(View view){story.selectNext(story.c4);}
    public void text(View view){story.selectNext(story.t);}

    //save 관련
    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SAVES, savenumber.getText().toString());

        editor.commit();
        Toast.makeText(this,"DATA SAVED", Toast.LENGTH_SHORT).show();
        System.out.println(savenumber.getText().toString());
    }

    public void loadData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        savehere = sharedPreferences.getString(SAVES, "");
    }
}


