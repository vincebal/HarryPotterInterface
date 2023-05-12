package example;

import lombok.Data;
import lombok.experimental.SuperBuilder;
@Data
@SuperBuilder
public class Spell extends AbstractSpell{
    private String name;
    private int damage;
    int success;

    public static Spell Wingardium_Leviosa(){
        Spell Wingardium_Leviosa = Spell.builder()
                .name("Wingardium Leviosa")
                .damage(500)
                .success(70)
                .build();
        return Wingardium_Leviosa;
    }

    public static Spell Sword_of_Godric_Gryffindor(){
        Spell Sword_of_Godric_Gryffondor = Spell.builder()
                .name("Sword of Godric Gryffondor")
                .damage(1200)
                .success(100)
                .build();

        return Sword_of_Godric_Gryffondor;
    }
    public static Spell Expecto_Patronum() {
        Spell Expecto_Patronum = Spell.builder()
                .name("Expecto Patronum")
                .damage(1500)
                .success(50)
                .build();
        return Expecto_Patronum;
    }

    public static Spell Accio(){
        Spell Accio = Spell.builder()
                .name("Accio")
                .damage(0)
                .success(90)
                .build();
        return Accio;
    }

    public static Spell Leak(){
        Spell Leak = Spell.builder()
                .name("Leak")
                .success(100)
                .build();
        return Leak;
    }

    public static Spell Sectumsempra() {
        Spell Sectumsempra = Spell.builder()
                .name("Sectumsempra")
                .damage(900)
                .success(80)
                .build();
        return Sectumsempra;
    }

    public static Spell Expelliarmus(){
        Spell Expelliarmus = Spell.builder()
                .name("Expelliarmus")
                .damage(1000)
                .success(75)
                .build();
        return Expelliarmus;
    }










    public static Spell Attack_Troll(){
        Spell Attack_Troll = Spell.builder()
                .name("Attack Troll")
                .damage(200)
                .build();
        return Attack_Troll;
    }

    public static Spell Attack_Basilic(){
        Spell Attack_Basilic = Spell.builder()
                .name("Attack Basilic")
                .damage(300)
                .build();
        return Attack_Basilic;
    }

    public static Spell Attack_Dementor(){
        Spell Attack_Dementor = Spell.builder()
                .name("Attack Dementor")
                .damage(350)
                .build();
        return Attack_Dementor;
    }

    public static Spell Attack_Voldemort(){
        Spell Attack_Voldemort = Spell.builder()
                .name("Attack Voldemort")
                .damage(400)
                .success(60)
                .build();
        return Attack_Voldemort;
    }
    public static Spell Attack_Peter_Pettigrow() {
        Spell Attack_Peter_Pettigrow = Spell.builder()
                .name("Attack Pettigrow")
                .damage(360)
                .success(80)
                .build();
        return Attack_Peter_Pettigrow;
    }

        public static Spell Attack_Dolores() {
            Spell Attack_Dolores = Spell.builder()
                    .name("Attack Dolores")
                    .damage(410)
                    .success(60)
                    .build();
            return Attack_Dolores;

        }

        public static Spell Attack_Death_Eater(){
        Spell Attack_Death_Eater = Spell.builder()
                .name("Attack Death Eater")
                .damage(450)
                .success(60)
                .build();
        return  Attack_Death_Eater;
        }

        public static Spell Attack_Bellatrix_Lestrange(){
        Spell Attack_Bellatrix_Lestrange = Spell.builder()
                .name("Attack Bellatrix Lestrange")
                .damage(500)
                .success(50)
                .build();
        return Attack_Bellatrix_Lestrange;
        }

    public static Spell Attack_Voldemort_prime(){
        Spell Attack_Voldemort = Spell.builder()
                .name("Attack Voldemort prime")
                .damage(600)
                .success(50)
                .build();
        return Attack_Voldemort;
    }
    }

