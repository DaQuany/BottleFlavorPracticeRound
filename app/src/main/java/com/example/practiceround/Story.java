package com.example.practiceround;

import android.view.View;
import android.widget.Button;

import com.example.practiceround.Hospital1;

import java.util.Arrays;

public class Story {

    Hospital1 h1;
    String c1, c2, c3, c4, t, n1;

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
            case "17a": text17a();break;
            case "n11" : neighbor11(); break;
            case "n12" : neighbor12(); break;
            case "n13" : neighbor13(); break;

            case "sn11": selectneighbor11();break;
            case "n14": neighbor14();break;
            case "n15": neighbor15();break;
            case "n16": neighbor16();break;
            case "n17": neighbor17();break;
            case "n18": neighbor18();break;
            case "n19": neighbor19();break;
            case "n110": neighbor110();break;
            case "n111": neighbor111();break;
            case "n112": neighbor112();break;
            case "n113": neighbor113();break;
            case "n114": neighbor114();break;
            case "n115": neighbor115();break;
            case "sn12":selectneighbor12();break;

            case "n117": neighbor117();break;
            case "n118": neighbor118();break;
            case "n119": neighbor119();break;
            case "n120": neighbor120();break;
            case "n121": neighbor121();break;
            case "n122": neighbor122();break;
            case "n123": neighbor123();break;
            case "n124": neighbor124();break;
            case "n125":neighbor125();break;

            case "sn13":selectneighbor13();break;
            case "n126":neighbor126();break;
            case "n127":neighbor127();break;
            case "n128":neighbor128();break;
            case "n129":neighbor129();break;

            case "sn14":selectneighbor14();break;
            case "n131": neighbor131();break;
            case"n133":neighbor133();break;
            case"n134":neighbor134();break;
            case"n135":neighbor135();break;

            case"n132":neighbor132();break;
            case"n132_1":neighbor132_1();break;
            case"n132_2":neighbor132_2();break;
            case"n132_3":neighbor132_3();break;

            case"n136":neighbor136();break;
            case"n137":neighbor137();break;
            case"n138":neighbor138();break;
            case"n141":neighbor141();break;
            case"n142":neighbor142();break;
            case"n143":neighbor143();break;
            case"n144":neighbor144();break;
            case"n145":neighbor145();break;
            case"n146":neighbor146();break;
            case"n147":neighbor147();break;
            case"n148":neighbor148();break;
            case"n150":neighbor150();break;

            case"sn15":selectneighbor15();break;
            case"n152":neighbor152();break;
            case"n155":neighbor155();break;
            case"n156":neighbor156();break;
            case"n157":neighbor157();break;
            case"n158":neighbor158();break;

            case"n153":neighbor153();break;
            case"n153_1":neighbor153_1();break;
            case"n153_2":neighbor153_2();break;
            case"n153_3":neighbor153_3();break;
            case"n153_4":neighbor153_4();break;
            case"n153_5":neighbor153_5();break;
            case"n153_6":neighbor153_6();break;

