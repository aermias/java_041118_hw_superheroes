package superheroes;

public class Superman extends SuperHero implements IFlightSpeed {
    public Superman(String realName, String[] specialPowers) {
        super(realName, specialPowers);
    }

    public double flightSpeed() {
        return 3000;
    }
}
