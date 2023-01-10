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
            case "n1" : neighbor1(); break;
            case "sn1" : selectnext1(); break;

            case "sn1_1":neighbor1_1();break;
            case "sn1_11":neighbor1_11();break;
            case "sn1_12":neighbor1_12();break;
            case "sn1_13":neighbor1_13();break;
            case "sn1_14":neighbor1_14();break;
            case "sn1_15":neighbor1_15();break;
            case "sn1_16":neighbor1_16();break;
            case "sn1_17":neighbor1_17();break;
            case "sn1_18":neighbor1_18();break;
            case "sn1_19":neighbor1_19();break;
            case "sn1_110":neighbor1_110();break;
            case "sn1_111":neighbor1_111();break;
            case "sn1_112":neighbor1_112();break;
            case "sn1_113":neighbor1_113();break;


            case"n12":neighbor12();break;
            case"n13":neighbor13();break;
            case"n14":neighbor14();break;
            case"n15":neighbor15();break;
            case"n16":neighbor16();break;
            case"n17":neighbor17();break;
            case"n18":neighbor18();break;
            case"n19":neighbor19();break;
            case"n110":neighbor110();break;
            case"n111":neighbor111();break;
            case"sn12":selectnext12();break;

            case"sn1_21":neighbor1_21();break;
            case"sn1_22":neighbor1_22();break;

            case"n112":neighbor112();break;
            case"n113":neighbor113();break;
            case"sn13":selectnext13();break;

            case"sn1_31":neighbor1_31();break;
            case"sn1_311":neighbor1_311();break;
            case"sn1_312":neighbor1_312();break;

            case"sn1_32":neighbor1_32();break;
            case"sn1_321":neighbor1_321();break;
            case"sn1_322":neighbor1_322();break;
            case"sn1_323":neighbor1_323();break;

            case"sn114":neighbor114();break;
            case"sn115":neighbor115();break;
            case"sn116":neighbor116();break;
            case"sn117":neighbor117();break;
            case"sn118":neighbor118();break;
            case"sn119":neighbor119();break;
            case"sn120":neighbor120();break;
            case"sn121":neighbor121();break;
            case"sn122":neighbor122();break;
            case"sn123":neighbor123();break;
            case"sn124":neighbor124();break;
            case"sn125":neighbor125();break;
            case"sn14":selectnext14();break;

            case"sn1_41":neighbor1_41();break;
            case"sn1_411":neighbor1_411();break;
            case"sn1_412":neighbor1_412();break;
            case"sn1_413":neighbor1_413();break;
            case"sn1_414":neighbor1_414();break;
            case"sn1_42":neighbor1_42();break;
            case"sn1_421":neighbor1_421();break;
            case"sn1_422":neighbor1_422();break;
            case"sn1_423":neighbor1_423();break;
            case"sn1_424":neighbor1_424();break;
            case"sn1_425":neighbor1_425();break;
            case"sn1_426":neighbor1_426();break;

            case"sn126":neighbor126();break;
            case"sn127":neighbor127();break;
            case"sn128":neighbor128();break;
            case"sn129":neighbor129();break;
            case"sn130":neighbor130();break;
            case"sn131":neighbor131();break;
            case"sn132":neighbor132();break;






            case"n31":neighbor31();break;
            case"n32":neighbor32();break;
            case"sn31":selectnext31();break;

            case"sn31_1":neighbor31_1();break;
            case"sn31_11":neighbor31_11();break;
            case"sn31_12":neighbor31_12();break;
            case"sn31_13":neighbor31_13();break;

            case"sn31_2":neighbor31_2();break;
            case"sn31_21":neighbor31_21();break;
            case"sn31_22":neighbor31_22();break;
            case"sn31_23":neighbor31_23();break;
            case"sn31_24":neighbor31_24();break;
            case"sn31_25":neighbor31_25();break;
            case"sn31_26":neighbor31_26();break;
            case"sn31_27":neighbor31_27();break;
            case"sn31_28":neighbor31_28();break;
            case"sn31_29":neighbor31_29();break;

            case"sn32":selectnext32();break;
            case"sn32_1":neighbor32_1();break;
            case"sn32_11":neighbor32_11();break;
            case"sn32_12":neighbor32_12();break;

            case"n33":neighbor33();break;

            case"sn33":selectnext33();break;
            case"sn33_1":neighbor33_1();break;
            case"sn33_2":neighbor33_2();break;
            case"sn33_3":neighbor33_3();break;

            case"n34":neighbor34();break;
            case"n35":neighbor35();break;
            case"n36":neighbor36();break;
            case"n37":neighbor37();break;
            case"n38":neighbor38();break;
            case"n39":neighbor39();break;
            case"n310":neighbor310();break;
            case"n311":neighbor311();break;
            case"n312":neighbor312();break;
            case"n313":neighbor313();break;
            case"n314":neighbor314();break;

            case"sn34":selectnext34();break;
            case"sn34_1":neighbor34_1();break;
            case"sn34_11":neighbor34_11();break;
            case"sn34_12":neighbor34_12();break;
            case"sn34_13":neighbor34_13();break;
            case"sn34_14":neighbor34_14();break;
            case"sn34_15":neighbor34_15();break;
            case"sn34_16":neighbor34_16();break;
            case"sn34_17":neighbor34_17();break;
            case"sn34_2":neighbor34_2();break;
            case"sn34_21":neighbor34_21();break;
            case"sn34_22":neighbor34_22();break;
            case"sn34_23":neighbor34_23();break;
            case"sn34_24":neighbor34_24();break;
            case"sn34_25":neighbor34_25();break;
            case"sn34_3":neighbor34_3();break;
            case"sn34_31":neighbor34_31();break;
            case"sn34_32":neighbor34_32();break;
            case"sn34_33":neighbor34_33();break;
            case"sn34_34":neighbor34_34();break;
            case"sn34_35":neighbor34_35();break;

            case"n315":neighbor315();break;
            case"n316":neighbor316();break;
            case"n317":neighbor317();break;
            case"n318":neighbor318();break;
            case"n319":neighbor319();break;






            case"s50":senior50();break;
            case"s51":senior51();break;
            case"s52":senior52();break;
            case"s53":senior53();break;
            case"s54":senior54();break;
            case"s55":senior55();break;
            case"s56":senior56();break;
            case"ss50":selectsenior50();break;

            case"s57":senior57();break;
            case"s58":senior58();break;
            case"s59":senior59();break;
            case"s510":senior510();break;
            case"s511":senior511();break;
            case"s512":senior512();break;
            case"s513":senior513();break;
            case"s514":senior514();break;
            case"s515":senior515();break;
            case"s516":senior516();break;
            case"s517":senior517();break;
            case"ss51":selectsenior51();break;

            case"s51_1":senior51_1();break;
            case"s51_2":senior51_2();break;
            case"s51_3":senior51_3();break;
            case"s51_4":senior51_4();break;

            case"s518":senior518();break;
            case"s519":senior519();break;
            case"s520":senior520();break;
            case"s521":senior521();break;
            case"s522":senior522();break;
            case"s523":senior523();break;
            case"s524":senior524();break;
            case"s525":senior525();break;
            case"s526":senior526();break;
            case"s527":senior527();break;
            case"s528":senior528();break;
            case"s529":senior529();break;
            case"s530":senior530();break;
            case"s531":senior531();break;
            case"ss52":selectsenior52();break;
            case"s52_1":senior52_1();break;
            case"s52_2":senior52_2();break;



            case"s532":senior532();break;
            case"s533":senior533();break;
            case"s534":senior534();break;
            case"s535":senior535();break;
            case"s537":senior537();break;
            case"s538":senior538();break;
            case"s539":senior539();break;
            case"s540":senior540();break;
            case"s541":senior541();break;
            case"s542":senior542();break;
            case"ss53":selectsenior53();break;


            case"n50":neighbor50();break;
            case"n51":neighbor51();break;
            case"sn50":selectnext50();break;

            case"sn50_1":neighbor50_1();break;
            case"sn51":selectnext51();break;

            case"sn51_1":neighbor51_1();break;
            case"sn51_11":neighbor51_11();break;
            case"sn51_12":neighbor51_12();break;
            case"sn51_2":neighbor51_2();break;
            case"sn51_21":neighbor51_21();break;
            case"sn51_22":neighbor51_22();break;

            case"n52":neighbor52();break;
            case"n53":neighbor53();break;
            case"n54":neighbor54();break;
            case"sn52":selectnext52();break;
            case"sn53":selectnext53();break;
            case"n53_2":neighbor53_2();break;
            case"n53_3":neighbor53_3();break;
            case"n55":neighbor55();break;
            case"n56":neighbor56();break;
            case"n57":neighbor57();break;
            case"sn55":selectnext55();break;

            case"sn55_1":neighbor55_1();break;
            case"sn55_11":neighbor55_11();break;
            case"sn55_12":neighbor55_12();break;
            case"sn55_13":neighbor55_13();break;

            case"sn55_2":neighbor55_2();break;
            case"sn55_21":neighbor55_21();break;
            case"sn55_22":neighbor55_22();break;
            case"sn55_23":neighbor55_23();break;
            case"sn55_24":neighbor55_24();break;
            case"sn55_25":neighbor55_25();break;
            case"sn55_26":neighbor55_26();break;
            case"sn55_27":neighbor55_27();break;









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
        h1.background.setImageResource(R.mipmap.room1);
        h1.character.setImageResource(R.mipmap.godimage1);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("(주인공)은 병원에서 진료를 마치고 자신이 살고 있는 원룸으로 돌아왔다. ");
        noButton();
        t = "n1";
    }

    public void neighbor1(){
        h1.text.setText("흠... 병원에서는 몸에 아무 이상이 없다고는 하니까 다행이기는 하지만... 아까 내가 \"신\"을 본게 사실인가? 그냥 꿈을 꾼게 아닐까?");
        t = "sn1";
    }

    public void selectnext1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("그래, 갑작스러운 사고로 인하여 그런 꿈을 꾼게 틀림없어. 요즘 내가 애니메이션을 너무 많이 봐서 그런가?");
        h1.choice3.setText("역시... 이몸인가? 확실히 이몸이 평범한 '닝겐'들과는 다르다고 생각은 했었지만, \"신\"에게 다시 기회를 받다니...");
        c1 = "sn1_1";
        c3 = "n12";
    }


    public void neighbor1_1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아까 있었던 일이 단순히 꿈이라 생각을 하고 별일이 아닌듯 그냥 넘어가려 하였을때, 갑자기 핸드폰에 \"발신자 제한 표시\"로 전화가 왔다.");
        noButton();
        t = "sn1_11";
    }

    public void neighbor1_11(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("엉? 발신자 제한 전화네... 뭐지? 여보세요?");
        noButton();
        t = "sn1_12";
    }

    public void neighbor1_12(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage1);
        h1.text.setText("어, 그래~ 방금 아까 일어난 일이 단순히 꿈이라고 생각을 했지?");
        noButton();
        t = "sn1_13";
    }

    public void neighbor1_13(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("뭐야! 당신! 누군데 내 생각을 알고 있는거야?");
        noButton();
        t = "sn1_14";
    }

    public void neighbor1_14(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage2);
        h1.text.setText("후후후, 나는 너가 쓰러졌을때 너를 치료한 의사지. 그리고 너가 쓰러진 동안 너의 귀안에 도청장치를 설치했기에 너의 생각을 알고 있는 거라고.");
        noButton();
        t = "sn1_15";
    }

    public void neighbor1_15(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("뭐.. 뭐라고?! 내 귀에 도청장치??");
        noButton();
        t = "sn1_16";
    }

    public void neighbor1_16(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage1);
        h1.text.setText("푸하하핫! 농담이야 농담~~ 그리고 귀에 도청장치가 있다고 해서 생각을 읽는게 가능할것 같아? 아주 생긴것 만큼 멍청하구만...");
        noButton();
        t = "sn1_17";
    }


    public void neighbor1_17(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("아니... 그러면 당신은 도대체 누군데 내 생각을 아는거지?");
        t = "sn1_18";
    }

    public void neighbor1_18(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("하... 멍청해도 너무 멍청한거 아니야? 그렇게 눈치가 없어서야 15일 안에 여자를 사귀는게 가능하겠어?");
        t = "sn1_19";
    }

    public void neighbor1_19(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("설마... 당신은... \"신\"? 그렇다면 아까 있었던게 꿈이 아니라고?");
        t = "sn1_110";
    }

    public void neighbor1_110(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        noButton();
        h1.text.setText("에휴... 이렇게 눈치가 없으니 지금까지 여자를 못 사귄거지. 15일동안 잘해봐라! 뭐 지금처럼 계속 눈치 없이 지내면  아무일도 생기지 않고 나를 만나러 올거지만 말이야!");
        t = "sn1_111";
    }

    public void neighbor1_111(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("아니... 잠깐... 저기요!...");
        t = "sn1_112";
    }

    public void neighbor1_112(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("전화는 끊어지고, 아까의 일이 단순한 꿈이 아니라는 것을 알게 되었다.");
        t = "sn1_113";
    }


    public void neighbor1_113(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("아니... 꿈이 아니였다니... 그럼 진짜로 이몸이 \"신\"을 만난거라고?...");
        t = "n12";
    }



    public void neighbor12(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("훗... 애니메이션을 보면 \"신\"에게 선택을 받은 사람들은 \"특별한 능력\"을 받던데.. 혹시 이몸에게도? ");
        t = "n13";
    }

    public void neighbor13(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("(주인공)은 자신이 \"신\"으로 부터 \"특별한 능력\"을 받은 것이 있는지를 확인을 하는 도중 거울을 보게 되었다. ");
        t = "n14";
    }

    public void neighbor14(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("후후후후... 설마 했는데... 그렇지 않아도 잘생긴 이몸의 외모를 \"신\"이 한층 더 잘생기게 한건가? 야레~~ 야레~ 이러면 곤란 하다고~");
        t = "n15";
    }

    public void neighbor15(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("거울을 보면서 자신의 외모에 감탄을 하고 있자 핸드폰이 울리더니 이내 한 목소리가 들리기 시작하였다.");
        t = "n16";
    }

    public void neighbor16(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("아니, 다시 살수 있는 기회를 준것만으로도 감사해야지, 무슨 \"특별한 능력\" 같은 헛소리를 하는거야? ");
        t= "n17";
    }

    public void neighbor17(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("우왓! 깜짝이야... 당신은...\"신\"?");
        t="n18";
    }

    public void neighbor18(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setText("에휴.... 미안하지만, 넌 잘생긴게 아니니까 착각하지 말고, 여자를 사귀려면 좋은 매너를 보이든 여자가 공감할 수 있는 대화를 하라고. 계속 보니까 불쌍해서 주는 팁이다! 그럼 수고하라고~~");
        t="n19";
    }

    public void neighbor19(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("잠깐... 그럼 애니메이션에 나오는 여심을 공략할 \"특별한 능력\"은 없는 거냐고요... 저기요!... 여보세요?");
        t="n110";
    }

    public void neighbor110(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("... ... ...");
        t="n111";
    }

    public void neighbor111(){
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setText("훗,  \"신\"이 \"특별한 능력\"을 주지 않아도 이몸의 매력이라면 15일안에 여심을 사로 잡는것은 충분하지. 일단, 아는 여자들에게 연락을 취해 볼까?");
        t="sn12";
    }

    public void selectnext12(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("핸드폰의 연락처를 확인 해 본다.");
        h1.choice3.setText("소셜 미디어 속 아는 친구들이 있는지를 확인 해 본다.");
        c1 = "sn1_21";
        c3 = "sn1_22";
    }

    public void neighbor1_21(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.smartphone);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공)은 핸드폰의 연락처를 확인해 보았지만, 어떠한 여자의 번호도 있지 않았다.");
        noButton();
        t = "n112";
    }

    public void neighbor1_22(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.smartphone);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공)은 핸드폰의 소셜미디어를 확인해 보았지만, 어떠한 여자의 팔로잉도 있지 않았다.");
        noButton();
        t = "n112";
    }

    public void neighbor112(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("... ... ...\n");
        noButton();
        t = "n113";
    }

    public void neighbor113(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("우와와와앗!!! 큰일났다. 생각을 해보니, 이 몸은 알고 지내는 여자따위는 없다고! 이거 어떻게 하냐? 15일 안에 새로운 여자를 만날 뿐 아니라 여자의 마음을 얻어야 한다고? 이거는 이몸에게도 easy 하지 않은 난이도 인데?");
        noButton();
        t = "sn13";
    }

    public void selectnext13(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("뭐... 어떻게든 되겠지. 일단 \"리그 오브 레거시\"라는 게임이나 해야겠다.(호감도-5)");
        h1.choice3.setText("일단 밖에라도 나가서 돌아다녀 볼까? 나가서 돌아다니다 보면 어떻게 해서든 여자를 만나지 않으려나?");
        c1 = "sn1_31";
        c3 = "sn1_32";
    }

    public void neighbor1_31(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공)은 \"리그 오브 레거시\"라는 게임을 시작 하였다.");
        noButton();
        t = "sn1_311";
    }

    public void neighbor1_311(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아니! 포탑이 파괴될것 같으면 와서 도와야지 왜 저녀석은 왜 탑에 밖혀서 안나오는 건데! 걔 때문에 내 승급전 망했자나!");
        noButton();
        t = "sn1_312";
    }

    public void neighbor1_312(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공)의 팀의 트롤링으로 인하여 승급전에서 패배를 하여 분한 마음에 책상을 두드리며 분을 삭히고 있을때 초인종이 울리기 시작하였다.");
        noButton();
        t = "sn114";
    }

    public void neighbor1_32(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("밖에 나가기 전에 한번 꾸며볼까? 어디 입을만한 옷이 뭐가 있을까?");
        noButton();
        t = "sn1_321";
    }

    public void neighbor1_321(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공)이 밖에 나가기 전 입을 옷을 고르기 위해 옷장을 열자 그 안에서 \"바퀴벌래\"가 나타났다.");
        noButton();
        t = "sn1_322";
    }

    public void neighbor1_322(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("우와와와와왓! 바...바... 바퀴벌래닷!...");
        noButton();
        t = "sn1_323";
    }

    public void neighbor1_323(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바퀴벌래를 잡기 위해 이곳 저곳을 이동하고 있던 도중 초인종이 울리기 시작하였다.");
        noButton();
        t = "sn114";
    }

    public void neighbor114(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("누구지? 올사람이 없는데...");
        noButton();
        t = "sn115";
    }

    public void neighbor115(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.background.setImageResource(R.mipmap.room11);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("저기요! 여기 혼자사는것도 아닌데 왜이리 시끄럽게 하는거에요! 다른 사람 생각은 안하나요?");
        noButton();
        t = "sn116";
    }

    public void neighbor116(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아니.. 그게 그러니까...");
        noButton();
        t = "sn117";
    }

    public void neighbor117(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그러니까는 무슨, 잘못을 했으면 변명이 아니고 사과를 해야 하는 것은 상식 아닌가요? 학교에서 그런것도 안배웠어요?");
        noButton();
        t = "sn118";
    }

    public void neighbor118(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어... 그러니까... 아.... 죄송합니다.");
        noButton();
        t = "sn119";
    }

    public void neighbor119(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("죄송하면 앞으로 조심좀 하세요. 앞으로 이런 일때문에 얼굴 보지 않았으면 하네요.");
        noButton();
        t = "sn120";
    }

    public void neighbor120(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("죄송합니다. 그런데... 정말 죄송한데... 저희 어디서 본적 없나요?");
        noButton();
        t = "sn121";
    }

    public void neighbor121(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나참, 어이가 없어서... 지금 뭐하는 거죠? 이 상황에 작업 거는 건가요? 상황 파악이 안되요?");
        noButton();
        t = "sn122";
    }

    public void neighbor122(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아니... 그게 아니고... 진짜 얼굴이 익숙해서요...");
        noButton();
        t = "sn123";
    }

    public void neighbor123(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("익숙하기는 무슨, 저는 당신같이 생긴 사람을... 음?... 그러고 보니 뭔가 익숙한것 같기도 하고... ");
        noButton();
        t = "sn124";
    }

    public void neighbor124(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("저... 혹시... 어느 중학교랑 고등학교를 나오셨는지 물어봐도 될까요?");
        noButton();
        t = "sn125";
    }

    public void neighbor125(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("중학교랑 고등학교?... 나는 병맛중학교와 고등학교를.... 어? 너 혹시 \"정모\" 아니야?? ");
        noButton();
        t = "sn14";
    }

    public void selectnext14(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("어!.. 맞아... 그럼 고등학교때 같은 반 이었나?(호감도-5)");
        h1.choice3.setText("맞아, 내가 \"정모\" 라고 불리긴 했는데... 그런데 \"정모\"의 뜻이 뭐야? 아직도 그 뜻을 몰라서 말이야.(호감도+5)");
        c1 = "sn1_41";
        c3 = "sn1_42";
    }

    public void neighbor1_41(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뭐야 아직도 내가 누군지 기억안나는거야?");
        noButton();
        t = "sn1_411";
    }

    public void neighbor1_411(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("앗, 미안...");
        noButton();
        t = "sn1_412";
    }

    public void neighbor1_412(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("하긴 같은 반이긴 했지만 그렇게 친하지는 않았으니 말이야. 나 복싱하던 \"고릴라\"라고.");
        noButton();
        t = "sn1_413";
    }

    public void neighbor1_413(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아! 그렇구나! 진짜 오랜만이야!");
        noButton();
        t = "sn1_414";
    }

    public void neighbor1_414(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오랜만이긴 하지");
        noButton();
        t = "sn126";
    }

    public void neighbor1_42(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뭐야, 너 별명인데 그 뜻도 몰랐던거야? \"정모\"는 \"정육점 모델\"을 줄인 말이자나!\n");
        noButton();
        t = "sn1_421";
    }

    public void neighbor1_421(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("하하... 정육점 모델이였다니...");
        noButton();
        t = "sn1_422";
    }

    public void neighbor1_422(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래도 이제 \"정모\" 라고 부르지는 못하겠는데? 그때보다 살 많이 빠졌다. 무슨 운동이라도 했어?\n");
        noButton();
        t = "sn1_423";
    }

    public void neighbor1_423(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("운동은 크게 안했는데 군대에서 고생해서 그런지 살이 빠지더라고");
        noButton();
        t = "sn1_424";
    }

    public void neighbor1_424(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("야, 그래도 전보다 보기 좋네. 그래도 진짜 오랜만이다! ");
        noButton();
        t = "sn1_425";
    }

    public void neighbor1_425(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그러게 말이야, 너는 고등학교때 복싱했던 \"고릴라\" 맞지?");
        noButton();
        t = "sn1_426";
    }

    public void neighbor1_426(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("올~ 정모, 기억력 좋은데?");
        noButton();
        t = "sn126";
    }

    public void neighbor126(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아, 맞아. 내일 저녁에 고등학교때 같은 반이였던 얘들 몇명이랑 오랜만에 만나는데 너도 시간 있으면 와.");
        noButton();
        t = "sn127";
    }

    public void neighbor127(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("내일 저녁이라고? 어... 내일 특별한 일정이 없어서 갈수 있을것 같아. ");
        noButton();
        t = "sn128";
    }

    public void neighbor128(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("야, 너 \"아웃스타그램\" 하냐? 계정 어떻게 되냐? 내일 어디서 보는지 문자 날릴게\n");
        noButton();
        t = "sn129";
    }

    public void neighbor129(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그렇게 주인공은 옆집동창과 연락처를 주고 받고, 내일의 약속 장소가 어딘지를 받았다. ");
        noButton();
        t = "sn130";
    }

    public void neighbor130(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그럼, 내일 봐! 그리고 앞으로 집에 있을때 조용히좀 해라! 그럼 난 간다.");
        noButton();
        t = "sn131";
    }

    public void neighbor131(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("옆집동창은 그 말을 마지막으로 자신의 집으로 돌아갔다");
        noButton();
        t = "sn132";
    }

    public void neighbor132(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("야레~ 야레~ 바로 약속을 잡아 버리는 이 몸의 센스... ");
        noButton();
        t = "n31";
    }










    //옆집소녀3

















    public void neighbor31(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setText("따르르르르릉~~~");
        noButton();
        t = "n32";
    }

    public void neighbor32(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("으.... 아침부터 누구야? 이렇게 이른 시간부터 나한테 전화 할 사람이 없는데...");
        noButton();
        t = "sn31";
    }

    public void selectnext31(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("전화를 무시하고 계속 잔다.");
        h1.choice3.setText("전화를 받는다. ");
        c1 = "sn31_1";
        c3 = "sn31_2";
    }

    public void neighbor31_1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("으... 피곤해... 끄고 자야겠다. 중요한 연락이면 다시 오겠지");
        noButton();
        t = "sn31_11";
    }

    public void neighbor31_11(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("...");
        noButton();
        t = "sn31_12";
    }

    public void neighbor31_12(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("따르르르르릉~");
        noButton();
        t = "sn31_13";
    }

    public void neighbor31_13(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아니... 또 전화가 온다고? ");
        noButton();
        t = "sn32";
    }

    public void selectnext32(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("전화를 무시하고 계속 잔다.");
        h1.choice3.setText("전화를 받는다.");
        c1 = "sn32_1";
        c3 = "sn31_2";
    }

    public void neighbor32_1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이제는 연락이 오지 않네. 이제 좀 더 자야 겠다.");
        noButton();
        t = "sn32_11";
    }

    public void neighbor32_11(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("시간이 흐른후");
        noButton();
        t = "sn32_12";
    }

    public void neighbor32_12(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아~ 잘잤다~");
        noButton();
        t = "n33";
    }

    public void neighbor31_2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.background.setVisibility(View.VISIBLE);
        h1.text.setText("누구세요?");
        noButton();
        t = "sn31_21";
    }

    public void neighbor31_21(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이제 3일 남았는데, 잠이 오냐?");
        noButton();
        t = "sn31_22";
    }

    public void neighbor31_22(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어..어? ");
        noButton();
        t = "sn31_23";
    }

    public void neighbor31_23(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어제 살면서 처음으로 여자들이랑 시간을 보냈다고 해서 다 된거라 생각하는 건 아니지? ");
        noButton();
        t = "sn31_24";
    }

    public void neighbor31_24(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어... 어..");
        noButton();
        t = "sn31_25";
    }

    public void neighbor31_25(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("너는 할수 있는 말이 \"어\" 밖에 없냐? ");
        noButton();
        t = "sn31_26";
    }

    public void neighbor31_26(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("갑자기 전화와서 놀란것 뿐이라고요!");
        noButton();
        t = "sn31_27";
    }

    public void neighbor31_27(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뭐가 되었든, 이렇게 자고 있다간 아무것도 하지 못하니까 빨리 일어나 뭐라도 하라고!");
        noButton();
        t = "sn31_28";
    }

    public void neighbor31_28(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("에... 귀찮은데...");
        noButton();
        t = "sn31_29";
    }

    public void neighbor31_29(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그렇게 전화는 끊어 졌다.");
        noButton();
        t = "n33";
    }

    public void neighbor33(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("하.. 이제 뭘 해야 하냐? 할일도 없는데... 운동이나 해야 겠다.. ");
        noButton();
        t = "sn33";
    }


    public void selectnext33(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice1.setText("베드민턴");
        h1.choice2.setText("축구");
        h1.choice3.setText("조깅");
        c1 = "sn33_1";
        c2 = "sn33_2";
        c3 = "sn33_3";
    }

    public void neighbor33_1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아.. 그러고 보니 베드민턴 채가 없구나...");
        noButton();
        t = "n33";
    }

    public void neighbor33_2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아.. 그러고 보니 축구는 혼자 할 수 없구나...");
        noButton();
        t = "n33";
    }

    public void neighbor33_3(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래, 혼자서도 할 수 있는 조깅이나 해야겠다.");
        noButton();
        t = "n34";
    }

    public void neighbor34(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공)은 옷을 갈아 입고 밖의 공원으로 향했다.");
        noButton();
        t = "n35";
    }

    public void neighbor35(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.godimage3);
        h1.text.setVisibility(View.VISIBLE);
        h1.background.setImageResource(R.mipmap.park11);
        h1.text.setText("이제 한번 뛰어 볼까?");
        noButton();
        t = "n36";
    }

    public void neighbor36(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.next3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어? \"정모\" 너 여기서 뭐하냐?");
        noButton();
        t = "n37";
    }

    public void neighbor37(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어? 뭐야, 너야말로 여기서 뭐해?");
        noButton();
        t = "n38";
    }

    public void neighbor38(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나는 시합 때문에 항상 이 시간에는 달리기를 하거든, 그러는 넌 어디 가는 길이냐?");
        noButton();
        t = "n39";
    }

    public void neighbor39(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나? 오랜만에 조깅하려고 왔는데");
        noButton();
        t = "n310";
    }

    public void neighbor310(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어? 진짜? 이열~\"정모\" 대단한데");
        noButton();
        t = "n311";
    }

    public void neighbor311(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아니... 뭐 그냥 달리는 건데 뭐..");
        noButton();
        t = "n312";
    }

    public void neighbor312(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("잘됬다. 혼자 달리기 심심했는데 같이 달리자.");
        noButton();
        t = "n313";
    }

    public void neighbor313(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("좋지!");
        noButton();
        t = "n314";
    }

    public void neighbor314(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("몇바퀴 뛸래? 참고로 여기 한바퀴는 1km 정도야.");
        noButton();
        t = "sn34";
    }

    public void selectnext34(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice1.setText("7 바퀴 는 달려 줘야지!(호감도-10)");
        h1.choice2.setText("5 바퀴정도 달려야 하지 않을까?(호감도-5)");
        h1.choice3.setText("한...3바퀴 달릴까?(호감도+5)");
        c1 = "sn34_1";
        c2 = "sn34_2";
        c3 = "sn34_3";
    }

    public void neighbor34_1(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("7바퀴나 뛴다고? 가능하겠어?");
        noButton();
        t = "sn34_11";
    }

    public void neighbor34_11(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그정도면 거뜬하지! ");
        noButton();
        t = "sn34_12";
    }

    public void neighbor34_12(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("흠... 일단 뛰어 보자!");
        noButton();
        t = "sn34_13";
    }

    public void neighbor34_13(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("3바퀴 뛴 후...");
        noButton();
        t = "sn34_14";
    }

    public void neighbor34_14(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("헤...헥....헥....");
        noButton();
        t = "sn34_15";
    }

    public void neighbor34_15(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아니, 다 뛰지도 못할꺼면서 뭘 7바퀴를 뛴다고 하냐.");
        noButton();
        t = "sn34_16";
    }

    public void neighbor34_16(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgirl2);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("우웨엑~");
        noButton();
        t = "sn34_17";
    }

    public void neighbor34_17(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.next44);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("으... 디러... 좀 쉬자.");
        noButton();
        t = "n315";
    }

    public void neighbor34_2(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오, 군대 갔다 왔다고 티 내는 거야? 좋아 한번 가보자!");
        noButton();
        t = "sn34_21";
    }

    public void neighbor34_21(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("3바퀴 뛴 후.....");
        noButton();
        t = "sn34_22";
    }

    public void neighbor34_22(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("헤.. 헥... 핵...\n");
        noButton();
        t = "sn34_23";
    }

    public void neighbor34_23(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.next3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이제 2바퀴만 남았어 조금 더 힘내!");
        noButton();
        t = "sn34_24";
    }
    public void neighbor34_24(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.next3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이...이제 더이상은...");
        noButton();
        t = "sn34_25";
    }

    public void neighbor34_25(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.next3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래, 그래도 이정도면 너치고는 많이 뛰었네.");
        noButton();
        t = "n315";
    }

    public void neighbor34_3(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("3바퀴면 거뜬하지! 그래 가자!");
        noButton();
        t = "sn34_31";
    }

    public void neighbor34_31(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("3바퀴 뛴 후");
        noButton();
        t = "sn34_32";
    }

    public void neighbor34_32(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("끝.. 끝났다!");
        noButton();
        t = "sn34_33";
    }

    public void neighbor34_33(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이야, 너 군대 가더니 많이 발전 했네. ");
        noButton();
        t = "sn34_34";
    }

    public void neighbor34_34(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("죽겠다.... ");
        noButton();
        t = "sn34_35";
    }

    public void neighbor34_35(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("잠시 휴식을 취하자, 고릴라가 말을 걸었다.");
        noButton();
        t = "n315";
    }

    public void neighbor315(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래도 운동 하는 거 좋아하나 보네.");
        noButton();
        t = "n316";
    }

    public void neighbor316(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("헥 헥.... 좋아한다기 보다는 좋아하려 노력 중이지.");
        noButton();
        t = "n317";
    }

    public void neighbor317(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("좋아하려 노력 중이라... 너 혹시 이번주에 시간 비어?");
        noButton();
        t = "n318";
    }

    public void neighbor318(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("왜? 뭐 있어?");
        noButton();
        t = "n319";
    }

    public void neighbor319(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.nextgril3);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뭐... 아무것도 하는 거 없으면 같이 야구장이나 가자. ");
        noButton();
    }



    public void senior50(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.senior111);
        h1.background.setVisibility(View.VISIBLE);
        h1.background.setImageResource(R.mipmap.back5);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라와 지난 3일간 슈퍼갓스타를 지원하기 위해 꾸준히 만났다.");
        noButton();
        t = "s51";
    }

    public void senior51(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라의 지원서를 온라인으로 접수하고…");
        noButton();
        t = "s52";
    }

    public void senior52(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어떤 곡을 첫번째로 선보일지…");
        noButton();
        t = "s53";
    }

    public void senior53(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그리고 무대를 어떻게 선보여야 더 눈에 띌지 등 함께 고민해주었다.");
        noButton();
        t = "s54";
    }

    public void senior54(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그리고 첫 오디션날이 왔고 우리는 함께 오디션장에 왔다.");
        noButton();
        t = "s55";
    }

    public void senior55(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("스태프: 32714번님! 준비해주세요.");
        noButton();
        t = "s56";
    }

    public void senior56(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오디션장에는 생각했던 것보다 훨씬 다양하고 개성적인 사람들이 많았다. 분위기에 압도당했는지 게릴라는 지나치게 몸이 굳어있었고 덜덜 떨고 있었다.\n");
        noButton();
        t = "ss50";
    }

    public void selectsenior50(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setText("이게 뭐라고 사람들은 이렇게 많이 지원했냐? ");
        h1.choice2.setText("그... 게릴라. 넌 잘 할 수 있어.");
        h1.choice3.setText("(그녀의 손을 잡아준다.)");
        h1.choice4.setText("벼..별거 아니야. 너는 자..잘할거야.");
        c1 = "s57";
        c2= "s57";
        c3 = "s57";
        c4 = "s57";
    }

    public void senior57(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("대기실에서 한참을 더 기다리자 드디어 게릴라의 차례가 왔다.");
        noButton();
        t = "s58";
    }

    public void senior58(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("스태프: 32892번님!");
        noButton();
        t = "s59";
    }

    public void senior59(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("…");
        noButton();
        t = "s510";
    }

    public void senior510(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("스태프: 32892번님!");
        noButton();
        t = "s511";
    }

    public void senior511(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("너 부른다.");
        noButton();
        t = "s512";
    }

    public void senior512(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어..어? 네..네! 여깄어요.");
        noButton();
        t = "s513";
    }

    public void senior513(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 부자연스럽게 일어난 후 스태프를 따라간다.");
        noButton();
        t = "s514";
    }

    public void senior514(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀의 긴장된 모습이 불안하여 나 또한 그녀를 따라갔다. 그녀와 나는 무대 뒷 편에 서 있게 되었고 앞으로 3명이 끝나면 바로 그녀 차례인 듯 하다.\n");
        noButton();
        t = "s515";
    }

    public void senior515(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("참가자 아니시죠? 동행자 분은 절대 무대 올라가시면 안 됩니다.");
        noButton();
        t = "s516";
    }

    public void senior516(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나는 게릴라의 상태를 체크한다.");
        noButton();
        t = "s517";
    }

    public void senior517(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어떻게 체크할 것인가?");
        noButton();
        t = "ss51";
    }

    public void selectsenior51(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setText("(그녀의 손을 잡아 입김을 불어넣어 따뜻하게 해준다.)");
        h1.choice2.setText("나야 음악이야.");
        h1.choice3.setText("(그녀의 손을 잡으며) 팬 1호인 내가 장담해! 넌 최고야.");
        h1.choice4.setText(" 파이팅! 우리 가수님 최고다.");
        c1 = "s51_1";
        c2= "s51_1";
        c3 = "s51_3";
        c4 = "s51_4";
    }

    public void senior51_1(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.senior111);
        h1.text.setText("...");
        noButton();
        t = "s518";
    }

    public void senior51_2(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.senior222);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("네? 갑자기 뭔소리예요?");
        noButton();
        t = "s518";
    }

    public void senior51_3(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.senior66);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("고마워요…");
        noButton();
        t = "s518";
    }

    public void senior51_4(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.senior222);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어후… 창피하니까, 작게 얘기해요…\n");
        noButton();
        t = "s518";
    }

    public void senior518(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그때 그녀를 부르는 소리가 스피커를 통해 들려온다.");
        noButton();
        t = "s519";
    }

    public void senior519(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("다음. 참가번호 32892번. 무대에 올라와주세요.");
        noButton();
        t = "s520";
    }

    public void senior520(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 창피해하면서 올라간다.");
        noButton();
        t = "s521";
    }

    public void senior521(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그런다가 그녀가 휙 뒤돌면서 나를 바라본다.\n");
        noButton();
        t = "s522";
    }

    public void senior522(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.senior333);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText(" 선배. 선배는 진짜 엉뚱하고 이상한 사람이네요.");
        noButton();
        t = "s523";
    }

    public void senior523(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText(" 그녀의 말 뜻을 이해 못하여 ‘무슨 소리야’라고 말하려는 순간…");
        noButton();
        t = "s524";
    }

    public void senior524(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.senior66);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래도 선배랑 만나서 다행이예요.");
        noButton();
        t = "s525";
    }

    public void senior525(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 자기 말만 하고 휙 다시 돌아 무대로 올라간다. 게릴라는 무대에 올라간 후에도 많이 긴장한 모습이 보여서 걱정이 되었다. 하지만 놀랍게도 노래가 시작되자 언제 긴장했냐는 듯 실수 한 번 없이 무대를 끝마쳤다.\n");
        noButton();
        t = "s526";
    }

    public void senior526(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀의 연습을 3일간 도와주며 수십번을 보고 들었던 노래지만 이번 무대보다 좋았던 적이 없었던 것 같다.");
        noButton();
        t = "s527";
    }

    public void senior527(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("심사위원1: 오늘 본 참가자 중 최고였어요.");
        noButton();
        t = "s528";
    }

    public void senior528(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("심사위원2: 오늘 핫걸의 핫을 부른 참가자가 20명은 더 되었을거예요. 그런데 이렇게 완벽했던 참가자는 없었어요. 잘 봤어요.");
        noButton();
        t = "s529";
    }

    public void senior529(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("심사위원3: 와… 노래를 듣는동안 꿈을 꾸는 것 같았어요. 고마워요.");
        noButton();
        t = "s530";
    }

    public void senior530(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("심사위원들에게 엄청난 극찬을 들으며 무대에 내려온 게릴라는 눈물을 흘린다.");
        noButton();
        t = "s531";
    }


    public void senior531(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("흑. 흑. 선배… 심사위원님들이… 흑. 흐윽…");
        noButton();
        t = "ss52";
    }

    public void selectsenior52(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setText("너무 멋있었어.");
        h1.choice2.setText(" 칭찬받았는데 왜 울어.");
        h1.choice3.setText("역시 우리 가수님. 믿고 있었어.");
        h1.choice4.setText("그래서 나야 음악이야.");
        c1 = "s52_1";
        c2= "s52_1";
        c3 = "s52_1";
        c4 = "s52_2";
    }

    public void senior52_1(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("흐에엥. 선배 덕분이예요.");
        noButton();
        t = "s532";
    }

    public void senior52_2(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setText("선배는 이런 상황에도 개소리를 하고… 흑… 선배답네요.");
        noButton();
        t = "s532";
    }

    public void senior532(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.background.setVisibility(View.VISIBLE);
        h1.background.setImageResource(R.mipmap.sunset222);
        h1.text.setText("1차 오디션이 끝난 게릴라는 나와 함께 오디션장을 빠져나온다. 오디션장에 해가 떠 있을 때 왔지만 그녀의 1차 오디션이 끝나니 이미 해가 한참 전에 져있었다.\n");
        noButton();
        t = "s533";
    }

    public void senior533(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("콰콰오택시 불렀어. 어서 가자.");
        noButton();
        t = "s534";
    }

    public void senior534(){
        h1.character.setVisibility(View.VISIBLE);
        h1.character.setImageResource(R.mipmap.senior66);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("올. 센스가 좀 늘었네요. 매니저 하셔도 되겠어요.");
        noButton();
        t = "s535";
    }

    public void senior535(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그럼. 우리 가수 게릴라님. 게릴라 콘서트 할 때 도움 필요하면 언제든 얘기하세요.");
        noButton();
        t = "s536";
    }

    public void senior536(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.background.setVisibility(View.VISIBLE);
        h1.background.setImageResource(R.mipmap.night111);
        h1.text.setText("나는 그녀와 택시를 타고 그녀의 집으로 향한다. 그리고 택시 안에서 나는 많은 고민을 하는 중이다.\n");
        noButton();
        t = "s537";
    }

    public void senior537(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("신인지 그냥 노망난 할배인지 알 수 없지만… 그와 약속했던 15일이 오늘이다.\n");
        noButton();
        t = "s538";
    }

    public void senior538(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("무조건 오늘 누군가에게는 고백을 해야한다.");
        noButton();
        t = "s539";
    }

    public void senior539(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(바닐라 누나? 고릴라? 아니면… 게릴라?)(만약 게릴라에게 고백한다면 그녀가 집에 들어가기 전에 해야하겠지…)");
        noButton();
        t = "s540";
    }

    public void senior540(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("시간은 안타깝게도 내 편이 아닌지 순식간에 그녀의 집 앞에 도착하였다.");
        noButton();
        t = "s541";
    }

    public void senior541(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.senior66);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("선배. 오늘… 정말 고마웠어요. 조심히 들어가세요.");
        noButton();
        t = "s542";
    }

    public void senior542(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공의 선택하는 여자는?");
        noButton();
        t = "ss53";
    }

    public void selectsenior53(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice1.setText("바닐라");
        h1.choice2.setText("고릴라");
        h1.choice3.setText("게릴라");
        h1.choice4.setText("신");
        c1 = "s52_1";
        c2= "s52_1";
        c3 = "s52_1";
        c4 = "s52_2";
    }









    public void neighbor50(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.background.setImageResource(R.mipmap.room1);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("드디어 내일 \"고릴라\"가 복싱대회를 하는 날이네.");
        noButton();
        t = "n51";
    }

    public void neighbor51(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("내일 시합 잘 하라고 문자나 보내 볼까?");
        noButton();
        t = "sn50";
    }

    public void selectnext50(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("문자를 보낸다.");
        h1.choice3.setText("문자를 보내지 않는다");
        c1 = "sn50_1";
        c3 = "n53";
    }

    public void neighbor50_1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어디 보자... 뭐라고 쓰지? ");
        noButton();
        t = "sn51";
    }

    public void selectnext51(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("이기고 지는건 생각하지마. 지금은 그냥 편히 쉬어.(호감도:-5)");
        h1.choice3.setText("너무 걱정하지마, 너 내일 잘할 꺼야.(호감도:+5)");
        c1 = "sn51_1";
        c3 = "sn51_2";
    }

    public void neighbor51_1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("잠시후, \"고릴라\"에게서 문자가 왔다.");
        noButton();
        t = "sn51_11";
    }

    public void neighbor51_11(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("미안, 나는 지금 운동해야 되서 편히 쉬는건 힘들것 같네. 너가 나 대신 편히 쉬고, 내일 봐. ");
        noButton();
        t = "sn51_12";
    }

    public void neighbor51_12(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("흠... 뭔가 화난것 같은데? 내가 문자를 잘못 보냈나?");
        noButton();
        t = "n52";
    }

    public void neighbor51_2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("잠시후, \"고릴라\"에게서 문자가 왔다.");
        noButton();
        t = "sn51_21";
    }

    public void neighbor51_21(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("고마워, 내일 잘 할지는 봐야 하지만, 나는 다시 운동하러 갈게. 그럼 내일 보자고. ");
        noButton();
        t = "sn51_21";
    }

    public void neighbor51_22(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("후후후, 문자 보내길 잘 했구만. ");
        noButton();
        t = "n52";
    }


    public void neighbor52(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이제 슬슬 자야 겠다. ");
        noButton();
        t = "n53";
    }

    public void neighbor53(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그렇게 하루가 지나 \"고릴라\"의 복싱 대회 날이 왔다. ");
        noButton();
        t = "n54";
    }

    public void neighbor54(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그런데 나는 사실 복싱은 잘 모르는데 가서 잘 응원 할 수 있으려나?");
        noButton();
        t = "sn52";
    }

    public void selectnext52(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("흠... 사실 복싱도 모르는 내가 가도 도움이 되지 않을 것 같은데, 그냥 가지 말까?\n");
        h1.choice3.setText("지금이라도 조금 복싱에 대해 공부를 해 볼까?");
        c1 = "sn53";
        c3 = "n55";
    }

    public void selectnext53(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("아니야, 그래도 가기로 했으니 가야지.");
        h1.choice3.setText("그래, 가지 말자. 나같은 애가 가봤자 뭐 도움이 되겠어?(호감도-40)");
        c1 = "n55";
        c3 = "sn53_2";
    }

    public void neighbor53_2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래, 그냥 가지 말아야 겠다. ");
        noButton();
        t = "sn53_3";
    }

    public void neighbor53_3(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그렇게 하루가 무의미 하게 흐르고, \"주인공\"에게는 어떠한 일도 일어나지 않았다.");
        noButton();
    }

    public void neighbor55(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("자... 복싱의 규칙을 보면... ... ...");
        noButton();
        t = "n56";
    }

    public void neighbor56(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그렇게 \"주인공\"은 복싱을 공부한 다음 복싱시합 장소로 나갔다.");
        noButton();
        t = "n57";
    }

    public void neighbor57(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오늘은 여기서 복싱 시합을 하는 거구나. 이제 응원 하러 가볼까?");
        noButton();
        t = "n58";
    }

    public void neighbor58(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("\"주인공\"은 \"고릴라\"의 시합을 구경하러 갔다. 그리고 그 경기에서 \"고릴라\"는...");
        noButton();
        t = "sn55";
    }

    public void selectnext55(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.INVISIBLE);
        showButton();
        h1.choice4.setVisibility(View.INVISIBLE);
        h1.choice2.setVisibility(View.INVISIBLE);
        h1.choice1.setText("경기에서 이겼다.(호감도+5)");
        h1.choice3.setText("경기에서 졌다.(호감도+10)");
        c1 = "sn55_1";
        c3 = "sn55_2";
    }

    public void neighbor55_1(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오! 경기에서 이기다니! 진짜 축하해!");
        noButton();
        t = "sn55_11";
    }

    public void neighbor55_11(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("고마워. 쉽지는 않았지만, 그래도 이기니까 기분이 좋네. ");
        noButton();
        t = "sn55_12";
    }

    public void neighbor55_12(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("내가 말한대로 내가 오니까 이긴거 아니야?");
        noButton();
        t = "sn55_13";
    }

    public void neighbor55_13(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("하하하,그러게. 다음에도 또 오라고. \n");
        noButton();
        t = "sn55_13";
    }

    public void neighbor55_2(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이번에 너무 아쉬웠어. 그래도 진짜 고생 많았어.");
        noButton();
        t = "sn55_21";
    }

    public void neighbor55_21(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뭐... 어쩔 수 없지. 다음 기회를 노려야지. ");
        noButton();
        t = "sn55_22";
    }

    public void neighbor55_22(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("너무 걱정하지마, 이번에 판정승으로 진거니까, 다음에는 이길 수 있을거야. ");
        noButton();
        t = "sn55_23";
    }

    public void neighbor55_23(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("올, 뭐야, 나 판정승 이라는 것도 알아? 복싱에 대해 아나보네? ");
        noButton();
        t = "sn55_24";
    }

    public void neighbor55_24(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("사실 잘 알지는 못하는데 너가 시합한다고 해서 공부했거든. \n ");
        noButton();
        t = "sn55_25";
    }

    public void neighbor55_25(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오 진짜? 대박인데?");
        noButton();
        t = "sn55_26";
    }

    public void neighbor55_26(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뭐... 그래도 잠깐 공부한거여서 잘을 모르지만, 다음에 너 시합할때 까지 더 공부해 올게!\n");
        noButton();
        t = "sn55_27";
    }

    public void neighbor55_27(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.cry111);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그래? 그때는 내가 꼭 이길게! 그대신 공부 열심히 하고 와!");
        noButton();
    }




}
