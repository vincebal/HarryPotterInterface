package example;

import com.example.harrypotterinterface.WindowTalk;
import lombok.Data;

import java.util.Random;
import java.util.Scanner;

import static com.example.harrypotterinterface.WindowTalk.nextButton;

@Data
public class Fight1 {


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
    public static int choixsorcier;
    public static int nombrerandom;

    public static void fight1(Wizzard mywizard) {


        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        //Paramètre à choisir dans la console

        Enemy troll = Enemy.builder()
                .firstname("troll")
                .healthPointNow(1000)
                .build();

        WindowTalk.printInWindow("The wizzard is named " + mywizard.getFirstname() + mywizard.getLastname() + " and got " + mywizard.getHealthPointMax() + " health points.");
        nextButton.setOnAction(event3 -> {

            WindowTalk.printInWindow("Level 1\n===============================================================================================" +
                    "===============================" + "It was a rainy night at the school and you weren't able to sleep.\n" +
                    "You decided to go to the toilet in the dark with your candle and started talking with some random painting in the corridor.\n" +
                    "It was 2 AM and you entered in the toilet and see a little troll\n" +
                    "Troll: 'Oh hello there, what are you doing outside of your room at this time of the night?'\n" +
                    "Troll: 'You'll have to beat me if you want to be alive tomorrow!'\n" + "\n========================================================" +
                    "=======================================" + "===============================\nA fight is begining between a wizzard and a troll!\nMay the best win !\n");

            Spell Attack_Troll = Spell.Attack_Troll();
            Spell Wingardium_Leviosa = Spell.Wingardium_Leviosa();

            nextButton.setOnAction(event4 -> {
                while (mywizard.getHealthPointNow() > 0 && troll.getHealthPointNow() > 0) {
                    WindowTalk.printInWindow("Troll's life :" + troll.getHealthPointNow() + "\nWizzard's life :" + mywizard.getHealthPointNow() + "\nChoose between:\n" +
                            "1: Attack with Wingardium Leviosa on the troll's head.\n" +
                            "2: Defend");

                    //attaques ou défense du sorcier
                    //nextButton.setOnAction(event5 -> {
                        choixsorcier = WindowTalk.askForInt("Choose between:\n" +
                                "1: Attack with Wingardium Leviosa on the troll's head.\n" +
                                "2: Defend", 1, 2);

                        if (choixsorcier == 1) {
                            boolean randomsucces = mywizard.useSpell(Wingardium_Leviosa, troll);
                            if (randomsucces == true) {
                                System.out.println(BLUE + "You attack and put " + Wingardium_Leviosa.getDamage() + " damage!");
                            } else {
                                System.out.println("You miss your spell...");
                            }
                        }
                        if (choixsorcier == 2) {
                            mywizard.defense(20);
                            System.out.println(BLUE + "You decided to defend!");
                        }


                        nombrerandom = (int) (random.nextInt(2)) + 1;
                        //attaque ou défense du troll
                        if (nombrerandom == 1) {
                            Enemy.useSpell(Attack_Troll, mywizard);
                            System.out.println(BLACK + "The troll decided to attack and put" + Attack_Troll.getDamage() + " damage ouch!");
                        }
                        if (nombrerandom == 2) {
                            troll.defense(5);
                            System.out.println(BLACK + "The troll decided to defend");
                        }

                    //});
                    }

                if (mywizard.getHealthPointNow() <= 0) {
                    mywizard.setIsalive(false);
                    System.out.println("Game Over, try again!");
                } else {
                    mywizard.setIsalive(true);
                    mywizard.addhp(100);
                    System.out.println(BLUE +
                            "You win, you're a boss!");
                }


            });
        });
    }
}
