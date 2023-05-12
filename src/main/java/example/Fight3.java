package example;

import java.util.Random;
import java.util.Scanner;

public class Fight3 {
    // Regular Colors
    public static final String RESET = "\033[0;0m";   // RESET
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static void fight3(Wizzard mywizard){
        int choixsorcier;
        int nombrerandom;


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        //Paramètre à choisir dans la console



        Enemy dementor = Enemy.builder()
                .firstname("Dementors")
                .healthPointNow(1500)
                .build();


        System.out.println(BLACK + "Level 3" + RESET);
        System.out.println("==============================================================================================================================");

        Text.printWithDelay("Harry Potter stood before the Dementor, his wand at the ready. The creature's presence was suffocating, and Harry could feel its cold tendrils of fear creeping up his spine.\n " +
                " \"I have come for your soul,\" the Dementor hissed, its voice cold and empty.\n " +
                " But Harry refused to back down. \"You won't get it,\" he replied, his voice firm. \"I won't let you take me.\"\n" +
                " The Dementor loomed closer, its hooded face inches from Harry's own. \"You cannot escape me,\" it said, its voice like a winter breeze. \"Your fear will be your undoing.\"\n " +
                " Harry took a deep breath, his wand glowing with a sudden burst of light. \"I am not afraid of you,\" he said, his voice steady. \"I have faced darkness before, and I will face it again. \n" +
                "You may try to take my soul, but you won't succeed.\" \n" +
                "The Dementor hissed in response, its ragged cloak flapping in an icy wind.\n " +
                " But Harry stood his ground, ready to face whatever challenges lay ahead.");
        System.out.println("May the best win !");
        System.out.println();

        System.out.println("==============================================================================================================================");

        Spell Attack_Dementor =Spell.Attack_Dementor();
        Spell Wingardium_Leviosa =Spell.Wingardium_Leviosa();
        Spell Expecto_Patronum = Spell.Expecto_Patronum();



        while (mywizard.getHealthPointNow() > 0 && dementor.getHealthPointNow() > 0) {
            System.out.println(GREEN + "Dementor's life :" + dementor.getHealthPointNow() + RESET);
            System.out.println(RED + "Wizzard's life :" + mywizard.getHealthPointNow()+ RESET);



            System.out.println("Choose between:\n" +
                    "1: Attack with Wingardium Leviosa.\n" +
                    "2: Defend\n" +
                    "3: Exepcto Patronum");
            //attaques ou défense du sorcier

            choixsorcier = scanner.nextInt();

            if (choixsorcier == 1){
                boolean randomsucces = mywizard.useSpell(Wingardium_Leviosa, dementor);
                if(randomsucces == true) {
                    System.out.println(BLUE + "You attack and put " + Wingardium_Leviosa.getDamage() + " damage!");
                }
                else{
                    System.out.println("You miss your spell...");
                }
            }
            if (choixsorcier == 2){
                mywizard.defense(100);
                System.out.println(BLUE + "You decided to defend!");
            }
            if (choixsorcier == 3){
                boolean randomsuccess = mywizard.useSpell(Expecto_Patronum, dementor);
                if(randomsuccess == true){
                    System.out.println(BLUE + "You attack and put " + Expecto_Patronum.getDamage() + " damage!");
                }
                else{
                    System.out.println((BLUE + "You miss your spell..."));
                }
            }


            nombrerandom = (int) (random.nextInt(2))+1;
            //attaque ou défense du détraqueur
            if (nombrerandom == 1){
                Enemy.useSpell(Attack_Dementor, mywizard);
                System.out.println(BLACK + "The dementor decided to attack and put" + Attack_Dementor.getDamage() + " damage ouch!");
            }
            if (nombrerandom == 2){
                dementor.defense(5);
                System.out.println(BLACK + "The dementor decided to defend");
            }


        }
        if (mywizard.getHealthPointNow() <= 0){
            mywizard.setIsalive(false);
            System.out.println("Game Over, try again!");
        }
        else{
            mywizard.setIsalive(true);
            mywizard.addhp(100);
            System.out.println(BLUE +
                    "You win, you're a boss!");
        }


    }
}



