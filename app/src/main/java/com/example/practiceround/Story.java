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

        //  school 2
            case "s21" : school21();break;
            case "s22" : school22();break;
            case "s23" : school23();break;
            case "s24" : school24();break;
            case "s25" : school25();break;
            case "s26" : school26();break;
            case "s27" : school27();break;
            case "s28" : school28();break;
            case "s29" : school29();break;
            case "s210" : school210();break;
            case "s211" : school211();break;
            case "s212" : school212();break;
            case "s213" : school213();break;
            case "s214" : school214();break;
            case "s215" : school215();break;
            case "s216" : school216();break;
            case "s217" : school217();break;
            case "s218" : school218();break;
            case "s219" : school219();break;
            case "s220" : school220();break;
            case "s222" : school222();break;
            case "s223" : school223();break;
            case "s224" : school224();break;
            case "s225" : school225();break;
            case "s226" : school226();break;
            case "s227" : school227();break;
            case "s228" : school228();break;
            case "s229" : school229();break;
            case "s230" : school230();break;
            case "s232" : school232(); break;
            case "s2s1" : school2select1(); break;
            case "s233as" : school233a(); break;
            case "s233b" : school233b(); break;
            case "s234a" : school234a(); break;
            case "s234b" : school234b(); break;
            case "s2s2" : school2select2(); break;
            case "s235b" : school235b(); break;
            case "s236b" : school236b(); break;
            case "s237d" : school237b(); break;
            case "s238b" : school238b(); break;
            case "s239b" : school239b(); break;
            case "s240b" : school240b(); break;
            case "s241b" : school241b(); break;
            case "s2s3" : school2select3(); break;
            case "s242b" : school242b(); break;
            case "s242c" : school242c(); break;
            case "s242d" : school242d(); break;
            case "s242a" : school242a(); break;
            case "s243a" : school243a(); break;
            case "s244a" : school244a(); break;
            case "s245a" : school245a(); break;
            case "s246a" : school246a(); break;
            case "s247a" : school247a(); break;
        //  School 2 end

        //  Hospital 3
            case "h31" : hospital31(); break;
            case "h32" : hospital32(); break;
            case "h33" : hospital33(); break;
            case "h34" : hospital34(); break;
            case "h3s1" : hospital3select1(); break;
            case "h35a" : hospital35a(); break;
            case "h35b" : hospital35b(); break;
            case "h35c" : hospital35c(); break;
            case "h36" : hospital36(); break;
            case "h3s2" : hospital3select2(); break;
            case "h37a" : hospital37a(); break;
            case "h37b" : hospital37b(); break;
            case "h37c" : hospital37c(); break;
            case "h37d" : hospital37d(); break;
            case "h38" : hospital38(); break;
            case "h39" : hospital39(); break;
            case "h310" : hospital310(); break;
            case "h311" : hospital311(); break;
            case "h312" : hospital312(); break;
            case "h3s3" : hospital3select3(); break;
            case "h313a" : hospital313a(); break;
            case "h313b" : hospital313b(); break;
            case "h313c" : hospital313c(); break;
            case "h314" : hospital314(); break;
            case "h315" : hospital315(); break;
            case "h3s4" : hospital3select4(); break;
            case "h316a" : hospital316a(); break;
            case "h316b" : hospital316b(); break;
            case "h316c" : hospital316c(); break;
            case "h317" : hospital317(); break;
            case "h318" : hospital318(); break;
            case "h3s5" : hospital3select5(); break;
            case "h319a" : hospital319a(); break;
            case "h319b" : hospital319b(); break;
            case "h319c" : hospital319c(); break;
            case "h320" : hospital320(); break;
            case "h321" : hospital321(); break;
            case "h322" : hospital322(); break;
            case "h323" : hospital323(); break;
            case "h324" : hospital324(); break;
            case "h325" : hospital325(); break;
            case "h3s6" : hospital3select6(); break;
            case "h326" : hospital326(); break;
            case "h327" : hospital327(); break;
            case "h328" : hospital328(); break;
            case "h329" : hospital329(); break;
            case "h330" : hospital330(); break;
            case "h331" : hospital331(); break;
            case "h3s7" : hospital3select7(); break;
            case "h332a" : hospital332a(); break;
            case "h332b" : hospital332b(); break;
            case "h332c" : hospital332c(); break;
            case "h333a" : hospital333a(); break;
            case "h333b" : hospital333b(); break;
            case "h333c" : hospital333c(); break;
            case "h334a" : hospital334a(); break;
            case "h334b" : hospital334b(); break;
            case "h334c" : hospital334c(); break;
            case "h335a" : hospital335a(); break;
            case "h335b" : hospital335b(); break;
            case "h335c" : hospital335c(); break;
            case "h336" : hospital336b(); break;
            case "h3s8" : hospital3select8(); break;
            case "h337" : hospital337(); break;
            case "h338" : hospital338(); break;
            case "h339" : hospital339(); break;
            case "h340" : hospital340(); break;
            case "h341" : hospital341(); break;
            case "h342" : hospital342(); break;
        //  Hospital 3 end

        //  Hospital 4
            case "h41" : hospital41(); break;

            case "h4s1" : hospital4select1(); break;
            case "h42a" : hospital42a(); break;
            case "h42b" : hospital42b(); break;
            case "h42c" : hospital42c(); break;

            case "h43" : hospital43(); break;
            case "h44" : hospital44(); break;
            case "h45" : hospital45(); break;
            case "h46" : hospital46(); break;

            case "h4s2" : hospital4select2(); break;
            case "h48a" : hospital48a(); break;
            case "h48b" : hospital48b(); break;
            case "h48c" : hospital48c(); break;

            case "h49" : hospital49(); break;
            case "h410" : hospital410(); break;

            case "h4s3" : hospital4select3(); break;
            case "h411a" : hospital411a(); break;
            case "h411b" : hospital411b(); break;
            case "h411c" : hospital411c(); break;

            case "h412" : hospital412(); break;
            case "h413" : hospital413(); break;
            case "h414" : hospital414(); break;

            case "h4s4" : hospital4select4(); break;
            case "h415a" : hospital415a(); break;
            case "h415b" : hospital415b(); break;
            case "h415c" : hospital415c(); break;

            case "h416" : hospital416(); break;
            case "h417" : hospital417(); break;
            case "h418" : hospital418(); break;
            case "h419" : hospital419(); break;
            case "h420" : hospital420(); break;
            case "h421" : hospital421(); break;

            case "h4s5" : hospital4select5(); break;
            case "h422a" : hospital422a(); break;
            case "h422b" : hospital422b(); break;
            case "h422c" : hospital422c(); break;

            case "h423" : hospital423(); break;
            case "h424" : hospital424(); break;
            case "h425" : hospital425(); break;
            case "h426" : hospital426(); break;
            case "h427" : hospital427(); break;
            case "h428" : hospital428(); break;

            case "h4s6" : hospital4select6(); break;
            case "h429a" : hospital429a(); break;
            case "h430a" : hospital430a(); break;
            case "h431a" : hospital431a(); break;
            case "h432a" : hospital432a(); break;
            case "h429b" : hospital429b(); break;
            case "h430b" : hospital430b(); break;
            case "h431b" : hospital431b(); break;
            case "h432b" : hospital432b(); break;
            case "h433b" : hospital433b(); break;
            case "h434b" : hospital434b(); break;
            case "h435b" : hospital435b(); break;
            case "h436b" : hospital436b(); break;
            case "h437b" : hospital437b(); break;
            case "h429c" : hospital429c(); break;
            case "h430c" : hospital430c(); break;
            case "h431c" : hospital431c(); break;
            case "h432c" : hospital432c(); break;
            case "h433c" : hospital433c(); break;
            case "h434c" : hospital434c(); break;
            case "h435c" : hospital435c(); break;
        //  Hospital 4 end

        //  Hospital 5
            case "h51" : hospital51(); break;
            case "h52" : hospital52(); break;
            case "h53" : hospital53(); break;
            case "h54" : hospital54(); break;
            case "h55" : hospital55(); break;
            case "h56" : hospital56(); break;
            case "h57" : hospital57(); break;
            case "h58" : hospital58(); break;
            case "h510" : hospital510(); break;
            case "h511" : hospital511(); break;
            case "h512" : hospital512(); break;
            case "h513" : hospital513(); break;
            case "h514" : hospital514(); break;
            case "h515" : hospital515(); break;
            case "h516" : hospital516(); break;
            case "h517" : hospital517(); break;
            case "h5s1" : hospital5select1(); break;
            case "h518a" : hospital518a(); break;
            case "h518b" : hospital518b(); break;
            case "h518c" : hospital518c(); break;
            case "h519" : hospital519(); break;
            case "h520" : hospital520(); break;
            case "h521" : hospital521(); break;
            case "h522" : hospital522(); break;
            case "h523" : hospital523(); break;
            case "h524" : hospital524(); break;
            case "h525" : hospital525(); break;
            case "h526" : hospital526(); break;
            case "h527" : hospital527(); break;
            case "h528" : hospital528(); break;
            case "h530" : hospital530(); break;
            case "h5s2" : hospital5select2(); break;
            case "h531a" : hospital531a(); break;
            case "h531b" : hospital531b(); break;
            case "h531c" : hospital531c(); break;
            case "h532" : hospital532(); break;
            case "h533" : hospital533(); break;
            case "h534" : hospital534(); break;
            case "h535" : hospital535(); break;
            case "h536" : hospital536(); break;
            case "h537" : hospital537(); break;
            case "h538" : hospital538(); break;
            case "h539" : hospital539(); break;
            case "h540" : hospital540(); break;
            case "h541" : hospital541(); break;
            case "h542" : hospital542(); break;
            case "h543" : hospital543(); break;
            case "h544" : hospital544(); break;
            case "h545" : hospital545(); break;
            case "h546" : hospital546(); break;
            case "h547" : hospital547(); break;
            case "h548" : hospital548(); break;
            case "h549" : hospital549(); break;
            case "h550" : hospital550(); break;
            case "h551" : hospital551(); break;
            case "h552" : hospital552(); break;
        //  Hospital 5 end

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
        h1.character.setImageResource(R.mipmap.god);
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

