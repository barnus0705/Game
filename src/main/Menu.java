package main;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public void main(){
        try {
            main_menu();
            int solution = 0;
            while (true) {
                solution = valasz();
                /*    Play kezdés    */
                if (solution == 1) {
                    lista();
                    while (true) {
                        /*    Kiválasztás kezdete    */
                        solution = 0;
                        solution = valasz();
                        /*    Mágus    */
                        if (solution == 1) {
                            Statistics.mage_stats();
                            System.out.print("Ez szeretné választani? 1.Igen  /  2.Nem      Válasz:");
                            int valasz = in.nextInt();
                            while (true) {
                                if (valasz == 1) {
                                    System.out.println("--------------------------------------------");
                                    System.out.print("Adja meg a karaktere nevét:");
                                    Mageplayer player = new Mageplayer(in.next());
                                    System.out.println("--------------------------------------------");
                                    System.out.println("ELSŐ SZINT");
                                    harc(Enemy.lvl1, player);
                                    System.out.println("--------------------------------------------");
                                    player.setHp(player.getStamina() * 10);
                                    System.out.println("MÁSODIK SZINT");
                                    harc(Enemy.lvl2, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("HARMADIK SZINT");
                                    player.setHp(player.getStamina() * 10);
                                    harc(Enemy.lvl3, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Kivitted a játékot! GGWP");
                                    System.exit(0);


                                } else if (valasz == 2) {
                                    lista();
                                    break;
                                } else {
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                            /*    Mágus vége    */
                            /*    Íjász    */
                        } else if (solution == 2) {
                            Statistics.archer_stats();
                            System.out.println("Ez szeretné választani? 1.Igen  /  2.Nem");
                            int valasz = in.nextInt();
                            while (true) {
                                if (valasz == 1) {
                                    System.out.println("--------------------------------------------");
                                    System.out.print("Adja meg a karaktere nevét:");
                                    Archerplayer player = new Archerplayer(in.next());
                                    System.out.println("--------------------------------------------");
                                    System.out.println("ELSŐ SZINT");
                                    harc(Enemy.lvl1, player);
                                    System.out.println("--------------------------------------------");
                                    player.setHp(player.getStamina() * 10);
                                    System.out.println("MÁSODIK SZINT");
                                    harc(Enemy.lvl2, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("HARMADIK SZINT");
                                    player.setHp(player.getStamina() * 10);
                                    harc(Enemy.lvl3, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Kivitted a játékot! GGWP");
                                    System.exit(0);
                                } else if (valasz == 2) {
                                    lista();
                                    break;
                                } else {
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                            /*    Íjász vége   */
                            /*    Barbár    */
                        } else if (solution == 3) {
                            Statistics.barbar_stats();
                            System.out.println("Ez szeretné választani? 1.Igen  /  2.Nem");
                            int valasz = in.nextInt();
                            while (true) {
                                if (valasz == 1) {
                                    System.out.println("--------------------------------------------");
                                    System.out.print("Adja meg a karaktere nevét:");
                                    Barbarplayer player = new Barbarplayer(in.next());
                                    System.out.println("--------------------------------------------");
                                    System.out.println("ELSŐ SZINT");
                                    harc(Enemy.lvl1, player);
                                    System.out.println("--------------------------------------------");
                                    player.setHp(player.getStamina() * 10);
                                    System.out.println("MÁSODIK SZINT");
                                    harc(Enemy.lvl2, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("HARMADIK SZINT");
                                    player.setHp(player.getStamina() * 10);
                                    harc(Enemy.lvl3, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Kivitted a játékot! GGWP");
                                    System.exit(0);
                                } else if (valasz == 2) {
                                    lista();
                                    break;
                                } else {
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                            /*    Barbár vége    */
                            /*    Alap karakter    */
                        } else if (solution == 4) {
                            Statistics.def_stats();
                            System.out.println("Ez szeretné választani? 1.Igen  /  2.Nem");
                            int valasz = in.nextInt();
                            while (true) {
                                if (valasz == 1) {
                                    System.out.println("--------------------------------------------");
                                    System.out.print("Adja meg a karaktere nevét:");
                                    Defaultplayer player = new Defaultplayer(in.next());
                                    System.out.println("--------------------------------------------");
                                    System.out.println("ELSŐ SZINT");
                                    harc(Enemy.lvl1, player);
                                    System.out.println("--------------------------------------------");
                                    player.setHp(player.getStamina() * 10);
                                    System.out.println("MÁSODIK SZINT");
                                    harc(Enemy.lvl2, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("HARMADIK SZINT");
                                    player.setHp(player.getStamina() * 10);
                                    harc(Enemy.lvl3, player);
                                    System.out.println("--------------------------------------------");
                                    System.out.println("Kivitted a játékot! GGWP");
                                    System.exit(0);
                                } else if (valasz == 2) {
                                    lista();
                                    break;
                                } else {
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                            /*    Alap karakter vége    */
                            /*    Kilépés    */
                        } else if (solution == 5) {
                            main_menu();
                            break;
                        } else {
                            rossz();
                        }
                        /*    Kilépés a menübe    */
                        /* Kiválasztás vége    */
                    }
                    /*    Kilépés    */
                } else if (solution == 2) {
                    System.out.println("--------------------------------\n");
                    System.out.println("Na csá!\n");
                    System.out.println("--------------------------------\n");
                    break;
                } else {
                    rossz();
                }
            }
        }catch (InputMismatchException ex){
            System.err.println("Hibás értéket adott meg máskor figyelj oda!");
        }

    }
    public int valasz(){
        System.out.println("--------------------------------\n");
        System.out.print("Válasz: ");
        int solution = in.nextInt();
        System.out.print("\n");
        System.out.println("--------------------------------");
        return solution;
    }
    public void rossz(){
        System.out.println("----------------------------------------------------\n");
        System.out.println("Nem jó a szám!");
        System.out.println("Lehetőleg a menüben szereplők közül válasszon.\n");
        System.out.println("----------------------------------------------------");
    }

    public void lista(){
        System.out.println("--------------------------------\n");
        System.out.println("Válasszon karaktert!\n");
        System.out.println("1.Mágus\n");
        System.out.println("2.Íjász\n");
        System.out.println("3.Barbár\n");
        System.out.println("4.Alap\n");
        System.out.println("5.Kilépés\n");
        System.out.println("--------------------------------");
    }
    public void main_menu(){
        System.out.println("------------------------------------\n");
        System.out.println("1. Play");
        System.out.println("2. Exit\n");
        System.out.println("------------------------------------");
    }
    public void att_menu(){
        System.out.println("-------------------------------------");
        System.out.println("1. Melee attack");
        System.out.println("2. Shoot attack");
        System.out.println("3. Fireball attack");
        System.out.println("4. Heal");
        System.out.println("-------------------------------------");
    }
    public int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public void harc(Enemy enemy,Defaultplayer player){
        Statistics.enemy_stats(enemy);
        System.out.println("");
        int i = 1;
        while(true){
            System.out.println("----------------------------------------");
            System.out.println(i+". Kör");
            System.out.println(enemy.getName()+" HP:"+enemy.getHp()+"\n");
            System.out.println(player.getName()+" HP:"+player.getHp()+"\n");
            att_menu();
            System.out.println("-----------------");
            System.out.print("Válasz: ");
            int solution = in.nextInt();
            System.out.println("-----------------");
            if(solution == 1){
                player.meele(Enemy.lvl1);
                System.out.println(player.getName()+" megütötte "+enemy.getName()+"-t");
            }else if (solution == 2){
                player.shoot(Enemy.lvl1);
                System.out.println(player.getName()+" meglőtte "+enemy.getName()+"-t");
            }else if (solution == 3){
                player.fireball(Enemy.lvl1);
                System.out.println(player.getName()+" tűzgolyóval eltalálta "+enemy.getName()+"-t");
            }else if (solution == 4){
                player.heal(player);
            }
            if (enemy.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            int rndszam = getRandomNumber(1,3);
            if(rndszam == 1){
                Enemy.lvl1.meele(player);
                System.out.println(enemy.getName()+" megütötte "+player.getName()+"-t");
            }else if (rndszam == 2){
                Enemy.lvl1.shoot(player);
                System.out.println(enemy.getName()+" meglőtte "+player.getName()+"-t");
            }else if (rndszam == 3){
                Enemy.lvl1.fireball(player);
                System.out.println(enemy.getName()+" tűzgolyóval eltalálta "+player.getName()+"-t");
            }
            if (Enemy.lvl1.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            else if (player.getHp()<0){
                System.out.println(enemy.getName()+" megölte "+player.getName()+"-t");
                System.out.println("Játék vége");
                System.exit(0);
            }
            i++;
        }
    }
    public void harc(Enemy enemy,Mageplayer player){
        Statistics.enemy_stats(enemy);
        System.out.println("");
        int i = 1;
        while(true){
            System.out.println("----------------------------------------");
            System.out.println(i+". Kör");
            System.out.println(enemy.getName()+" HP:"+enemy.getHp()+"\n");
            System.out.println(player.getName()+" HP:"+player.getHp()+"\n");
            att_menu();
            System.out.println("-----------------");
            System.out.print("Válasz: ");
            int solution = in.nextInt();
            System.out.println("-----------------");
            if(solution == 1){
                player.meele(Enemy.lvl1);
                System.out.println(player.getName()+" megütötte "+enemy.getName()+"-t");
            }else if (solution == 2){
                player.shoot(Enemy.lvl1);
                System.out.println(player.getName()+" meglőtte "+enemy.getName()+"-t");
            }else if (solution == 3){
                player.fireball(Enemy.lvl1);
                System.out.println(player.getName()+" tűzgolyóval eltalálta "+enemy.getName()+"-t");
            }else if (solution == 4){
                player.heal(player);
            }
            if (enemy.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            int rndszam = getRandomNumber(1,3);
            if(rndszam == 1){
                Enemy.lvl1.meele(player);
                System.out.println(enemy.getName()+" megütötte "+player.getName()+"-t");
            }else if (rndszam == 2){
                Enemy.lvl1.shoot(player);
                System.out.println(enemy.getName()+" meglőtte "+player.getName()+"-t");
            }else if (rndszam == 3){
                Enemy.lvl1.fireball(player);
                System.out.println(enemy.getName()+" tűzgolyóval eltalálta "+player.getName()+"-t");
            }
            if (Enemy.lvl1.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            else if (player.getHp()<0){
                System.out.println(enemy.getName()+" megölte "+player.getName()+"-t");
                System.out.println("Játék vége");
                System.exit(0);
            }
            i++;
        }
    }
    public void harc(Enemy enemy,Archerplayer player){
        Statistics.enemy_stats(enemy);
        System.out.println("");
        int i = 1;
        while(true){
            System.out.println("----------------------------------------");
            System.out.println(i+". Kör");
            System.out.println(enemy.getName()+" HP:"+enemy.getHp()+"\n");
            System.out.println(player.getName()+" HP:"+player.getHp()+"\n");
            att_menu();
            System.out.println("-----------------");
            System.out.print("Válasz: ");
            int solution = in.nextInt();
            System.out.println("-----------------");
            if(solution == 1){
                player.meele(Enemy.lvl1);
                System.out.println(player.getName()+" megütötte "+enemy.getName()+"-t");
            }else if (solution == 2){
                player.shoot(Enemy.lvl1);
                System.out.println(player.getName()+" meglőtte "+enemy.getName()+"-t");
            }else if (solution == 3){
                player.fireball(Enemy.lvl1);
                System.out.println(player.getName()+" tűzgolyóval eltalálta "+enemy.getName()+"-t");
            }else if (solution == 4){
                player.heal(player);
            }
            if (enemy.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            int rndszam = getRandomNumber(1,3);
            if(rndszam == 1){
                Enemy.lvl1.meele(player);
                System.out.println(enemy.getName()+" megütötte "+player.getName()+"-t");
            }else if (rndszam == 2){
                Enemy.lvl1.shoot(player);
                System.out.println(enemy.getName()+" meglőtte "+player.getName()+"-t");
            }else if (rndszam == 3){
                Enemy.lvl1.fireball(player);
                System.out.println(enemy.getName()+" tűzgolyóval eltalálta "+player.getName()+"-t");
            }
            if (Enemy.lvl1.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            else if (player.getHp()<0){
                System.out.println(enemy.getName()+" megölte "+player.getName()+"-t");
                System.out.println("Játék vége");
                System.exit(0);
            }
            i++;
        }
    }
    public void harc(Enemy enemy,Barbarplayer player){
        Statistics.enemy_stats(enemy);
        System.out.println("");
        int i = 1;
        while(true){
            System.out.println("----------------------------------------");
            System.out.println(i+". Kör");
            System.out.println(enemy.getName()+" HP:"+enemy.getHp()+"\n");
            System.out.println(player.getName()+" HP:"+player.getHp()+"\n");
            att_menu();
            System.out.println("-----------------");
            System.out.print("Válasz: ");
            int solution = in.nextInt();
            System.out.println("-----------------");
            if(solution == 1){
                player.meele(Enemy.lvl1);
                System.out.println(player.getName()+" megütötte "+enemy.getName()+"-t");
            }else if (solution == 2){
                player.shoot(Enemy.lvl1);
                System.out.println(player.getName()+" meglőtte "+enemy.getName()+"-t");
            }else if (solution == 3){
                player.fireball(Enemy.lvl1);
                System.out.println(player.getName()+" tűzgolyóval eltalálta "+enemy.getName()+"-t");
            }else if (solution == 4){
                player.heal(player);
            }
            if (enemy.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            int rndszam = getRandomNumber(1,3);
            if(rndszam == 1){
                Enemy.lvl1.meele(player);
                System.out.println(enemy.getName()+" megütötte "+player.getName()+"-t");
            }else if (rndszam == 2){
                Enemy.lvl1.shoot(player);
                System.out.println(enemy.getName()+" meglőtte "+player.getName()+"-t");
            }else if (rndszam == 3){
                Enemy.lvl1.fireball(player);
                System.out.println(enemy.getName()+" tűzgolyóval eltalálta "+player.getName()+"-t");
            }
            if (Enemy.lvl1.getHp()<0){
                System.out.println(player.getName()+" megölte "+enemy.getName()+"-t");
                break;
            }
            else if (player.getHp()<0){
                System.out.println(enemy.getName()+" megölte "+player.getName()+"-t");
                System.out.println("Játék vége");
                System.exit(0);
            }
            i++;
        }
    }
}
