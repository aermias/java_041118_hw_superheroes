package superheroes;

public class GreenLantern extends SuperHero implements IFlightSpeed, BlackHeroes {
    public GreenLantern(String realName, String[] specialPowers) {
        super(realName, specialPowers);
    }

    public double flightSpeed() {
        return 1500;
    }

    public String myBlackHero() {
        return "my black hero is " + this.getClass().getSimpleName();
    }
}
