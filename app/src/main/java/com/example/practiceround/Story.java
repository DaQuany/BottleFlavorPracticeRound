package com.example.practiceround;

import android.view.View;
import android.widget.Button;

import com.example.practiceround.Hospital1;

import java.util.Arrays;

public class Story {

    Hospital1 h1;
    String c1, c2, c3, c4, t, ss1, ss2, ss3, ss4;

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


            case "s11" : school11(); break;
            case "s11a" : school11a(); break;
            case "s12" : school12(); break;
            case "s13" : school13(); break;
            case "s13a" : school13a(); break;
            case "s14" : school14(); break;
            case "s15" : school15(); break;
            case "s15a" : school15a(); break;
            case "s16" : school16(); break;
            case "s17" : school17(); break;
            case "s18" : school18(); break;
            case "s19" : school19(); break;
            case "s110" : school110(); break;
            case "s111" : school111(); break;
            case "s112" : school112(); break;
            case "s112a" : school112a(); break;
            case "s112ab" : school112ab(); break;
            case "s5" : select5(); break;
            case "s113" : school113(); break;
            case "s6" : select6(); break;
            case "s114" : school114(); break;
            case "s115" : school115(); break;
            case "s116" : school116(); break;
            case "s117" : school117(); break;
            case "s118" : school118(); break;

// 대학교 3
            case "s31" : school31(); break;
            case "s32" : school32(); break;
            case "s33" : school33(); break;
            case "s34" : school34(); break;
            case "s35" : school35(); break;
            case "s36" : school36(); break;
            case "s37" : school37(); break;
            case "s38" : school38(); break;
            case "s39" : school39(); break;
            case "s310" : school310(); break;
            case "s311" : school311(); break;
            case "s312" : school312(); break;
            case "s313" : school313(); break;
            case "s314" : school314(); break;
            case "s315" : school315(); break;
            case "s316" : school316(); break;
            case "s317" : school317(); break;
            case "s318" : school318(); break;
            case "s7": select7(); break;
            case "s319" : school319(); break;
            case "s320" : school320(); break;
            case "s321" : school321(); break;
            case "s322" : school322(); break;
            case "s323" : school323(); break;
            case "s324" : school324(); break;
            case "s325" : school325(); break;
            case "s326" : school326(); break;
            case "s327" : school327(); break;
            case "s328" : school328(); break;
            case "s329" : school329(); break;
            case "s330" : school330(); break;
            case "s331" : school331(); break;
            case "s332" : school332(); break;
            case "s333" : school333(); break;
            case "s334" : school334(); break;
            case "s335" : school335(); break;
            case "s336" : school336(); break;
            case "s337" : school337(); break;
            case "s338" : school338(); break;
            case "s339" : school339(); break;
            case "s340" : school340(); break;
            case "s341" : school341(); break;
            case "s342" : school342(); break;
            case "s343" : school343(); break;
            case "s344" : school344(); break;
            case "s345" : school345(); break;
            case "s346" : school346(); break;
            case "s347" : school347(); break;
            case "s8": select8(); break;
            case "s348" : school348(); break;
            case "s349" : school349(); break;
            case "s350" : school350(); break;
            case "s351" : school351(); break;
            case "s352" : school352(); break;
            case "s353" : school353(); break;
            case "s354" : school354(); break;
            case "s355" : school355(); break;
            case "s9": select9(); break;
            case "s356" : school356(); break;
            case "s357" : school357(); break;
            case "s358" : school358(); break;
            case "s359" : school359(); break;
            case "s360" : school360(); break;
            case "s361" : school361(); break;
            case "s362" : school362(); break;
            case "s363" : school363(); break;
            case "s364" : school364(); break;
            case "s365" : school365(); break;
            case "s366" : school366(); break;
            case "s367" : school367(); break;
            case "s368" : school368(); break;
            case "s369" : school369(); break;
            case "s370" : school370(); break;
            case "s371" : school371(); break;
            case "s372" : school372(); break;
            case "s373" : school373(); break;
            case "s374" : school374(); break;
            case "s375" : school375(); break;
            case "s376" : school376(); break;
            case "s377" : school377(); break;
            case "s10": select10(); break;
            case "s378a" : school378a(); break;
            case "s378b" : school378b(); break;
            case "s378c" : school378c(); break;
            case "s378d" : school378d(); break;
            case "s379" : school379(); break;
            case "s380" : school380(); break;
            case "s381" : school381(); break;
            case "s382" : school382(); break;
            case "s383" : school383(); break;
            case "s384" : school384(); break;
            case "s385" : school385(); break;
            case "s386" : school386(); break;
            case "s387" : school387(); break;
            case "s388" : school388(); break;
            case "s389" : school389(); break;
            case "s390" : school390(); break;
            case "s391" : school391(); break;
            case "s392" : school392(); break;
            case "s393" : school393(); break;
            case "s394" : school394(); break;
            case "s395" : school395(); break;
            case "s396" : school396(); break;
            case "s397" : school397(); break;
            case "s398" : school398(); break;
            case "s399" : school399(); break;
            case "s31000" : school3100(); break;

//대학교 후배 4
            case "s41" : school41(); break;
            case "s42" : school42(); break;
            case "s43" : school43(); break;
            case "s44" : school44(); break;
            case "s45" : school45(); break;
            case "s46" : school46(); break;
            case "s47" : school47(); break;
            case "s48" : school48(); break;
            case "s49" : school49(); break;
            case "s410" : school410(); break;
            case "s411" : school411(); break;
            case "s412" : school412(); break;
            case "s413" : school413(); break;
            case "s414" : school414(); break;
            case "s418" : school418(); break;
            case "s419" : school419(); break;
            case "s420" : school420(); break;
            case "s421" : school421(); break;
            case "s422" : school422(); break;
            case "s423" : school423(); break;
            case "s424" : school424(); break;
            case "s425" : school425(); break;
            case "s426" : school426(); break;
            case "s427" : school427(); break;
            case "s428" : school428(); break;
            case "s429" : school429(); break;
            case "ss11": select11(); break;
            case "s430" : school430(); break;
            case "s431" : school431(); break;
            case "s432" : school432(); break;
            case "s433" : school433(); break;
            case "s434" : school434(); break;
            case "s435" : school435(); break;
            case "s436" : school436(); break;
            case "s437" : school437(); break;
            case "s438" : school438(); break;
            case "s439" : school439(); break;
            case "s440" : school440(); break;
            case "s441" : school441(); break;
            case "s442" : school442(); break;
            case "s443" : school443(); break;
            case "s444" : school444(); break;
            case "s445" : school445(); break;
            case "s446" : school446(); break;
            case "s447" : school447(); break;
            case "s448" : school448(); break;
            case "s449" : school449(); break;
            case "s450" : school450(); break;
            case "s451" : school451(); break;
            case "s452" : school452(); break;
            case "s453" : school453(); break;
            case "s454" : school454(); break;
            case "s455" : school455(); break;
            case "s456" : school456(); break;
            case "s457" : school457(); break;
            case "s458" : school458(); break;
            case "s459" : school459(); break;
            case "s460" : school460(); break;
            case "s461" : school461(); break;
            case "s462" : school462(); break;
            case "s463" : school463(); break;
            case "s464" : school464(); break;
            case "ss12": select12(); break;
            case "s465" : school465(); break;
            case "s466" : school466(); break;
            case "s467" : school467(); break;
            case "s468" : school468(); break;
            case "s469" : school469(); break;
            case "s470" : school470(); break;
            case "s471" : school471(); break;
            case "s472" : school472(); break;
            case "s473" : school473(); break;
            case "s474" : school474(); break;
            case "s475" : school475(); break;
            case "s476" : school476(); break;
            case "s477" : school477(); break;
            case "s478" : school478(); break;
            case "s479" : school479(); break;
            case "s480" : school480(); break;
            case "s481" : school481(); break;
            case "s482" : school482(); break;
            case "s483" : school483(); break;
            case "s484" : school484(); break;
            case "s485" : school485(); break;
            case "s486" : school486(); break;
            case "s487" : school487(); break;
            case "s488" : school488(); break;
            case "s489" : school489(); break;
            case "s490" : school490(); break;
            case "s491" : school491(); break;
            case "s492" : school492(); break;
            case "s493" : school493(); break;
            case "s494" : school494(); break;
            case "s495" : school495(); break;
            case "s496" : school496(); break;
            case "s497" : school497(); break;
            case "s498" : school498(); break;
            case "s499" : school499(); break;
            case "s4100" : school4100(); break;
            case "s4101" : school4101(); break;
            case "s4102" : school4102(); break;
            case "s4103" : school4103(); break;
            case "s4104" : school4104(); break;
            case "s4105" : school4105(); break;
            case "s4106" : school4106(); break;
            case "s4107" : school4107(); break;
            case "s4108" : school4108(); break;
            case "s4109" : school4109(); break;
            case "s4110" : school4110(); break;
            case "s4111" : school4111(); break;
            case "s4112" : school4112(); break;
            case "s4113" : school4113(); break;
            case "s4114" : school4114(); break;
            case "s4115" : school4115(); break;
            case "s4116" : school4116(); break;
            case "s4117" : school4117(); break;
            case "s4118" : school4118(); break;
            case "s4119" : school4119(); break;
            case "s4120" : school4120(); break;
            case "s4121" : school4121(); break;
            case "s4122" : school4122(); break;
            case "s4123" : school4123(); break;
            case "s4124" : school4124(); break;
            case "s4125" : school4125(); break;
            case "s4126" : school4126(); break;
            case "s4127" : school4127(); break;
            case "ss13": select13(); break;
            case "s4128" : school4128(); break;
            case "s4129" : school4129(); break;
            case "s4130" : school4130(); break;
            case "s4131" : school4131(); break;
            case "s4132" : school4132(); break;
            case "s4133" : school4133(); break;
            case "ss14": select14(); break;
            case "s4134" : school4134(); break;
            case "s4135" : school4135(); break;
            case "s4136" : school4136(); break;
            case "s4137" : school4137(); break;
            case "s4138" : school4138(); break;
            case "s4139" : school4139(); break;
            case "s4140" : school4140(); break;
            case "s4141" : school4141(); break;
            case "s4142" : school4142(); break;
            case "s4143" : school4143(); break;
            case "s4144" : school4144(); break;
            case "s4145" : school4145(); break;
            case "s4146" : school4146(); break;
            case "s4147" : school4148(); break;
            case "s4149" : school4149(); break;
            case "s4150" : school4150(); break;
            case "s4151" : school4151(); break;
            case "s4152" : school4152(); break;
            case "s4153" : school4153(); break;
            case "s4154" : school4154(); break;
            case "s4155" : school4155(); break;
            case "s4156" : school4156(); break;
            case "ss15": select15(); break;
            case "s4157" : school4157(); break;
            case "s4158" : school4158(); break;
            case "s4159" : school4159(); break;
            case "s4160" : school4160(); break;
            case "s4161" : school4161(); break;
            case "s4162" : school4162(); break;
            case "s4163" : school4163(); break;
            case "s4164" : school4164(); break;
            case "s4165" : school4165(); break;
            case "s4166" : school4166(); break;
            case "s4167" : school4167(); break;
            case "s4168" : school4168(); break;
            case "s4169" : school4169(); break;
            case "s4170" : school4170(); break;
            case "s4171" : school4171(); break;
            case "s4172" : school4172(); break;
            case "ss16": select16(); break;
            case "s4173" : school4173(); break;
            case "s4174" : school4174(); break;
            case "s4175" : school4175(); break;
            case "s4176" : school4176(); break;
            case "s4177" : school4177(); break;
            case "s4178" : school4178(); break;
            case "s4179" : school4179(); break;
            case "s4180" : school4180(); break;
            case "s4181" : school4181(); break;
            case "s4182" : school4182(); break;
            case "s4183" : school4183(); break;
            case "s4184" : school4184(); break;
            case "s4185" : school4185(); break;
            case "s4186" : school4186(); break;
            case "s4187" : school4187(); break;
            case "s4188" : school4188(); break;
            case "s4189" : school4189(); break;
            case "s4190" : school4190(); break;
            case "s4191" : school4191(); break;












        }
    }






    //댁학생 후배 4

    public void school41() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.teacher);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: be nothing compared to. 이 패턴은 많이 사용하니까 잘 외워두세요. 시험에도 반영했으니까요.");
        t = "s42";

    }
    public void school42() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오늘도 어김없이 수업에 참석했다.");
        t = "s43";

    }
    public void school43() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("벌써 그 이상한 신인지 이상한 할아버지인지 알 수 없는 남자를 만난지도 12일이 지난 상태다.");
        t = "s44";

    }
    public void school44() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("만약 그 할아버지의 말이 사실이라면...");
        t = "s45";

    }
    public void school45() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 이러다가 정말 여친 못 만들어서 죽는 거 아니야?");
        t = "s46";

    }    public void school46() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("자칭 신 할아버지의 말이 사실이라면 나는 지금 이딴 수업이나 들을 때가 아니다.");
        t = "s47";

    }    public void school47() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 오늘은... 바닐라 누나도 일하느라 바쁘고... 고릴라는... 오늘 친구들이랑 어디 간다고 했었고... 후우… 이렇게 허무하게 하루를 버려야하나?");
        t = "s48";

    }    public void school48() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 강하찬 학생.");
        t = "s49";

    }    public void school49() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.student);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("학생1: 네!");
        t = "s410";

    }    public void school410() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.teacher);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 이 패턴으로 문장을 만들어 보겠어요?.");
        t = "s411";

    }    public void school411() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.student);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("학생1: 아… 그… This pen.. is nothing compared to 어… a normal pen.");
        t = "s412";

    }    public void school412() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.teacher);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 강하찬 학생 잘했어요. 추가 점수 1점 드릴게요. 게릴라 학생. 게릴라 학생 없나요?");
        t = "s413";

    }    public void school413() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.yap);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: …네?");
        t = "s414";

    }    public void school414() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 멍하니 다른 생각을 하고 있었는지 한박자 늦게 교수님의 말에 대답했다.");
        t = "s415";

    }    public void school415() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (그러고보니 게릴라랑 대화해본게 PC방 이후로 한번도 없네.)");
        t = "s416";

    }    public void school416() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.teacher);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 이 패턴으로 문장을 만들어 보겠어요?");
        t = "s417";

    }
    public void school417() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.student);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: …죄송합니다. 어떤 패턴이죠?");
        t = "s418";

    }
    public void school418() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.teacher);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 게릴라 학생. 수업에 집중하세요.");
        t = "s419";

    }
    public void school419() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.student);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 죄송합니다…");
        t = "s420";

    }
    public void school420() {
        h1.background.setImageResource(R.mipmap.classroom);
        h1.character.setImageResource(R.mipmap.teacher);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("교수님: 다음은…");
        t = "s421";

    }
    public void school421() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (무슨 일 있나?)");
        t = "s422";

    }
    public void school422() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라를 그렇게 잘 알지 못하지만 오늘은 유독 침울해보이고 표정이 죽어있었다");
        t = "s423";

    }    public void school423() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (무슨 문제라도 있나?)(문자라도 날려볼까?)");
        t = "s424";

    }
    public void school424() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("걱정되는 마음이 들어서 저번에 받았던 번호로 그녀에게 문자를 날린다");
        t = "s425";

    }
    public void school425() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 릴라 ㅎㅇ");
        t = "s426";

    }
    public void school426() {
        h1.character.setVisibility(View.INVISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 문자를 멍하니 보다가 나를 스윽 바라본다.");
        t = "s427";

    }
    public void school427() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 영혼이 빠진 느낌인데… 진짜 무슨 일이라도 있나?");
        t = "s428";

    }
    public void school428() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 오늘 바빠요?");
        t = "s429";

    }
    public void school429() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라가 먼저 나에게 이런 질문을 할 줄 생각도 못했던 나는 어떻게 대답할지 고민한다.\n" +
                "주인공: ");
        t = "ss11";

    }
    public void select11(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("ㅇㅇ. 시간ㄱㅊ.");
        h1.choice2.setText("하나도 안 바빠.");
        h1.choice3.setText("일정 확인해보고 알려줄게.");
        h1.choice4.setText("이따 오후 수업 2개 더 들으면 괜찮아.");

        ss1 = "s430";
        ss2 = "s432";
        ss3 = "s434";
        ss4 = "s436";
    }
    //선택 1
    public void school430() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오늘 나랑 놀래요?");
        t = "s431";

    }    public void school431() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그.그래. 좋지.");
        t = "s438";

    }
    //선택 2
    public void school432() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오늘 나랑 놀래요?");
        t = "s433";

    }
    public void school433() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그.그래. 좋지.");
        t = "s438";

    }
    //선택 3
    public void school434() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아니예요. 괜찮아요.");
        t = "s435";

    }
    public void school435() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 잠..잠시만! 나 오늘 시간 완전 괜찮아.");
        t = "s438";

    }
    //선택 4
    public void school436() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("네. 수업 열심히 들으세요.");
        t = "s437";

    }
    public void school437() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 얘가 무슨 왠일로 이런걸 묻지?");
        t = "4191";

    }//씬 종료
    public void school438() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 저기 만년 지각생 오네.");
        t = "s439";

    }
    public void school439() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 이렇게 갑자기 데이트!? 뭐야. 설마 날 생각하고 있던 건가!");
        t = "s440";

    }
    public void school440() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("수업이 끝났다.");
        t = "s441";

    }
    public void school441() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나는 당연히 그녀가 와서 오늘 데이트에 대해 얘기하러 올 줄 알았다.");
        t = "s442";

    }
    public void school442() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("하지만 그녀는 가방을 챙기고 곧장 교실을 나갔다.");
        t = "s443";

    }
    public void school443() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그리고 그때 게릴라의 문자가 도착했다.");
        t = "s444";

    }
    public void school444() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 학교 정문으로 오세요.");
        t = "s445";

    }
    public void school445() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 음… 내가 생각했던 데이트랑은 다를거같기도하고…");
        t = "s446";

    }
    public void school446() {
        h1.background.setImageResource(R.mipmap.park);
        h1.character.setImageResource(R.mipmap.yap);
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("빠르게 답장을 하곤 가방을 챙긴 후 학교 정문으로 향했다.");
        t = "s447";

    }
    public void school447() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그곳에는 벽에 기대고 하늘을 바라보고 있는 게릴라가 있었다.");
        t = "s448";

    }
    public void school448() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 지금 무슨 생각을 하고 있는걸까?");
        t = "s449";

    }
    public void school449() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("표정을 전혀 읽을 수 없는 무표정으로 벽에 기댄 모습은 마치 잡지에서 보던 모델같다는 생각까지 들었다.");
        t = "s450";

    }
    public void school450() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 이..이럴때가 아니지.");
        t = "s451";

    }
    public void school451() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("얼른 게릴라에게 다가가 인사한다.");
        t = "s452";

    }
    public void school452() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아..안녕? 많이 기다렸어?");
        t = "s453";

    }
    public void school453() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: …갈까요?");
        t = "s454";

    }    public void school454() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어? 어디로 가게?");
        t = "s455";

    }
    public void school455() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나를 쳐다보지도 않고 말한다.");
        t = "s456";

    }
    public void school456() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 밥 먹으러요.");
        t = "s457";

    }
    public void school457() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀의 분위기에 압도당한 나는 레스토랑에 도착할 때까지 그녀에게 제대로 말도 못 걸었다.");
        t = "s458";

    }
    public void school458() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀가 나를 데리고 온 곳은 고기 뷔페였다.");
        t = "s459";

    }
    public void school459() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아직 점심인데… 고기 괜찮아?");
        t = "s460";

    }
    public void school460() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 말도 하지 않고 고기를 굽고 먹기를 반복했다.");
        t = "s461";

    }
    public void school461() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (저렇게 가녀린 체형에 어떻게 저 많은 음식들이 들어가지?)");
        t = "s462";

    }
    public void school462() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 폭식이 이런 것이다’라는 것을 온 몸으로 보여주듯이 미친듯이 흡입했다.");
        t = "s463";

    }
    public void school463() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("다른 테이블과는 달리 우리 테이블은 고기를 굽는 소리만 들렸으며 이 자리가 굉장히 불편했다.");
        t = "s464";

    }
    public void school464() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 분위기를 바꿔야할지 고민한다.");
        t = "ss12";

    }
    public void select12(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("무슨 일 있어?");
        h1.choice2.setText("너는 닭이 먼저라고 생각해? 알이 먼저라고 생각해?");
        h1.choice3.setText("(아니야. 생각할 시간이 필요해보여. 기다려주자.)");
        h1.choice4.setText("여기 고기 맛있다.");

        ss1 = "s465";
        ss2 = "s471";
        ss3 = "s477";
        ss4 = "s482";
    }

