package main;

public class Barbarplayer extends Defaultplayer{
    public Barbarplayer(String name){
        super(name);
        stamina = 15;
        strength = 14;
        agility = 8;
        intelect = 3;
        hp = stamina*10;
    }
    public void meele(Enemy enemy){
        enemy.setHp(enemy.hp-strength+3);
    }
    public void shoot(Enemy enemy){
        enemy.setHp(enemy.hp-agility+1);
    }
    public void fireball(Enemy enemy){
        enemy.setHp(enemy.hp-intelect);
    }
    public void heal(Defaultplayer player){
        player.setHp(player.hp+25);
        player.agility--;
        player.intelect--;
        player.strength--;
    }
}