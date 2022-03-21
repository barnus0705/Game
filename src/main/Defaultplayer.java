package main;

public class Defaultplayer {
    protected String name;
    protected int stamina = 10;
    protected int hp = stamina * 10;
    protected int strength = 10;
    protected int agility = 10;
    protected int intelect = 10;

    public Defaultplayer(String name) {
        this.name = name;
    }

    public Defaultplayer(String name, int stamina, int strength, int agility, int intelect) {
        this.name = name;
        this.stamina = stamina;
        this.strength = strength;
        this.agility = agility;
        this.intelect = intelect;
    }

    public void setHp(int hp) {
        this.hp = hp;
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

    public void meele(Enemy enemy) {
        enemy.setHp(enemy.hp - strength + 3);
    }

    public void shoot(Enemy enemy) {
        enemy.setHp(enemy.hp - agility + 3);
    }

    public void fireball(Enemy enemy) {
        enemy.setHp(enemy.hp - intelect + 3);
    }

    public void heal(Defaultplayer player) {
        if (player.hp < player.stamina * 10 && player.hp+25 < player.stamina*10) {
            player.setHp(player.hp + 25);
            player.agility--;
            player.intelect--;
            player.strength--;
        } else {
            System.out.println("A gyógyítás nem volt lehetséges.");
        }
    }
}