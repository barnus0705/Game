package main;

public class Enemy extends Defaultplayer {
    public Enemy(String name,int stamina,int strength,int agility,int intelect){
        super(name,stamina,strength,agility,intelect);
        hp = stamina*10;
    }
    public static Enemy lvl1 = new Enemy("Kalgordon the Thief",20,15,20,10);
}