// 선택 1
    public void school465() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(그녀의 젓가락이 멈칫하다가 고기를 한 번에 많이 집어 입에 쑤셔 넣는다.)");
        t = "s466";

    }
    public void school466() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 그러곤 자리에 일어나 화장실로 가버린다.");
        t = "s467";

    }
    public void school467() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 에휴. 괜히 왔나…");
        t = "s468";

    }
    public void school468() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("10분 정도 기다리자 핼쑥해진 상태로 자리에 돌아왔다.");
        t = "s469";

    }
    public void school469() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 이만 나가죠.");
        t = "s470";

    }
    public void school470() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어? 어… 그래.");
        t = "s487";

    }
    //선택 2
    public void school471() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText(" …(그녀는 따로 대답도 안 하고 인상만 살짝 찌푸린 후 고기를 한 번에 많이 집어 입에 쑤셔 넣는다.)");
        t = "s472";

    }
    public void school472() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 그러곤 자리에 일어나 화장실로 가버린다.");
        t = "s473";

    }
    public void school473() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 에휴. 괜히 왔나…");
        t = "s474";

    }
    public void school474() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("10분 정도 기다리자 핼쑥해진 상태로 자리에 돌아왔다.");
        t = "s475";

    }
    public void school475() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 이만 나가죠.");
        t = "s476";

    }
    public void school476() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어? 어… 그래.");
        t = "s487";

    }
    //선택 3
    public void school477() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(고기 몇 점을 더 먹은 게릴라는 젓가락을 내려놓는다.)");
        t = "s478";

    }
    public void school478() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 다 먹었는지 더 이상 젓가락을 들지 않았고 그저 멍하니 고기를 구우면서 생긴 연기만을 멍하니 바라보았다.");
        t = "s479";

    }
    public void school479() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 다..다 먹었어?");
        t = "s480";

    }
    public void school480() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 네.");
        t = "s481";

    }
    public void school481() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그..그럼 갈까.");
        t = "s487";

    }
    //선택 4
    public void school482() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("네. 많이 드세요. (고기 한 점을 더 먹은 게릴라는 젓가락을 내려놓는다.)");
        t = "s483";

    }
    public void school483() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 다 먹었는지 더 이상 젓가락을 들지 않았고 그저 멍하니 고기를 구우면서 생긴 연기만을 멍하니 바라보았다.");
        t = "s484";

    }
    public void school484() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 다..다 먹었어?");
        t = "s485";

    }
    public void school485() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 네.");
        t = "s486";

    }
    public void school486() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그..그럼 갈까.");
        t = "s487";

    }

    // 위까지가 선택지
    public void school487() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 먼저 자리에서 일어나더니 계산을 뚝딱해버린다.");
        t = "s488";

    }
    public void school488() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 내..내가 내려고 했는데…");
        t = "s489";

    }
    public void school489() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 제가 데려왔으니까요. 괜찮아요.");
        t = "s490";

    }
    public void school490() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("고기 뷔페를 나온 후 그녀와 나는 주변에 있던 오락실에 왔다.");
        t = "s491";

    }
    public void school491() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 오자마자 격투게임, 비행기 게임, 음악 게임, 종류를 가리지 않고 오락실 게임을 섭렵해 나갔다.");
        t = "s492";

    }
    public void school492() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나는 옆에서 그것을 잠시 같이하다가 그녀가 하는 것을 옆에서 지켜보았다.");
        t = "s493";

    }
    public void school493() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 와… 너 게임 진짜 잘한다.");
        t = "s494";

    }
    public void school494() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 게임을 하면… 잠시동안은 잊을 수 있으니까요.");
        t = "s495";

    }
    public void school495() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 의미심장한 말만 남긴 채 게임에 집중해 나갔다.");
        t = "s496";

    }
    public void school496() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 아오! @#@&*. 저 보스놈을 어떻게 깨라는거야.");
        t = "s497";

    }
    public void school497() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("자리를 박차고 일어난 그녀는 오락실 문을 연다.");
        t = "s498";

    }public void school498() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 뭐해요. 이제 노래방이나 가요.");
        t = "s499";

    }public void school499() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어..어? 어. 그..그래.");
        t = "s4100";

    }
    public void school4100() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 그 말을 한 이후로 별 말없이 노래방으로 향한다.");
        t = "s4101";

    }
    public void school4101() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 이 노래방이 익숙한지 노래방 주인이 알아본다.");
        t = "s4102";

    }
    public void school4102() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("노래방 주인: 여. 오늘도 7번방? 어? 너 친구도 있었어? 남자친구?");
        t = "s4103";

    }
    public void school4103() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 쿨하게 그를 지나치고 곧 바로 7번방으로 들어갔다.");
        t = "s4104";

    }
    public void school4104() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 저기… 나 노래 못하는데…");
        t = "s4105";

    }
    public void school4105() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: …그냥 옆에서 들어요.");
        t = "s4106";

    }
    public void school4106() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 바로 첫 곡을 부르기 시작했다.");
        t = "s4107";

    }
    public void school4107() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("굉장히 파워풀하고 고음이 많은 노래였음에도 삑사리 한 번 없이 손쉽게 부른다.");
        t = "s4108";

    }
    public void school4108() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("음악에 대해 문외한이지만 막귀를 가진 나도 그녀의 노래 실력이 범상치 않다는 것을 바로 알 수 있었다.");
        t = "s4109";

    }
    public void school4109() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아이돌 연습생은 역시 다르다…");
        t = "s4110";

    }
    public void school4110() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("첫 곡이 끝나고 그녀는 두번째. 세번째, 네번째 곡까지 여러 장르들의 노래를 부른 후…");
        t = "s4111";

    }
    public void school4111() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 노래방 리모컨으로 똑 같은 숫자를 눌렀다 지웠다를 반복한다.");
        t = "s4112";

    }
    public void school4112() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("고민하던 그녀는 결국 한 곡을 선택한다.");
        t = "s4113";

    }public void school4113() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어? 이 노래는?");
        t = "s4114";

    }public void school4114() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("데뷔가 얼마되지 않았음에도 요즘 가장 핫하고 인기있는 핫걸스의 ‘핫’이라는 노래다.");
        t = "s4115";

    }
    public void school4115() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("티비든 인터넷이든 이 노래로 엄청나게 떠들썩해서 모를래야 모를 수 없었다.");
        t = "s4116";

    }
    public void school4116() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀의 감미롭고 청아한 목소리와 함께 노래가 시작되었다.");
        t = "s4117";

    }
    public void school4117() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("다른 노래도 잘 불렀지만 ‘핫’을 부르는 그녀는 마치 천사같다는 생각이 들었다.");
        t = "s4118";

    }
    public void school4118() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 와… 원곡보다 더 좋은 거 같은데…");
        t = "s4119";

    }
    public void school4119() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("가수의 라이브를 들으면 이런 느낌일까?");
        t = "s4120";

    }
    public void school4120() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("왜 사람들이 가수들에게 열광하는지 알 수 있게 만들었다.");
        t = "s4121";

    }
    public void school4121() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀의 노래솜씨에 취하듯 눈을 감고 듣고 있는데 갑자기 그녀의 목소리가 뚝 끊겼다.");
        t = "s4122";

    }
    public void school4122() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 응?");
        t = "s4123";

    }
    public void school4123() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("무슨일인가하고 그녀를 보았다.");
        t = "s4124";

    }
    public void school4124() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: …");
        t = "s4125";

    }
    public void school4125() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 입을 꽉 깨문 채 울고 있었다.");
        t = "s4126";

    }
    public void school4126() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("무엇이 그녀를 저렇게 서럽게 만들었을까…");
        t = "s4127";

    }
    public void school4127() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("저렇게 재능도 많고 예쁜 여자가 인생을 다 산 표정을 지을까…");
        t = "ss13";

    }
    public void select13(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("…괜찮아?");
        h1.choice2.setText("(조용히 티슈를 건낸다.)");
        h1.choice3.setText("그만 좀 울어라!");
        h1.choice4.setText("어…그…어…");

        ss1 = "s4128";
        ss2 = "s4128";
        ss3 = "s4129";
        ss4 = "s4128";
    }


