package main;

import modell.Jatekosok;
import modell.Kartyak;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Kartyak kartyak = new Kartyak();

        Jatekosok elso = new Jatekosok();
        Jatekosok masodik = new Jatekosok();
        Jatekosok harmadik = new Jatekosok();


        System.out.println(elso.getName() + ": " + kartyak.generator());
        System.out.println(masodik.getName() + ": " + kartyak.generator());
        System.out.println(harmadik.getName() + ": " + kartyak.generator());

    }


}
