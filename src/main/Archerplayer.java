package main;

public class Archerplayer extends Defaultplayer{
    public Archerplayer(String name){
        super(name);
        stamina = 9;
        strength = 6;
        agility = 17;
        intelect = 8;
        hp = stamina*10;
    }
    public void meele(Enemy enemy){
        enemy.setHp(enemy.hp-strength+1);
    }
    public void shoot(Enemy enemy){
        enemy.setHp(enemy.hp-agility+8);
    }
    public void fireball(Enemy enemy){
        enemy.setHp(enemy.hp-intelect-5);
    }
    public void heal(Archerplayer player){
        if(player.hp < player.stamina*10 && player.hp+25 < player.stamina*10) {
            player.setHp(player.hp + 25);
            player.agility--;
            player.intelect--;
            player.strength--;
        }else{
            System.out.println("A gyógyítás nem volt lehetséges.");
        }
    }
}
