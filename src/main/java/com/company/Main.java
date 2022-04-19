package com.company;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.company.enums.AviaCategory;
import com.company.enums.ShipsCategory;
import com.company.enums.WeaponsCategory;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    static public void main(String[] args) {

        LOGGER.info("Application started");

        Conscripts conscripts1 = new Conscripts("Darius", "Raj", "Kobulyanska street", "+38099425262779", 2000, true);
        Conscripts conscripts2 = new Conscripts("Brandon", "Debonair", "Golovna street", "+380669232110", 1998, false);
        AirForce airForce = new AirForce("Air Force", 120, 4, "Aviation");
        LandMilitary landMilitary = new LandMilitary("LandMilitary", 120, 4, "tanks");
        MarineCorps marineCorps = new MarineCorps("Marine Corps", 120, 4, "warships");
        MilitaryMedicine medicine = new MilitaryMedicine("Medicine", "service", 40, 3, "ambulances", "surgeon");
        AirMarshal airMarshal1 = new AirMarshal("Air Force", "Air Marshal", "senior officers", "3 stars", "infantry");
        AirMarshal airMarshal2 = new AirMarshal("Air Force", "Vice Air Marshal", "senior officers", "3 stars with sign", "infantry");
        Admiral admiral1 = new Admiral("Land Military", "Admiral", "Senior officers", "4 strips", "Fast");
        Admiral admiral2 = new Admiral("Marine Corps", "Admiral", "Senior officers", "4 strips", "Platoon");
        General general1 = new General("Land Military", "General", "senior officers", "4 stars with sign", "Post");
        General general2 = new General("Marine Corps", "General", "senior officers", "4 stars with sign", "Crew");
        Major major1 = new Major("Land Military", "Major", "senior officers", "1 star", "Post");
        Major major2 = new Major("Avia Force", "Major-General", "senior officers", "1 star", "Crew");
        OfficerCadet officerCadet1 = new OfficerCadet("Land Military", "OfficerCadet", "ordinary", "K", "squadron");
        OfficerCadet officerCadet2 = new OfficerCadet("Marine Corps", "OfficerCadet", "ordinary", "K", "squadron");
        Midshipman midshipman = new Midshipman("Marine Corps", "Sailor", "ordinary", "anchor ", "Squadron");
        Lieutenant lieutenant1 = new Lieutenant("Land Military", "Lieutenant", "junior officers", "2 stars ", "Post");
        Lieutenant lieutenant2 = new Lieutenant("Air Force", "Flight Lieutenant", "junior officers", "2 stars", "Crew");
        Captain captain1 = new Captain("Air Force", "Captain", "junior officers", "4 stars", "crew");
        Captain captain2 = new Captain("Marine Corps", "Captain", "junior officers", "4 stars", "crew");
        ArmoredCarriers armoredCarriers1 = new ArmoredCarriers("БТР-4K", "Armored reconnaissance vehicle", "BM-7 <<Sail>>", 100, 690);
        ArmoredCarriers armoredCarriers2 = new ArmoredCarriers("БММ-4С", "armored medical machine", "BTR-4MV", 30, 500);
        Tanks tanks1 = new Tanks("Т-64БВ", "Main battle tank", 50, 110);
        Tanks tanks2 = new Tanks("Т-80", "hard", 70, 75);
        InfantryWeapons infantryWeapons1 = new InfantryWeapons("ВТ APR308", WeaponsCategory.HANDGUN, 50, 62);
        InfantryWeapons infantryWeapons2 = new InfantryWeapons("AK-47", WeaponsCategory.RIFLES, 150, 5);
        InfantryWeapons infantryWeapons3 = new InfantryWeapons("M60 Camerton", WeaponsCategory.SHOTGUN, 70, 60);
        Aviation aviation1 = new Aviation("2А60", AviaCategory.BOMBING, 60, 152);
        Aviation aviation2 = new Aviation("AA-30", AviaCategory.FIGHTER, 80, 90);
        Aviation aviation3 = new Aviation("MK-30", AviaCategory.ASSAULT, 30, 100);
        Gun gun1 = new Gun("2А65 «Мста-Б»", "Main battle tank", 60, 152);
        Gun gun2 = new Gun("Д-30", "МТ-12 Рапіра", 30, 122);
        Warships warships1 = new Warships("М361«Balta»", ShipsCategory.DIVING, 40, 27000);
        Warships warships2 = new Warships("P170«Skadovsk»", ShipsCategory.HOSPITAL, 60, 70000);
        Warships warships3 = new Warships("A500«Dombas»", ShipsCategory.COMBAT, 80, 17000);
        Warships warships4 = new Warships("P170«Skadovsk»", ShipsCategory.PURPOSE, 60, 70000);
        Warships warships5 = new Warships("A500«Dombas»", ShipsCategory.HYDRO, 80, 17000);

        System.out.println("Conscripts\n");
        System.out.println(conscripts1);
        System.out.println(conscripts2);

        System.out.println("\nArmy\n");
        System.out.println(airForce);
        System.out.println(landMilitary);
        System.out.println(marineCorps);
        System.out.println(medicine);

        System.out.println("\nRank\n");
        System.out.println(airMarshal1);
        System.out.println(airMarshal2);
        System.out.println(admiral1);
        System.out.println(admiral2);
        System.out.println(general1);
        System.out.println(general2);
        System.out.println(major1);
        System.out.println(major2);
        System.out.println(officerCadet1);
        System.out.println(officerCadet2);
        System.out.println(midshipman);
        System.out.println(lieutenant1);
        System.out.println(lieutenant2);
        System.out.println(captain1);
        System.out.println(captain2);

        System.out.println("\nEquipment\n");
        System.out.println(armoredCarriers1);
        System.out.println(armoredCarriers2);
        System.out.println(tanks1);
        System.out.println(tanks2);
        System.out.println(aviation1);
        System.out.println(aviation2);
        System.out.println(aviation3);
        System.out.println(tanks2);
        System.out.println(infantryWeapons1);
        System.out.println(infantryWeapons2);
        System.out.println(infantryWeapons3);
        System.out.println(gun1);
        System.out.println(gun2);
        System.out.println(warships1);
        System.out.println(warships2);
        System.out.println(warships3);
        System.out.println(warships4);
        System.out.println(warships5);

      LOGGER.info("Total Conscripts: " + Conscripts.totalConscripts);
      LOGGER.info("Application finished");
    }
}
















