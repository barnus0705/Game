package main;

public class Defaultplayer {
    protected String name;
    protected int hp = 100;
    protected int stamina = 10;
    protected int strength = 10;
    protected int agility = 10;
    protected int intelect = 10;

    public Defaultplayer(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getStamina() {
        return stamina;
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelect() {
        return intelect;
    }
}
