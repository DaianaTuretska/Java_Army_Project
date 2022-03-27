package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Conscripts\n");
        Conscripts s1=new Conscripts("Darius","Raj","Kobulyanska street", "+38099425262779",2000, true);
        Conscripts s2=new Conscripts("Brandon","Debonair","Golovna street", "+380669232110",1998, false);
        AirForce s3 = new AirForce("Air Force", 120, 4, "Aviation");
        LandMilitary s4 = new LandMilitary("LandMilitary", 120, 4, "tanks");
        MarineCorps s5 = new MarineCorps("Marine Corps", 120, 4, "warships");
        MilitaryMedicine s8 = new MilitaryMedicine("Medicine", "service", 40, 3, "ambulances", "surgeon");
        AirMarshal s6 = new AirMarshal("Air Force", "Air Marshal", "senior officers", "3 stars", "infantry");
        AirMarshal s7 = new AirMarshal("Air Force", "Vice Air Marshal", "senior officers", "3 stars with sign", "infantry");
        Admiral s9 = new Admiral("Land Military", "Admiral", "Senior officers", "4 strips", "Fast");
        Admiral s10 = new Admiral("Marine Corps", "Admiral", "Senior officers", "4 strips", "Platoon");
        General s11 = new General("Land Military", "General", "senior officers", "4 stars with sign", "Post");
        General s12= new General("Marine Corps", "General", "senior officers", "4 stars with sign", "Crew");
        Major s13 = new Major("Land Military", "Major", "senior officers", "1 star", "Post");
        Major s14 = new Major("Avia Force", "Major-General", "senior officers", "1 star", "Crew");
        OfficerCadet s15 = new OfficerCadet("Land Military", "OfficerCadet", "ordinary", "K", "squadron");
        OfficerCadet s16 = new OfficerCadet("Marine Corps", "OfficerCadet", "ordinary", "K", "squadron");
        Midshipman s17 = new Midshipman("Marine Corps", "Sailor", "ordinary", "anchor ", "Squadron");
        Lieutenant s18 = new Lieutenant("Land Military", "Lieutenant", "junior officers", "2 stars ", "Post");
        Lieutenant s19 = new Lieutenant("Air Force", "Flight Lieutenant", "junior officers", "2 stars", "Crew");
        Captain s20 = new Captain("Air Force", "Captain", "junior officers", "4 stars", "crew");
        Captain s21 = new Captain("Marine Corps", "Captain", "junior officers", "4 stars", "crew");
        ArmoredCarriers s22 = new ArmoredCarriers("БТР-4K", "Armored reconnaissance vehicle", "BM-7 <<Sail>>", 100, 690);
        ArmoredCarriers s23 = new ArmoredCarriers("БММ-4С", "armored medical machine", "BTR-4MV", 30, 500);
        Tanks s24 = new Tanks("Т-64БВ", "Main battle tank", 50, 110);
        Tanks s25 = new Tanks("Т-80", "hard", 70, 75);
        InfantryWeapons s26 = new InfantryWeapons("ВТ APR308", "sniper rifle", 50, 62);
        InfantryWeapons s27 = new InfantryWeapons("AK-47", "machine rifle", 150, 5);
        InfantryWeapons s28 = new InfantryWeapons("M60 Camerton", "machine rifle", 70, 60);
        Gun s29 = new Gun("2А65 «Мста-Б»", "Main battle tank", 60, 152);
        Gun s30 = new Gun("Д-30", "МТ-12 Рапіра", 30, 122);
        Warships s31 = new Warships("М361«Balta»", "Minelayer", 40, 27000);
        Warships s32 = new Warships("P170«Skadovsk»", "Patrol boat", 60, 70000);
        Warships s33 = new Warships("A500«Dombas»", "Control ship", 80, 17000);
        System.out.println(s1);System.out.println(s2);System.out.println("\nArmy\n");System.out.println(s3);System.out.println(s4);System.out.println(s5);System.out.println("\nRank\n");System.out.println(s6);System.out.println(s7);System.out.println(s8);System.out.println(s9);System.out.println(s10);
        System.out.println(s11);System.out.println(s12);System.out.println(s13);System.out.println(s14);System.out.println(s15);System.out.println(s16);System.out.println(s17);System.out.println(s18);System.out.println(s19);System.out.println(s20);
        System.out.println(s21);System.out.println("\nEquipment\n");System.out.println(s22);System.out.println(s23);System.out.println(s24);System.out.println(s25);System.out.println(s26);System.out.println(s27);System.out.println(s28);System.out.println(s29);System.out.println(s30);
    }
}
















