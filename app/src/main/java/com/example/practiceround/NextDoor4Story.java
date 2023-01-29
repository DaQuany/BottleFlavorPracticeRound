package com.example.practiceround;

import android.view.View;
import android.widget.Button;

import java.util.Arrays;

public class NextDoor4Story
{
    NextDoor4 nds4;
    String t, c1, c2, c3;
    public NextDoor4Story(NextDoor4 nds4) {this.nds4 = nds4;}

    public void selectNext(String next){
        switch (next){
            case "nd4-1": text1(); break;
            case "nd4-2": text2(); break;
            case "nd4-3": text3(); break;
            case "nd4-4": text4(); break;
            case "nd4-5": text5(); break;
            case "nd4-6": text6(); break;
            case "nd4-7": text7(); break;
            case "nd4-8": text8(); break;
            case "nd4-9": text9(); break;
            case "nd4-10": text10(); break;
            case "nd4-11": text11(); break;
            case "nd4-12": text12(); break;
            case "nd4-13": text13(); break;
            case "nd4-14": text14(); break;
            case "nd4-15": text15(); break;
            case "nd4-16": text16(); break;
            case "nd4-17": text17(); break;
            case "nd4-18": text18(); break;
            case "nd4-19": text19(); break;
            case "nd4-20": text20(); break;
            case "nd4-21": text21(); break;
            case "nd4-22": text22(); break;
            case "nd4-23": text23(); break;
            case "nd4-24": text24(); break;
            case "nd4-25": text25(); break;
            case "nd4-26": text26(); break;
            case "nd4-27": text27(); break;
            case "nd4-28": text28(); break;
            case "nd4-29": text29(); break;
            case "nd4-30": text30(); break;
            case "nd4-31": text31(); break;
            case "nd4-32": text32(); break;
            case "nd4-33": text33(); break;
            case "nd4-34": text34(); break;
            case "nd4-35": text35(); break;
            case "nd4-36": text36(); break;
            case "nd4-37": text37(); break;
            case "nd4-38": text38(); break;
            case "nd4-39": text39(); break;
            case "nd4-40": text40(); break;
            case "nd4-41": text41(); break;
            case "nd4-42": text42(); break;
            case "nd4-43": text43(); break;
            case "nd4-44": text44(); break;
            case "nd4-45": text45(); break;
            case "nd4-46": text46(); break;
            case "nd4-47": text47(); break;
            case "nd4-48": text48(); break;
            case "nd4-49": text49(); break;
            case "nd4-50": text50(); break;
            case "nd4-51": text51(); break;
            case "nd4-52": text52(); break;
            case "nd4-53": text53(); break;
            case "nd4-54": text54(); break;
            case "nd4-55": text55(); break;
            case "nd4-56": text56(); break;
            case "nd4-57": text57(); break;
            case "nd4-58": text58(); break;
            case "nd4-59": text59(); break;
            case "nd4-60": text60(); break;
            case "nd4-61": text61(); break;
            case "nd4-62": text62(); break;
            case "nd4-63": text63(); break;
            case "nd4-64": text64(); break;
            case "nd4-65": text65(); break;
            case "nd4-66": text66(); break;
            case "nd4-67": text67(); break;
            case "nd4-68": text68(); break;
            case "nd4-69": text69(); break;
            case "nd4-70": text70(); break;
            case "nd4-71": text71(); break;
            case "nd4-72": text72(); break;
            case "nd4-73": text73(); break;
            case "nd4-74": text74(); break;
            case "nd4-75": text75(); break;
        }
    }

    public void showButton(){
        nds4.text.setVisibility(View.INVISIBLE);
        for (Button button : Arrays.asList(nds4.choice1, nds4.choice2, nds4.choice3)) {
            button.setVisibility(View.VISIBLE);
        }
    }

    public void noButton(){
        nds4.text.setVisibility(View.VISIBLE);
        for (Button button : Arrays.asList(nds4.choice1, nds4.choice2, nds4.choice3)) {
            button.setVisibility(View.INVISIBLE);
        }
    }


