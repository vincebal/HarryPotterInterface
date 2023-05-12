package example;

import java.util.Random;
import java.util.Scanner;

public class Fight7 {
    public static final String RESET = "\033[0;0m";   // RESET
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE

    public static void fight7(Wizzard mywizard){
        int choixsorcier;
        int nombrerandom;
        int choixSerpentard;


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        Enemy Voldemort_Prime = Enemy.builder()
                .firstname("Voldemort Prime")
                .healthPointNow(4000)
                .build();

        Enemy Bellatrix_Lestrange = Enemy.builder()
                .firstname("Bellatric Lesrange")
                .healthPointNow(1000)
                .build();




        System.out.println(BLACK + "Level 7" + RESET);
        System.out.println("==============================================================================================================================");
        Text.printWithDelay("Harry Potter: Voldemort, Bellatrix, we don't need to do this. It's not too late to turn back and choose a different path.\n" +
                "\n" +
                "Voldemort: It's too late for that, Potter. You've chosen to stand against me, and you will suffer the consequences.\n" +
                "\n" +
                "Bellatrix: Yes, Harry, you should have joined us. You would have been so powerful.\n" +
                "\n" +
                "Harry Potter: I'll never join you, Bellatrix. You and Voldemort are wrong. Your path leads only to destruction.\n" +
                "\n" +
                "Voldemort: Your words are meaningless, Potter. You will die today, and your death will be a warning to all those who oppose me.\n" +
                "\n" +
                "Bellatrix: We'll make sure your death is slow and painful, Harry. You'll regret ever crossing us.\n" +
                "\n" +
                "Harry Potter: I won't regret standing up for what's right. And even if I die today, I know I'll have done the right thing. I won't let you destroy everything I love.");
        System.out.println("==============================================================================================================================");


        System.out.println("May the best win !");
        System.out.println();


        Spell Wingardium_Leviosa =Spell.Wingardium_Leviosa();
        Spell Expecto_Patronum = Spell.Expecto_Patronum();
        Spell Sectumsempra = Spell.Sectumsempra();
        Spell Expelliarmus = Spell.Expelliarmus();


        Spell Attack_Bellatrix_Lestrange = Spell.Attack_Bellatrix_Lestrange();
        Spell Attack_Voldemort_prime = Spell.Attack_Voldemort_prime();




        while (mywizard.getHealthPointNow() > 0 && Voldemort_Prime.getHealthPointNow() > 0 && Bellatrix_Lestrange.getHealthPointNow() > 0 ) {
            System.out.println(GREEN + "Voldemort prime's life :" + Voldemort_Prime.getHealthPointNow() + RESET);
            System.out.println(GREEN + "Bellatrix Lestrange's life :" + Bellatrix_Lestrange.getHealthPointNow() + RESET);

            System.out.println(RED + "Wizzard's life :" + mywizard.getHealthPointNow()+ RESET);


//Paramètre à choisir dans la console
            System.out.println("Choose between:\n" +
                    "On Voldemort:\n" +
                    "1: Exepcto Patronum \n" +
                    "2: Defend\n" +
                    "3: Wingardium Leviosa\n" +
                    "4: Sectumsempra\n" +
                    "5: Expelliarmus\n" +

                    "On Bellatrix Lestrange\n" +
                    "6: Expecto Patronum\n" +
                    "7: Windgardium Leviosa\n" +
                    "8: Sectumsempra\n" +
                    "9: Expelliarmus" );
            //attaques ou défense du sorcier

            choixsorcier = scanner.nextInt();

            if (choixsorcier == 1){
                boolean randomsucces = mywizard.useSpell(Expecto_Patronum,Voldemort_Prime);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You touch Voldemort with Expecto Patronum!");

                }
                else{
                    System.out.println("You miss your spell...");
                }
            }
            if (choixsorcier == 2){
                mywizard.defense(200);
                System.out.println(BLUE + "You decided to defend!");
            }
            if (choixsorcier == 3){
                boolean randomsucces = mywizard.useSpell(Wingardium_Leviosa,Voldemort_Prime);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You've succeeded to touch Voldemort with Windgardium Leviosa !");

                }
                else{
                    System.out.println("You miss...");
                }
            }
            if(choixsorcier == 4){
                boolean randomsucces = mywizard.useSpell(Sectumsempra,Voldemort_Prime);
                if(randomsucces == true) {
                    System.out.println(BLUE + "You've succeeded to touch Voldemort with Sectumsempra!");

                }
                else{
                    System.out.println("You miss...");
                }
            }
            if(choixsorcier == 5){
                boolean randomsucces = mywizard.useSpell(Expelliarmus,Voldemort_Prime);
                if(randomsucces == true){
                    System.out.println(BLUE + "You've succeeded to touch Voldemort with Expelliarmus!");
                }
            }
            if (choixsorcier == 6){
                boolean randomsucces = mywizard.useSpell(Expecto_Patronum,Bellatrix_Lestrange);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You touch Bellatrix with Expecto Patronum!");

                }
                else{
                    System.out.println("You miss your spell...");
                }
            }

            if (choixsorcier == 7){
                boolean randomsucces = mywizard.useSpell(Wingardium_Leviosa,Bellatrix_Lestrange);

                if(randomsucces == true) {
                    System.out.println(BLUE + "You've succeeded to touch Bellatrix with Windgardium Leviosa !");

                }
                else{
                    System.out.println("You miss...");
                }
            }
            if(choixsorcier == 8){
                boolean randomsucces = mywizard.useSpell(Sectumsempra,Bellatrix_Lestrange);
                if(randomsucces == true) {
                    System.out.println(BLUE + "You've succeeded to touch Bellatrix with Sectumsempra!");

                }
                else{
                    System.out.println("You miss...");
                }
            }
            if(choixsorcier == 9){
                boolean randomsucces = mywizard.useSpell(Expelliarmus,Bellatrix_Lestrange);
                if(randomsucces == true){
                    System.out.println(BLUE + "You've succeeded to touch Bellatrix with Expelliarmus!");
                }
            }



            nombrerandom = (int) (random.nextInt(4))+1;
            //attaque ou défense de Voldemort ou de Bellatrix
            if (nombrerandom == 1){
                Enemy.useSpell(Spell.Attack_Voldemort_prime(), mywizard);
                System.out.println(BLACK + "Voldemort decided to attack and put" + Attack_Voldemort_prime.getDamage() + " damage ouch!");
            }
            if (nombrerandom == 2){
                Voldemort_Prime.defense(30);
                System.out.println(BLACK + "Voldemort decided to defend");
            }
            if (nombrerandom == 3){
                Enemy.useSpell(Spell.Attack_Bellatrix_Lestrange(), mywizard);
                System.out.println(BLACK + "Bellatrix decided to attack and put" + Attack_Voldemort_prime.getDamage() + " damage ouch!");
            }
            if (nombrerandom == 4){
                Bellatrix_Lestrange.defense(30);
                System.out.println(BLACK + "Bellatrix decided to defend");
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
                    "You win, you're a boss!\n" +
                    "IT'S THE END OF THE PARTY YOU WIN THE GAME!!!" );

        }


    }


}
