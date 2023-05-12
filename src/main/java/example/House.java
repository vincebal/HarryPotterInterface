package example;

import com.example.harrypotterinterface.WindowTalk;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Scanner;
@Getter
@AllArgsConstructor

    public enum House {
        GRYFFONDOR,
        SERDAIGLE,
        SERPENTARD,
        PUDDLEMERE;

    public static House ChooseHouse() {

        String chooseHouse = WindowTalk.askForString("YOU HAVE TO CHOSE A HOUSE FOR YOUR STUDY BETWEEN:\n" +
                "GRYFFONDOR\n" +
                "SERDAIGLE\n" +
                "SERPENTARD\n" +
                "PUDDLEMERE\n");

        House resultHouse = null;
        for (House house : values()){
            if (house.name().equalsIgnoreCase(chooseHouse)){
                WindowTalk.printInWindow("YOU CHOOSE THE HOUSE: " + chooseHouse + " I WISH YOU ALL THE BEST IN OUR SCHOOL!");
                resultHouse = house;
                break;
            }
        }
        return resultHouse;
    }}






