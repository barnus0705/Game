package main;

public class Statistics {
    public static void def_stats(){
        System.out.println("------------------------------------------------------\n");
        Defaultplayer alap = new Defaultplayer("alap");
        System.out.println("A Alapkarakter statisztikái:\n");
        System.out.print("Karakter életereje: "+alap.getHp()+"\n");
        System.out.print("Karakter kitartása: "+alap.getStamina()+"\n");
        System.out.print("Karakter ereje: "+alap.getStrength()+"\n");
        System.out.print("Karakter ügyessége: "+alap.getAgility()+"\n");
        System.out.print("Karakter inteligenciája: "+alap.getIntelect()+"\n");
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
    public static void mage_stats(){
        System.out.println("------------------------------------------------------\n");
        Mageplayer alap = new Mageplayer("alap");
        System.out.println("A mágus statisztikái:\n");
        System.out.print("Karakter életereje: "+alap.getHp()+"\n");
        System.out.print("Karakter kitartása: "+alap.getStamina()+"\n");
        System.out.print("Karakter ereje: "+alap.getStrength()+"\n");
        System.out.print("Karakter ügyessége: "+alap.getAgility()+"\n");
        System.out.print("Karakter inteligenciája: "+alap.getIntelect()+"\n");
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
    public static void barbar_stats(){
        System.out.println("------------------------------------------------------\n");
        Barbarplayer alap = new Barbarplayer("alap");
        System.out.println("A Barbár statisztikái:\n");
        System.out.print("Karakter életereje: "+alap.getHp()+"\n");
        System.out.print("Karakter kitartása: "+alap.getStamina()+"\n");
        System.out.print("Karakter ereje: "+alap.getStrength()+"\n");
        System.out.print("Karakter ügyessége: "+alap.getAgility()+"\n");
        System.out.print("Karakter inteligenciája: "+alap.getIntelect()+"\n");
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
    public static void archer_stats(){
        System.out.println("------------------------------------------------------\n");
        Archerplayer alap = new Archerplayer("alap");
        System.out.println("A mágus statisztikái:\n");
        System.out.print("Karakter életereje: "+alap.getHp()+"\n");
        System.out.print("Karakter kitartása: "+alap.getStamina()+"\n");
        System.out.print("Karakter ereje: "+alap.getStrength()+"\n");
        System.out.print("Karakter ügyessége: "+alap.getAgility()+"\n");
        System.out.print("Karakter inteligenciája: "+alap.getIntelect()+"\n");
        System.out.println();
        System.out.println("--------------------------------------------------------");
    }
    public static void enemy_stats(Enemy alap){
        System.out.println("------------------------------------------------------\n");
        System.out.println("Az ellenfél statisztikái:\n");
        System.out.println("Ellenfél neve: "+alap.getName());
        System.out.print("Ellenfél életereje: "+alap.getHp()+"\n");
        System.out.print("Ellenfél kitartása: "+alap.getStamina()+"\n");
        System.out.print("Ellenfél ereje: "+alap.getStrength()+"\n");
        System.out.print("Ellenfél ügyessége: "+alap.getAgility()+"\n");
        System.out.print("Ellenfél inteligenciája: "+alap.getIntelect()+"\n");
        System.out.println();
        System.out.println("--------------------------------------------------------");

    }
}