    public void start()
    {
        noButton();
        nds4.background.setImageResource(R.mipmap.room7);
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setTextSize(13);
        nds4.text.setText("나레이션: \"고릴라\"에게 같이 야구장에 가자고 초대를 받은 \"주인공\"은 믿을 수 없다는 표정을 지으며 침대에 누워 있다.");
        t = "nd4-1";
    }

    public void text1(){
        nds4.text.setText("주인공: 흐흐흐... 역시... 이몸이야... 내가 안해서 그렇지 마음먹고 하니까 여자가 먼저 놀러 가자 말하는 클라스... 캬~~ 취한다 취해~");
        t = "nd4-2";
    }

    public void text2(){
        nds4.text.setText("주인공: 이렇게 되면, 내가 이세계에 가게 되는 것은 식은 죽 먹기 겠구만. 후히히히히히");
        t = "nd4-3";
    }

    public void text3(){
        nds4.text.setText("주인공: 그나저나 지금 시간이 벌써 11시네. 내일 야구장에 가려면 이제 슬슬 잘까?");
        t = "nd4-4";
    }

    public void text4(){
        nds4.choice1.setText("그래 지금 자고 내일 일어나서 야구장에 갈 준비를 하자.");
        nds4.choice2.setText("11시에 자는 건 너무 이르지, 한 30분만 \"아웃스타그램\"을 보다가 자야겠다.(호감도+5)");
        showButton();
        c1 = "nd4-5";
        c2 = "nd4-13";
    }

    public void text5(){
        noButton();
        nds4.text.setText("나레이션: 30분 경과...");
        t = "nd4-6";
    }

    public void text6(){
        nds4.text.setText("주인공: 하하하.. 이거 재미 있네...");
        t = "nd4-7";
    }

    public void text7(){
        nds4.text.setText("나레이션: 30분 경과...");
        t = "nd4-8";
    }

    public void text8(){
        nds4.text.setText("주인공: 이것만 마저 보고 자야 겠다...");
        t = "nd4-9";
    }

    public void text9(){
        nds4.text.setText("나레이션: \"주인공\"은 \"아웃스타그램\"을 하다 보니 시간이 2시간이 흘러 버렸다.");
        t = "nd4-10";
    }

    public void text10(){
        nds4.text.setText("주인공: 아니, 뭐 했다고 벌써 2시간이 흘러 버렸냐? 이제 진짜 자야겠... 어? 이건...");
        t = "nd4-11";
    }

    public void text11(){
        nds4.text.setText("나레이션: \"주인공\"이 자려 하였을때, \"아웃스타그램\"에서 내일 가는 \"야구장\"근처의 유명한 \"카페\"를 발견하였다. ");
        t = "nd4-12";
    }

    public void text12(){
        nds4.text.setText("주인공: 오, 여기 좋은데? 내일 한번 기회가 되면 여기 가봐야 겠다. 그럼 이제 시간도 늦었는데 자야겠다.");
        t = "nd4-14";
    }

    public void text13(){
        noButton();
        nds4.text.setText("주인공: 으... 에이, 뭐 데이트가 뭐 대수라고... 긴장되서 잠도 못잤네. 일단 일어나서 나갈 준비 해야 겠다. 오늘 갈때 어떻게 하고 갈까?");
        t = "nd4-14";
    }

    public void text14(){
        showButton();
        nds4.choice1.setText("모자를 쓰고 가야겠다. (호감도+5)");
        nds4.choice2.setText("왁스를 바르고 가야 겠다. (호감도-5)");
        c1 = "nd4-15";
        //호감도 +5
        c2 = "nd4-19";
        //호감도-5
    }

    public void text15(){
        noButton();
        nds4.text.setText("주인공: 그래, 뭘 갑자기 꾸민다고 왁스를 바르긴 뭘 바르냐, 그냥 평소처럼 모자나 쓰고 가야 겠다. ");
        t = "nd4-16";
    }

