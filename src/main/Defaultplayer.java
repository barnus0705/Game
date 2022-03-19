package main;

public class Defaultplayer {
    protected String name;
    protected final int hp = 100;
    protected int stamina;
    protected int strength;
    protected int agility;
    protected int intelect;

    public Defaultplayer(String name,int stamina,int strength,int agility,int intelect){
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
        this.agility = agility;
        this.intelect = intelect;
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
