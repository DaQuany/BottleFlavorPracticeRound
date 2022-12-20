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
        h1.savenumber.setText(next);
        switch (next){
            case "0": start(); break;
            case "1": text1(); break;
            case "2": text2(); break;
            case "3": text3(); break;
            case "4": text4(); break;
            case "5": text5(); break;
            case "6": text6(); break;
            case "7": text7(); break;
            case "8": text8(); break;
            case "9": text9(); break;
            case "s1": select1(); break;
            case "10a": text10a(); break;
            case "10b": text10b(); break;
            case "s2": select2(); break;
            case "11a": text11a(); break;
            case "11b": text11b(); break;
            case "12": text12(); break;
            case "13": text13(); break;
            case "s3": select3(); break;
            case "14a" : text14a(); break;
            case "14b" : text14b(); break;
            case "14c" : text14c(); break;
            case "15" : text15(); break;
            case "16" : text16(); break;
            case "s4" : select4(); break;
            case "17a" : text17a(); break;
            case "17b" : text17b(); break;
            case "17c" : text17c(); break;

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
        h1.text.setText("주인공 : (눈을 뜨면서)(으윽... 여긴...?)");
        noButton();
        t = "1";
    }

    public void text1(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nurse2);
        h1.text.setText("간호사 : 환자분!!! 괜찮으세요? 정신이 드시나요?");
        t = "2";
    }

    public void text2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 여..여기가 어디죠...?");
        t = "3";
    }

    public void text3(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 여긴 병원이예요.");
        t = "4";
    }

    public void text4(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 아... 저 번개 맞아서 죽은 거 아니었나요?");
        t = "5";
    }

    public void text5(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 무슨 소리예요. 환자분, 기억 안 나세요? 교통사고 당해서 응급실로 실려오셨어요.");
        t = "6";
    }

    public void text6(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : (아... 교통사고 난 걸로 처리가 된건가?)");
        t = "7";
    }

    public void text7(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 선생님 여기 환자 상태가 좀 이상해요. 아무래도 기억상실증에...");
        t = "8";
    }

    public void text8(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 아뇨 전 괜찮습니다. 잠시 착각했나보네요.(근데 어디서 많이 본 얼굴인데? 기분탓인가?)");
        t = "9";
    }

    public void text9(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 아... 네. 뭐.. 다행이네요.");
        t = "s1";
    }

    public void select1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("저희 혹시 어디서 본 적 있지 않아요?");
        h1.choice3.setText("이쁜 아가씨, 나같은 귀여운 동생 알지 않아?");
        c1 = "10a";
        c3 = "10b";
    }

    public void text10a(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("간호사 : 네!? 갑자기 무슨.... 어? 너 혹시 (땡땡땡)이니?");
        t = "s2";
    }

    public void text10b(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("간호사 : 네!? 갑자기 무슨.... 어? 너 혹시 (땡땡땡)이니?");
        t = "s2";
    }

    public void select2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("와... 누나 진짜 오랜만이다! 이런 데서 다 보네?");
        h1.choice3.setText("드디어 이 몸을 알아보았군!");
        c1 = "11a";
        c3 = "11b";
    }

    public void text11a(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("간호사 : 그러게..이게 무슨 일이야? 어쩌다가 응급실까지 오게 됐어. 조심 좀 하지...");
        t = "12";
    }

    public void text11b(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("간호사 : 그러게..이게 무슨 일이야? 어쩌다가 응급실까지 오게 됐어. 조심 좀 하지...");
        t = "12";
    }

    public void text12(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("주인공 : 하하... 어쩌다보니...(내가 10살 때 바닐라 누나가 이사갔으니까. 10년만에 보는건가? 옛날에도 예뻤지만... 지금은 빛이나네...)");
        t = "13";
    }

    public void text13(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 그래도 천만다행이야. 교통사고 난 것 치고는 크게 다치지 않아서. 빠르면 내일 아니면 모레쯤에는 퇴원해도 되겠어.");
        t = "s3";
    }

    public void select3(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("응. 알려줘서 고마워.");
        h1.choice2.setText("내 몸은 비브라늄이거든! 히힛!");
        h1.choice3.setText("사고낸 차주 어디갔어? 엉덩이로 걷어차줘야하는데.");
        c1 = "14a";
        c2 = "14b";
        c3 = "14c";
    }

    public void text14a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "15";
    }

    public void text14b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "15";
    }

    public void text14c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "15";
    }

    public void text15(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("누나, 잠깐만!");
        t = "16";
    }

    public void text16(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("응?");
        t = "s4";
    }

    public void select4(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("병원비 얼마 나왔어? 내가 돈 내야하는 건 아니지?");
        h1.choice2.setText("최대한 늦게 퇴원해야겠는 걸?");
        h1.choice3.setText("저기 옆에 누워계신 여자분 번호좀... 완전 내 스타일.");

        c1 = "17a";
        c2 = "17b";
        c3 = "17c";
    }

    public void text17a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "15";
    }

    public void text17b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "15";
    }

    public void text17c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "15";
    }

}
