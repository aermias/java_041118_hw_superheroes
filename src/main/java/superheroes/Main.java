package superheroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
    static String separator = "=====================================================================";

    public static void main(String[] args) {
        Superman clark = new Superman("Clark Kent",new String[]{"flight", "heat vision", "super speed"});
        Batman bruce = new Batman("Bruce Wayne", new String[]{"none"});
        TheFlash barry = new TheFlash("Barry Allen", new String[]{"super speed"});
        GreenLantern john = new GreenLantern("John Stewart", new String[]{"flight", "force fields"});

        ArrayList<SuperHero> dcHeroes = new ArrayList<SuperHero>(Arrays.asList(clark, bruce, barry, john));

        // breakdown loop
        for (Iterator<SuperHero> iterator = dcHeroes.iterator(); iterator.hasNext();) {
            SuperHero current_hero = iterator.next();
            String breakdown =  current_hero.getRealName() + " possesses these superpowers " + current_hero.listPowers();
            System.out.println(breakdown + '\n' + separator);
        }

        // flying heroes
        System.out.println(clark.getClass().getSimpleName() + " flies at " + clark.flightSpeed() + " miles per hour");
        System.out.println(separator);
        System.out.println(john.getClass().getSimpleName() + " flies at " + john.flightSpeed() + " miles per hour");
        System.out.println(separator);

        // black hero
        System.out.println(john.myBlackHero() + " he flies really quick");
    }
}