    public void text16(){
        nds4.text.setText("나레이션: \"주인공\"은 옷을 입고 모자를 쓴 다음에 간단히 옷을 입은 다음 약속장소로 나갔다. 그리고 얼마 지나지 않아 \"고릴라\"가 나왔다.");
        t = "nd4-17";
    }

    public void text17(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 오! 뭐야, \"정모\" 일찍나왔네.");
        t = "nd4-18";
    }

    public void text18(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 나도 방금 나왔어.");
        t = "nd4-29";
    }

    public void text19(){
        noButton();
        nds4.text.setText("주인공: 어디보자... 왁스가 어디 있더라...  앗 여기있다. 왁스도 저번에 사놓고 한번도 사용안해봤지만, 뭐 잘 되겠지.");
        t = "nd4-20";
    }

    public void text20(){
        nds4.text.setText("나레이션: \"주인공\"이 머리에 왁스를 바르고 시간이 지나고...");
        t = "nd4-21";
    }

    public void text21(){
        nds4.text.setText("주인공: 으아악! 머리가 망했다! 왁스를 너무 많이 사용한건가? 이거 어떻게 하지?");
        t = "nd4-22";
    }

    public void text22(){
        nds4.text.setText("주인공: 으... 어쩔수 없지. 약속시간에 늦을 것 같기는 하지만, 머리를 감은 다음에 그냥 모자 쓰고 나가야 겠다.");
        t = "nd4-23";
    }

    public void text23(){
        nds4.text.setText("나레이션: 그렇게 \"주인공\"은 머리를 깜은 다음에 다시 준비를 하고 약속장소로 향했다.");
        t = "nd4-24";
    }

    public void text24(){
        nds4.background.setImageResource(R.mipmap.baseballstadium1);
        nds4.text.setText("주인공: 미얀. \"고릴라\"내가 조금 늦었지?");
        t = "nd4-25";
    }

    public void text25(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 음... 약간?");
        t = "nd4-26";
    }

    public void text26(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 어.. 진짜로?");
        t = "nd4-27";
    }

    public void text27(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 뭐, 그래도 약속장소를 헷갈리지 않은게 어디야?");
        t = "nd4-28";
    }

    public void text28(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 미얀.");
        t = "nd4-29";
    }

    public void text29(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 바로 야구나 보러 가자.");
        t = "nd4-30";
    }

    public void text30(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 어, 좋지!");
        t = "nd4-31";
    }

    public void text31(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그나저나, 너 \"하놔 피죤스\" 팬이야?");
        t = "nd4-32";
    }

    public void text32(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 어? \"하놔 피죤스\"라니?");
        t = "nd4-33";
    }

    public void text33(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 아니, 너가 지금 쓰고 있는 모자가 \"하놔 피죤스\" 모자여서 말이야.");
        t = "nd4-34";
    }

    public void text34(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 어... 오! 그... 그럼! 내가 \"하놔 피죤스\"의 팬이거든! 그나저나 이걸 알아보는 너도 \"하놔 피죤스\" 팬인거야?");
        t = "nd4-35";
    }

    public void text35(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 맞아. 나도 \"하놔 피존스\" 팬이야.");
        t = "nd4-36";
    }

    public void text36(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그런데 지금 \"하놔 피죤스\" 순위가 어떻게 되더라?");
        t = "nd4-37";
    }

    public void text37(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 너도 잘 알잖아... 언제나 꼴찌지...");
        t = "nd4-38";
    }

    public void text38(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 아하하... 그... 그렇구나....");
        t = "nd4-39";
    }
    public void text39(){
        nds4.choice1.setText("그런데 너는 왜 꼴찌하는 팀을 좋아하는거야?");
        nds4.choice2.setText("그래도 오늘 \"하놔 피죤스\"가 이길 수도 있지.");
        nds4.choice3.setText("그래도 꼴찌니까 더이상 떨어질때가 없으니 괜찮지 않을까? 뭐, 맘편하게 경기 하면 되잖아.");
        showButton();
        c1 = "nd4-40";
        //호감도 +10
        c2 = "nd4-55";
        //호감도 +5
        c3 = "nd4-57";
        //호감도 -5
    }

    public void text40(){
        noButton();
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그러면 너는 왜 좋아하는데?");
        t = "nd4-41";
    }

    public void text41(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 어?... 나? 아니... 내가 먼저 물어봤으니까 먼저 말해주면 알려줄게.");
        t = "nd4-42";
    }

    public void text42(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 뭐야, 그래. 듣고 웃지마.");
        t = "nd4-43";
    }

    public void text43(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 너가 말하는거 보고.");
        t = "nd4-44";
    }

    public void text44(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 사실, 내가 꼴찌하는 팀을 좋아하는 이유는 계속 팀이 지고 있더라도 끝까지 포기 하지 않고 열심히 하기 때문이야.");
        t = "nd4-45";
    }

    public void text45(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 끝까지 열심히 하기 때문에 좋아한다고?");
        t = "nd4-46";
    }

    public void text46(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 맞아, 조금 창피하긴 하지만 나도 복싱이라는 운동을 하자나.");
        t = "nd4-47";
    }

    public void text47(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 복싱을 할때 이길때도 있지만, 질때도 있거든. 그리고 어느날, 내가 복싱 경기에서 지고 힘들어 하고 있을때 내가 좌절하지 않을 수 있도록 나를 도와주었던게");
        t = "nd4-48";
    }

    public void text48(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 경기에서 지고 있음에도 포기하지 않고 계속 열심히 노력하는 \"하놔 피죤스\" 선수들을 통해 나도 그떄 힘든 시기를 이겨낼 수 있었거든. 그래서 그 이후로 \"하놔 피죤스\"를 좋아해.");
        t = "nd4-49";
    }

    public void text49(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 멋있다...");
        t = "nd4-50";
    }

    public void text50(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 어? 에이... 뭘 그냥 그렇다고. 그러는 너는 왜 좋아하는거야?");
        t = "nd4-51";
    }

    public void text51(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 야, 너 처럼 그런 의미 있는 이야기를 한 다음에 내가 어떻게 말하냐? 창피해서 말 못하지.");
        t = "nd4-52";
    }

    public void text52(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그래도 한번 말해봐");
        t = "nd4-53";
    }

    public void text53(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 뭐... 나중에 기회가 되면 말해 줄게.");
        t = "nd4-54";
    }

    public void text54(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 에이.. 뭘 그리 창피해 하냐.");
        t = "nd4-63";
    }

    public void text55(){//선택지 2
        noButton();
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 맞아. 오늘 이길 수도 있지!");
        t = "nd4-56";
    }

    public void text56(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그래, 우리 희망을 가지고 응원을 하자고!");
        t = "nd4-63";
    }

    public void text57(){//선택지 3
        noButton();
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 뭐야, 너 진심으로 하는 말이야?");
        t = "nd4-58";
    }

    public void text58(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 어? 아니... 나는 그냥 장난으로...");
        t = "nd4-59";
    }

    public void text59(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 장난이라도 그렇게 이야기 하지마.");
        t = "nd4-60";
    }

    public void text60(){
        nds4.text.setText("고릴라: 꼴찌니까 마음 편하게 운동을 한다고? 누가 운동을 하는데 있어서 마음 편하게 하냐!");
        t = "nd4-61";
    }

    public void text61(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 미얀, 내가 생각이 조금 짧았어.");
        t = "nd4-62";
    }

    public void text62(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 알면 됬어. 다음에는 조심해줘. 나도 운동 하는 사람으로써 운동 관련해서는 조금 민감해서 말이야.");
        t = "nd4-63";
    }

    public void text63(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 자, 그럼 우리 경기장에 들어가서 경기 보러 가자.");
        t = "nd4-64";
    }

    public void text64(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 어 그래!");
        t = "nd4-65";
    }

    public void text65(){
        nds4.text.setText("나레이션: \"주인공\"과 \"고릴라\"는 함께 야구 경기를 보았다.");
        t = "nd4-66";
    }

    public void text66(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 이야~ 재미 있었다!");
        t = "nd4-67";
    }

    public void text67(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그러니까. 게다가 \"하놔 피죤스\"팀이 이기니까 더 좋았어!");
        t = "nd4-68";
    }

    public void text68(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그러니까 말이야! 그나저나 이제 우리 어디 갈까?");
        t = "nd4-69";
    }

    public void text69(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 음... 글쎄... 뭐 생각해 놓은데 있어?");
        t = "nd4-70";
    }

    public void text70(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 이 근처에 유명한 카페가 있다는데 거기갈까?");
        t = "nd4-71";
    }

    public void text71(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 올~ 그런건 언제 알아 봤데? 좋지 그럼 가서 시간좀 보내다 가자.");
        t = "nd4-72";
    }

    public void text72(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("\"나레이션: \"주인공\"과 \"고릴라\"는 함께 카페로 갔다.");
        t = "nd4-73";
    }

    public void text73(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그럼 너는 뭐 먹을래?");
        t = "nd4-74";
    }

    public void text74(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 음... 나는...");
        t = "nd4-75";
    }

    public void text75() {
        nds4.choice1.setText("초콜릿 스무디는 어떄?");
        nds4.choice2.setText("오곡라떼는 어떄?(호감도+5)");
        nds4.choice3.setText("자몽 에이드는 어떄?");
        c1 = c3 = "nd4-76";
        c2 = "nd4-77";
    }

    public void text76(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그래? 그러면 나는 그나마 건강한 오곡라떼를 먹어야 겠다.");
        t = "nd4-78";
    }

    public void text77(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 뭐야? 너도 오곡라떼 좋아해? 나도 좋아하는데!");
        t = "nd4-78";
    }

    public void text78(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 좋아, 그러면 가서 앉아 있어. 내가 가서 주문하고 올게.");
        t = "nd4-79";
    }

    public void text79(){
        nds4.text.setText("나레이션: \"주인공\"은 카페에서 음료를 주문하고 가지고 왔다.");
        t = "nd4-80";
    }

    public void text80(){
        nds4.text.setText("주인공: 자, 여기 음료수 가져왔어.");
        t = "nd4-81";
    }

    public void text81(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 오, 고마워.");
        t = "nd4-82";
    }

    public void text82(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그런데 나 궁금한게 있는데?");
        t = "nd4-83";
    }

    public void text83(){
        nds4.text.setText("고릴라: 뭔데?");
        t = "nd4-84";
    }

    public void text84(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 오늘 왜 나랑 같이 야구장에 가자고 한거야?");
        t = "nd4-85";
    }

    public void text85(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 왜 일꺼 같아?");
        t = "nd4-86";
    }

    public void text86(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그건...");
        t = "nd4-87";
    }

    public void text87(){
        showButton();
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.choice1.setText("혹시 나한테 관심 있는거야?");
        nds4.choice2.setText("내가 시간이 많아 보여서?");
        nds4.choice3.setText("내가 운동을 좋아하는것 처럼 보여서?");
        c1 = "nd4-88";
        c2 = "nd4-96";
        c3 = "nd4-101";
    }

    public void text88(){
        noButton();
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 뭐라는거야, 내가 너한테 왜 관심을 가지냐?");
        t = "nd4-89";
    }

    public void text89(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 물론, 내가 매력적이라서?");
        t = "nd4-90";
    }

    public void text90(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 푸하하! 너가 매력적이라고? 요근래 들었던 농담 중에서 가장 웃긴 말이였다. 그러면 너가 생각하는 너의 매력이 뭔데?");
        t = "nd4-91";
    }

    public void text91(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 나의 매력이라... 그건...");
        t = "nd4-92";
    }

    public void text92(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그건?");
        t = "nd4-93";
    }

    public void text93(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: ... ... ...");
        t = "nd4-94";
    }

    public void text94(){
        nds4.text.setText("주인공: \"하놔 피죤스\"를 좋아하는거?");
        t = "nd4-95";
    }

    public void text95(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 하하하, 기껏 생각해 낸 매력이 너가 \"하놔 피죤스\"를 좋아한다는 거야? 진짜 웃기다, 너!");
        t = "nd4-104";
    }

    public void text96(){//선택 2
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 확실히 그것도 맞긴 하지. 그나저나 너는 요즘 뭐하면서 지내냐? 계속 집에 있던것 같은데.");
        t = "nd4-97";
    }

    public void text97(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 나? 나는 군대 제대하고 지금은 그냥 쉬고 있어.");
        t = "nd4-98";
    }

    public void text98(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그렇군. 그래서 계속 집에만 있어서 소음을 만들어 내는 거구만");
        t = "nd4-99";
    }

    public void text99(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 앗, 그거는... 내가 앞으로 조심할게.");
        t = "nd4-100";
    }

    public void text100(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 하하, 장난이야! 물론, 조심해주면 나야 좋지만.");
        t = "nd4-104";
    }

    public void text101(){//선택 3
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 너 살도 빠지고, 운동도 열심히 하고 요즘 너 다시 보인다.");
        t = "nd4-102";
    }

    public void text102(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 뭐야, 설마 나한테 반해버린거야? 야레~ 야레~~ 그러면 곤란 하다구~~");
        t = "nd4-103";
    }

    public void text103(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 하하, 성격은 그대로네 ");
        t = "nd4-104";
    }

    public void text104(){//스토리 다시 진행
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그나저나, 너 무슨 걱정 있어?");
        t = "nd4-105";
    }

    public void text105(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 어? 왜? 너는 내가 고민이 있어 보여?");
        t = "nd4-106";
    }

    public void text106(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 음, 오늘 경기 보는데 뭐랄까... 완전히 경기에 집중하지 못하는것 처럼 보이기는 하더라고.");
        t = "nd4-107";
    }

    public void text107(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 흠... 사실, 이제 며칠 뒤면 내가 복싱 시합이 있거든.");
        t = "nd4-108";
    }

    public void text108(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 아 진짜?");
        t = "nd4-109";
    }
    public void text109(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 응...");
        t = "nd4-110";
    }

    public void text110(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그래서 긴장하고 있는 거구나.");
        t = "nd4-111";
    }

    public void text111(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 맞아, 그것때문에 계속 긴장이 되고 그렇네.");
        t = "nd4-112";
    }

    public void text112(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그래도 걱정하지마.");
        t = "nd4-113";
    }

    public void text113(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 뭐야, \"정모\" , 너 주제에 위로해주는 거야?");
        t = "nd4-114";
    }

    public void text114(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그야 그동안 많이 노력 했을 거잖아. 노력한 만큼 결실을 이루어 낼 거라고.");
        t = "nd4-115";
    }

    public void text115(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그러니 너무 걱정하지 말고, 지금껏 너가 한 노력을 믿으라고!");
        t = "nd4-116";
    }

    public void text116(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그래, 고맙다. 덕분에 조금 나아진것 같아. ");
        t = "nd4-117";
    }

    public void text117(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 혹시 괜찮으면, 내가 너 복싱하는 날 가서 응원해도 괜찮아?");
        t = "nd4-118";
    }

    public void text118(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 어?... 응원 이라고?");
        t = "nd4-119";
    }

    public void text119(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그래, 응원. 혹시 모르자나. 내가 응원가면 오늘\"하놔 피죤스\" 처럼 승리할 수도.");
        t = "nd4-120";
    }

    public void text120(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 흠, 확실히 그럴 수도 있겠네");
        t = "nd4-121";
    }

    public void text121(){
        nds4.character.setVisibility(View.INVISIBLE);
        nds4.text.setText("주인공: 그러면 나 응원하러 가도 되?");
        t = "nd4-122";
    }

    public void text122(){
        nds4.character.setVisibility(View.VISIBLE);
        nds4.text.setText("고릴라: 그래, 그날 시간 되면 한번 와봐.");
    }
}