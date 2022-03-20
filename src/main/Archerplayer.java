package main;

public class Archerplayer extends Defaultplayer{
    public Archerplayer(String name){
        super(name);
        stamina = 9;
        strength = 6;
        agility = 17;
        intelect = 8;
        hp = hp-(100-(10*stamina));
    }
}
