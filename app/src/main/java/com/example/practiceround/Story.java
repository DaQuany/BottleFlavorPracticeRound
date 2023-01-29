package com.example.practiceround;

import static androidx.core.content.ContextCompat.startActivity;

import android.content.Intent;
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

            //간호사 1


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

        //동창1



            case "n0" : neighbor0(); break;
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

// 후배1
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

            //간호사2
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


                //옆집2

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

                //후배2
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

            //병원3

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



//옆집3
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



//후배3
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

            //간호사4

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


            //옆집4

            case "nd4-0":text0();break;
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



//후배4
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


            //간호사5

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


            //동창5
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

            //후배5
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

    //간호사1

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
        t = "n0";
    }


    //옆집1

    public void neighbor0(){
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
        t = "s11";
    }


    //후배1

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

        c1 = "s113";
        c2 = "s113";
        c3 = "s113";
        c4 = "s113";
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

        c1 = "s114";
        c2 = "s115";
        c3 = "s116";
        c4 = "s117";
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

    }

    //간호사2

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



    //옆집소녀2

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


    //후배2

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
        t="h31";
    }

    //병원3

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
        t="n31";
    }



    //옆집3


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
        t=",s31";
    }

    //후배3

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
        c1 = "s319";
        c2 = "s321";
        c3 = "s332";
        c4 = "s319";
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

        c1 = "s348";
        c2 = "s349";
        c3 = "s350";
        c4 = "s353";
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

        c1 = "s356";
        c2 = "s359";
        c3 = "s362";
        c4 = "s363";      //////////여기 부터
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

        c1 = "s378a";
        c2 = "s378b";
        c3 = "s378c";
        c4 = "s378d";
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
        t = "h41";

    }



