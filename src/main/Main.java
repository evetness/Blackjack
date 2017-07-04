package main;

import modell.Jatekosok;
import modell.Kartyak;

public class Main {

    public static void main(String[] args){

        Jatekosok jatekos1 = new Jatekosok("Player 1");
        Jatekosok jatekos2 = new Jatekosok("Player 2");
        Kartyak kartyak = new Kartyak();

        System.out.println(jatekos1.getName() + ": " + kartyak.generator() + " " + kartyak.generator());
        System.out.println(jatekos2.getName() + ": " + kartyak.generator() + " " + kartyak.generator());

    }

}
