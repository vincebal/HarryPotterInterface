package example;

import lombok.Data;

import java.util.Random;
import java.util.Scanner;

@Data
public class Fight2 {

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

    public static void fight2(Wizzard mywizzard) {

        int choixsorcier;
        int nombrerandom;
        boolean isalive;

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();


        //On fait évolouer notre sorcier


        Enemy basilic = Enemy.builder()
                .firstname("Basilic")
                .healthPointNow(1200)
                .build();


        System.out.println(BLACK + "Level 2" + RESET);
        System.out.println("==============================================================================================================================");

        Text.printWithDelay("The air was thick with tension as Harry Potter and the Basilisk stood face to face, alone in the Chamber of Secrets.\n " +
                " The darkness of the chamber seemed to amplify the hissing of the serpent, making it sound more sinister than ever.\n " +
                " Harry took a deep breath and tightened his grip on his wand. \"This ends here, Basilisk,\" he said, his voice firm. \n " +
                "The Basilisk lunged forward, its massive jaws snapping shut just inches from Harry's face. \n " +
                "Harry dodged and sent a powerful spell toward the serpent, but the Basilisk was too quick. \n " +
                "It slithered out of the way and countered with a blast of venomous saliva.\n " +
                " Harry barely managed to block the attack, his wand glowing with a protective shield. \n " +
                "He knew he had to act fast if he wanted to defeat the Basilisk. He could feel the venom burning through his shield and knew he wouldn't be able to hold it for long.\n " +
                " He dodged another attack from the Basilisk and sent a spell toward one of the chamber's stone pillars.\n " +
                " The spell hit its target, and the pillar began to crumble, sending chunks of rock raining down on the serpent. \n " +
                "The Basilisk roared in anger and lunged forward again, but this time Harry was ready. \n " +
                "He had anticipated the move and sent a powerful spell toward the serpent's eyes. The spell hit its target, and the Basilisk let out a terrible scream, thrashing wildly in agony.\n " +
                " With one final, powerful spell, Harry struck the killing blow, and the Basilisk slumped to the ground, dead. \n " +
                "Harry breathed a sigh of relief, his heart pounding with the adrenaline of the fight. He knew he had won, but the cost had been high. He had faced the Basilisk alone, with no one to witness his victory.\n " +
                " But Harry didn't need an audience to know that he had triumphed over evil once again. He straightened his shoulders and took one last look at the serpent before turning and walking out of the chamber, ready to face whatever challenges lay ahead.");


        System.out.println("==============================================================================================================================");

        if (mywizzard.getHouse() == House.GRYFFONDOR) { //On fait un séparaison pour utiliser l'épé

            System.out.println("A fight is begining between a wizzard and Basilic!");
            System.out.println(RED + "May the best win !" + RESET);
            System.out.println();

            Spell Attack_Troll = Spell.Attack_Troll();
            Spell Wingardium_Leviosa = Spell.Wingardium_Leviosa();
            Spell Sword_of_Godric_Gryffindor = Spell.Sword_of_Godric_Gryffindor();
            Spell Attack_Basilic = Spell.Attack_Basilic();


            while (mywizzard.getHealthPointNow() > 0 && basilic.getHealthPointNow() > 0) {
                System.out.println(GREEN + "Basilic's life :" + basilic.getHealthPointNow() + RESET);
                System.out.println(RED + "Wizzard's life :" + mywizzard.getHealthPointNow() + RESET);


                System.out.println("Choose between:\n" +
                        "1: Attack with Wingardium Leviosa\n" +
                        "2: Defend\n" +
                        "3: The Sword of Godric Gryffondor");

                //attaques ou défense du sorcier
                choixsorcier = scanner.nextInt();
                if (choixsorcier == 1) {
                    boolean success = mywizzard.useSpell(Wingardium_Leviosa, basilic);
                    if (success == true) {
                        System.out.println(BLUE + "You attack and put " + Wingardium_Leviosa.getDamage() + " damage!");
                    } else {
                        System.out.println("You miss tour spell...");
                    }
                }
                    if (choixsorcier == 2) {
                        mywizzard.defense(50);
                        System.out.println(BLUE + "You decided to defend!");
                    }
                    if (choixsorcier == 3) {

                            System.out.println(BLUE + "You decided to use the sword of Godric Gryffondor and kill easily Basilic");
                            basilic.setHealthPointNow(0);

                    }


                    nombrerandom = (int) (random.nextInt(2)) + 1;
                    //attaque ou défense de basilic
                    if (nombrerandom == 1) {
                        Enemy.useSpell(Attack_Basilic, mywizzard);
                        System.out.println(BLACK + "Basilic decided to attack and put" + Attack_Troll.getDamage() + " damage ouch!");
                    }
                    if (nombrerandom == 2) {
                        basilic.defense(5);
                        System.out.println(BLACK + "Basilic decided to defend");
                    }




            }
            if (mywizzard.getHealthPointNow() <= 0) {
                isalive = false;
                System.out.println("Game Over, try again!");
            } else {
                isalive = true;
                System.out.println(BLUE +
                        "You win, you're a boss!");
            }
            System.out.println(basilic.getHealthPointNow());
        }

        // Si on n'est pas de Gryffondor:
        else {

            System.out.println("A fight is begining between a wizzard and Basilic!");
            System.out.println("May the best win !");
            System.out.println();

            choixsorcier = 0;

            Spell Attack_Troll = Spell.Attack_Troll();
            Spell Wingardium_Leviosa = Spell.Wingardium_Leviosa();
            Spell Sword_of_Godric_Gryffindor = Spell.Sword_of_Godric_Gryffindor();
            Spell Attack_Basilic = Spell.Attack_Basilic();


            while (mywizzard.getHealthPointNow() > 0 && basilic.getHealthPointNow() > 0) {
                System.out.println(GREEN + "Basilic's life :" + basilic.getHealthPointNow() + RESET);
                System.out.println(RED + "Wizzard's life :" + mywizzard.getHealthPointNow() + RESET);


                System.out.println("Choose between:\n" +
                        "1: Attack with Wingardium Leviosa\n" +
                        "2: Defend\n");

                //attaques ou défense du sorcier

                choixsorcier = scanner.nextInt();
                if (choixsorcier == 1) {
                    mywizzard.useSpell(Wingardium_Leviosa, basilic);
                    System.out.println(BLUE + "You attack and put " + Wingardium_Leviosa.getDamage() + " damage!");
                }
                if (choixsorcier == 2) {
                    mywizzard.defense(5);
                    System.out.println(BLUE + "You decided to defend!");
                }


                nombrerandom = (int) (random.nextInt(2)) + 1;
                //attaque ou défense du troll
                if (nombrerandom == 1) {
                    Enemy.useSpell(Attack_Basilic, mywizzard);
                    System.out.println(BLACK + "Basilic decided to attack and put" + Attack_Basilic.getDamage() + " damage ouch!");
                }
                if (nombrerandom == 2) {
                    basilic.defense(5);
                    System.out.println(BLACK + "Basilic decided to defend");
                }


            }
            if (mywizzard.getHealthPointNow() <= 0) {
                mywizzard.setIsalive(false);
                System.out.println("Game Over, try again!");
            } else {
                mywizzard.setIsalive(true);
                mywizzard.addhp(200);
                System.out.println(BLUE +
                        "You win, you're a boss!");
            }

        }

    }

}