//선택 124
    public void school4128() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 자신이 우는 모습을 보여주기 싫은지 고개를 숙인 채 팔 소매로 눈물을 닦는다.");
        t = "s4130";

    }
    //선택 3
    public void school4129() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(게릴라는 나의 말에 문을 박차고 나간다.)");
        t = "s4130";

    }

    //위 까지가 선택지
    public void school4130() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("…");
        t = "s4131";

    }
    public void school4131() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀가 진정할때까지 기다려주었다.");
        t = "s4132";

    }
    public void school4132() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("겨우 진정한 게릴라는 드디어 입을 열었다.");
        t = "s4233";

    }
    public void school4133() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 미안해요… 갑자기 이곳저곳 데리고 다녀서요.");
        t = "s14";

    }
    public void select14(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("아...아니야! 난 재밌었어.");
        h1.choice2.setText("조..조금 힘들긴 했지. 헤헤.");
        h1.choice3.setText("어..어? 어…");
        h1.choice4.setText("왜 그래…");

        ss1 = "s4234";
        ss2 = "s4234";
        ss3 = "s4234";
        ss4 = "s4234";
    }

    public void school4134() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 물을 마신 후 말을 이었다.");
        t = "s4235";

    }
    public void school4135() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 방금 제가 부른 곡… 알아요?");
        t = "s4236";

    }
    public void school4136() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어..? 알지. 요즘 제일 인기있는 핫걸의 핫이잖아.");
        t = "s4237";

    }
    public void school4137() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 맞아요. 요즘 굉장히 잘나가더라고요. 저 없이…");
        t = "s4238";

    }
    public void school4138() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 여지껏 혼자 담아두던 것을 털어놓기 시작한다.");
        t = "s4239";

    }
    public void school4139() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 저는 원래 핫걸의 리더였어요.");
        t = "s4240";

    }
    public void school4140() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 뭐!? 정말?");
        t = "s4241";

    }
    public void school4141() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 네. 멤버들이랑도 아주 친했어요. 모두 언니언니하면서 잘 따르기도 했고요. 소속사랑도 별 트러블 없어서 데뷔만을 기다리는 상태였죠.");
        t = "s4242";

    }
    public void school4142() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그런데 어쩌다가…");
        t = "s4243";

    }
    public void school4143() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 디질라라는 애가 갑자기 새로 멤버로 들어왔어요.");
        t = "s4244";

    }
    public void school4144() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 디질라? 지금 핫걸의 리더잖아.");
        t = "s4245";

    }
    public void school4145() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 네. 걔가 소속사 사장의 딸이예요. 몇 일 디질라와 지내다가 여러 의견차이 때문에 사이가 좋지 않아졌고… 저는 팀에서 쫓겨나게 됐죠.");
        t = "s4246";

    }
    public void school4146() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그럴수가... 너무해.");
        t = "s4247";

    }
    public void school4147() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 어쩌겠어요. 상대는 소속사 사장의 딸이고… 저는 뒤를 봐주는 빽은 없으니까요.");
        t = "s4248";

    }
    public void school4148() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("자세한 내용은 알 수 없지만 소속사에서 많은 우여곡절이 있었다는 것을 그녀의 표정만 봐도 알 수 있었다.");
        t = "s4249";

    }
    public void school4149() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어떤 말을 해야할지 몰라서 어버버하고 있을 때 그녀가 다시 입을 열었다.");
        t = "s4250";

    }
    public void school4150() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 오늘 소속사와 계약이 끝났어요... 그리고 전…  4천만원이라는 빚만 남은 상태죠.");
        t = "s4251";

    }
    public void school4151() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: ... 이제 어쩌려고?");
        t = "s4252";

    }
    public void school4152() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 모르겠어요... 막막해요. 평생을 아이돌이 되는 것만 생각했는데... 나따위가 다른 재주가 어딨겠어요.");
        t = "s4253";

    }
    public void school4153() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("해탈한 표정으로 천장만 바라보는 그녀의 모습은 마치 곧 죽을거 같은 사람의 모습이였다.");
        t = "s4254";

    }
    public void school4154() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 고마워요. 그래도 남한테 얘기하니까, 속이 다 시원하네요.");
        t = "s4255";

    }
    public void school4155() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("전혀 후련해 보이지 않는 표정으로 얘기하니 더욱 걱정되었다.");
        t = "s4256";

    }
    public void school4156() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("이대로 두면 안 되겠다는 생각에 그녀에게 조언을 하려고 한다.");
        t = "s15";

    }
    public void select15(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("인생은 그게 다가 아니야!");
        h1.choice2.setText("다른 소속사를 찾아봐! 너라면 할 수 있어.");
        h1.choice3.setText("세상은 넓어. 새로운 길을 찾아봐.");
        h1.choice4.setText("함께 방법을 찾아보자. 내가 도와줄게.");

        ss1 = "s378a";
        ss2 = "s378b";
        ss3 = "s378c";
        ss4 = "s378d";
    }


    public void school4157() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 생각해준 건 고맙지만... 괜찮아요. 오늘 고마웠어요.");
        t = "s33";

    }
    public void school4158() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 가방을 챙긴 채 노래방을 나갔다.");
        t = "s33";

    }
    public void school4159() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 후우…");
        t = "s33";

    }
    public void school4160() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀에게 조그만 도움이라도 주고 싶었지만 나는 정말 무능하고 쓸모없는 사람이라는 생각만 들었다.");
        t = "s33";

    }
    public void school4161() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("노래방 주인: 어이~ 차였나?");
        t = "s33";

    }
    public void school4162() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그런거 아닙니다.");
        t = "s33";

    }
    public void school4163() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("익살스럽게 웃던 노래방 주인은 한숨을 쉰다.");
        t = "s33";

    }
    public void school4164() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("노래방 주인: 에휴. 잘해줘. 분명 재능도 끼도 있고… 확실히 포텐이 있는 앤데. 그 포텐을 보여줄 기회를 얻기가 힘들지.");
        t = "s33";

    }
    public void school4165() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 포텐을… 보여줄 기회? 보여줘요? 어?");
        t = "s33";

    }
    public void school4166() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("보여준다는 말을 되뇌던 나는 한 포스터를 보게 된다.");
        t = "s33";

    }
    public void school4167() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 슈퍼갓스타? 이거면… 아저씨 고마워요!");
        t = "s33";

    }
    public void school4168() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나는 급하게 그녀를 찾으러 나간다.");
        t = "s33";

    }
    public void school4169() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 릴라야! 게릴라! 어디갔지?");
        t = "s33";

    }
    public void school4170() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("노래방을 나와 그녀를 찾으려했지만 시내 한복판에서 그녀를 찾기는 쉽지 않았다.");
        t = "s33";

    }
    public void school4171() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("전화를 해봐도 받지 않는다.");
        t = "s33";

    }
    public void school4172() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 젠장! 생각해! 어디로 갔을까…");
        t = "s16";

    }
    public void select16(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("포기하고 집에 간다.");
        h1.choice2.setText("다른 소속사를 찾아봐! 너라면 할 수 있어.");
        h1.choice3.setText("세상은 넓어. 새로운 길을 찾아봐.");
        h1.choice4.setText("함께 방법을 찾아보자. 내가 도와줄게.");

        ss1 = "s4273";
        ss2 = "s4274";
        ss3 = "s4275";
        ss4 = "s4277";
    }
    //선택지 1
    public void school4173() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 에휴. 알아서 잘 하겠지.");
        t = "s4291";

    }//씬 종료
    //선택지 2
    public void school4174() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("버스 정류장에 간다.");
        t = "s4281";

    }
    //선택지 3
    public void school4175() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오락실에 다시 가본다.");
        t = "s4276";

    }
    public void school4176() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 오락실에 없었다.");
        t = "s4291";

    }//씬 종료
    //선택지 4
    public void school4177() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("노래방에 다시 들어간다.");
        t = "s4278";

    }
    public void school4178() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("노래방 주인에게 묻는다.");
        t = "s4279";

    }
    public void school4179() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("노래방 주인은 모른다는 말을 한다.");
        t = "s4280";

    }
    public void school4180() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (주인공은 포기하고 집으로 돌아간다.) 에휴. 알아서 잘 하겠지.");
        t = "s4291";

    }//씬 종료
    public void school4181() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("버스 정류장으로 달려가자 그녀는 의자에 앉아 멍하게 하늘만 보고 있었다.");
        t = "s4282";

    }
    public void school4182() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 헥. 헥. 릴라야!");
        t = "s4283";

    }
    public void school4183() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 선배?");
        t = "s4284";

    }
    public void school4184() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 헥. 헥. 후우. 릴라야. 슈퍼갓스타에 나가자!");
        t = "s4285";

    }
    public void school4185() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 슈퍼갓...스타요?");
        t = "s4286";

    }
    public void school4186() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그래. 너라면 분명 잘 할거야. 팬 1호로써. 니가 무대에서 반짝이는 것을 꼭 보고 싶어.");
        t = "s4287";

    }
    public void school4187() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 제가…요?");
        t = "s4288";

    }
    public void school4188() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 잠시만…");
        t = "s4289";

    }
    public void school4189() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나는 스마트폰으로 아까 찍었던 포스터를 그녀에게 보여준다.");
        t = "s4290";

    }
    public void school4190() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 이거 지원 오늘까지야. 내가 옆에서 서포트 해줄게!");
        t = "s4291";

    }
    public void school4191() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: …알겠어요.");
        t = "s33";

    }// 대학교 후배 4 끝.


