//  Hospital 3
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
        h1.character.setVisibility(View.INVISIBLE);
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
        t ="h317";
    }
    public void hospital316b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응... (훌쩍..)");
        t ="h317";
    }

    public void hospital316c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응... (훌쩍..)");
        t ="h317";
    }

    public void hospital317(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 근데 어떤 게 힘든거야..?");
        t ="h318";
    }

    public void hospital318(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 선배들이 너무 괴롭혀. ㅠㅠ 일도 계속 나만 시키고 몸도 마음도 너무 지친다..");
        t ="h3s5";
    }

    public void hospital3select5() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 다 데려와!! 내가 다 혼내줄게!");
        h1.choice3.setText("주인공: 어쩔 수 없지.. 누나가 참아~");
        h1.choice4.setText("주인공: 그랬구나~ 힘들었겠다..");
        c2 = "h319a";
        c3 = "h319b";
        c4 = "h319c";
    }

    public void hospital319a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 얘기 들어줘서 고마워.");
        t ="h320";
    }

    public void hospital319b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 얘기 들어줘서 고마워.");
        t ="h320";
    }

    public void hospital319c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 얘기 들어줘서 고마워.");
        t ="h320";
    }

    public void hospital320(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : (별로 들어 준 것도 없는데 뭐지) 아... 응..");
        t ="h321";
    }

    public void hospital321(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 우리 먹고 뭐할까? 영화볼래? 같이 게임하러갈까?");
        t ="h322";
    }

    public void hospital322(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 음... 역시 국밥먹고 난 후에는 소화를 시켜야지~ 산책하자!");
        t ="h323";
    }

    public void hospital323(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공:(왜 물어본거야 그럼..)그래, 그러자!");
        t ="h324";
    }

    public void hospital324(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공과 바닐라가 식사를 마치고 나온다.)");
        t ="h324";
    }

    public void hospital325(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 우리 산책하러 어디로 갈까?");
        t ="h3s6";
    }

    public void hospital3select6() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("강가");
        h1.choice3.setText("공원");
        h1.choice4.setText("골목길");
        c2 = "h326";
        c3 = "h326";
        c4 = "h326";
    }

    public void hospital326(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그래! 거기로 가자!");
        t ="h327";
    }

    public void hospital327(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: ... ... ...");
        t ="h328";
    }

    public void hospital328(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: ... ... ...");
        t ="h329";
    }

    public void hospital329(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : (여자랑 단둘이 있는게 얼마만이냐... 뭐라고 해야할지 모르겠네... 어색하다.)");
        t ="h330";
    }

    public void hospital330(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(바닐라는 앞만 보고 걸어간다.)");
        t ="h331";
    }

    public void hospital331(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : (질문은 해야겠고... 뭐라고 물어보지..?)");
        t ="h3s7";
    }

    public void hospital3select7() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 누난 보통 주말에 뭐하면서 쉬어?");
        h1.choice3.setText("주인공: 누나 이상형이 뭐야?");
        h1.choice4.setText("주인공: 누나 혹시 애니 좋아해?");
        c2 = "h332a";
        c3 = "h332b";
        c4 = "h332c";
    }

    public void hospital332a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 보통은 책 읽거나 영화 자주 봐! 너는?");
        t ="h333a";
    }

    public void hospital333a(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 오! 나두 그래!! 나도 책이랑 영화 자주 봐ㅎㅎ");
        t ="h334a";
    }

    public void hospital334a(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 정말? 우리 그럼 다음에 영화 같이 볼까?");
        t ="h335a";
    }

    public void hospital335a(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 좋아! 그러자!!");
        t ="h3s8";
    }

    public void hospital332b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 음... 나는 키크고 잘생긴 사람??");
        t ="h333b";
    }

    public void hospital333b(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (마음의 상처를 받는다.) ... ... ...");
        t ="h334b";
    }

    public void hospital334b(){
        h1.character.setVisibility(View.VISIBLE);

        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 근데 그래도 마음씨가 착한 게 제일인 것 같아!");
        t ="h335b";
    }

    public void hospital335b(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (다시 기분이 좋아진다.) 그럼 만약에 키도 작고 못생겼는데 착한 건?");
        t ="h336b";
    }

    public void hospital336b(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그건 좀 생각해 봐야할 것 같은데?ㅎㅎ");
        t ="h3s8";
    }

    public void hospital332c(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아, 너 애니 좋아해??");
        t ="h320";
    }

    public void hospital333c(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 응 조금..ㅎㅎ)");
        t ="h334c";
    }

    public void hospital334c(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 누나는 애니는 딱히 잘 안봐서..ㅎㅎ 잘모르겠네..");
        t ="h335b";
    }

    public void hospital335c(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(두 사람 사이에 어색한 침묵만 흐른다.)");
        t ="h3s8";
    }

    public void hospital3select8() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 이제 좀 걸었으니까 디저트 먹을까?");
        h1.choice3.setText("주인공: 우리 할 것도 없는데 영화보러 갈까?");
        h1.choice4.setText("주인공: 누나 게임방 혹시 가봤어? 같이 가볼래?");
        c2 = "h337";
        c3 = "h337";
        c4 = "h337";
    }

    public void hospital337(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 좋아!");
        t ="h338";
    }

    public void hospital338(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뚜루루 뚜루루 (바닐라에게 전화가 걸려온다.)");
        t ="h339";
    }

    public void hospital339(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아..! 병원에서 전화오네.");
        h1.text.setText("바닐라: 여보세요? 아, 네.. 아!!! 지금 바로 가겠습니다!!");
        h1.text.setText("바닐라: 인공아 어떡하지..?");
        h1.text.setText("바닐라: 병원에서 갑자기 간호사가 부족하다고 해서 지금 가봐야할 것 같아..");
        t ="h340";
    }

    public void hospital340(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아, 급한 일이 우선이지! 얼른 가봐!!");
        t ="h341";
    }

    public void hospital341(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 미안해!! 다음에 시간나면 또 보자ㅎㅎ");
        t ="h342";
    }

    public void hospital342(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 으..응..! 조심히 가!");
    }
