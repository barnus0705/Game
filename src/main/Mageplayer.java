package main;

public class Mageplayer extends Defaultplayer {

    public Mageplayer(String name) {
        super(name);
        intelect = 15;
        agility = 8;
        strength = 8;
        stamina = 7;
        hp = stamina * 10;

    }

    public void meele(Enemy enemy) {
        enemy.setHp(enemy.hp - strength);
    }

    public void shoot(Enemy enemy) {
        enemy.setHp(enemy.hp - agility);
    }

    public void fireball(Enemy enemy) {
        enemy.setHp(enemy.hp - (intelect * 10));
    }

    public void heal(Mageplayer player) {
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