package com.example.practiceround;

import android.view.View;
import android.widget.Button;

import com.example.practiceround.Hospital1;

import java.util.Arrays;

public class Story {

    Hospital1 h1;
    String c1, c2, c3, c4, t;

    public Story(Hospital1 h1) {
        this.h1 = h1;
    }

    public void selectNext(String next) {
        switch (next) {
            //  hospital 1
            case "h11":
                hospital11();
                break;
            case "h12":
                hospital12();
                break;
            case "h13":
                hospital13();
                break;
            case "h14":
                hospital14();
                break;
            case "h15":
                hospital15();
                break;
            case "h16":
                hospital16();
                break;
            case "h17":
                hospital17();
                break;
            case "h18":
                hospital18();
                break;
            case "h19":
                hospital19();
                break;

            case "h1s1":
                hospital1select1();
                break;
            case "h110a":
                hospital110a();
                break;
            case "h110b":
                hospital110b();
                break;

            case "h1s2":
                hospital1select2();
                break;
            case "h111a":
                hospital111a();
                break;
            case "h111b":
                hospital111b();
                break;

            case "h112":
                hospital112();
                break;
            case "h113":
                hospital113();
                break;

            case "h1s3":
                hospital1select3();
                break;
            case "h114a":
                hospital114a();
                break;
            case "h114b":
                hospital114b();
                break;
            case "h114c":
                hospital114c();
                break;

            case "h115":
                hospital115();
                break;
            case "h116":
                hospital116();
                break;

            case "h1s4":
                hospital1select4();
                break;
            case "h117a":
                hospital117a();
                break;
            case "h117b":
                hospital117b();
                break;
            case "h117c":
                hospital117c();
                break;
            case "h118a":
                hospital118a();
                break;
            case "h118b":
                hospital118b();
                break;
            case "h118c":
                hospital118c();
                break;

            case "h119":
                hospital119();
                break;
            case "h120":
                hospital120();
                break;
            //  hospital 1 end

            //  hospital 2
            case "h21":
                hospital21();
                break;
            case "h22":
                hospital22();
                break;

            case "h2s1":
                hospital2select1();
                break;
            case "h23a":
                hospital23a();
                break;
            case "h23b":
                hospital23b();
                break;

            case "h24":
                hospital24();
                break;
            case "h25":
                hospital25();
                break;
            case "h26":
                hospital26();
                break;
            case "h27":
                hospital27();
                break;
            case "h28":
                hospital28();
                break;
            case "h29":
                hospital29();
                break;
            case "h210":
                hospital210();
                break;


            //  h2 11 - 24 ab
            case "h2s2":
                hospital2select2();
                break;
            case "h211a":
                hospital211a();
                break;
            case "h212a":
                hospital212a();
                break;
            case "h213a":
                hospital213a();
                break;
            case "h214a":
                hospital214a();
                break;
            case "h215a":
                hospital215a();
                break;
            case "h216a":
                hospital216a();
                break;
            case "h217a":
                hospital217a();
                break;
            case "h218a":
                hospital218a();
                break;
            case "h219a":
                hospital219a();
                break;
            case "h220a":
                hospital220a();
                break;
            case "h221a":
                hospital221a();
                break;
            case "h222a":
                hospital222a();
                break;
            case "h223a":
                hospital223a();
                break;
            case "h224a":
                hospital224a();
                break;

            case "h211b":
                hospital211b();
                break;
            case "h212b":
                hospital212b();
                break;
            case "h213b":
                hospital213b();
                break;
            case "h214b":
                hospital214b();
                break;
            case "h215b":
                hospital215b();
                break;
            case "h216b":
                hospital216b();
                break;
            case "h217b":
                hospital217b();
                break;
            case "h218b":
                hospital218b();
                break;
            case "h219b":
                hospital219b();
                break;
            case "h220b":
                hospital220b();
                break;
            case "h221b":
                hospital221b();
                break;
            case "h222b":
                hospital222b();
                break;
            case "h223b":
                hospital223b();
                break;
            case "h224b":
                hospital224b();
                break;
            //  h2 11 - 24 ab end
            //  hospital 2 end

            //  neighbor 2
            case "n21":
                neighbor21();
                break;

            //  n2 2 - 7 ab
            case "n2s1":
                neighbor2select1();
                break;
            case "n22a":
                neighbor22a();
                break;
            case "n23a":
                neighbor23a();
                break;
            case "n24a":
                neighbor24a();
                break;
            case "n25a":
                neighbor25a();
                break;
            case "n26a":
                neighbor26a();
                break;
            case "n27a":
                neighbor27a();
                break;

            case "n22b":
                neighbor22b();
                break;
            case "n23b":
                neighbor23b();
                break;
            case "n24b":
                neighbor24b();
                break;
            case "n25b":
                neighbor25b();
                break;
            case "n26b":
                neighbor26b();
                break;
            case "n27b":
                neighbor27b();
                break;
            //  n2 2 - 7 ab end

            case "n28":
                neighbor28();
                break;
            case "n29":
                neighbor29();
                break;
            case "n210":
                neighbor210();
                break;
            case "n2s2":
                neighbor2select2();
                break;

            //  n2 11 - 16 abc
            case "n211a":
                neighbor211a();
                break;
            case "n212a":
                neighbor212a();
                break;
            case "n213a":
                neighbor213a();
                break;
            case "n214a":
                neighbor214a();
                break;
            case "n215a":
                neighbor215a();
                break;

            case "n211b":
                neighbor211b();
                break;
            case "n212b":
                neighbor212b();
                break;
            case "n213b":
                neighbor213b();
                break;
            case "n214b":
                neighbor214b();
                break;
            case "n215b":
                neighbor215b();
                break;

            case "n211c":
                neighbor211c();
                break;
            case "n212c":
                neighbor212c();
                break;
            case "n213c":
                neighbor213c();
                break;
            case "n214c":
                neighbor214c();
                break;
            case "n215c":
                neighbor215c();
                break;
            case "n216c":
                neighbor216c();
                break;
            //  n2 11 - 16 abc end

            case "n217":
                neighbor217();
                break;
            case "n218":
                neighbor218();
                break;
            case "n219":
                neighbor219();
                break;
            case "n220":
                neighbor220();
                break;
            case "n221":
                neighbor221();
                break;
            case "n222":
                neighbor222();
                break;
            case "n223":
                neighbor223();
                break;
            case "n224":
                neighbor224();
                break;
            case "n2s3":
                neighbor2select3();
                break;

            //  n2 25 - 31 abc
            case "n225a":
                neighbor225a();
                break;
            case "n226a":
                neighbor226a();
                break;
            case "n227a":
                neighbor227a();
                break;
            case "n228a":
                neighbor228a();
                break;
            case "n229a":
                neighbor229a();
                break;
            case "n230a":
                neighbor230a();
                break;
            case "n231a":
                neighbor231a();
                break;

            case "n225b":
                neighbor225b();
                break;
            case "n226b":
                neighbor226b();
                break;
            case "n227b":
                neighbor227b();
                break;
            case "n228b":
                neighbor228b();
                break;
            case "n229b":
                neighbor229b();
                break;

            case "n225c":
                neighbor225c();
                break;
            case "n226c":
                neighbor226c();
                break;
            case "n227c":
                neighbor227c();
                break;
            case "n228c":
                neighbor228c();
                break;
            case "n229c":
                neighbor229c();
                break;
            case "n230c":
                neighbor230c();
                break;
            //  n2 25 - 31 abc end

            case "n232":
                neighbor232();
                break;
            case "n233":
                neighbor233();
                break;
            case "n234":
                neighbor234();
                break;
            case "n235":
                neighbor235();
                break;
            case "n236":
                neighbor236();
                break;
            case "n237":
                neighbor237();
                break;
            case "n238":
                neighbor238();
                break;
            case "n239":
                neighbor239();
                break;

            case "n2s4":
                neighbor2select4();
                break;
            case "n240a":
                neighbor240a();
                break;
            case "n241a":
                neighbor241a();
                break;
            case "n240b":
                neighbor240b();
                break;
            case "n241b":
                neighbor241b();
                break;

            //  n2 42 - 54 abc
            case "n2s5":
                neighbor2select5();
                break;
            case "n242a":
                neighbor242a();
                break;
            case "n243a":
                neighbor243a();
                break;
            case "n244a":
                neighbor244a();
                break;

            case "n242b":
                neighbor242b();
                break;
            case "n243b":
                neighbor243b();
                break;
            case "n244b":
                neighbor244b();
                break;
            case "n245b":
                neighbor245b();
                break;
            case "n246b":
                neighbor246b();
                break;
            case "n247b":
                neighbor247b();
                break;

            case "n242c":
                neighbor242c();
                break;
            case "n243c":
                neighbor243c();
                break;
            case "n244c":
                neighbor244c();
                break;
            case "n245c":
                neighbor245c();
                break;
            case "n246c":
                neighbor246c();
                break;
            case "n247c":
                neighbor247c();
                break;
            case "n248c":
                neighbor248c();
                break;
            case "n249c":
                neighbor249c();
                break;
            case "n250c":
                neighbor250c();
                break;
            case "n251c":
                neighbor251c();
                break;
            case "n252c":
                neighbor252c();
                break;
            case "n253c":
                neighbor253c();
                break;
            case "n254c":
                neighbor254c();
                break;
            //  n2 42 - 54 abc end
            //  neighbor 2 end

            case "s21" :
                school21();
                break;
            case "s22" :
                school22();
                break;
            case "s23" :
                school23();
                break;
            case "s24" :
                school24();
                break;
            case "s25" :
                school25();
                break;
            case "s26" :
                school26();
                break;
            case "s27" :
                school27();
                break;
            case "s28" :
                school28();
                break;
            case "s29" :
                school29();
                break;
            case "s210" :
                school210();
                break;
            case "s211" :
                school211();
                break;
            case "s212" :
                school212();
                break;
            case "s213" :
                school213();
                break;
            case "s214" :
                school214();
                break;
            case "s215" :
                school215();
                break;
            case "s216" :
                school216();
                break;
            case "s217" :
                school217();
                break;
            case "s218" :
                school218();
                break;
            case "s219" :
                school219();
                break;
            case "s220" :
                school220();
                break;
            case "s222" :
                school222();
                break;
            case "s223" :
                school223();
                break;
            case "s224" :
                school224();
                break;
            case "s225" :
                school225();
                break;
            case "s226" :
                school226();
                break;
            case "s227" :
                school227();
                break;
            case "s228" :
                school228();
                break;
            case "s229" :
                school229();
                break;
            case "s230" :
                school230();
                break;
            case "s232" :
                school232();
                break;
            case "s2s1" :
                school2select1();
            case "s233as" :
                school233a();
                break;
            case "s233b" :
                school233b();
                break;
            case "s234a" :
                school234a();
                break;
            case "s234b" :
                school234b();
                break;
            case "s2s2" :
                school2select2();
                break;
            case "s235b" :
                school235b();
                break;
            case "s236b" :
                school236b();
                break;
            case "s237d" :
                school237b();
                break;
            case "s238b" :
                school238b();
                break;
            case "s239b" :
                school239b();
                break;
            case "s240b" :
                school240b();
                break;
            case "s241b" :
                school241b();
                break;
            case "s2s3" :
                school2select3();
                break;
            case "s242b" :
                school242b();
                break;
            case "s242c" :
                school242c();
                break;
            case "s242d" :
                school242d();
                break;
            case "s242a" :
                school242a();
                break;
            case "s243a" :
                school243a();
                break;
            case "s244a" :
                school244a();
                break;
            case "s245a" :
                school245a();
                break;
            case "s246a" :
                school246a();
                break;
            case "s247a" :
                school247a();
                break;


        }

    }