//  Hospital 3 end

//  Hospital 4
    public void hospital41(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(우당탕!!)");
        h1.text.setText("(바닐라가 병원 침대에서 깬다..)");
        t = "h42";
    }

    public void hospital4select1() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 누나 괜찮아?? 무슨 일이 있었던거야???");
        h1.choice3.setText("주인공: 아니, 누나 왜이렇게 약해빠졌어? 이거 무슨 꼴이야..");
        h1.choice4.setText("주인공: 내가 왔으니 걱정말라구ㅎㅎ");
        c2 = "h42a";
        c3 = "h42b";
        c4 = "h42c";
    }

    public void hospital42a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 음... 인공이 왔구나..?");
        t ="h43";
    }

    public void hospital42b(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 음... 인공이 왔구나..?");
        t ="h43";
    }

    public void hospital42c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 음... 인공이 왔구나..?");
        t = "h43";
    }

    public void hospital43(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 다른 간호사분한테 전화 받자마자 바로 왔어! 어쩌다가 쓰러진거야?");
        t = "h44";
    }

    public void hospital44(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 최근에 일을 너무 많이 했나봐.");
        t = "h45";
    }

    public void hospital45(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 일을 얼마나 많이 했길래 이 지경이 났어...");
        t = "h46";
    }

    public void hospital46(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 지난 몇일간 잠도 제대로 못자고 연속 근무 뛰고..");
        h1.text.setText("바닐라: 어제도 일하다가 쓰러졌나봐.. 정신 차려보니까 여기네.");
        t = "h4s2";
    }

    public void hospital4select2() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 그게 그렇게 힘들 정도인가..? 나도 군대에서 자주 그렇게 일했는데...");
        h1.choice3.setText("주인공: 헐 힘들었겠다.. 병원에선 그걸 그대로 계속 일을 시켜?");
        h1.choice4.setText("주인공: 이제라도 좀 쉬어... 나중에 병원에 한 번 얘기해보자.");
        c2 = "h48a";
        c3 = "h48b";
        c4 = "h48c";
    }

    public void hospital48a(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: ㅎㅎ.. 그래도 이렇게 와줘서 너무 고마워..");
        t = "h49";
    }

    public void hospital48b(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: ㅎㅎ.. 그래도 이렇게 와줘서 너무 고마워..");
        t = "h49";
    }

    public void hospital48c(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: ㅎㅎ.. 그래도 이렇게 와줘서 너무 고마워..");
        t = "h49";
    }

    public void hospital49(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 :  아니야 이 정도는 기본이지! 뭐 좀 먹었어?");
        t = "h410";
    }

    public void hospital410() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아침먹고 아직...");
        t = "h4s3";
    }

    public void hospital4select3() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 해가 중천인데 아직도 안먹었어? 밥이라도 좀 잘먹어!");
        h1.choice3.setText("주인공: 내가 오면서 사과를 챙겨오긴 했는데 이거라도 일단 먹을래?");
        h1.choice4.setText("주인공: 그렇구나.. ");
        c2 = "h411a";
        c3 = "h411b";
        c4 = "h411c";
    }

    public void hospital411a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그럴까.. 근데 손에 들고 온 건 사과야??");
        t = "h412";
    }

    public void hospital411b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 헐 정말? 고마워! ㅠㅠ");
        t = "h412";
    }

    public void hospital411c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 근데 너 손에 들고 온 건 사과야??");
        t = "h412";
    }

    public void hospital412() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 마침 과일이 먹고 싶었는데 잘됐다! 진짜 고마워!");
        t = "h413";
    }

    public void hospital413(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 훗, 이정도 쯤이야..ㅎㅎ");
        h1.text.setText("주인공 : (나도 점점 센스가 늘어가는군 이러다가 진짜 바닐라 누나가 나한테 반하는거 아니야?)");
        t = "h414";
    }

    public void hospital414() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 이 사과 정말 맛있다! 어디서 샀어?");
        t = "h4s4";
    }

    public void hospital4select4() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 그냥 오다가 주웠어~");
        h1.choice3.setText("주인공: 누나 마음 속 >_<");
        h1.choice4.setText("주인공: 이거 문경사과야. 당도가 높은걸로 유명하지.");
        c2 = "h415a";
        c3 = "h415b";
        c4 = "h415c";
    }

    public void hospital415a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아... 그렇구나... 맛있다!!");
        t = "h416";
    }

    public void hospital415b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아... 그렇구나... 맛있다!!");
        t = "h416";
    }

    public void hospital415c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아... 그렇구나... 맛있다!!");
        t = "h416";
    }

    public void hospital416(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (방금 멘트 쩔었다. 나님)");
        t = "h417";
    }

    public void hospital417() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그나저나 진짜 갑작스러웠는데 와줘서 고마워...");
        t = "h418";
    }

    public void hospital418(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 아니야... 누나가 아프다는데 당연히 와야지!");
        t = "h419";
    }

    public void hospital419() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 내 동료 간호사가 가장 최근에 전화한 사람한테 전화했는데 그게 너였다고 하더라구..");
        t = "h420";
    }

    public void hospital420(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 그랬구나.. 뭔가 좀 특별한 기분인걸?ㅎㅎ");
        t = "h421";
    }

    public void hospital421() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 지난 주는 바빠서 연락을 너말고는 아무랑도 못했던 것 같아..");
        t = "h42s5";
    }

    public void hospital4select5() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 그 바쁜 와중에 나한테 시간을 내준거였어??");
        h1.choice3.setText("주인공: 아 뭐야.. 다른 이유가 있던 게 아니구나.");
        h1.choice4.setText("주인공: 부모님한테도 전화하고 좀 그래~ 어!");
        c2 = "h422a";
        c3 = "h422b";
        c4 = "h422c";
    }

    public void hospital422a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: ㅎㅎ 그렇게 됐네.");
        t = "h423";
    }

    public void hospital422b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 음.. 그런가? 난 특별하다고 생각했는데..");
        t = "h423";
    }

    public void hospital422c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아... 응... 그래야지..?");
        t = "h423";
    }

    public void hospital423(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 그래서 언제까지 입원해 있는거야?");
        t = "h424";
    }

    public void hospital424() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 사실 단순 피로 누적이라 아마 내일까지 푹 쉬고 바로 퇴원할 것 같아..");
        t = "h425";
    }

    public void hospital425(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 그렇구나. 그럼 일도 바로 하게 되는거야??");
        t = "h426";
    }

    public void hospital426() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아니, 일은 한 일주일 쉬게 해주셨지. 다행이야ㅎㅎ");
        t = "h427";
    }

    public void hospital427(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 아 정말? 그건 그래도 다행이네..");
        t = "h428";
    }

    public void hospital428() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 다음 주에 내 생일이기도 하고 오랜만에 좀 쉬려구ㅎㅎ");
        t = "h4s6";
    }

    public void hospital4select6() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 헐! 다음 주가 생일이구나?? 생일 때 같이 놀자!!");
        h1.choice3.setText("주인공: 오.. 그렇구나. 생일이 무슨 요일이야?");
        h1.choice4.setText("주인공: 아, 쉬는 동안 뭐하게?");
        c2 = "h429a";
        c3 = "h429b";
        c4 = "h429c";
    }

    public void hospital429a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아.. 근데 그 날 친구들이랑 가족들이랑 같이 보낼 수도 있어서 아직은 잘 모르겠다ㅜㅜ");
        t = "h430a";
    }

    public void hospital430a(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 아 그래..? 내가 너무 성급했네..ㅎㅎ");
        t = "h431a";
    }

    public void hospital431a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아니야!! 내가 시간 한 번 내볼게ㅎㅎ");
        t = "h432a";
    }

    public void hospital432a(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아 진짜?? 아싸!! 그럼 우리 뭐할지 생각 해봐야겠다ㅎㅎ");
        t = "h433a";
    }

    public void hospital429b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 다음 주 월요일!");
        t = "h430b";
    }

    public void hospital430b(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아 그렇구나! 누나 생일이 그 때였는지는 처음 알았네ㅎㅎ");
        t = "h431b";
    }

    public void hospital431b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그러게, 생각해보니까 우리 어릴 때는 생일 파티 한 번도 같이 안한 것 같네.");
        t = "h432b";
    }

    public void hospital432b(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 이번에도 생일 파티 하는거야?");
        t = "h433b";
    }

    public void hospital433b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아니.. 이번에는 혼자 보낼 것 같아..ㅎㅎ");
        t = "h434b";
    }

    public void hospital434b(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그렇구나...");
        t = "h435b";
    }

    public void hospital435b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 혹시 너 안바쁘면 내 생일 날 같이 시간 보낼래..?");
        t = "h436b";
    }

    public void hospital436b(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 헐... 그래도 괜찮아? 나는 너무 좋지!!");
        t = "h437b";
    }

    public void hospital437b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 나야 너가 그래주면 너무 고맙지ㅎㅎ");
    }

    public void hospital429c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 아마 그냥 쉬고, 책도 읽고, 영화도 하나 볼 것 같아ㅎㅎ 너는 다음 주에 계획 있어?");
        t = "h430c";
    }

    public void hospital430c(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 나도 뭐.. 그냥 별 일 없어ㅎㅎ");
        t = "h431c";
    }

    public void hospital431c() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그럼 내 생일 날 같이 시간 보내지 않을래..?");
        t = "h432c";
    }

    public void hospital432c(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아 그럴까!? 좋아!!");
        t = "h433c";
    }

    public void hospital433c() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 그래ㅎㅎ 그럼 오늘은 이만 각자 집에 가고 그 때 보자!!");
        t = "h434c";
    }

    public void hospital434c(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아, 그래ㅎㅎ 누나 퇴원 잘하구 몸 잘챙겨!!");
        t = "h435c";
    }

    public void hospital435c() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 응!! 너두 집 조심히 들어가~ 안녕!");
    }
