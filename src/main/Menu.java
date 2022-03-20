package main;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public static Scanner in = new Scanner(System.in);
    public void main(){
        main_menu();
        int solution = 0;
        while(true){
                solution = valasz();
                if (solution == 1) {
                    lista();
                    while (true) {
                        solution = 0;
                        solution = valasz();
                        if (solution == 1){
                            Statistics.mage_stats();
                            System.out.println("Ez szeretné választani? 1.Igen  /  2.Nem");
                            int valasz = in.nextInt();
                            while(true){
                                if(valasz == 1){
                                    System.out.println("ok");
                                    break;
                                }else if(valasz == 2){
                                    lista();
                                    break;
                                }else{
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                        }else if(solution == 2){
                            Statistics.archer_stats();
                            System.out.println("Ez szeretné választani? 1.Igen  /  2.Nem");
                            int valasz = in.nextInt();
                            while(true){
                                if(valasz == 1){
                                    System.out.println("ok");
                                    break;
                                }else if(valasz == 2){
                                    lista();
                                    break;
                                }else{
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                        }else if(solution == 3){
                            Statistics.barbar_stats();
                            System.out.println("Ez szeretné választani? 1.Igen  /  2.Nem");
                            int valasz = in.nextInt();
                            while(true){
                                if(valasz == 1){
                                    System.out.println("ok");
                                    break;
                                }else if(valasz == 2){
                                    lista();
                                    break;
                                }else{
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                        }else if (solution == 4){
                            Statistics.def_stats();
                            System.out.println("Ez szeretné választani? 1.Igen  /  2.Nem");
                            int valasz = in.nextInt();
                            while(true){
                                if(valasz == 1){
                                    System.out.println("ok");
                                    break;
                                }else if(valasz == 2){
                                    lista();
                                    break;
                                }else{
                                    rossz();
                                    lista();
                                    break;
                                }
                            }
                        }else if(solution == 5){
                            main_menu();
                            break;
                        }else{
                            rossz();
                        }
                    }
                } else if (solution == 2) {
                    System.out.println("--------------------------------\n");
                    System.out.println("Na csá!\n");
                    System.out.println("--------------------------------\n");
                    break;
                }else{
                    rossz();
                }
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
        System.out.println("1. Start");
        System.out.println("2. Exit\n");
        System.out.println("------------------------------------");
    }
}
