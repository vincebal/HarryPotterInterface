package example;


import com.example.harrypotterinterface.WindowTalk;

import java.util.Scanner;

public enum Pet{
        OWL,
        RAT ,
        CAT,
        TOAD;
    public static Pet ChoosePet() {



        String choosePet = WindowTalk.askForString("YOU HAVE TO CHOSE A PET FOR YOUR STUDY BETWEEN:\n" +
                "OWL\n" +
                "RAT\n" +
                "CAT\n" +
                "TOAD\n");
        Pet resultPet = null;
        for (Pet pet : values()){
            if (pet.name().equalsIgnoreCase(choosePet)){
                WindowTalk.printInWindow("YOU CHOOSE : " + choosePet + " !");
                resultPet = pet;
                break;
            }
        }
        return resultPet;
    }}

