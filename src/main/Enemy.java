package main;

public class Enemy extends Defaultplayer {
    public Enemy(String name,int stamina,int strength,int agility,int intelect){
        super(name,stamina,strength,agility,intelect);
        hp = stamina*10;
    }
    public static Enemy lvl1 = new Enemy("Kalgordon the Thief",20,15,20,10);
    public static Enemy lvl2 = new Enemy("Billy the killer",18,10,30,20);
    public static Enemy lvl3 = new Enemy("Joe the Giant",400,10,4,1);

    public void meele(Mageplayer enemy) {
        enemy.setHp(enemy.hp - strength);
    }

    public void shoot(Mageplayer enemy) {
        enemy.setHp(enemy.hp - agility);
    }

    public void fireball(Mageplayer enemy) {
        enemy.setHp(enemy.hp - intelect);
    }
    public void meele(Defaultplayer enemy) {
        enemy.setHp(enemy.hp - strength);
    }

    public void shoot(Defaultplayer enemy) {
        enemy.setHp(enemy.hp - agility);
    }

    public void fireball(Defaultplayer enemy) {
        enemy.setHp(enemy.hp - intelect);
    }

    public void meele(Archerplayer enemy) {
        enemy.setHp(enemy.hp - strength);
    }

    public void shoot(Archerplayer enemy) {
        enemy.setHp(enemy.hp - agility);
    }

    public void fireball(Archerplayer enemy) {
        enemy.setHp(enemy.hp - intelect);
    }

    public void meele(Barbarplayer enemy) {
        enemy.setHp(enemy.hp - strength);
    }

    public void shoot(Barbarplayer enemy) {
        enemy.setHp(enemy.hp - agility);
    }

    public void fireball(Barbarplayer enemy) {
        enemy.setHp(enemy.hp - intelect);
    }

}
