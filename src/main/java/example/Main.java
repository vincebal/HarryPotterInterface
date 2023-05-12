package example;

import com.example.harrypotterinterface.WindowTalk;
import lombok.Data;

import static com.example.harrypotterinterface.WindowTalk.nextButton;

@Data
public class Main {

    public static void start() {
        House ChooseHouse = House.ChooseHouse();
        nextButton.setOnAction(event -> {
            Pet ChoosePet = Pet.ChoosePet();

            Wand chosenWand = new Wand(Core.DRAGON_HEARTSTRING, 40);
            //On construit notre sorcier
            Wizzard hero = Wizzard.builder()
                    .level(1)
                    .firstname("Harry")
                    .lastname("Potter")
                    .healthPointMax(10000)
                    .healthPointNow(10000)
                    .knownspells(null)
                    .potions(null)
                    .pet(ChoosePet)
                    .house(ChooseHouse)
                    .wand(chosenWand)
                    .build();
            nextButton.setOnAction(event2 -> {
            Fight1.fight1(hero);

            if (hero.isIsalive()) {
                Fight2.fight2(hero);
            }
            if (hero.isIsalive()) {
                Fight3.fight3(hero);
            }
            if (hero.isIsalive()) {
                Fight4.fight4(hero);
            }
            if (hero.isIsalive()) {
                Fight5.fight5(hero);
            }
            if (hero.isIsalive()) {
                Fight6.fight6(hero);
            }
            if (hero.isIsalive()) {
                Fight7.fight7(hero);
            }
        });});


    }

    public static void main(String[] args) {
        start();
    }
}


