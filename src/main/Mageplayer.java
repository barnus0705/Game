package main;

public class Mageplayer extends Defaultplayer{

    public Mageplayer (String name){
        super(name);
        intelect = 15;
        agility = 8;
        strength = 8;
        stamina = 7;
        hp = stamina*10;

    }
    public void meele(Enemy enemy){
        enemy.setHp(enemy.hp-strength);
    }
    public void shoot(Enemy enemy){
        enemy.setHp(enemy.hp-agility);
    }
    public void fireball(Enemy enemy){
        enemy.setHp(enemy.hp-(intelect*2));
    }
    public void heal(Defaultplayer player){
        player.setHp(player.hp+25);
        player.agility--;
        player.intelect--;
        player.strength--;
    }


}
