package com.example.practiceround;

import android.view.View;
import android.widget.Button;

import com.example.practiceround.Hospital1;

import java.util.Arrays;

public class Story {

    Hospital1 h1;
    String c1, c2, c3, c4, t;

    public Story(Hospital1 h1){this.h1 = h1;}

    public void selectNext(String next){
        switch (next){
            case "1": text1(); break;
            case "2": text2(); break;
            case "3": text3(); break;
            case "4": text4(); break;
            case "5": text5(); break;
        }
    }

    public void showButton(){
        for (Button button : Arrays.asList(h1.choice1, h1.choice2, h1.choice3, h1.choice4)) {
            button.setVisibility(View.VISIBLE);
        }
    }
    public void noButton(){
        for (Button button : Arrays.asList(h1.choice1, h1.choice2, h1.choice3, h1.choice4)) {
            button.setVisibility(View.INVISIBLE);
        }
    }

    public void start(){
        h1.background.setImageResource(R.mipmap.hospitalbed);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 으... 어...");
        noButton();
        t = "1";
    }

    public void text1(){
        h1.background.setImageResource(R.mipmap.hospitalbed);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nurse2);
        h1.text.setText("??? : 깨어났니?");
        t = "2";
    }

    public void text2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 오..오카상... 10분만 더... 데스요...");
        t = "3";
    }

    public void text3(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("??? : 000아. 이제 정신차려.");
        t = "4";
    }

    public void text4(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 으..어? 에? 누..누구세요?");
        t = "5";
    }

    public void text5(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 너가 보기엔 내가 누구인것 같아?");
        t = "6";
    }
}