//  Hospital 4 end

//  Hospital 5
    public void hospital51() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(바닐라의 생일 날)");
        h1.text.setText("(똑똑똑~)");
        t = "h52";
    }

    public void hospital52(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라: 어! 인공이 왔구나!! 어서 들어와ㅎㅎ");
        t = "h53";
    }

    public void hospital53(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 고..고마워ㅎㅎ");
        t = "h54";
    }

    public void hospital54(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 와줘서 고마워. 진짜로 이렇게 둘이 보내게 될 줄은 몰랐네..ㅎㅎ");
        t = "h55";
    }

    public void hospital55(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 그러게, 처음엔 누나 친구들도 온다 그랬는데 어쩌다보니 이렇게 됐네..");
        t = "h56";
    }

    public void hospital56(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그게 다들 바쁜가봐...ㅎㅎ");
        t = "h57";
    }

    public void hospital57(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 그럴 수 있지. 그나저나 몸은 좀 어때? 그래도 아직 퇴원한지 며칠 안됐잖아..");
        t = "h58";
    }

    public void hospital58(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 이제 괜찮아! 몇 일 동안 푹 쉬고 나니까 개운하다 ㅎㅎ");
        t = "h510";
    }

    public void hospital510(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 아 진짜? 너무 다행이다!");
        t = "h511";
    }

    public void hospital511(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 응!! 근데 나 아직 요리중인데 덜 끝나서 그런데 조금만 기다려 줄 수 있어?");
        t = "h512";
    }

    public void hospital512(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 아, 알겠어! 혹시 내가 도와줄거 있어?");
        t = "h513";
    }

    public void hospital513(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아... 그럼 혹시 양파만 썰어줄 수 있어?");
        t = "h514";
    }

    public void hospital514(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 내가 또 전생에 조선에서 제일가는 요리사였거든. 맡겨만 두라구!");
        t = "h515";
    }

    public void hospital515(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 고마워 ㅎㅎ");
        t = "h516";
    }

    public void hospital516(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 훌쩍 훌쩍...");
        t = "h517";
    }

    public void hospital517(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 어머어머 설마 우는 거니?");
        t = "h5s1";
    }

    public void hospital5select1() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("주인공: 아...아니야! 사나이는 울지 않는다구!!");
        h1.choice3.setText("주인공: 누...누나 집에서 단 둘이 시간도 보내고 꿈만 같아서 ㅎㅎ");
        h1.choice4.setText("주인공: 아, 양파가 좀 맵네..ㅎㅎ 훌쩍..");
        c2 = "h518a";
        c3 = "h518b";
        c4 = "h518c";
    }

    public void hospital518a(){
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아..ㅎㅎ 인공이 울보였네~");
        t = "h519";
    }

    public void hospital518b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아..ㅎㅎ 인공이 울보였네~");
        t = "h519";
    }

    public void hospital518c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아..ㅎㅎ 인공이 울보였네~");
        t = "h519";
    }

    public void hospital519() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그나저나 그래도 오늘 내 생일인데 빈손으로 온거야..?");
        t = "h520";
    }

    public void hospital520(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 주인공 : 그...그럴리가~!! (헐 어떡하지? 아무것도 안가져왔는데)");
        t = "h521";
    }

    public void hospital521() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 어!! 그럼 선물 준비한거야???");
        t = "h522";
    }

    public void hospital522(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 그럼그럼! 누나 생일인데 당연하지~");
        t = "h523";
    }

    public void hospital523() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 뭔데 뭔데? 보여줘~~");
        t = "h524";
    }

    public void hospital524(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 아 안돼! 서프라이즈야!!");
        t = "h525";
    }

    public void hospital525() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 치... 알겠어! 그럼 언제 보여줄건데?");
        t = "h526";
    }

    public void hospital526(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 음... 좀 이따가...");
        t = "h527";
    }

    public void hospital527() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 뭐야~~~ 궁금하게!!");
        t = "h528";
    }

    public void hospital528(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 사실 선물.. 이... 이거야 (무언가를 건네준다)");
        t = "h530";
    }

    public void hospital530() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 어!! 뭔데뭔데!?!?");
        t = "h5s2";
    }

    public void hospital5select2() {
        h1.character.setVisibility((View.INVISIBLE));
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setVisibility(View.INVISIBLE);
        h1.choice2.setText("쥬바줍스");
        h1.choice3.setText("머리끈");
        h1.choice4.setText("주인공: 짠! 내가 선물이야!!!");
        c2 = "h531a";
        c3 = "h531b";
        c4 = "h531c";
    }

    public void hospital531a() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : (썩은 표정을 짓는다.)");
        t = "h532";
    }

    public void hospital531b() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : (썩은 표정을 짓는다.)");
        t = "h532";
    }

    public void hospital531c() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : (썩은 표정을 짓는다.)");
        t = "h532";
    }

    public void hospital532(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 미...미안.. 나 너무 센스 없지..?");
        t = "h533";
    }

    public void hospital533() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아..아니야!!ㅎㅎ 괜찮아~ 너가 와준 것만 해도 얼마나 고마운데!!");
        h1.text.setText("바닐라 : 밥 준비 다 된 것 같은데 슬슬 밥 먹을까?");
        t = "h534";
    }

    public void hospital534(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 으응.. 배고프긴 하네..");
        t = "h535";
    }

    public void hospital535() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그래, 얼른 먹자!!");
        t = "h536";
    }

    public void hospital536(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(냠냠... 쩝쩝.. 후루룩.. 쩝쩝..)");
        h1.text.setText("(파오후 쿰척쿰척)");
        t = "h537";
    }

    public void hospital537(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 근데 반찬이 좀...");
        t = "h538";
    }

    public void hospital538() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그치! 맛있지!? 우리 엄마가 만들어 주신거야ㅎㅎ");
        t = "h539";
    }

    public void hospital539(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : (쿨럭쿨럭) 진짜 마.. 맛있어!!!");
        t = "h540";
    }

    public void hospital540() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그치??");
        t = "h541";
    }

    public void hospital541(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 으...응..! (쿨럭..) 여..역시 엄마 손맛이 (쿨럭..) 최고라니까..!");
        t = "h542";
    }

    public void hospital542() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그나저나 사실 나 너 인공이 주려고 선물 하나 준비했어!");
        t = "h543";
    }

    public void hospital543(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 에엥? 진짜?! 오늘은 누나 생일인데..");
        t = "h544";
    }

    public void hospital544() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 그동안 고마운 게 많은 거 같아서... 병문안도 와주고..");
        t = "h545";
    }

    public void hospital545(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 난 한 게 아무것도 없는데??");
        t = "h546";
    }

    public void hospital546() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 아무것도 없기는.. 자! 받아 이거!");
        t = "h547";
    }

    public void hospital547(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 이게 뭐야...?");
        t = "h548";
    }

    public void hospital548() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 우리 어릴때 너가 나한테 줬었던 시계야! 그 때 기억해?ㅎㅎ");
        h1.text.setText("바닐라: 내가 시계 잃어버려서 울고 있는데 너가 너꺼 나한테 줬잖아.. 진짜 감동이었어..");
        t = "h549";
    }

    public void hospital549(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : (내가 그랬다고..? 기억이 하나도 없는데....?)");
        t = "h550";
    }

    public void hospital550() {
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("바닐라 : 어쨋든! 언젠가 돌려주고 싶었어 ㅎㅎ");
        t = "h551";
    }

    public void hospital551(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공 : 고...고마워 ㅎㅎ");
        t = "h552";
    }

    public void hospital552() {
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(주인공과 바닐라이 대화를 나누다 하루가 끝나간다.)");
    }
//  Hospital 5 end

}

