package superheroes;

public class Main {
    static String separator = "=====================================================================";

    public static void main(String[] args) {
        Superman clark = new Superman("Clark Kent",new String[]{"flight", "heat vision", "super speed"});
        Batman bruce = new Batman("Bruce Wayne", new String[]{"none"});
        TheFlash barry = new TheFlash("Barry Allen", new String[]{"super speed"});
        GreenLantern john = new GreenLantern("John Stewart", new String[]{"flight", "force fields"});

        SuperHero[] dcHeroes = new SuperHero[]{clark, bruce, barry, john};

        // breakdown loop
        for (SuperHero s : dcHeroes) {
            String breakdown = s.getRealName() + " possesses these superpowers " + s.listPowers();
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
