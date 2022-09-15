package hu.petrik.pontoop;

import hu.petrik.pontoop.kor.Kor;
import hu.petrik.pontoop.pont.Pont;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**Pont p1 = new Pont();
         Pont p2 = new Pont(0, 0);
         Pont p3 = new Pont(3, 4);
         Pont p4 = new Pont(100);


         System.out.println(p1);
         System.out.println(p2);
         System.out.println(p3);
         System.out.println(p4);*/


        Pont[] pontok = new Pont[100];
        for (int i = 0; i < pontok.length; i++) {
            pontok[i] = new Pont(10);
        }

        for (Pont p : pontok) {
            System.out.println(p);
        }

        //Origotól legtávolabb eső pont

        int legtavolabbindex = 0;
        for (int i = 0; i < pontok.length; i++) {
            if (pontok[legtavolabbindex].getOrigotolMertTavolsag() < pontok[i].getOrigotolMertTavolsag()) {
                legtavolabbindex = i;
            }
        }
        System.out.printf("A legtávolabbi pont az origotól a %d. pont, koordinátái: %s, origotól mért távolsága: %f "
                , (legtavolabbindex + 1), pontok[legtavolabbindex], pontok[legtavolabbindex].getOrigotolMertTavolsag());


        //sqrt gyök
        //pow négyzet


        //saját feladatok:

        /**System.out.print("\nKérem adja meg az első pont első koordinátáját:");
         int a1 = sc.nextInt();
         System.out.print("Kérem adja meg az első pont második koordinátáját:");
         int a2 = sc.nextInt();

         System.out.print("Kérem adja meg a második pont első koordinátáját:");
         int b1 = sc.nextInt();
         System.out.print("Kérem adja meg a második pont második koordinátáját:");
         int b2 = sc.nextInt();
         Pont ps1 = new Pont();
         System.out.println(ps1.getTavolsag(a1, a2, b1, b2));
         */

        //Melyik síknegyedbe esik?

        /**
         System.out.print("Kérem adja meg az első pont első koordinátáját:");
         int s1 = sc.nextInt();
         System.out.print("Kérem adja meg az első pont második koordinátáját:");
         int s2 = sc.nextInt();
         if (s1 > 0 && s2 > 0) {
         System.out.println("A pont a 4-esbe esik.");
         } else if (s1 < 0 && s2 < 0) {
         System.out.println("A pont a 2-esbe esik.");
         } else if (s1 > 0 && s2 < 0) {
         System.out.println("A pont a 3-asba esik.");
         } else {
         System.out.println("A pont az 1-esbe esik.");
         }*/
        //Körös feladatok

        System.out.print("\nKérem adja meg a kör sugarát centiméterben:");

        int sugar = sc.nextInt();
        Kor k = new Kor(sugar);
        Kor kr = new Kor();
        System.out.println("Csak a radius-os kör kerülete. területe:");
        System.out.printf("\nA kör kerülete: %f", k.getKorKerulete(sugar));
        System.out.printf("\nA kör területe: %f négyzet centiméter.", k.getKorTerulete(sugar));

        //kör középpontos bekérés:

        System.out.print("\nKérem adja meg a kör sugarát centiméterben:");
        sugar = sc.nextInt();
        System.out.print("\nKérem adja meg a középpont első koordinátáját: ");
        int p1 = sc.nextInt();
        System.out.print("\nKérem adja meg a középpont második koordinátáját: ");
        int p2 = sc.nextInt();
        System.out.printf("\nA kör kerülete: %f", k.getKorKerulete(sugar));
        System.out.printf("\nA kör területe: %f négyzet centiméter.", k.getKorTerulete(sugar));

        //Kör nagyítása és ksicsinyétése:

        System.out.print("\nKérem adja meg hogy a kört mennyivel akarja nagyítani (természetes szám) vagy kicsinyíteni (negatív szám)");
        int bekertszam = sc.nextInt();
        System.out.printf("Az átméretezés végeredménye: %s", k.getKorMéretezes(bekertszam, sugar));

        System.out.print("\n" + kr.toString());

        Kor[] korok = new Kor[10];
        for (int i = 0; i < korok.length; i++) {
            korok[i] = new Kor();
        }
        for (int i = 0; i < korok.length; i++) {
            System.out.printf("\n %d -ik elem a: %s", i + 1, korok[i].toString());
        }

        int max = 0;
        int index = 0;
        for (int i = 0; i < korok.length; i++) {
            if (korok[i].getR() > max) {
                max = korok[i].getR();
                index = i;
            }
        }
        System.out.printf("\n A legnagyobb kör területe a: %s", korok[index].toString());

    }
}
