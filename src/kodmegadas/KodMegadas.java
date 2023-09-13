package kodmegadas;

import java.util.Random;
import java.util.Scanner;

public class KodMegadas {

    static Scanner sc1 = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);

    static int[] KodGombok = new int[9];
    
    public static void main(String[] args) {
        
        
        int kod1 = KodBekeres();
        int kod2 = MegadottSzamBekeres();
        Ellenorzes(kod1, kod2);
        //KodGeneralas();
        
        

    }

    private static void Ellenorzes(int kod1, int kod2) {
        int szamlalo = 1;
        while ((szamlalo < 3) && (kod1 != kod2)) {
            szamlalo++;
            System.out.println("\tRossz pinkód, próbáld újra!");
            System.out.printf("Kérem a belépési kódot[%d/3]:", szamlalo);
            kod2 = sc2.nextInt();
        }

        if (kod1 != kod2) {
            System.out.println("\n\tBelépés megtagadva!");
        } else {
            System.out.println("\n\tRendben, sikeres belépés!");
        }

    }

    private static int KodBekeres() {
        System.out.printf("Kérek egy pinkódot(4-6): ");
        int kod1 = sc1.nextInt();
        while(!((kod1 >= 1000) && (kod1 < 1000000)))
        {
            System.out.println("\n\tNem megfellő formátum, minimum 4 maximum 6 számjegy legyen!");
            System.out.printf("\nKérek egy pinkódot(4-6): ");
            kod1 = sc1.nextInt();
        }
        System.out.println("\n\tPinkód elmentve!");
        return kod1;
    }

    private static int MegadottSzamBekeres() {
        System.out.printf("\nKérem a belépési kódot[1/3]: ");
        int kod2 = sc2.nextInt();
        return kod2;
    }
    
     private static void KodGeneralas() {
       Random rnd = new Random();
       int random = rnd.nextInt(0,9);
       int sortores =0;
         for (int i = 0; i < 10; i++) {
             
             if (sortores == 3) {
                 System.out.printf("\n"+i+"\t");
                 sortores=0;
             }
             else{System.out.printf(i+"\t");}
             sortores++;
         }
    }
    

}
