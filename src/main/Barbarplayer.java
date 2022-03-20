package main;

public class Barbarplayer extends Defaultplayer{
    public Barbarplayer(String name){
        super(name);
        stamina = 15;
        strength = 14;
        agility = 8;
        intelect = 3;
        hp = hp-(100-(10*stamina));
    }
}