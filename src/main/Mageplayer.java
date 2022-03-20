package main;

public class Mageplayer extends Defaultplayer{

    public Mageplayer (String name){
        super(name);
        intelect = 15;
        agility = 8;
        strength = 8;
        stamina = 7;
        hp = hp-(100-(stamina*10));
    }


}
