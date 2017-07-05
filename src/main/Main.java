package main;

import modell.Jatekosok;
import modell.Kartyak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Kartyak kartyak = new Kartyak();
        Scanner input = new Scanner(System.in);

        System.out.println("Játékos neve:");
        Jatekosok elso = new Jatekosok();

        System.out.println("Játékos neve:");
        Jatekosok masodik = new Jatekosok();

        System.out.println("Játékos neve:");
        Jatekosok harmadik = new Jatekosok();

        System.out.println(elso.getName() + ": " + elso.getKartyai());
        System.out.println(masodik.getName() + ": " + masodik.getKartyai());
        System.out.println(harmadik.getName() + ": " + harmadik.getKartyai());

    }
}
