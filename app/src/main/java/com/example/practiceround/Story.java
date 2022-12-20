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
            case "18a" : text18a(); break;
            case "18b" : text18b(); break;
            case "18c" : text18c(); break;
            case "19" : text19(); break;
            case "20" : text20(); break;
//          병원2
            case "s5" : select5(); break;
            case "21a" : text21a(); break;
            case "21b" : text21b(); break;
            case "21c" : text21c(); break;
            case "21d" : text21d(); break;
            case "22" : text22(); break;
            case "s6" : select6(); break;
//            case "22a" : text22a(); break;
//            case "22b" : text22b(); break;
//            case "22c" : text22c(); break;
//            case "22d" : text22d(); break;
//            case "23a" : text23a(); break;
//            case "23b" : text23b(); break;
//            case "23c" : text23c(); break;
//            case "23d" : text23d(); break;
//            case "24a" : text24a(); break;
//            case "24b" : text24b(); break;
//            case "24c" : text24c(); break;
//            case "24d" : text24d(); break;
//            case "25" : text25(); break;
//            case "26" : text26(); break;
//            case "27" : text27(); break;
//            case "28" : text28(); break;
//            case "29" : text29(); break;
//            case "30" : text30(); break;
//            case "31" : text31(); break;
//            case "32" : text32(); break;
//            case "33" : text33(); break;
//            case "30" : text30(); break;
//            case "30" : text30(); break;
//            case "30" : text30(); break;
//            case "30" : text30(); break;
//            case "30" : text30(); break;


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
        h1.choice3.setText("후훗, 드디어 이 몸을 알아보았군!");
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
        h1.text.setText("주인공 : 하하... 어쩌다보니...(내가 10살 때 바닐라 누나가 이사갔으니까. 10년 만에 보는건가? 옛날에도 예뻤지만... 지금은 빛이 나네...)");
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
        h1.choice4.setVisibility(View.INVISIBLE);
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
        h1.choice2.setText("최대한 늦게 퇴원해야겠는 걸? 그래야 누나를 더 볼 수 있으니까..");
        h1.choice3.setText("저기 옆에 누워계신 여자분 번호좀... 완전 내 스타일ㅎㅎ.");
        h1.choice4.setVisibility((View.INVISIBLE));

        c1 = "17a";
        c2 = "17b";
        c3 = "17c";
    }

    public void text17a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("음.. 자세한 건 잘 모르겠는데 내일 원무과에서 접수해줄게!");
        h1.text.setText("빨리 퇴원하고 싶으면 적당히 안정을 취하고 있어~");
        t = "18a";
    }

    public void text17b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("쓸 데 없는 소리하지 마시고 안정이나 취하세요 환자분~");
        t = "18b";
    }

    public void text17c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("저기요!! 이 환자분 마취제 하나 놓아주세요!!!");
        t = "18c";
    }

    public void text18a(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아아, 알겠어. 알겠어. 그만할게ㅎㅎ 근데 누나..");
        h1.text.setText("오늘 간호복이 좀 잘어울리네?");
        t = "19";
    }

    public void text18b(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아아, 알겠어. 알겠어. 그만할게ㅎㅎ 근데 누나..");
        h1.text.setText("요즘 간호사들 사이에서도 부조리 있나?");
        t = "19";
    }

    public void text18c(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아, 알겠어. 알겠어. 그만할게ㅎㅎ 근데 누나..");
        h1.text.setText("내가 의사 되면 누나랑 결혼할 수 있으려나?ㅎㅎ 농담ㅋ");
        t = "19";
    }

    public void text19(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(누군가 간호사를 부르는 소리)네? 아 네! 금방 가겠습니다!! 000아 나중에 더 얘기하자ㅎㅎ 안녕!");
        t = "20";
    }

    public void text20(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(걸어가면서 독백) '나한테 그렇게 얘기해준 사람은 너가 처음이야..ㅎ'");
        t = "s5";
    }

    //병원2
    public void select5(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("누나에게 말을 걸지 말지 우물쭈물한다.");
        h1.choice2.setText("(누나이름을 크게 외치며 부른다) 야 바닐라!!!");
        h1.choice3.setText("돈만 놔두고 도망간다.");
        h1.choice4.setText("(씹덕 말투로) 오이오이 거기 간호사쨩! 배고프지? 이거 넣어두라구~");
        c1 = "21a";
        c2 = "21b";
        c3 = "21c";
        c4 = "21d";
    }

    public void text21a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(바닐라가 웃으며)어머, 000아! 무슨 일이야?");
        t = "22";
    }

    public void text21b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주변 사람들이 모두 바닐라를 쳐다본다. 바닐라 얼굴은 빨개지고 주인공은 당당하게 서있는다.)");
        t = "22";
    }

    public void text21c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공을 못본 바닐라는 돈만 가져간다.)");
        t = "22";
//      game over
    }

    public void text21d(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(극혐하는 표정으로 주인공을 쳐다본다.)");
        t = "22";
    }

    public void text22(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("무슨 일이야??");
        t = "s6";
    }

    public void select6(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText(View.INVISIBLE);
        showButton();
        h1.choice1.setText("(얼버무린다.) 어..으어... ㅈ..저... 그그그게...");
        h1.choice2.setText("(씨익)누나가 보고싶어서 왔지~");
        h1.choice3.setText("무슨 상관이지 닝겐!?!?!?");
        h1.choice4.setText("안녕하세요..(뻘쭘)");
        c1 = "22a";
        c2 = "22b";
        c3 = "22c";
        c4 = "22d";
    }

    public void text22a(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("");
        t = "22a";
    }

    public void text22b(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("");
        t = "23b";
    }

    public void text22c(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("");
        t = "23c";
    }

    public void text22d(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("");
        t = "23d";
    }

    public void text24a(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("병원비 내러 왔니?");
        t = "25";
    }

    public void text24b(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("병원비 내러 왔니?");
        t = "25";
    }

    public void text24c(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("병원비 내러 왔니?");
        t = "25";
    }

    public void text24d(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("병원비 내러 왔니?");
        t = "25";
    }

    public void text25(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("아.. 네..");
        t = "26";
    }

    public void text26(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("아 그래ㅎㅎ 총 50만원이야~");
        t = "27";
    }

    public void text27(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("아 네.. 여기요!");
        t = "28";
    }

    public void text28(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고마워~");
        t = "29";
    }

    public void text29(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("..............................");
        t = "30";
    }

    public void text30(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("이제 곧 퇴원이지??");
        t = "31";
    }

    public void text31(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("네..ㅎㅎ");
        t = "32";
    }

    public void text32(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("퇴원하면 뭐할지 생각해봤어?");
        t = "s";
    }

    public void text33(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("");
        t = "34";
    }
}