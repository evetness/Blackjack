package main;

import modell.Jatekosok;
import modell.Kartyak;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Kartyak kartyak = new Kartyak();

        System.out.println("Játékos neve:");
        Jatekosok elso = new Jatekosok();
        System.out.println("Játékos neve:");
        Jatekosok masodik = new Jatekosok();
        System.out.println("Játékos neve:");
        Jatekosok harmadik = new Jatekosok();

        System.out.println(elso.getName() + ": " + kartyak.generator());
        System.out.println(masodik.getName() + ": " + kartyak.generator());
        System.out.println(harmadik.getName() + ": " + kartyak.generator());
        

    }


}
