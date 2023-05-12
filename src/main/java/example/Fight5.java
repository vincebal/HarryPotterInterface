package example;


import java.util.Random;
import java.util.Scanner;
public class Fight5 {
    public static final String RESET = "\033[0;0m";   // RESET
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static void fight5(Wizzard mywizard){
        int choixsorcier;
        int nombrerandom;


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        Enemy Dolores_Ombrage = Enemy.builder()
                .firstname("Dolores Ombrage")
                .healthPointNow(2500)
                .build();




        System.out.println(BLACK + "Level 5" + RESET);
        System.out.println("==============================================================================================================================");
        Text.printWithDelay("Harry Potter stood firm, his wand at the ready, as Voldemort and Peter Pettigrew approached him. \n" +
                "There were no witnesses to this encounter - no friends to back him up, no cheering crowds to give him courage.\n" +
                " It was just him against two of the most powerful and evil wizards in the world.");
        Text.printWithDelay("\"You know what we're here for, Potter,\" Voldemort hissed. \"You will surrender yourself to us, or face the consequences.\"");
        Text.printWithDelay("But Harry didn't flinch. \"I'm not going anywhere with you,\" he replied, his voice steady. \"I know what you stand for, and I won't be a part of it.\"");
        Text.printWithDelay("Pettigrew sneered. \"You'll regret that decision, Potter. You may have defeated us before, but we've only grown stronger since then.\"\n" +
                "\n" +
                "Harry tightened his grip on his wand. \"I'm not afraid of you,\" he said. \"I have something you'll never have - something more powerful than any spell. I have love, and that's what will ultimately defeat you.\"");
        System.out.println("==============================================================================================================================");


        System.out.println("May the best win !");
        System.out.println();
        Spell Attack_Dolores =Spell.Attack_Dolores();
        Spell Wingardium_Leviosa =Spell.Wingardium_Leviosa();
        Spell Expecto_Patronum = Spell.Expecto_Patronum();




        while (mywizard.getHealthPointNow() > 0 && Dolores_Ombrage.getHealthPointNow() > 0 ) {
            System.out.println(GREEN + "Dolores's life :" + Dolores_Ombrage.getHealthPointNow() + RESET);
            System.out.println(RED + "Wizzard's life :" + mywizard.getHealthPointNow()+ RESET);


//Paramètre à choisir dans la console
            System.out.println("Choose between:\n" +
                    "1: Exepcto Patronum \n" +
                    "2: Defend\n" +
                    "3: Wingardium Leviosa");
            //attaques ou défense du sorcier

            choixsorcier = scanner.nextInt();

            if (choixsorcier == 1){
                boolean randomsucces = mywizard.useSpell(Expecto_Patronum,Dolores_Ombrage);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You touch Dolores with Expecto Patronum!");

                }
                else{
                    System.out.println("You miss your spell...");
                }
            }
            if (choixsorcier == 2){
                mywizard.defense(150);
                System.out.println(BLUE + "You decided to defend!");
            }
            if (choixsorcier == 3){
                boolean randomsucces = mywizard.useSpell(Wingardium_Leviosa,Dolores_Ombrage);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You've succeeded to touch Dolores with Windgardium Leviosa!");

                }
                else{
                    System.out.println("You miss...");
                }
            }



            nombrerandom = (int) (random.nextInt(2))+1;
            //attaque ou défense du troll
            if (nombrerandom == 1){
                Enemy.useSpell(Attack_Dolores, mywizard);
                System.out.println(BLACK + "Dolores decided to attack and put" + Attack_Dolores.getDamage() + " damage ouch!");
            }
            if (nombrerandom == 2){
                Dolores_Ombrage.defense(30);
                System.out.println(BLACK + "Dolores decided to defend");
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
            System.out.println(PURPLE + "You've won the fireworks CONGRATULATIONS!");
        }


    }



}
