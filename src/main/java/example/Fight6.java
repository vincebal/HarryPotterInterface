package example;
import java.util.Random;
import java.util.Scanner;

public class Fight6 {
    public static final String RESET = "\033[0;0m";   // RESET
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static void fight6(Wizzard mywizard){
        int choixsorcier;
        int nombrerandom;
        int choixSerpentard;


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        Enemy Death_Eater = Enemy.builder()
                .firstname("Death Eater")
                .healthPointNow(3500)
                .build();




        System.out.println(BLACK + "Level 6" + RESET);
        System.out.println("==============================================================================================================================");
        Text.printWithDelay("Harry Potter: \"I'm not afraid of you, Death Eater. You and your kind have caused enough pain and suffering. It's time to put an end to it.\"\n" +
                "\n" +
                "Death Eater: \"You're a fool, Potter. You have no idea what you're up against. You can't stop us.\"\n" +
                "\n" +
                "Harry Potter: \"I may not be able to stop all of you, but I can certainly stop you. You underestimate me, and that will be your downfall.\"\n" +
                "\n" +
                "Death Eater: \"You may have defeated some of us in the past, but you won't defeat me. I am more powerful than you can imagine.\"\n" +
                "\n" +
                "Harry Potter: \"We'll see about that. I'm not just fighting for myself, but for everyone who has suffered because of your actions. This ends now.\"\n" +
                "\n" +
                "Death Eater: \"Very well, Potter. Let's see if you're as good as you think you are.\"");
        System.out.println("==============================================================================================================================");


        System.out.println("May the best win !");
        System.out.println();


        Spell Wingardium_Leviosa =Spell.Wingardium_Leviosa();
        Spell Expecto_Patronum = Spell.Expecto_Patronum();
        Spell Sectumsempra =Spell.Sectumsempra();

        Spell Attack_Death_Eater = Spell.Attack_Death_Eater();

        if (mywizard.getHouse() == House.SERPENTARD){
            System.out.println("Do you want to join the death eater?\n" +
                    "1: oui\n" +
                    "2: non");

            choixSerpentard = scanner.nextInt();
            if(choixSerpentard ==1){
                System.out.println("You choose to join the death eater!");
                System.out.println("The game is finish and you choose the darkness!");
                mywizard.setHealthPointNow(0);
            }
            if(choixSerpentard == 2){
                System.out.println("You choose to continue the fight against death eater!");

            }
        }






        while (mywizard.getHealthPointNow() > 0 && Death_Eater.getHealthPointNow() > 0 ) {
            System.out.println(GREEN + "Death eater's life :" + Death_Eater.getHealthPointNow() + RESET);
            System.out.println(RED + "Wizzard's life :" + mywizard.getHealthPointNow()+ RESET);


//Paramètre à choisir dans la console
            System.out.println("Choose between:\n" +
                    "1: Exepcto Patronum \n" +
                    "2: Defend\n" +
                    "3: Wingardium Leviosa\n" +
                    "4: Sectumsempra");
            //attaques ou défense du sorcier

            choixsorcier = scanner.nextInt();

            if (choixsorcier == 1){
                boolean randomsucces = mywizard.useSpell(Expecto_Patronum,Death_Eater);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You touch Death eater with Expecto Patronum!");

                }
                else{
                    System.out.println("You miss your spell...");
                }
            }
            if (choixsorcier == 2){
                mywizard.defense(170);
                System.out.println(BLUE + "You decided to defend!");
            }
            if (choixsorcier == 3){
                boolean randomsucces = mywizard.useSpell(Wingardium_Leviosa,Death_Eater);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You've succeeded to touch Death Eater with Windgardium Leviosa !");

                }
                else{
                    System.out.println("You miss...");
                }
            }
            if(choixsorcier == 4){
                boolean randomsucces = mywizard.useSpell(Sectumsempra,Death_Eater);
                if(randomsucces == true) {
                    System.out.println(BLUE + "You've succeeded to touch Death Eater with Sectumsempra!");

                }
                else{
                    System.out.println("You miss...");
                }
            }



            nombrerandom = (int) (random.nextInt(2))+1;
            //attaque ou défense du mangemort
            if (nombrerandom == 1){
                Enemy.useSpell(Spell.Attack_Death_Eater(), mywizard);
                System.out.println(BLACK + "Death eater decided to attack and put" + Attack_Death_Eater.getDamage() + " damage ouch!");
            }
            if (nombrerandom == 2){
                Death_Eater.defense(30);
                System.out.println(BLACK + "Death eater decided to defend");
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
