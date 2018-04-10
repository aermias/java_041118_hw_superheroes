package superheroes;

import java.util.Arrays;

public abstract class SuperHero {
    // instance variable
    private String realName;
    private String[] specialPowers;

    // constructor
    public SuperHero(String realName, String[] specialPowers) {
        this.realName = realName;
        this.specialPowers = specialPowers;
    }

    public String listPowers() {
        return Arrays.toString(this.specialPowers);
    }

    // getters and setters
    public String getRealName() { return realName; }
    public void setRealName(String realName) { this.realName = realName; }

    public String[] getSpecialPowers() { return specialPowers; }
    public void setSpecialPowers(String[] specialPowers) { this.specialPowers = specialPowers; }

    // toString

    @Override
    public String toString() {
        return "SuperHero{" +
                "realName='" + realName + '\'' +
                ", specialPowers=" + Arrays.toString(specialPowers) +
                '}';
    }
}