// 대학생 후배 3
    public void school31() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오랜만에 중딩시절에 함께다니던 친구들을 만났다.");
        t = "s32";

    }
    public void school32() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 저기 만년 지각생 오네.");
        t = "s33";

    }
    public void school33() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구2: 정확히 5분 지났으니까. 5만원.");
        t = "s34";

    }
    public void school34() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("응. 꺼져.");
        t = "s35";

    }
    public void school35() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구3: 야. 너 사고 났다며. 븅신. 눈은 어따두고 다니냐?");
        t = "s36";

    }
    public void school36() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("짜식이. 행님이 아팠다는데 걱정은 못해주고.");
        t = "s37";

    }
    public void school37() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구2: 얘 상태보니까. 꾀병이야. 꾀병.");
        t = "s38";

    }
    public void school38() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구4: 응? 사고? 무슨 사고?");
        t = "s39";

    }
    public void school39() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 됐고. 빨리 PC방이나 가자. 오랜만에 5인큐 돌리겠네.");
        t = "s310";

    }
    public void school310() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구4: 저기 얘들아? 나만 몰랐던거야? 뭔데.");
        t = "s311";

    }
    public void school311() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("우리는 지도앱을 킨 후 가장 평이 좋고 가까운 PC방으로 향했다.");
        t = "s312";

    }
    public void school312() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 오. 여기 PC방 괜찮네.");
        t = "s313";

    }
    public void school313() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구4: 여기 1시간에 얼마지?");
        t = "s314";

    }
    public void school314() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("다섯 자리가 붙어있는 곳을 찾기 위해 두리번거리던 중 익숙한 여자의 목소리가 들린다.");
        t = "s315";

    }
    public void school315() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("???: @#@&^#. 후우. 젠장!");
        t = "s316";

    }
    public void school316() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아혹시하는 생각으로 그쪽으로 가보니 게릴라가 혼자 게임을 하고 있었다.");
        t = "s317";

    }
    public void school317() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 뭐해. 빨리 와.");
        t = "s318";

    }
    public void school318() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구들이 나를 부른다.");
        t = "s7";

    }
    public void select7(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("가즈아~ 5인큐 가즈아~");
        h1.choice2.setText("게릴라의 게임 플레이를 본다.");
        h1.choice3.setText("그녀의 어깨를 건들며 인사한다.");
        h1.choice4.setText("친구들에게 간다.");

        ss1 = "s319";
        ss2 = "s321";
        ss3 = "s332";
        ss4 = "s319";
    }
    //선택 1,4
    public void school319() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구들과 5인큐를 한다.");
        t = "s321";

    }
    public void school320() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("몇 시간을 게임을 한 후 우리는 서로 못했다고 지적질을 하면서 떡볶이를 먹은 후 헤어졌다.");
        t = "s3100"; //상황종료로

    }
    //선택 2
    public void school321() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 리그 오브 레거시를 하고 있었다.");
        t = "s322";

    }
    public void school322() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 오… 잘하네.");
        t = "s323";

    }

    public void school323() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("뒤에서 조용히 그녀의 플레이를 보는데 상당한 실력이라는 것을 알 수 있었다.");
        t = "s324";

    }
    public void school324() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 와! 저걸 살았어. 베이커인줄.");
        t = "s325";

    }
    public void school325() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 얌마! 뭐해. 안 오면 너 빼고 돌린다?");
        t = "s326";

    }
    public void school326() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아. 미안. 그냥 니네들끼리 해라. ");
        t = "s327";

    }
    public void school327() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: …아는 사람이야?");
        t = "s328";

    }
    public void school328() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 학교 후배.");
        t = "s329";

    }
    public void school329() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 올~ 다른 애들한테는 내가 말해줄게 키킥.");
        t = "s330";

    }
    public void school330() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그…그런거 아니야!");
        t = "s331";

    }
    public void school331() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구1: 응. 모쏠 연애고자의 몸부림 잘 봤고요.");
        t = "s339";// 상황 이어서

    }
    //상황 3
    public void school332() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 아이씨. 뭐야!");
        t = "s333";

    }
    public void school333() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어… 안녕…");
        t = "s334";

    }
    public void school334() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 지금 안녕 못하니까. 저리 가세요.");
        t = "s335";

    }
    public void school335() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어… 그래.");
        t = "s336";

    }
    public void school336() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀는 나를 제대로 보지도 않고 축객령을 내렸다.");
        t = "s337";

    }
    public void school337() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나는 친구들에게 돌아가 게임을 한 후 친구들과 5인큐를 한다.");
        t = "s338";

    }
    public void school338() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("몇 시간을 게임을 한 후 우리는 서로 못했다고 지적질을 하면서 떡볶이를 먹은 후 헤어졌다.");
        t = "s3100";//상황 종료

    }






    //위 까지가 선택 옵션
    public void school339() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("다시 그녀의 게임화면을 다시 보자 화면이 회색으로 변했다.");
        t = "s340";

    }
    public void school340() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("쾅!(게릴라가 책상을 주먹으로 내리친 소리)");
        t = "s341";

    }
    public void school341() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 아오! 얼마나 떠먹여줘야 하는거야. 저런 놈들 때문에 나라가 이 모양이고 내 인생도 이 모양이지!");
        t = "s342";

    }
    public void school342() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: (깜짝이야…)");
        t = "s343";

    }
    public void school343() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀의 화면이 다시 컬러 바뀌기 전에 게임은 끝이나고 말았다.");
        t = "s344";

    }
    public void school344() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 후우. 어?");
        t = "s345";

    }
    public void school345() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아.. 안녕?");
        t = "s346";

    }public void school346() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 아. 네… 그… 선배인지 몰랐어요. 저번에 반말해서 죄송해요. 밀친 것도요.");
        t = "s347";

    }public void school347() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어? 아.. 괜찮아. 그럴 수 있지.");
        t = "s8";

    }
    public void select8(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("같이 게임할래? 티어, 나랑 같은거 같은데.");
        h1.choice2.setText("같이 게임할래? 내가 캐리해줄게.");
        h1.choice3.setText("옆에 앉아서 게임해도 될까?");
        h1.choice4.setText("저기… 아까 마지막 한타 봤는데 포지션이 너무 앞쪽이였던거 같아.");

        ss1 = "s348";
        ss2 = "s349";
        ss3 = "s350";
        ss4 = "s353";
    }
    // 선택지 1 상황
    public void school348() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어… 포지션이 어딘데요?");
        t = "s9";

    }
    // 선택지 2 상황
    public void school349() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어… 포지션이 어딘데요?");
        t = "s9";

    }
    // 선택지 3 상황
    public void school350() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그러세요.");
        t = "s351";

    }
    public void school351() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("우리는 각자 게임을 하였다.");
        t = "s352";

    }
    public void school352() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText(" 게릴라는 1시간 정도 더 플레이 한 후 pc방을 떠났다.");
        t = "s3100";// 상황 종료

    }
    // 선택지 4 상황
    public void school353() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("알아서 할게요.");
        t = "s354";

    }
    public void school354() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 어… 그래.");
        t = "s355";

    }
    public void school355() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구들에게 돌아가 함께 게임을 한다.");
        t = "s3100";// 상황종료

    }

    public void select9(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("원딜");
        h1.choice2.setText("탑");
        h1.choice3.setText("정글");
        h1.choice4.setText("미드");

        ss1 = "s356";
        ss2 = "s359";
        ss3 = "s362";
        ss4 = "s363";      //////////여기 부터
    }
    //선택 1 상황
    public void school356() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("원딜이요? 음… 정글이나 서폿도 가능한가요? 제가 미드아니면 원딜만해서요.");
        t = "s357";

    }
    public void school357() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("저 정글도 가능해요!");
        t = "s358";

    }
    public void school358() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(게릴라는 불안해하면서도 옆자리를 권한다.)");
        t = "s366";

    }
    //선택 2 상황
    public void school359() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("탑이요? 음… 정글이나 서폿도 가능한가요? 제가 미드아니면 원딜만해서요.");
        t = "s360";

    }
    public void school360() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("저 정글도 가능해요!");
        t = "s361";

    }
    public void school361() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(게릴라는 불안해하면서도 옆자리를 권한다.)");
        t = "s366";

    }
    //선택지 3 상황
    public void school362() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("오. 좋아요. 저는 주라인이 미드라서요. 정글이면 듀오하기 괜찮겠네요.");
        t = "s366";

    }
    //선택지 4 상황
    public void school363() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아… 저도 미드라서… 그냥 따로 해요.");
        t = "s364";

    }
    public void school364() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아… 그래…");
        t = "s365";

    }
    public void school365() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구들과 게임하러 간다.");
        t = "s3100";//상황 종료

    }
    public void school366() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("빠르게 그녀의 옆자리에 앉은 후 게임에 접속했다.");
        t = "s367";

    }
    public void school367() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아이디좀 알려줄래?");
        t = "s368";

    }
    public void school368() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 킹크랩갓크랩이요.");
        t = "s369";

    }
    public void school369() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("친구추가를 마친 후 우리는 바로 게임을 돌렸다.");
        t = "s370";

    }public void school370() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("평소에는 잘 잡히지도 않던 큐가 오늘은 다행히 바로 잡혔다.");
        t = "s371";

    }
    public void school371() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 오..오늘따라 큐가 금방잡혔네.");
        t = "s372";

    }
    public void school372() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 그러게요. 아이씨. 1픽이냐. ");
        t = "s373";

    }
    public void school373() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 빠르게 가쓰오라는 칼챔을 픽하곤 자리에서 일어난다.");
        t = "s374";

    }
    public void school374() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 저 화장실 갔다올게요.");
        t = "s375";

    }
    public void school375() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 아. 응.");
        t = "s376";

    }
    public void school376() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그리고 2픽인 나는 캐릭터를 정할 차례가 왔다.");
        t = "s377";

    }
    public void school377() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공의 챔피언은?");
        t = "s10";

    }
    public void select10(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("샤콕");
        h1.choice2.setText("야이애나");
        h1.choice3.setText("라이번");
        h1.choice4.setText("칼서스");

        ss1 = "s378a";
        ss2 = "s378b";
        ss3 = "s378c";
        ss4 = "s378d";
    }
    public void school378a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 자리에 돌아오고 내가 고른 챔피언을 본다.");
        t = "s319";

    }
    public void school378b() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 자리에 돌아오고 내가 고른 챔피언을 본다.");
        t = "s320";

    }
    public void school378c() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 자리에 돌아오고 내가 고른 챔피언을 본다.");
        t = "s321";

    }
    public void school378d() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 자리에 돌아오고 내가 고른 챔피언을 본다.");
        t = "s322";

    }
    // 선택지 1,3,4를 고를 때
    public void school379() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 아… 우리 조합이…");
        t = "s380";

    }
    public void school380() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 나 이 챔피언 잘해! 한 번 믿어봐.");
        t = "s381";

    }
    public void school381() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(게임 플레이…)");
        t = "s382";

    }
    public void school382() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그리고 20분이 지나고 우리는 굉장히 어색해졌다.");
        t = "s383";

    }
    public void school383() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: …믿으라면서요.");
        t = "s384";

    }
    public void school384() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: …미안.");
        t = "s385";

    }
    public void school385() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라의 눈을 지금 본 후 나는 새로운 지식을 얻었다.");
        t = "s386";

    }
    public void school386() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("사람은 눈으로도 심한 욕을 할 수 있다는 것을.");
        t = "s387";

    }
    public void school387() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 후우… 오늘은 날이 아닌가보네요. 그래도 재밌었어요.");
        t = "s388";

    }
    public void school388() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라는 간단히 인사하고 나가버린다.");
        t = "s3100";

    }
    // 선택지 2 고를 때
    public void school389() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 오… 그래도 저희 둘이 조합이 괜찮아서 다행이네요.");
        t = "s390";

    }
    public void school390() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 미드만 계속 갈 테니까. 준비하고 있어.");
        t = "s391";

    }
    public void school391() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 한번 믿어볼게요.");
        t = "s392";

    }
    public void school392() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게임은 상당히 팽팽하게 진행되었다.");
        t = "s393";

    }
    public void school393() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("나와 게릴라의 활약으로 나머지 팀원들이 싸놓은 똥을 어떻게든 치워주고 있었기 때문이다.");
        t = "s394";

    }
    public void school394() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그리고 내쉬어 남작이라는 유니크 몬스터 주변에서의 중요한 한타상황.");
        t = "s395";

    }
    public void school395() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 지금!(야이애나 궁을 사용 함)");
        t = "s396";

    }
    public void school396() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그리고 게릴라의 가쓰오가 연계적으로 궁을 사용하였다.");
        t = "s397";

    }
    public void school397() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 좋아! 이거야.");
        t = "s398";

    }
    public void school398() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("극적으로 모든 적들을 물리치고 승리를 할 수 있게 되었다.");
        t = "s399";

    }
    public void school399() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("게릴라: 와. 선배. 진짜 잘하네요. 가끔 저랑 같이해요. 이렇게 잘 맞는 정글은 또 처음이네요.");
        t = "s3100";

    }
    public void school3100() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공: 그래. 그래. 좋지.");
        t = "s112";

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
        t = "s11";
    }



    // 후배 스토리 시작






    public void school11(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.character.setImageResource(R.mipmap.gg);
        h1.background.setImageResource(R.mipmap.school);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("갑작스러운 사고로 몇 일간 병원신세를 진 후 오랜만에 대학교에 왔다.");
        t = "s11a";

    }
    public void school11a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("머리가 복잡하기도 하고 생각이 많아져서 수업시간보다 2시간이나 일찍 대학교에 와버렸다.");
        t = "s12";

    }
    public void school12() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("괜히 일찍 왔나? 오늘따라 유독 사람들이 많기도 하고…");
        t = "s13";

    }
    public void school13() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("조만간 축제라도 있는지 사람들이 북적이고 무언가 열심히 설치하고 떠드는 소리가 가득하다.");
        t = "s13a";

    }
    public void school13a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("주인공은 얼른 주위를 두리번거리며 사람이 적은 곳을 찾아본다.");
        t = "s14";

    }
    public void school14() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("저기는 사람이 별로 없네.");
        t = "s15";

    }
    public void school15() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("얼른 이 사람 많은 곳을 빠져나오기 위해 빠른 걸음으로 걷는데 누군가 빠르게 뛰어온다.");
        t = "s15a";

    }
    public void school15a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("후드를 쓰고 바닥만 본채 뛰어오던 여자는 앞을 확인하지 않더니 기어이 나와 부딪힌다.");
        t = "s16";

    }
    public void school16() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(서로 부딪히는 소리) 꽝!");
        t = "s17";

    }
    public void school17() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("어이쿠!");
        t = "s18";

    }
    public void school18() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.character.setImageResource(R.mipmap.gg2);
        h1.background.setImageResource(R.mipmap.school);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("IC…");
        t = "s19";

    }
    public void school19() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("몸에 후유증이 남아있어서 그런지 그녀가 부딪힐 때까지 전혀 반응을 못했다.");
        t = "s110";

    }
    public void school110() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.character.setImageResource(R.mipmap.gg3);
        h1.background.setImageResource(R.mipmap.school);
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("하… !@#$@.");
        t = "s111";

    }
    public void school111() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("아야야… 아니! 어…");
        t = "s112";

    }
    public void school112() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("화를 내려던 나는 그녀의 얼굴을 보곤 넋을 잃었다.");
        t = "s112a";

    }
    public void school112a() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("밝은 주황색으로 웨이브진 머리카락에 인형같이 아기자기하면서도 예쁜 외모에 첫번째로 감탄했고");
        t = "s112ab";

    }
    public void school112ab() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그런 그녀가 울고 있었던 것에 두번째로 놀랐으며 그녀와의 이미지와는 전혀 어울리지 않게 그녀의 작은 입에서 걸걸한 욕을 쏟아낸 것에 세번째로 놀란다.");
        t = "s5";

    }
    public void select5(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText("괘..괜찮아요?");
        h1.choice2.setText("나..나는 아..아무 잘 못 없어!");
        h1.choice3.setText("아니… 나는 잘 못… 없는데…");
        h1.choice4.setText("이것이 사랑?");

        ss1 = "s113";
        ss2 = "s113";
        ss3 = "s113";
        ss4 = "s113";
    }
    public void school113() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("짜증나! 짜증나아아!");
        t = "s6";

    }
    public void select6(){
        h1.character.setVisibility(View.INVISIBLE);
        showButton();
        h1.text.setVisibility(View.INVISIBLE);
        h1.choice1.setText(" (그녀를 향해 크게 소리치며) 미안해요!");
        h1.choice2.setText("(그녀를 따라가 주머니에 있던 애니메이션이 그려진 손수건을 꺼내 건넨다.) 이…이거라도 쓰세요. (또 욕을 할 수 있다는 생각에 도망친다)");
        h1.choice3.setText("(그녀를 향해 크게 소리치며)나는 잘 못 없어! 자기가 달려와서 달려와놓고…");
        h1.choice4.setText("화내는 모습까지 예쁘다. 이것이 사랑?");

        ss1 = "s114";
        ss2 = "s115";
        ss3 = "s116";
        ss4 = "s117";
    }
    public void school114() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(잠시동안 멈췄던 그녀는 어디론가 뛰어간다.)");
        t = "s118";

    }
    public void school115() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("…");
        t = "s118";

    }
    public void school116() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(어쩐지 그녀의 욕하는 소리가 유난히 더 크게 들리는 것은 기분 탓일까?)");
        t = "s118";

    }
    public void school117() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("(그녀는 듣지 못한 듯하다.)");
        t = "s118";

    }
    public void school118() {
        h1.character.setVisibility(View.VISIBLE);
        noButton();
        h1.text.setVisibility(View.VISIBLE);
        h1.text.setText("그녀의 입은 굉장히 험하기도 하고 행동도 무례했지만 어째선지 그녀를 욕하고 미워하고 싶지는 않았다. \n" +
                "그녀가 눈물을 흘리고 있던 것도 신경쓰인다… \n" +
                "하지만 내가 그녀에게 무슨 일이냐고 묻는 것은 오지랖이겠지.\n");
        t = "";

    }}