            case"n159":neighbor159();break;
            case"n161":neighbor161();break;
            case"n162":neighbor162();break;
            case"n163":neighbor163();break;
            case"n164":neighbor164();break;
            case"n165":neighbor165();break;






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
        t = "n12";
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
        t = "n11";
    }

    //옆집 소녀 스토리 시작~~~~~~~~

    public void neighbor11() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("(주인공)은 병원에서 진료를 마치고 자신이 살고 있는 원룸으로 돌아왔다. ");
        t = "n12";
    }

    public void neighbor12() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("흠... 병원에서는 몸에 아무 이상이 없다고는 하니까 다행이기는 하지만... 아까 내가 \"신\"을 본게 사실인가? 그냥 꿈을 꾼게 아닐까?");
        t = "n13";
    }

    public void neighbor13() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("그래, 갑작스러운 사고로 인하여 그런 꿈을 꾼게 틀림없어. 요즘 내가 애니메이션을 너무 많이 봐서 그런가?");
        h1.choice3.setText("역시... 이몸인가? 확실히 이몸이 평범한 '닝겐'들과는 다르다고 생각은 했었지만, \"신\"에게 다시 기회를 받다니...");
        c1 = "sn11";
        c3 = "sn12";
    }

    public void selectneighbor11() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.smartphone);
        noButton();
        h1.text.setText("아까 있었던 일이 단순히 꿈이라 생각을 하고 별일이 아닌듯 그냥 넘어가려 하였을때, 갑자기 핸드폰에 \"발신자 제한 표시\"로 전화가 왔다.");
        t= "n14";
        }

    public void neighbor14() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("엉? 발신자 제한 전화네... 뭐지? 여보세요?");
        t= "n15";
    }

        public void neighbor15() {
            h1.background.setImageResource(R.mipmap.room1);
            h1.character.setVisibility(View.VISIBLE);
            h1.text.setVisibility(View.VISIBLE);
            h1.character.setImageResource(R.mipmap.godimage1);
            noButton();
            h1.text.setText("어, 그래~ 방금 아까 일어난 일이 단순히 꿈이라고 생각을 했지?");
            t="n16";
        }

    public void neighbor16() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("뭐야! 당신! 누군데 내 생각을 알고 있는거야?");
        t= "n17";
    }

    public void neighbor17() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage1);
        noButton();
        h1.text.setText("후후후, 나는 너가 쓰러졌을때 너를 치료한 의사지. 그리고 너가 쓰러진 동안 너의 귀안에 도청장치를 설치했기에 너의 생각을 알고 있는 거라고.");
        t= "n18";
    }

    public void neighbor18() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage2);
        noButton();
        h1.text.setText("푸하하핫! 농담이야 농담~~ 그리고 귀에 도청장치가 있다고 해서 생각을 읽는게 가능할것 같아? 아주 생긴것 만큼 멍청하구만...");
        t= "n19";
    }

    public void neighbor19() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("아니... 그러면 당신은 도대체 누군데 내 생각을 아는거지?");
        t= "n110";
    }

    public void neighbor110() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage1);
        noButton();
        h1.text.setText("하... 멍청해도 너무 멍청한거 아니야? 그렇게 눈치가 없어서야 15일 안에 여자를 사귀는게 가능하겠어?");
        t= "n111";
    }

    public void neighbor111() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage1);
        noButton();
        h1.text.setText("설마... 당신은... \"신\"? 그렇다면 아까 있었던게 꿈이 아니라고?");
        t= "n112";
    }

    public void neighbor112() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        noButton();
        h1.text.setText("에휴... 이렇게 눈치가 없으니 지금까지 여자를 못 사귄거지. 15일동안 잘해봐라! 뭐 지금처럼 계속 눈치 없이 지내면  아무일도 생기지 않고 나를 만나러 올거지만 말이야!");
        t= "n113";
    }

    public void neighbor113() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("아니... 잠깐... 저기요!...");
        t= "n114";
    }

    public void neighbor114() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("전화는 끊어지고, 아까의 일이 단순한 꿈이 아니라는 것을 알게 되었다.");
        t= "n115";
    }

    public void neighbor115() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("아니... 꿈이 아니였다니... 그럼 진짜로 이몸이 \"신\"을 만난거라고?...");
        t= "sn12";
    }

    public void selectneighbor12() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("훗... 애니메이션을 보면 \"신\"에게 선택을 받은 사람들은 \"특별한 능력\"을 받던데.. 혹시 이몸에게도? ");
        t= "n117";
    }

    public void neighbor117() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("(주인공)은 자신이 \"신\"으로 부터 \"특별한 능력\"을 받은 것이 있는지를 확인을 하는 도중 거울을 보게 되었다. ");
        t= "n118";
    }

    public void neighbor118() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("후후후후... 설마 했는데... 그렇지 않아도 잘생긴 이몸의 외모를 \"신\"이 한층 더 잘생기게 한건가? 야레~~ 야레~ 이러면 곤란 하다고~");
        t= "n119";
    }

    public void neighbor119() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.smartphone);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("거울을 보면서 자신의 외모에 감탄을 하고 있자 핸드폰이 울리더니 이내 한 목소리가 들리기 시작하였다.");
        t="n120";
    }

    public void neighbor120() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        noButton();
        h1.text.setText("아니, 다시 살수 있는 기회를 준것만으로도 감사해야지, 무슨 \"특별한 능력\" 같은 헛소리를 하는거야? ");
        t="n121";
    }

    public void neighbor121() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("우왓! 깜짝이야... 당신은...\"신\"?");
        t="n122";
    }

    public void neighbor122() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        noButton();
        h1.text.setText("에휴.... 미안하지만, 넌 잘생긴게 아니니까 착각하지 말고, 여자를 사귀려면 좋은 매너를 보이든 여자가 공감할 수 있는 대화를 하라고. 계속 보니까 불쌍해서 주는 팁이다! 그럼 수고하라고~~");
        t="n123";
    }

    public void neighbor123() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("잠깐... 그럼 애니메이션에 나오는 여심을 공략할 \"특별한 능력\"은 없는 거냐고요... 저기요!... 여보세요?");
        t="n124";
    }

    public void neighbor124() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("... ... ...");
        t= "n125";
    }

    public void neighbor125() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("훗,  \"신\"이 \"특별한 능력\"을 주지 않아도 이몸의 매력이라면 15일안에 여심을 사로 잡는것은 충분하지. 일단, 아는 여자들에게 연락을 취해 볼까?");
        t= "sn13";
    }

    public void selectneighbor13() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("핸드폰의 연락처를 확인 해 본다.");
        h1.choice3.setText("소셜 미디어 속 아는 친구들이 있는지를 확인 해 본다.");
        c1 = "n126";
        c3 = "n127";
    }

    public void neighbor126() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("(주인공)은 핸드폰의 연락처를 확인해 보았지만, 어떠한 여자의 번호도 있지 않았다.");
        t= "n128";
    }

    public void neighbor127() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("(주인공)은 핸드폰의 소셜미디어를 확인해 보았지만, 어떠한 여자의 팔로잉도 있지 않았다.");
        t= "n128";
    }

    public void neighbor128() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("... ... ...");
        t= "n129";
    }

    public void neighbor129() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
    noButton();
        h1.text.setText("우와와와앗!!! 큰일났다. 생각을 해보니, 이 몸은 알고 지내는 여자따위는 없다고! 이거 어떻게 하냐? 15일 안에 새로운 여자를 만날 뿐 아니라 여자의 마음을 얻어야 한다고? 이거는 이몸에게도 easy 하지 않은 난이도 인데?");
    t= "sn14";
}

    public void selectneighbor14() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("뭐... 어떻게든 되겠지. 일단 \"리그 오브 레거시\"라는 게임이나 해야겠다.(호감도-5)");
        h1.choice3.setText("일단 밖에라도 나가서 돌아다녀 볼까? 나가서 돌아다니다 보면 어떻게 해서든 여자를 만나지 않으려나?");
        c1 = "n131";
        c3 = "n132";
    }

    public void neighbor131() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("우와와와앗!!! 큰일났다. 생각을 해보니, 이 몸은 알고 지내는 여자따위는 없다고! 이거 어떻게 하냐? 15일 안에 새로운 여자를 만날 뿐 아니라 여자의 마음을 얻어야 한다고? 이거는 이몸에게도 easy 하지 않은 난이도 인데?");
        t= "n133";
    }

    public void neighbor133() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("(주인공)은 \"리그 오브 레거시\"라는 게임을 시작 하였다.");
        t= "n134";
    }

    public void neighbor134() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("아니! 포탑이 파괴될것 같으면 와서 도와야지 왜 저녀석은 왜 탑에 밖혀서 안나오는 건데! 걔 때문에 내 승급전 망했자나!");
        t= "n135";
    }

    public void neighbor135() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("(주인공)의 팀의 트롤링으로 인하여 승급전에서 패배를 하여 분한 마음에 책상을 두드리며 분을 삭히고 있을때 초인종이 울리기 시작하였다.");
        t= "n136";
    }

    public void neighbor132() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("밖에 나가기 전에 한번 꾸며볼까? 어디 입을만한 옷이 뭐가 있을까?");
        t= "n132_1";
    }

    public void neighbor132_1() {
        h1.background.setImageResource(R.mipmap.room5);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("밖에 나가기 전에 한번 꾸며볼까? 어디 입을만한 옷이 뭐가 있을까?");
        t= "n132_2";
    }

    public void neighbor132_2() {
        h1.background.setImageResource(R.mipmap.room5);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("(주인공)이 밖에 나가기 전 입을 옷을 고르기 위해 옷장을 열자 그 안에서 \"바퀴벌래\"가 나타났다.");
        t= "n132_3";
    }

    public void neighbor132_3() {
        h1.background.setImageResource(R.mipmap.room5);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("바퀴벌래를 잡기 위해 이곳 저곳을 이동하고 있던 도중 초인종이 울리기 시작하였다.");
        t= "n136";
    }

    public void neighbor136() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("누구지? 올사람이 없는데...");
        t= "n137";
    }

    public void neighbor137() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        noButton();
        h1.text.setText("저기요! 여기 혼자사는것도 아닌데 왜이리 시끄럽게 하는거에요! 다른 사람 생각은 안하나요?");
        t= "n138";
    }

    public void neighbor138() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("아니.. 그게 그러니까...");
        t= "n141";
    }


    public void neighbor141() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("그러니까는 무슨, 잘못을 했으면 변명이 아니고 사과를 해야 하는 것은 상식 아닌가요? 학교에서 그런것도 안배웠어요?");
        t= "n142";
    }

    public void neighbor142() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("어... 그러니까... 아.... 죄송합니다.");
        t= "n143";
    }

    public void neighbor143() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("죄송하면 앞으로 조심좀 하세요. 앞으로 이런 일때문에 얼굴 보지 않았으면 하네요.");
        t= "n144";
    }

    public void neighbor144() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("죄송합니다. 그런데... 정말 죄송한데... 저희 어디서 본적 없나요?");
        t= "n145";
    }

    public void neighbor145() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        noButton();
        h1.text.setText("나참, 어이가 없어서... 지금 뭐하는 거죠? 이 상황에 작업 거는 건가요? 상황 파악이 안되요?");
        t= "n146";
    }

    public void neighbor146() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        noButton();
        h1.text.setText("아니... 그게 아니고... 진짜 얼굴이 익숙해서요...");
        t= "n147";
    }

    public void neighbor147() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        noButton();
        h1.text.setText("익숙하기는 무슨, 저는 당신같이 생긴 사람을... 음?... 그러고 보니 뭔가 익숙한것 같기도 하고... ");
        t= "n148";
    }

    public void neighbor148() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("저... 혹시... 어느 중학교랑 고등학교를 나오셨는지 물어봐도 될까요?");
        t= "n150";
    }

    public void neighbor150() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("중학교랑 고등학교?... 나는 병맛중학교와 고등학교를.... 어? 너 혹시 \"정모\" 아니야?? ");
        t= "sn15";
    }

    public void selectneighbor15() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("어!.. 맞아... 그럼 고등학교때 같은 반 이었나?(호감도-5)");
        h1.choice3.setText("맞아, 내가 \"정모\" 라고 불리긴 했는데... 그런데 \"정모\"의 뜻이 뭐야? 아직도 그 뜻을 몰라서 말이야.(호감도+5)");
        c1 = "n152";
        c3 = "n153";
    }

    public void neighbor152() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("뭐야 아직도 내가 누군지 기억안나는거야?");
        t= "n155";
    }

    public void neighbor155() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("앗, 미안...");
        t= "n156";
    }

    public void neighbor156() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("하긴 같은 반이긴 했지만 그렇게 친하지는 않았으니 말이야. 나 복싱하던 \"고릴라\"라고.");
        t= "n157";
    }

    public void neighbor157() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("아! 그렇구나! 진짜 오랜만이야!");
        t= "n158";
    }

    public void neighbor158() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("오랜만이긴 하지");
        t= "n159";
    }

    public void neighbor153() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("뭐야, 너 별명인데 그 뜻도 몰랐던거야? \"정모\"는 \"정육점 모델\"을 줄인 말이자나!");
        t= "n153_1";
    }

    public void neighbor153_1() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("하하... 정육점 모델이였다니...");
        t= "n153_2";
    }

    public void neighbor153_2() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("그래도 이제 \"정모\" 라고 부르지는 못하겠는데? 그때보다 살 많이 빠졌다. 무슨 운동이라도 했어?");
        t= "n153_3";
    }

    public void neighbor153_3() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("운동은 크게 안했는데 군대에서 고생해서 그런지 살이 빠지더라고");
        t= "n153_4";
    }

    public void neighbor153_4() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("야, 그래도 전보다 보기 좋네. 그래도 진짜 오랜만이다! ");
        t= "n153_5";
    }

    public void neighbor153_5() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("그러게 말이야, 너는 고등학교때 복싱했던 \"고릴라\" 맞지?");
        t= "n153_6";
    }

    public void neighbor153_6() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("올~ 정모, 기억력 좋은데?");
        t= "n159";
    }

    public void neighbor159() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("아, 맞아. 내일 저녁에 고등학교때 같은 반이였던 얘들 몇명이랑 오랜만에 만나는데 너도 시간 있으면 와.");
        t= "n161";
    }


    public void neighbor161() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("내일 저녁이라고? 어... 내일 특별한 일정이 없어서 갈수 있을것 같아.");
        t= "n162";
    }

    public void neighbor162() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("그렇게 주인공은 옆집동창과 연락처를 주고 받고, 내일의 약속 장소가 어딘지를 받았다.");
        t= "n163";
    }

    public void neighbor163() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        noButton();
        h1.text.setText("그럼, 내일 봐! 그리고 앞으로 집에 있을때 조용히좀 해라! 그럼 난 간다.");
        t= "n164";
    }

    public void neighbor164() {
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("옆집동창은 그 말을 마지막으로 자신의 집으로 돌아갔다.");
        t= "n165";
    }

    public void neighbor165() {
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("야레~ 야레~ 바로 약속을 잡아 버리는 이 몸의 센스... 아주 손쉽구만");

    }
}