    public void showButton() {
        for (Button button : Arrays.asList(h1.choice1, h1.choice2, h1.choice3, h1.choice4)) {
            button.setVisibility(View.VISIBLE);
        }
    }

    public void noButton() {
        for (Button button : Arrays.asList(h1.choice1, h1.choice2, h1.choice3, h1.choice4)) {
            button.setVisibility(View.INVISIBLE);
        }
    }

    public void start() {
        h1.background.setImageResource(R.mipmap.hospitalbed);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : (눈을 뜨면서)(으윽... 여긴...?)");
        noButton();
        t = "h11";
    }

    public void hospital11() {
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nurse2);
        h1.text.setText("간호사 : 환자분!!! 괜찮으세요? 정신이 드시나요?");
        t = "h12";
    }

    public void hospital12() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 여..여기가 어디죠...?");
        t = "h13";
    }

    public void hospital13() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 여긴 병원이예요.");
        t = "h14";
    }

    public void hospital14() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 아... 저 번개 맞아서 죽은 거 아니었나요?");
        t = "h15";
    }

    public void hospital15() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 무슨 소리예요. 환자분, 기억 안 나세요? 교통사고 당해서 응급실로 실려오셨어요.");
        t = "h16";
    }

    public void hospital16() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : (아... 교통사고 난 걸로 처리가 된건가?)");
        t = "h17";
    }

    public void hospital17() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 선생님 여기 환자 상태가 좀 이상해요. 아무래도 기억상실증에...");
        t = "h18";
    }

    public void hospital18() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공 : 아뇨 전 괜찮습니다. 잠시 착각했나보네요.(근데 어디서 많이 본 얼굴인데? 기분탓인가?)");
        t = "h19";
    }

    public void hospital19() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("간호사 : 아... 네. 뭐.. 다행이네요.");
        t = "h1s1";
    }

    public void hospital1select1() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 저희 혹시 어디서 본 적 있지 않아요? 혹시 바닐라 누나 아니세요..?");
        h1.choice3.setText("주인공: 이쁜 아가씨, 혹시 이름이 바닐라 아 나같은 귀여운 동생 알지 않아?");
        c2 = "h110a";
        c3 = "h110b";
    }

    public void hospital110a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("간호사 : 네!? 제 이름을 어떻게..... 어? 너 혹시 (주인공)이니?");
        t = "h1s2";
    }

    public void hospital110b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("간호사 : 네!? 갑자기 무슨.... 어? 너 혹시 (주인공)이니?");
        t = "h1s2";
    }

    public void hospital1select2() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 와... 진짜 오랜만이다! 바닐라 누나.. 맞지? 이런 데서 다 보네?");
        h1.choice3.setText("주인공: 후훗, 드디어 이 몸을 알아보았군!");
        c2 = "h111a";
        c3 = "h111b";
    }

    public void hospital111a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("바닐라: 그러게..이게 무슨 일이야? 어쩌다가 응급실까지 오게 됐어. 조심 좀 하지...");
        t = "h112";
    }

    public void hospital111b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("바닐라 : 나 바닐라야! 나 기억하지?");
        h1.text.setText("바닐라 : 이게 무슨 일이야.. 어쩌다가 응급실까지 오게 됐어. 조심 좀 하지...");
        t = "h112";
    }

    public void hospital112() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("주인공 : 하하... 어쩌다보니...");
        h1.text.setText("주인공: (내가 10살 때 바닐라 누나가 이사갔으니까. 10년 만에 보는건가? 옛날에도 예뻤지만 지금은 빛이 나네...)");
        t = "h113";
    }

    public void hospital113() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그래도 천만다행이야. 교통사고 난 것 치고는 크게 다치지 않아서. 빠르면 내일 아니면 모레쯤에는 퇴원해도 되겠어.");
        t = "h1s3";
    }

    public void hospital1select3() {
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("주인공: 응. 알려줘서 고마워.");
        h1.choice2.setText("주인공: 내 몸은 비브라늄이거든! 히힛!");
        h1.choice3.setText("주인공: 사고낸 차주 어디갔어? 엉덩이를 걷어차버려야지!!!");
        h1.choice4.setVisibility(View.INVISIBLE);
        c1 = "h114a";
        c2 = "h114b";
        c3 = "h114c";
    }

    public void hospital114a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "h115";
    }

    public void hospital114b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "h115";
    }

    public void hospital114c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그래. 그럼 몸조리 잘하고 난 다른 일 있어서 가봐야겠다.");
        t = "h115";
    }

    public void hospital115() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 누나, 잠깐만!");
        t = "h116";
    }

    public void hospital116() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응?");
        t = "h1s4";
    }

    public void hospital1select4() {
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("주인공: 병원비 얼마 나왔어? 내가 돈 내야하는 건 아니지?");
        h1.choice2.setText("주인공: 최대한 늦게 퇴원해야겠는 걸? 그래야 누나를 더 볼 수 있으니까..");
        h1.choice3.setText("주인공: 저기 옆에 누워계신 여자분 번호좀... 완전 내 스타일ㅎㅎ.");
        h1.choice4.setVisibility((View.INVISIBLE));

        c1 = "h117a";
        c2 = "h117b";
        c3 = "h117c";
    }

    public void hospital117a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 음.. 자세한 건 잘 모르겠는데 내일 원무과에서 접수해줄게!");
        h1.text.setText("바닐라: 빨리 퇴원하고 싶으면 적당히 안정을 취하고 있어~");
        t = "h118a";
    }

    public void hospital117b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 쓸 데 없는 소리하지 마시고 안정이나 취하세요 환자분~");
        t = "h118b";
    }

    public void hospital117c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: (다른 간호사에게) 저기요!! 이 환자분 마취제 하나 놓아주세요!!!");
        t = "h118c";
    }

    public void hospital118a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아아, 알겠어. 알겠어. 그만할게ㅎㅎ 근데 누나..");
        h1.text.setText("주인공: 오늘 간호복이 좀 잘어울리네?");
        t = "h119";
    }

    public void hospital118b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아아, 알겠어. 알겠어. 그만할게ㅎㅎ 근데 누나..");
        h1.text.setText("바닐라: 요즘 간호사들 사이에서도 부조리 있나?");
        t = "h119";
    }

    public void hospital118c() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아, 알겠어. 알겠어. 그만할게ㅎㅎ 근데 누나..");
        h1.text.setText("주인공: 내가 의사 되면 누나랑 결혼할 수 있으려나?ㅎㅎ 농담ㅋ");
        t = "h119";
    }

    public void hospital119() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("간호사1: 바닐라쌤!! 여기 좀 와서 도와주세요!");
        h1.text.setText("바닐라: 네? 아 네! 금방 가겠습니다!! 000아 나중에 더 얘기하자ㅎㅎ 안녕!");
        t = "h120";
    }

    public void hospital120() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: (걸어가면서 독백)'나한테 그렇게 얘기해준 사람은 너가 처음이야..ㅎ'");
        t = "h21";
    }


    //  병원2
    public void hospital21() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: '요즘 병원은 건강보험이 적용되도 왜이렇게 병원비가 비싼건지... 에휴...'");
        h1.text.setText("주인공: '그래도 우리 누나보고 눈정화 할 생각에 벌써부터 기대가 되는구나 ㅎㅎ'");
        t = "h22";
    }

    public void hospital22() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 어머! 00이 왔구나~ 필요한 거 있어??");
        t = "h2s1";
    }

    public void hospital2select1() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 뭐 필요한건 아니구 그냥 병원비 납부하려구~");
        h1.choice3.setText("주인공: 내 인생에 필요한 건 누나 뿐인걸?ㅎㅎ");
        h1.choice4.setVisibility(View.INVISIBLE);
        c2 = "h23a";
        c3 = "h23b";
    }

    public void hospital23a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아 그래! 여기 원무과에서 도와줄게~");
        h1.text.setText("음.. 어디보자...");
        h1.text.setText("바닐라: 입원 이틀에 진료비랑 링거까지 해서 12만 8천원이네~");
        t = "h24";
    }

    public void hospital23b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: ㅋㅋㅋ 쓸 데 없는 소리 하지 마시구요~ 환자분, 병원비 총 12만 8천원 나오셨습니다~");
        t = "h24";
    }

    public void hospital24() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (윽... 비싸다..) 여기 카드로 결제할게.");
        t = "h25";
    }

    public void hospital25() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 웅 알았어ㅎㅎ 자~~ 다됐다! 혹시 뭐 더 필요한 건 없어??");
        t = "h26";
    }

    public void hospital26() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 음 딱히 없는 것 같아.");
        t = "h27";
    }

    public void hospital27() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("간호사1: 바닐라 간호사!! 여기 좀 빨리 와주세요!!");
        t = "h28";
    }

    public void hospital28() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 네!! 000아 나 얼른 가봐야겠다! 나중에 또 보자!");
        t = "h29";
    }

    public void hospital29() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 누나!!");
        t = "h210";
    }

    public void hospital210() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응?? 왜??");
        t = "h2s2";
    }

    public void hospital2select2() {
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 아... 아무것도 아니야..");
        h1.choice3.setText("주인공: 혹시 우리 이따가 잠깐 얘기 좀 할 수 있을까?");
        h1.choice4.setVisibility(View.INVISIBLE);

        c2 = "h211a";
        c3 = "h211b";
    }

    //  h2 11a ~ 24a
    public void hospital211a() {
        noButton();
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("간호사: 뭐야~ 싱겁기는~~ 아무튼 나 먼저 가볼게!");
        t = "h212a";
    }

    public void hospital212a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(1시간 후)");
        t = "h213b";
    }

    public void hospital213a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 뭐야?? 왜 아직도 안갔어?? 무슨 할 말이라도 있어??");
        t = "h214a";
    }

    public void hospital214a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 그게... 누나 혹시...");
        t = "h215a";
    }

    public void hospital215a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아 맞다 000아, 이번 주 토요일에 시간 있어??");
        t = "h216a";
    }

    public void hospital216a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: ㅇ..어??? 갑자기 왜?");
        t = "h217a";
    }

    public void hospital217a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아, 오랜만에 아는 동생 만나기로 했는데 밥이나 같이 사줄까 해서ㅎㅎ");
        t = "h218a";
    }

    public void hospital218a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 응.. 시간 될 것 같아ㅎㅎ");
        t = "h219a";
    }

    public void hospital219a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 다행이다ㅎㅎ 그럼 이번 주 토요일에 보자!!");
        t = "h220a";
    }

    public void hospital220a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어.. 그래..!");
        t = "h221a";
    }

    public void hospital221a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("간호사1: 닐라쌤!! 여기 다시 좀 와줘야될 것 같아요!!");
        t = "h222a";
    }

    public void hospital222a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: (간호사1을 향해)네!! 지금 갈게요!!");
        t = "h223a";
    }

    public void hospital223a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: (주인공을 향해)나 일하러 다시 가봐야겠다ㅎㅎ 토요일에 봐!!");
        t = "h224a";
    }

    public void hospital224a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (ㅎㅎ 닐라누나랑 점심을 같이 먹는다니.. 개이득!!)");
        t = "h225";
    }

    //  h2 11b ~ 24b
    public void hospital211b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응?? 나 좀 오래 걸릴 수도 있는데 괜찮아?");
        t = "h212b";
    }

    public void hospital212b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 응! 기다릴게ㅎㅎ");
        t = "h213b";
    }

    public void hospital213b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그래! 그럼 할 일 좀 빨리 올게!!");
        t = "h214b";
    }

    public void hospital214b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(약 1시간 후)");
        t = "h215b";
    }

    public void hospital215b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 00아 오래 기다렸지?");
        t = "h216b";
    }

    public void hospital216b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아냐ㅎㅎ 별로 오래 안기다렸어!");
        t = "h217b";
    }

    public void hospital217b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: ㅎㅎ 그래서 할 말 있다는 게 뭐야??");
        t = "h218b";
    }

    public void hospital218b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 혹시 이번 주 토요일에 시간 있어??");
        t = "h219b";
    }

    public void hospital219b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 이번 주 토요일? 시간은 되는데 왜??");
        t = "h220b";
    }

    public void hospital220b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아 그냥 뭐... 오랜만에 보기도 했구 같이 영화나 같이 볼까 해서..ㅎㅎ");
        t = "h221b";
    }

    public void hospital221b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 오~~ 우리 00이 이렇게 적극적이었어~? 나야 좋지!!");
        t = "h222b";
    }

    public void hospital222b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 그럼 이번 주 토요일에 보는 걸로 하자ㅎㅎ");
        h1.text.setText("주인공: 정확한 시간은 내가 나중에 알려줄게!!");
        t = "h223b";
    }

    public void hospital223b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그래 그럼 그 때 보자ㅎㅎ");
        t = "h224b";
    }

    public void hospital224b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (아싸..!!! 개이득ㅎㅎ)");
        t = "n21";
    }


    //  옆집2
    public void neighbor21() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(000은 동창회에 나가기 전 어떻게 꾸미고 갈지 정하고 있다.)");
        t = "n2s1";
    }

    public void neighbor2select1() {
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice2.setText("멋진 체크 무늬 셔츠에 튀지 않는 남방색 바지");
        h1.choice3.setText("특별한 것 없는 모나미 패션");
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice4.setVisibility(View.INVISIBLE);
        c2 = "n22a";
        c3 = "n22b";
    }

    //  neighbor2 2a - 7a
    public void neighbor22a() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 야레~ 야레~ 이렇게 멋있게 입고 가면 어떤 여자든 나에게 빠지지 않을 수 없다고~ 그럼 한번 가 볼까?");
        t = "n23a";
    }

    public void neighbor23a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(000은 집에서 나와 약속 장소에 도착했다.)");
        t = "n24a";
    }

    public void neighbor24a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 야! 여기야!!");
        t = "n25a";
    }

    public void neighbor25a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 나 늦지는 않았지? 다들 오랜만이다!");
        t = "n26a";
    }

    public void neighbor26a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 야! 너 무슨 공대생이냐? 무슨 옷을 그렇게 입고 왔냐ㅋㅋㅋ");
        t = "n27a";
    }

    public void neighbor27a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 이제 정육점 모델 아니고 공대생 모델이라 불러야겠네ㅋㅋ");
        t = "n28a";
    }

    //  neighbor2 2b - 7b
    public void neighbor22b() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 엄청 튀지도 않고 나쁘진 않군. 어디 한 번 가볼까?");
        t = "n23b";
    }

    public void neighbor23b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(000은 집에서 나와 약속 장소에 도착했다.)");
        t = "n24b";
    }

    public void neighbor24b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 야! 여기야!");
        t = "n25b";
    }

    public void neighbor25b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 나 늦지는 않았지? 다들 오랜만이다!");
        t = "n26b";
    }

    public void neighbor26b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 오? 너 살 뺐다고 들었는데 진짜 많이 빠졌다~? 길에서 보면 못알아보겠어~");
        t = "n27b";
    }

    public void neighbor27b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 이야~ 00이 고등학생 때는 대충 입고 다니더니 대학생 됐다고 이제 꾸미는거야?");
        t = "n28";
    }

    public void neighbor28() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 야 됐고, 다들 오랜만인데 어떻게 지내냐?");
        t = "n29";
    }

    public void neighbor29() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 나는 이번에 대학교 졸업해서 취업 준비하느라 정신없이 보내는 중..");
        t = "n212";
    }

    public void neighbor210() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 난 계속 군대에 있었어.");
        t = "n2s2";
    }

    public void neighbor2select2() {
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 오, 너는 어디 부대 나왔어?");
        h1.choice3.setText("주인공: 뭐야, 그럼 지금 휴가 나와 있는거야?");
        h1.choice4.setText("주인공: 군대에 있었다고? 그럼 특급전사는 됐냐?ㅋㅋ");
        c2 = "n211a";
        c3 = "n211b";
        c4 = "n211c";
    }

    public void neighbor211a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 00이, 너 벌써 군대 갔다 왔어? 빨리 갔다 온 것 보니 육군으로 갔다 왔나보네. 난 공군이어서 좀 오래 있었음ㅋㅋ");
        t = "n212a";
    }

    public void neighbor212a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 오~ 공군 갔다 온거야? 부대 위치는 어디야?");
        t = "n213a";
    }

    public void neighbor213a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 나? 나는 대구 쪽에 있었어. 너는 어디로 갔는데?");
        t = "n214a";
    }

    public void neighbor214a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 나는 포천에서 복무했었어.");
        t = "n215a";
    }

    public void neighbor215a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 에휴.. 남자 애들은 만나면 군대 이야기만 한다더니..");
        t = "n217";
    }

    public void neighbor211b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2:제대를 했다고? 군대는 제대로 갔다왔냐? 공익인데 군대 갔다왔다고 하는 건 아니지?");
        t = "n212b";
    }

    public void neighbor212b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 뭔 소리야. 나 육군 만기 전역했다고!!");
        t = "n213b";
    }

    public void neighbor213b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 어이구, 그러세요? 뭐, 그래서 나보다 빨리 군대 전역한거 부심이라도 부리게?");
        t = "n214b";
    }

    public void neighbor214b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아니 그런 건 아니고...");
        t = "n215b";
    }

    public void neighbor215b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 야, 너넨 오랜만에 만나가지고 그러고 있냐. 적당히 해라 좀.");
        t = "n217";
    }

    public void neighbor211c() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2:야, 당연하지ㅋㅋ 특급 전사 걍 껌이더만ㅋㅋㅋ 그러는 너는? 특급 전사 땄냐?");
        t = "n212c";
    }

    public void neighbor212c() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 나? 많이 노력하긴 했는데 특급은 못하겠더라.. 3km 뜀걸은 13분까진 나오는데 더는 못하겠더라.");
        t = "n213b";
    }

    public void neighbor213c() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 뭐야, 그 정도면 빠른 거 아냐? 그래서 너 살도 빠진건가?");
        t = "n214b";
    }

    public void neighbor214c() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 뭐 그것때문에 빠진 건 아니고, 살 빠져서 달리기도 이 정도 나온 것 같긴 해.");
        t = "n215b";
    }

    public void neighbor215c() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 우리 집도 바로 옆인데 같이 조깅이나 뛰자.");
        t = "n216b";
    }

    public void neighbor216c() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어..어... 좋지..!");
        t = "n217";
    }

    public void neighbor217() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 그런데 (옆집 동창), 너는 요즘 뭐하면서 보내? 아직도 복싱하는거야?");
        t = "n218";
    }

    public void neighbor218() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 그럼, 아직 복싱하고 있지. 안그래도 사흘 뒤에 복싱 경기도 하나 있다고.");
        t = "n219";
    }

    public void neighbor219() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 아 진짜로? 대박이다. 근데 시합 있으면 체중 감량 해야되는 거 아니야? 이렇게 저녁 많이 먹어도 돼?");
        t = "n220";
    }

    public void neighbor220() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 이번에 하는 시합은 현재 몸무게랑 같은 체급에서 하는 경기라 다이어트는 안해도 돼.");
        h1.text.setText("옆집 동창: 대신 단백질 위주로 먹고 해야지.");
        t = "n221";
    }

    public void neighbor221() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 계속 운동하고 있다니 대단하네. 난 이제 나이를 먹어서 그런가 조금만 뛰어도 힘들던데..");
        t = "n222";
    }

    public void neighbor222() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 아니, 나이를 먹으면 얼마나 먹었다고. 뭐가 그렇게 힘들대ㅋㅋ");
        t = "n223";
    }

    public void neighbor223() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 나이가 아니라 그냥 많이 먹어서 그런 거 아니야?");
        t = "n224";
    }

    public void neighbor224() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 야, 먹는 얘기 하느까 배고프다. 일단 뭐 먹을지 메뉴부터 정하자.");
        t = "n2s3";
    }

    public void neighbor2select3() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.choice2.setText("주인공: 우리 닭갈비 먹으러 갈까?");
        h1.choice3.setText("주인공: 우리 마라탕 먹으러 갈래?");
        h1.choice4.setText("주인공: 크림 파스타 먹으러 갈까?");
        h1.choice1.setVisibility(View.INVISIBLE);
        c2 = "n25a";
        c3 = "n25b";
        c4 = "n25c";
    }

    public void neighbor225a() {
        h1.character.setVisibility((View.INVISIBLE));
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 오! 닭갈비 좋지. 거기에 치즈 추가도 하자!!");
        t = "n226a";
    }

    public void neighbor226a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 치즈에 지방 많이 들어있지 않나? (옆집 동창)이, 너 괜찮아?");
        t = "n227a";
    }

    public void neighbor227a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 무슨 소리야! 치즈 100g 당 단백질이 25g이나 들어있다고! 그리고 이 근처에 닭가슴살로 만드는 닭갈비 집도 있다고!");
        t = "n228a";
    }

    public void neighbor228a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 아니... 닭가슴살로 하는 닭갈비라니.... 맛있겠네..;;");
        t = "n229a";
    }

    public void neighbor229a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 이제 시합이 얼마 안남았으니까 단백질 위주로 먹어야지. 00이 음식 선택 좋은데?");
        t = "n230a";
    }

    public void neighbor230a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: ㅎㅎ 내가 한 센스 하지~");
        t = "n231a";
    }

    public void neighbor231a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 아, 빨리 가자. 배고파 죽겠어!!");
        t = "n232";
    }

    public void neighbor225b() {
        h1.character.setVisibility((View.INVISIBLE));
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 오, 마라탕 맛있겠다.");
        t = "n226b";
    }

    public void neighbor226b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 아.. 마라탕 맛있긴 한데.. 국물 요리는 좀...");
        t = "n227b";
    }

    public void neighbor227b() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 왜? 아, 너 시합때문에? 국물 요리 먹으면 안되는건가?");
        t = "n228b";
    }

    public void neighbor228b() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 나트륨때문에 웬만하면 시합 전엔 자제하는데.. 너네들이 먹고 싶으면 먹으러 가자!");
        t = "n229b";
    }

    public void neighbor229b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 아니야, 그럼 그냥 닭갈비나 먹으러 가자!");
        t = "n232";
    }

    public void neighbor225c() {
        h1.character.setVisibility((View.INVISIBLE));
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 오, 파스타 괜찮은데? 다들 까르보나라 파스타 괜찮아?");
        t = "n226c";
    }

    public void neighbor226c() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 800..");
        t = "n227c";
    }

    public void neighbor227c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어? 방금 뭐 말했어?");
        t = "n228c";
    }

    public void neighbor228c() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 까르보나라 칼로리가 얼마나 되는줄 알아? 기본 800 칼로리라고..");
        t = "n229c";
    }

    public void neighbor229c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 아, 그..래..? 그 정도인 줄 몰랐네.. 그럼 다른 거 먹을까?");
        t = "n230c";
    }

    public void neighbor230c() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 아냐. 나는 뭐 가서 파스타 말고 다른 거 먹으면 되지.");
        h1.text.setText("옆집 동창: 일단 빨리 가자. 배고파 죽겠다.");
        t = "n232";
    }

    public void neighbor232() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(00과 친구들은 함께 저녁을 먹고 나왔다.)");
        t = "n233";
    }

    public void neighbor233() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 아~ 잘먹었다.");
        t = "n234";
    }

    public void neighbor234() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 오랜만에 이렇게 만나서 밥도 먹고 얘기하니까 재밌었다!");
        t = "n235";
    }

    public void neighbor235() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그니깐. 다음에도 이렇게 또 만나자!");
        t = "n236";
    }

    public void neighbor236() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 올ㅋㅋ 00이 고등학생 때는 조용하기만 하더니 이젠 그런 말도 하고 다 컸네.");
        t = "n237";
    }

    public void neighbor237() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 안변하면 죽을 수도 있거든.");
        t = "n238";
    }

    public void neighbor238() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 하.. 중2병 있는 건 그대로네...");
        t = "n239";
    }

    public void neighbor239() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 어쨌든, 오늘 재밌었다. 이제 슬슬 갈까?");
        t = "n2s4";
    }

    public void neighbor2select4() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 우리 오랜만에 만난건데 뭐 좀 더 하다 가자!");
        h1.choice3.setText("주인공: 그래, 오늘 너무 즐거웠어. 그럼 우리 나중에 또 보자!");
        c2 = "n240a";
        c3 = "n240b";
    }

    public void neighbor240a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 맞아, 이대로 헤어지긴 아쉽지~");
        t = "n241a";
    }

    public void neighbor241a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 그렇긴 하네. 그럼 뭐하고 놀건데?");
        t = "n2s5";
    }

    public void neighbor240b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 그래, 그럼 다들 나중에 봐.");
        t = "n241b";
    }

    public void neighbor241b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(그렇게 하루가 지나갔다.)");
        t = "n2";
    }


    public void neighbor2select5() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 노래방 갈까?");
        h1.choice3.setText("주인공: 카페가서 얘기나 좀 더 할까?");
        h1.choice4.setText("주인공: 볼링장 어때?");
        c2 = "n242a";
        c3 = "n242b";
        c4 = "n242c";
    }

    public void neighbor242a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 노래방 좋지! 밥도 먹었겠다, 칼로리 소모하러 가자!!");
        t = "n243a";
    }

    public void neighbor243a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 뭐, 00이 너 노래 좀 하냐?");
        t = "n244a";
    }

    public void neighbor244a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 노래방 좋다! 가자!!");
        t = "n245";
    }

    public void neighbor242b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 아니, 방금 그렇게 먹었는데 뭘 또 먹자고?");
        t = "n243b";
    }

    public void neighbor243b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 아니.. 그게...");
        t = "n244b";
    }


    public void neighbor244b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 그럼 그냥 너네들끼리 먹어. 나는 먼저 가볼게.");
        t = "n245b";
    }

    public void neighbor245b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 어? 그럼 그냥 다 각자 집으로 가자.");
        t = "n246b";
    }

    public void neighbor246b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: 아.. 이렇게 끝내..? 아쉽다.. 나중에 날 한 번 또 잡아서 만나자!!");
        t = "n247b";
    }

    public void neighbor247b() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (아... 이게 아닌데...)");
        t = "n248";
    }

    public void neighbor242c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 오, 볼링 좋은데? 00이 너 볼링 좀 잘하냐?");
        t = "n243c";
    }

    public void neighbor243c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아니..? 딱히 잘하진 않는데..");
        t = "n244c";
    }

    public void neighbor244c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 우리 4명이니까 2대 2로 팀 나눠서 시합하자!");
        t = "n245c";
    }

    public void neighbor245c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 올ㅋㅋ 자신 있냐?");
        t = "n246c";
    }

    public void neighbor246c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(00과 친구들이 함께 볼링을 치고 나온다.)");
        t = "n247c";
    }

    public void neighbor247c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 역시 너넨 아직 나한텐 안돼~");
        t = "n248c";
    }

    public void neighbor248c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창1: 아.. 마지막에 스트라이크만 쳤어도 이기는 거였는데..");
        t = "n249c";
    }

    public void neighbor249c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("동창2: (옆집 동창), 너는 그렇다 치고, 00이는 왜 잘하는건데..");
        h1.text.setText("동창2: 00이 너 볼링 못한다며! 이길려고 일부러 못한다고 한거지?");
        t = "n250c";
    }

    public void neighbor250c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아냐ㅋㅋ 그냥 운이 좋았어.");
        t = "n251c";
    }

    public void neighbor251c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 아 그니까, 00이 너 좀 하던데? 언제 배웠냐?");
        t = "n252c";
    }

    public void neighbor252c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그냥 운이였어. 너야말로 나보다 훨씬 잘했지.");
        t = "n253c";
    }

    public void neighbor253c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집 동창: 그거야 당연한거고. 그래도 너 다시 봤다!");
        t = "n254c";
    }

    public void neighbor254c() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(각자 집으로 돌아간다.)");
        t = "s1";
    }

    //  school 2
    public void school21() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("영어 수업을 듣기 위해 대학교 강의실에 들어온 나는 가장 뒷자리 구석에 앉았다.");
        h1.text.setText("병원신세를 지내면서 몇 일간 학교에 참석하지 못한 나는 같은 수업을 듣는 친구들과 친해지지 못한 상황이라 조용히 뒤에 앉은 것이다.");
        h1.text.setText("절대 내가 찐따라 이렇게 혼자 있는 게 아니라고!");
        h1.text.setText("스스로에게 변명을 하고 있던 중 나이가 지긋한 아저씨가 들어왔다.");
        t = "s22";
    }

    public void school22() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수: 출석 부르겠습니다. 다들 자리에 앉으세요. 강술래 학생.");
        t = "s23";
    }

    public void school23() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("학생1: 네.");
        t = "s24";
    }

    public void school24() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수: 김마루 학생.");
        t = "s25";
    }

    public void school25() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("학생2: 네~");
        t = "s26";
    }

    public void school26() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수: 게릴라 학생.");
        t = "s27";
    }

    public void school27() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("...");
        t = "s28";
    }

    public void school28() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수: 게릴라 학생.");
        t = "s29";
    }

    public void school29() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("...");
        t = "s210";
    }

    public void school210() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수: 게릴라 학생? 오늘도 지각인가요?");
        t = "s211";
    }

    public void school211() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("드르륵, 탁!");
        h1.text.setText("그때 한 여자가 교실 문을 급하게 열고 들어왔다.");
        h1.text.setText("요란한 소리에 모든 시선이 그녀에게로 향했다.");
        h1.text.setText("밝은 주황빛으로 웨이브진 머리. 그 머리색과 매칭되는 주황빛 눈동자.");
        h1.text.setText("아기자기하면서도 인형 같은 외모를 가진 그녀를 본 후 저번에 부딪혔던 여자란 것을 단번에 알 수 있었다.");
        t = "s212";
    }

    public void school212() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (어? 저 애도 나랑 같은 수업을 듣고 있었구나.. 이쁘다...)");
        t = "s213";
    }

    public void school213() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(병원이 입원하면서 수업을 참석하지 못해 몰랐던 것이다.)");
        t = "s214";
    }

    public void school214() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 하아.. 하아.. 늦어서 죄송합니다.");
        t = "s215";
    }

    public void school215() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수: 게릴라 학생, 다음부턴 좀 더 일찍 오세요.");
        t = "s216";
    }

    public void school216() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 네..!");
        t = "s217";
    }

    public void school217() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (이름이 게릴라..ㅋㅋ 얼굴이랑 안어울리게)");
        t = "s218";
    }

    public void school218() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(게릴라는 주인공과 두 칸 떨어진 자리에 앉는다.)");
        t = "s219";
    }

    public void school219() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(수업이 시작한지도 30분정도 지나자 잠이 오고 나른 해진다.)");
        t = "s220";
    }

    public void school220() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(그렇게 눈이 감기려 하는데 앞의 두명의 여학생들이 얘기가 들린다.)");
        t = "s222";
    }

    public void school222() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자1: 너 그거 들었어? 게릴라. 쟤. 완전 아이돌 지망생이래.");
        t = "s223";
    }

    public void school223() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자2: 이 학교에 그걸 모르는 사람이 어딨어. 유명하잖아. 망한 아이돌로.");
        t = "s224";
    }

    public void school224() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (바로 옆에 릴라가 있는데 저렇게 대놓고..)");
        t = "s225";
    }

    public void school225() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자1: 정말? 왜?");
        t = "s226";
    }

    public void school226() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자2: 소문이 아주 무성해. 고등학교 때 양아치에 학폭까지 했다고 난리였잖아.");
        h1.text.setText("여자2: 그러니까 데뷔도 못하는거 아니겠어?");
        t = "s227";
    }

    public void school227() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자1: 하긴… 얼굴만 반반해서는 연예인하긴 좀... 그렇지. 나쁜 소문들이 정말 사실인가?");
        t = "s228";
    }

    public void school228() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀들이 뒷담을 까는 소리에 왠지 모르게 불쾌했다.");
        t = "s229";
    }

    public void school229() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라를 바라보자 주머니를 꽉 쥐고 부들거리는 것이 보였다.");
        t = "s230";
    }

    public void school230() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자2: 하여간. 남자들이 좋다고 쫓아다니는 이유를 모르겠다니까?");
        t = "s232";
    }

    public void school232() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자2: 자세히 보면 그렇게 예쁘지도 않은데.");
        t = "s2s1";
    }

    public void school2select1() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.choice1.setText("주인공: 기침을 한다.");
        h1.choice2.setText("주인공: 조용히 계속 듣는다.");
        h1.choice3.setText("주인공: 우스꽝스럽게 넘어진다.");
        h1.choice4.setText("주인공: 수업에 집중한다.");

        c1 = "s233a";
        c2 = "s233a";
        c3 = "s233b";
        c4 = "s233a";
    }

    public void school233a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자들이 계속 뒷담을 깐다.");
        t = "s234a";
    }

    public void school233b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자들의 뒷담이 멈추고 나에게 시선이 몰린다.");
        t = "s234b";
    }

    public void school234a() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("여자들의 뒷담을 듣던 게릴라는 더 이상 참지 못하고 가방을 들고 교실을 나간다.");
        t = "s23s2";
    }

    public void school234b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("모든 시선이 쏠린 상황에 나는 게릴라 쪽을 본다.");
        h1.text.setText("주인공과 게릴라는 순간적으로 눈이 마주쳤다.");
        h1.text.setText("몇 초간 서로를 보던 와중 교수님이 나를 부른다.");
        t = "s235b";
    }

    public void school235b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 학생, 괜찮아요?");
        t = "s236b";
    }

    public void school236b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 하하.. 죄송합니다. 교수님.");
        t = "s237b";
    }

    public void school237b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 흠흠.. 어서 자리에 앉아요. 수업 계속 진행할게요.");
        t = "s238b";
    }

    public void school238b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (나의 황당한 몸개그 덕분인지 알 수 없지만 내 앞자리에서 뒷담하던 여자들은 다른 주제에 대해 얘기하게 되었다.)");
        h1.text.setText("(수업 중…)");
        t = "s239b";
    }

    public void school239b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 오늘은 여기까지 하겠습니다. 다들 수고하셨고, 숙제는 다음 주 월요일까지 제출하는 거 잊지들 마세요.");
        t = "s240b";
    }

    public void school240b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(수업이 끝나자 교실은 대화소리로 떠들썩해졌다.)");
        h1.text.setText("주인공: (게릴라는…?)");
        t = "s241b";
    }

    public void school241b() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(게릴라가 있던 자리를 확인하니 이미 자리에는 없고 문 앞에 있었다.)");
        t = "s2s2";
    }

    public void school2select2() {
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setText("주인공: 게릴라를 따라간다.");
        h1.choice2.setText("주인공: 집에 돌아간다.");
        h1.choice3.setText("주인공: 새로운 친구를 사귀기 위해 자리에 그대로 있는다.");
        h1.choice4.setText("주인공: 배고프니 매점에 간다.");
        c1 = "s242a";
        c2 = "s242b";
        c3 = "s242c";
        c4 = "s242d";
    }

    public void school242b() {
        h1.character.setVisibility((View.INVISIBLE));
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("Game Over");
    }

    public void school242c() {
        h1.character.setVisibility((View.INVISIBLE));
        noButton();
        h1.text.setText("(자리에 앉아 우물쭈물하며 가만히 있었지만 아무도 말을 걸지 않았다.)");
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("Game Over");
    }

    public void school242d() {
        h1.character.setVisibility((View.INVISIBLE));
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("Game Over");
    }

    public void school242a() {
        h1.character.setVisibility((View.INVISIBLE));
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(게릴라를 급하게 따라간다.)");
        h1.text.setText("주인공: 나 뭐하는거냐.. 따라가서 어쩌려고...");
        t = "school236a";
    }

    public void school243a() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공은 괜히 따라왔다는 생각이 들면서도 그녀의 뒤를 따라간다.)");
        h1.text.setText("(그녀가 멈춘 곳은 사람들이 잘오지 않는 건물 뒷편이었다.)");
        t = "school237a";
    }

    public void school244a() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 흑.. 잘알지도 못하면서.. 흐흑... 지들이 뭐 얼마나 안다고...");
        h1.text.setText("(표독스럽고 화가 난 채 욕하는 모습의 게릴라는 오열하듯 울고 있다.)");
        t = "school238a";
    }

    public void school245a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (음.. 그냥 돌아 가야겠다...)");
        t = "school239a";
    }

    public void school246a() {
        h1.character.setVisibility((View.INVISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("빠각! (주인공이 나뭇가지를 밟는 소리)");
        t = "school240a";
    }

    public void school247a() {
        h1.character.setVisibility((View.VISIBLE));
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 꺄악! 거기 누구야!?");
        t = "school2select3";
    }

    public void school2select3() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("주인공: (재빠르게 도망친다.)");
        h1.choice2.setText("주인공: (모습을 드러낸다.)");
        h1.choice3.setText("주인공: (고양이 소리를 낸다.)");
        h1.choice4.setText("주인공: (햄스터 소리를 낸다.)");
    }

    public void hospital31() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : (드디어 기다리고 기다리던 토요일! 누나와의 두근두근 점심 데이트!!! 누나의 사복... 어떨까?)");
        t = "h32";
    }

    public void hospital32() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(1시간 후...)");
        t = "h33";
    }

    public void hospital33() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : ???~ 기다렸지~ 미안해 늦어서! 오랜만에 사복입고 나오느라 준비하느라 오래걸렸어!");
        t = "h34";
    }

    public void hospital34() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : ???~ 기다렸지~ 미안해 늦어서! 오랜만에 사복입고 나오느라 준비하느라 오래걸렸어!");
        t = "h3s1";
    }

    public void hospital3select1() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 황금같은 시간 약속에 늦다니! 아주 건방진 누나네~");
        h1.choice3.setText("주인공: 아니야 ㅎㅎ 여자가 준비하다보면 늦을 수도 있지");
        h1.choice4.setText("주인공: 기분 나쁜 티를 내면서 째려본다.");
        c2 = "h35a";
        c3 = "h35b";
        c4 = "h35c";
    }

    public void hospital35a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 어쨌든..ㅎㅎ 배고프지? 뭐 먹을까?");
        t = "h36";
    }

    public void hospital35b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 어쨌든..ㅎㅎ 배고프지? 뭐 먹을까?");
        t = "h36";
    }

    public void hospital35c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 어쨌든..ㅎㅎ 배고프지? 뭐 먹을까?");
        t = "h36";
    }

    public void hospital36() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 음.. 그러게..");
        t = "h36";
    }

    public void hospital3select2() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("주인공: 국밥 어때?");
        h1.choice2.setText("주인공: 파스타 먹을까?");
        h1.choice3.setText("주인공: 떡볶이?");
        h1.choice4.setText("주인공: 초밥 나쁘지 않을 것 같은데..ㅎㅎ");
        c1 = "h37a";
        c2 = "h37b";
        c3 = "h37c";
        c4 = "h37d";
    }

    public void hospital37a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아무래도 뜨끈한 국밥이 최고지! 국밥 먹자ㅎㅎ");
        t = "h38";
    }

    public void hospital37b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아무래도 뜨끈한 국밥이 최고지! 국밥 먹자ㅎㅎ");
        t = "h38";
    }

    public void hospital37c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아무래도 뜨끈한 국밥이 최고지! 국밥 먹자ㅎㅎ");
        t = "h38";
    }

    public void hospital37d() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아무래도 뜨끈한 국밥이 최고지! 국밥 먹자ㅎㅎ");
        t = "h38";
    }

    public void hospital38() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그...그래!!");
        t = "h39";
    }

    public void hospital39() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(잠시 후 국밥집 도착)");
        t = "h310";
    }

    public void hospital310() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그나저나 그 동안은 어떻게 지냈어? 나 이사간 이후로 서로 연락이 끊겨서ㅜㅜ");
        t = "h311";
    }

    public void hospital311() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 음...? 나야 뭐 그럭저럭 잘지냈지ㅎㅎ 누나는?");
        t = "h312";
    }

    public void hospital312() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 나도... 뭐 그냥...잘 지냈지");
        t = "h3s3";
    }

    public void hospital3select3() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("주인공: ... 누나 무슨 일 있어?");
        h1.choice2.setText("주인공: 그럼 다행이네ㅎㅎ");
        h1.choice3.setText("(말없이 국밥을 들이킨다.)");
        h1.choice4.setVisibility(View.INVISIBLE);
        c1 = "h313a";
        c2 = "h313b";
        c3 = "h313c";
    }

    public void hospital313a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 사실은.. 흑흑...");
        t = "h314";
    }

    public void hospital313b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 사실은.. 흑흑...");
        t = "h314";
    }

    public void hospital313c() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 사실은.. 흑흑...");
        t = "h314";
    }

    public void hospital314() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 왜그래...? 괜찮아??");
        t = "h315";
    }

    public void hospital315() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 미안해... 갑자기 꼴사나운 모습 보여서... 사실은 요즘 일이 너무 힘들어서 스트레스를 많이 받았나봐.");
        t = "h3s4";
    }

    public void hospital3select4() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 아 간호사 일이 힘들었구나...");
        h1.choice3.setText("주인공: 아.. 응...(후루룹 쩝쩝)");
        h1.choice4.setText("주인공: 뭐 어쩔 수 없지 원래 일이 다 그런거니까.. 힘내..");
        c2 = "h316a";
        c3 = "h316b";
        c4 = "h316c";
    }

    public void hospital316a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응... (훌쩍..)");
    }

    public void hospital316b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응... (훌쩍..)");
    }

    public void hospital316c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응... (훌쩍..)");
    }
}