//간호사4

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
        t="nd4-0";
    }



    //옆집4
    public void text0()
    {
        noButton();
        h1.background.setImageResource(R.mipmap.room7);
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setTextSize(13);
        h1.text.setText("나레이션: \"고릴라\"에게 같이 야구장에 가자고 초대를 받은 \"주인공\"은 믿을 수 없다는 표정을 지으며 침대에 누워 있다.");
        t = "nd4-1";
    }

    public void text1(){
        h1.text.setText("주인공: 흐흐흐... 역시... 이몸이야... 내가 안해서 그렇지 마음먹고 하니까 여자가 먼저 놀러 가자 말하는 클라스... 캬~~ 취한다 취해~");
        t = "nd4-2";
    }

    public void text2(){
        h1.text.setText("주인공: 이렇게 되면, 내가 이세계에 가게 되는 것은 식은 죽 먹기 겠구만. 후히히히히히");
        t = "nd4-3";
    }

    public void text3(){
        h1.text.setText("주인공: 그나저나 지금 시간이 벌써 11시네. 내일 야구장에 가려면 이제 슬슬 잘까?");
        t = "nd4-4";
    }

    public void text4(){
        h1.choice1.setText("그래 지금 자고 내일 일어나서 야구장에 갈 준비를 하자.");
        h1.choice2.setText("11시에 자는 건 너무 이르지, 한 30분만 \"아웃스타그램\"을 보다가 자야겠다.(호감도+5)");
        showButton();
        c1 = "nd4-5";
        c2 = "nd4-13";
    }

    public void text5(){
        noButton();
        h1.text.setText("나레이션: 30분 경과...");
        t = "nd4-6";
    }

    public void text6(){
        h1.text.setText("주인공: 하하하.. 이거 재미 있네...");
        t = "nd4-7";
    }

    public void text7(){
        h1.text.setText("나레이션: 30분 경과...");
        t = "nd4-8";
    }

    public void text8(){
        h1.text.setText("주인공: 이것만 마저 보고 자야 겠다...");
        t = "nd4-9";
    }

    public void text9(){
        h1.text.setText("나레이션: \"주인공\"은 \"아웃스타그램\"을 하다 보니 시간이 2시간이 흘러 버렸다.");
        t = "nd4-10";
    }

    public void text10(){
        h1.text.setText("주인공: 아니, 뭐 했다고 벌써 2시간이 흘러 버렸냐? 이제 진짜 자야겠... 어? 이건...");
        t = "nd4-11";
    }

    public void text11(){
        h1.text.setText("나레이션: \"주인공\"이 자려 하였을때, \"아웃스타그램\"에서 내일 가는 \"야구장\"근처의 유명한 \"카페\"를 발견하였다. ");
        t = "nd4-12";
    }

    public void text12(){
        h1.text.setText("주인공: 오, 여기 좋은데? 내일 한번 기회가 되면 여기 가봐야 겠다. 그럼 이제 시간도 늦었는데 자야겠다.");
        t = "nd4-14";
    }

    public void text13(){
        noButton();
        h1.text.setText("주인공: 으... 에이, 뭐 데이트가 뭐 대수라고... 긴장되서 잠도 못잤네. 일단 일어나서 나갈 준비 해야 겠다. 오늘 갈때 어떻게 하고 갈까?");
        t = "nd4-14";
    }

    public void text14(){
        showButton();
        h1.choice1.setText("모자를 쓰고 가야겠다. (호감도+5)");
        h1.choice2.setText("왁스를 바르고 가야 겠다. (호감도-5)");
        c1 = "nd4-15";
        //호감도 +5
        c2 = "nd4-19";
        //호감도-5
    }

    public void text15(){
        noButton();
        h1.text.setText("주인공: 그래, 뭘 갑자기 꾸민다고 왁스를 바르긴 뭘 바르냐, 그냥 평소처럼 모자나 쓰고 가야 겠다. ");
        t = "nd4-16";
    }

    public void text16(){
        h1.text.setText("나레이션: \"주인공\"은 옷을 입고 모자를 쓴 다음에 간단히 옷을 입은 다음 약속장소로 나갔다. 그리고 얼마 지나지 않아 \"고릴라\"가 나왔다.");
        t = "nd4-17";
    }

    public void text17(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 오! 뭐야, \"정모\" 일찍나왔네.");
        t = "nd4-18";
    }

    public void text18(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 나도 방금 나왔어.");
        t = "nd4-29";
    }

    public void text19(){
        noButton();
        h1.text.setText("주인공: 어디보자... 왁스가 어디 있더라...  앗 여기있다. 왁스도 저번에 사놓고 한번도 사용안해봤지만, 뭐 잘 되겠지.");
        t = "nd4-20";
    }

    public void text20(){
        h1.text.setText("나레이션: \"주인공\"이 머리에 왁스를 바르고 시간이 지나고...");
        t = "nd4-21";
    }

    public void text21(){
        h1.text.setText("주인공: 으아악! 머리가 망했다! 왁스를 너무 많이 사용한건가? 이거 어떻게 하지?");
        t = "nd4-22";
    }

    public void text22(){
        h1.text.setText("주인공: 으... 어쩔수 없지. 약속시간에 늦을 것 같기는 하지만, 머리를 감은 다음에 그냥 모자 쓰고 나가야 겠다.");
        t = "nd4-23";
    }

    public void text23(){
        h1.text.setText("나레이션: 그렇게 \"주인공\"은 머리를 깜은 다음에 다시 준비를 하고 약속장소로 향했다.");
        t = "nd4-24";
    }

    public void text24(){
        h1.background.setImageResource(R.mipmap.baseballstadium1);
        h1.text.setText("주인공: 미얀. \"고릴라\"내가 조금 늦었지?");
        t = "nd4-25";
    }

    public void text25(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 음... 약간?");
        t = "nd4-26";
    }

    public void text26(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 어.. 진짜로?");
        t = "nd4-27";
    }

    public void text27(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 뭐, 그래도 약속장소를 헷갈리지 않은게 어디야?");
        t = "nd4-28";
    }

    public void text28(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 미얀.");
        t = "nd4-29";
    }

    public void text29(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 바로 야구나 보러 가자.");
        t = "nd4-30";
    }

    public void text30(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 어, 좋지!");
        t = "nd4-31";
    }

    public void text31(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그나저나, 너 \"하놔 피죤스\" 팬이야?");
        t = "nd4-32";
    }

    public void text32(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 어? \"하놔 피죤스\"라니?");
        t = "nd4-33";
    }

    public void text33(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 아니, 너가 지금 쓰고 있는 모자가 \"하놔 피죤스\" 모자여서 말이야.");
        t = "nd4-34";
    }

    public void text34(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 어... 오! 그... 그럼! 내가 \"하놔 피죤스\"의 팬이거든! 그나저나 이걸 알아보는 너도 \"하놔 피죤스\" 팬인거야?");
        t = "nd4-35";
    }

    public void text35(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 맞아. 나도 \"하놔 피존스\" 팬이야.");
        t = "nd4-36";
    }

    public void text36(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그런데 지금 \"하놔 피죤스\" 순위가 어떻게 되더라?");
        t = "nd4-37";
    }

    public void text37(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 너도 잘 알잖아... 언제나 꼴찌지...");
        t = "nd4-38";
    }

    public void text38(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 아하하... 그... 그렇구나....");
        t = "nd4-39";
    }
    public void text39(){
        h1.choice1.setText("그런데 너는 왜 꼴찌하는 팀을 좋아하는거야?");
        h1.choice2.setText("그래도 오늘 \"하놔 피죤스\"가 이길 수도 있지.");
        h1.choice3.setText("그래도 꼴찌니까 더이상 떨어질때가 없으니 괜찮지 않을까? 뭐, 맘편하게 경기 하면 되잖아.");
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
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그러면 너는 왜 좋아하는데?");
        t = "nd4-41";
    }

    public void text41(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 어?... 나? 아니... 내가 먼저 물어봤으니까 먼저 말해주면 알려줄게.");
        t = "nd4-42";
    }

    public void text42(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 뭐야, 그래. 듣고 웃지마.");
        t = "nd4-43";
    }

    public void text43(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 너가 말하는거 보고.");
        t = "nd4-44";
    }

    public void text44(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 사실, 내가 꼴찌하는 팀을 좋아하는 이유는 계속 팀이 지고 있더라도 끝까지 포기 하지 않고 열심히 하기 때문이야.");
        t = "nd4-45";
    }

    public void text45(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 끝까지 열심히 하기 때문에 좋아한다고?");
        t = "nd4-46";
    }

    public void text46(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 맞아, 조금 창피하긴 하지만 나도 복싱이라는 운동을 하자나.");
        t = "nd4-47";
    }

    public void text47(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 복싱을 할때 이길때도 있지만, 질때도 있거든. 그리고 어느날, 내가 복싱 경기에서 지고 힘들어 하고 있을때 내가 좌절하지 않을 수 있도록 나를 도와주었던게");
        t = "nd4-48";
    }

    public void text48(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 경기에서 지고 있음에도 포기하지 않고 계속 열심히 노력하는 \"하놔 피죤스\" 선수들을 통해 나도 그떄 힘든 시기를 이겨낼 수 있었거든. 그래서 그 이후로 \"하놔 피죤스\"를 좋아해.");
        t = "nd4-49";
    }

    public void text49(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 멋있다...");
        t = "nd4-50";
    }

    public void text50(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 어? 에이... 뭘 그냥 그렇다고. 그러는 너는 왜 좋아하는거야?");
        t = "nd4-51";
    }

    public void text51(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 야, 너 처럼 그런 의미 있는 이야기를 한 다음에 내가 어떻게 말하냐? 창피해서 말 못하지.");
        t = "nd4-52";
    }

    public void text52(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그래도 한번 말해봐");
        t = "nd4-53";
    }

    public void text53(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 뭐... 나중에 기회가 되면 말해 줄게.");
        t = "nd4-54";
    }

    public void text54(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 에이.. 뭘 그리 창피해 하냐.");
        t = "nd4-63";
    }

    public void text55(){//선택지 2
        noButton();
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 맞아. 오늘 이길 수도 있지!");
        t = "nd4-56";
    }

    public void text56(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그래, 우리 희망을 가지고 응원을 하자고!");
        t = "nd4-63";
    }

    public void text57(){//선택지 3
        noButton();
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 뭐야, 너 진심으로 하는 말이야?");
        t = "nd4-58";
    }

    public void text58(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 어? 아니... 나는 그냥 장난으로...");
        t = "nd4-59";
    }

    public void text59(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 장난이라도 그렇게 이야기 하지마.");
        t = "nd4-60";
    }

    public void text60(){
        h1.text.setText("고릴라: 꼴찌니까 마음 편하게 운동을 한다고? 누가 운동을 하는데 있어서 마음 편하게 하냐!");
        t = "nd4-61";
    }

    public void text61(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 미얀, 내가 생각이 조금 짧았어.");
        t = "nd4-62";
    }

    public void text62(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 알면 됬어. 다음에는 조심해줘. 나도 운동 하는 사람으로써 운동 관련해서는 조금 민감해서 말이야.");
        t = "nd4-63";
    }

    public void text63(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 자, 그럼 우리 경기장에 들어가서 경기 보러 가자.");
        t = "nd4-64";
    }

    public void text64(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 어 그래!");
        t = "nd4-65";
    }

    public void text65(){
        h1.text.setText("나레이션: \"주인공\"과 \"고릴라\"는 함께 야구 경기를 보았다.");
        t = "nd4-66";
    }

    public void text66(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 이야~ 재미 있었다!");
        t = "nd4-67";
    }

    public void text67(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그러니까. 게다가 \"하놔 피죤스\"팀이 이기니까 더 좋았어!");
        t = "nd4-68";
    }

    public void text68(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그러니까 말이야! 그나저나 이제 우리 어디 갈까?");
        t = "nd4-69";
    }

    public void text69(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 음... 글쎄... 뭐 생각해 놓은데 있어?");
        t = "nd4-70";
    }

    public void text70(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 이 근처에 유명한 카페가 있다는데 거기갈까?");
        t = "nd4-71";
    }

    public void text71(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 올~ 그런건 언제 알아 봤데? 좋지 그럼 가서 시간좀 보내다 가자.");
        t = "nd4-72";
    }

    public void text72(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("\"나레이션: \"주인공\"과 \"고릴라\"는 함께 카페로 갔다.");
        t = "nd4-73";
    }

    public void text73(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그럼 너는 뭐 먹을래?");
        t = "nd4-74";
    }

    public void text74(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 음... 나는...");
        t = "nd4-75";
    }

    public void text75() {
        h1.choice1.setText("초콜릿 스무디는 어떄?");
        h1.choice2.setText("오곡라떼는 어떄?(호감도+5)");
        h1.choice3.setText("자몽 에이드는 어떄?");
        c1 = c3 = "nd4-76";
        c2 = "nd4-77";
    }

    public void text76(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그래? 그러면 나는 그나마 건강한 오곡라떼를 먹어야 겠다.");
        t = "nd4-78";
    }

    public void text77(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 뭐야? 너도 오곡라떼 좋아해? 나도 좋아하는데!");
        t = "nd4-78";
    }

    public void text78(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 좋아, 그러면 가서 앉아 있어. 내가 가서 주문하고 올게.");
        t = "nd4-79";
    }

    public void text79(){
        h1.text.setText("나레이션: \"주인공\"은 카페에서 음료를 주문하고 가지고 왔다.");
        t = "nd4-80";
    }

    public void text80(){
        h1.text.setText("주인공: 자, 여기 음료수 가져왔어.");
        t = "nd4-81";
    }

    public void text81(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 오, 고마워.");
        t = "nd4-82";
    }

    public void text82(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그런데 나 궁금한게 있는데?");
        t = "nd4-83";
    }

    public void text83(){
        h1.text.setText("고릴라: 뭔데?");
        t = "nd4-84";
    }

    public void text84(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 오늘 왜 나랑 같이 야구장에 가자고 한거야?");
        t = "nd4-85";
    }

    public void text85(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 왜 일꺼 같아?");
        t = "nd4-86";
    }

    public void text86(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그건...");
        t = "nd4-87";
    }

    public void text87(){
        showButton();
        h1.character.setVisibility(View.INVISIBLE);
        h1.choice1.setText("혹시 나한테 관심 있는거야?");
        h1.choice2.setText("내가 시간이 많아 보여서?");
        h1.choice3.setText("내가 운동을 좋아하는것 처럼 보여서?");
        c1 = "nd4-88";
        c2 = "nd4-96";
        c3 = "nd4-101";
    }

    public void text88(){
        noButton();
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 뭐라는거야, 내가 너한테 왜 관심을 가지냐?");
        t = "nd4-89";
    }

    public void text89(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 물론, 내가 매력적이라서?");
        t = "nd4-90";
    }

    public void text90(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 푸하하! 너가 매력적이라고? 요근래 들었던 농담 중에서 가장 웃긴 말이였다. 그러면 너가 생각하는 너의 매력이 뭔데?");
        t = "nd4-91";
    }

    public void text91(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 나의 매력이라... 그건...");
        t = "nd4-92";
    }

    public void text92(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그건?");
        t = "nd4-93";
    }

    public void text93(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: ... ... ...");
        t = "nd4-94";
    }

    public void text94(){
        h1.text.setText("주인공: \"하놔 피죤스\"를 좋아하는거?");
        t = "nd4-95";
    }

    public void text95(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 하하하, 기껏 생각해 낸 매력이 너가 \"하놔 피죤스\"를 좋아한다는 거야? 진짜 웃기다, 너!");
        t = "nd4-104";
    }

    public void text96(){//선택 2
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 확실히 그것도 맞긴 하지. 그나저나 너는 요즘 뭐하면서 지내냐? 계속 집에 있던것 같은데.");
        t = "nd4-97";
    }

    public void text97(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 나? 나는 군대 제대하고 지금은 그냥 쉬고 있어.");
        t = "nd4-98";
    }

    public void text98(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그렇군. 그래서 계속 집에만 있어서 소음을 만들어 내는 거구만");
        t = "nd4-99";
    }

    public void text99(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 앗, 그거는... 내가 앞으로 조심할게.");
        t = "nd4-100";
    }

    public void text100(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 하하, 장난이야! 물론, 조심해주면 나야 좋지만.");
        t = "nd4-104";
    }

    public void text101(){//선택 3
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 너 살도 빠지고, 운동도 열심히 하고 요즘 너 다시 보인다.");
        t = "nd4-102";
    }

    public void text102(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 뭐야, 설마 나한테 반해버린거야? 야레~ 야레~~ 그러면 곤란 하다구~~");
        t = "nd4-103";
    }

    public void text103(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 하하, 성격은 그대로네 ");
        t = "nd4-104";
    }

    public void text104(){//스토리 다시 진행
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그나저나, 너 무슨 걱정 있어?");
        t = "nd4-105";
    }

    public void text105(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 어? 왜? 너는 내가 고민이 있어 보여?");
        t = "nd4-106";
    }

    public void text106(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 음, 오늘 경기 보는데 뭐랄까... 완전히 경기에 집중하지 못하는것 처럼 보이기는 하더라고.");
        t = "nd4-107";
    }

    public void text107(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 흠... 사실, 이제 며칠 뒤면 내가 복싱 시합이 있거든.");
        t = "nd4-108";
    }

    public void text108(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 아 진짜?");
        t = "nd4-109";
    }
    public void text109(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 응...");
        t = "nd4-110";
    }

    public void text110(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그래서 긴장하고 있는 거구나.");
        t = "nd4-111";
    }

    public void text111(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 맞아, 그것때문에 계속 긴장이 되고 그렇네.");
        t = "nd4-112";
    }

    public void text112(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그래도 걱정하지마.");
        t = "nd4-113";
    }

    public void text113(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 뭐야, \"정모\" , 너 주제에 위로해주는 거야?");
        t = "nd4-114";
    }

    public void text114(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그야 그동안 많이 노력 했을 거잖아. 노력한 만큼 결실을 이루어 낼 거라고.");
        t = "nd4-115";
    }

    public void text115(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그러니 너무 걱정하지 말고, 지금껏 너가 한 노력을 믿으라고!");
        t = "nd4-116";
    }

    public void text116(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그래, 고맙다. 덕분에 조금 나아진것 같아. ");
        t = "nd4-117";
    }

    public void text117(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 혹시 괜찮으면, 내가 너 복싱하는 날 가서 응원해도 괜찮아?");
        t = "nd4-118";
    }

    public void text118(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 어?... 응원 이라고?");
        t = "nd4-119";
    }

    public void text119(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그래, 응원. 혹시 모르자나. 내가 응원가면 오늘\"하놔 피죤스\" 처럼 승리할 수도.");
        t = "nd4-120";
    }

    public void text120(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 흠, 확실히 그럴 수도 있겠네");
        t = "nd4-121";
    }

    public void text121(){
        h1.character.setVisibility(View.INVISIBLE);
        h1.text.setText("주인공: 그러면 나 응원하러 가도 되?");
        t = "nd4-122";
    }

    public void text122(){
        h1.character.setVisibility(View.VISIBLE);
        h1.text.setText("고릴라: 그래, 그날 시간 되면 한번 와봐.");
        t="s41";
    }


    //후배4
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

        c1 = "s430";
        c2 = "s432";
        c3 = "s434";
        c4 = "s436";
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

        c1 = "s465";
        c2 = "s471";
        c3 = "s477";
        c4 = "s482";
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

        c1 = "s4128";
        c2 = "s4128";
        c3 = "s4129";
        c4 = "s4128";
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

        c1 = "s4234";
        c2 = "s4234";
        c3 = "s4234";
        c4 = "s4234";
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

        c1 = "s378a";
        c2 = "s378b";
        c3 = "s378c";
        c4 = "s378d";
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

        c1 = "s4273";
        c2 = "s4274";
        c3 = "s4275";
        c4 = "s4277";
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
        t = "h51";

    }


    //간호사5

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
        t="n50";
    }


    //동창5
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
        t="s50";
    }


    //후배5

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

}

