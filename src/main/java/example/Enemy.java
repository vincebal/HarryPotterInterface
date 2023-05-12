package example;

import lombok.Data;
import lombok.experimental.SuperBuilder;
@Data
@SuperBuilder
public class Enemy extends AbstractEnemy{

    public static void useSpell(Spell spell, Wizzard hero) {
        hero.setHealthPointNow(hero.getHealthPointNow()-spell.getDamage());
    }
}
