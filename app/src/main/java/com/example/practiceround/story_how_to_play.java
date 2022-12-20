package com.example.practiceround;

import android.view.View;


public class story_how_to_play {

    How_to_play hp;
    String next, t;

    public story_how_to_play(How_to_play hp){this.hp = hp;}

    public void storyNext(String next) {
        switch (next) {
            case "1": explain1(); break;
            case "2": explain2(); break;
            case "3": explain3(); break;
        }
    }

    public void start(){
        hp.background.setVisibility(View.VISIBLE);
        hp.text.setText("이 게임은 플레이어의 선택에 따라 사건의 이야기가 진행이 되는 게임 입니다.");
        t = "1";
    }

    public void explain1 () {
        hp.background.setImageResource(R.mipmap.giseok2);
        hp.text.setText("게임을 진행하는 도중 여러 선택지가 나오는데, 플레이어는 선택지를 확인하고 이중 더 선호하는 대답을 선택할 수 있습니다.");
        t = "2";
    }

    public void explain2 () {
        hp.background.setImageResource(R.mipmap.giseok3);
        hp.text.setText("플레이어의 선택에 따라 주인공이 히로인에 대한 호감도가 변동됩니다. 히로인에 대한 호감도에 따라 스토리의 결말이 바뀝니다.");
        t = "3";
    }

    public void explain3 () {
        hp.background.setImageResource(R.mipmap.giseok4);
        hp.text.setText("게임 도중 스토리를 저장하기 위해서는 위의 톱니바퀴 모양의 설정을 누름으로 저장이 가능합니다.");
        t = "4";
    }
}