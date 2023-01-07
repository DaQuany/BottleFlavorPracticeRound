package com.example.practiceround;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;

public class Hospital1 extends AppCompatActivity {

    private DatabaseHelper db;
    private ArrayList<Hart> hartItem;
    private RecyclerView tv_hart;

    ImageView background;
    ImageView character;
    Button text;
    Button choice1, choice2, choice3, choice4;
    Button home;

    String scene200;

    static TextView savenumber;
    TextView ba_hart;
    TextView go_hart;
    TextView ge_hart;

    Button savebt;

    public static final String SHARED_PREFS = "sharedPrefs";
    public static final String SHARED_PREFS_hart = "sharedPrefs";
    public static final String SAVE_SCENE = "text";


    //connecting story and mainActivity
    Story story = new Story(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hospital1);

        setInit();

        background = (ImageView) findViewById(R.id.background);
        character = (ImageView) findViewById(R.id.character);
        text = (Button) findViewById(R.id.talking);
        db = new DatabaseHelper(this);

        // 조그만 선택형 버튼
        choice1 = (Button) findViewById(R.id.choice1);
        choice2 = (Button) findViewById(R.id.choice2);
        choice3 = (Button) findViewById(R.id.choice3);
        choice4 = (Button) findViewById(R.id.choice4);

        // 세이브 버튼
        savebt = (Button) findViewById(R.id.savebt);
        // 세이브 했을 때 신 넘버
        savenumber = (TextView) findViewById(R.id.savenumber);

        // 홈으로 돌아가기
        home = (Button) findViewById(R.id.bt_home);



        savebt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                savenumber.getText().toString();

                saveData();

            }
        });

        if(getIntent().hasExtra("msg")){
            go_hart.setText("0");
            ge_hart.setText("0");
            ba_hart.setText("0");
            savenumber.setText("0");
        }
        else{
            loadData();

            savenumber.setText(scene200);
        }

        story.selectNext(savenumber.getText().toString());

        home.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent(Hospital1.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private void setInit() {
        db = new DatabaseHelper(this);
        // 호감도 지수
        go_hart = (TextView) findViewById(R.id.tv_go);
        ge_hart = (TextView) findViewById(R.id.tv_ge);
        ba_hart = (TextView) findViewById(R.id.tv_ba);
//        db =
    }


    public void choice1(View view) {
        story.selectNext(story.c1);
    }
    public void choice2(View view) {
        story.selectNext(story.c2);
    }
    public void choice3(View view) {
        story.selectNext(story.c3);
    }
    public void choice4(View view) {
        story.selectNext(story.c4);
    }
    public void text(View view) {
        story.selectNext(story.t);
    }

    public void saveData(){
        SharedPreferences sharedPreferences = getSharedPreferences(SHARED_PREFS, MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(SAVE_SCENE, savenumber.getText().toString());
        editor.commit();

        Toast.makeText(this,"DATA SAVED", Toast.LENGTH_SHORT).show();
    }

    public void loadData(){
        SharedPreferences shared_scene = getSharedPreferences(SHARED_PREFS_hart, MODE_PRIVATE);
        scene200 = shared_scene.getString(SAVE_SCENE, "");
    }
}




