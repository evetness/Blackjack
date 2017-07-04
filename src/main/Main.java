package main;

import modell.Jatekosok;
import modell.Kartyak;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Első játékos neve:");
        String elsoNeve = input.nextLine();

        System.out.println("Masodik játékos neve:");
        String masodikNeve = input.nextLine();

        System.out.println("Harmadik játékos neve:");
        String harmadikNeve = input.nextLine();


        Jatekosok jatekos1 = new Jatekosok(elsoNeve);
        Jatekosok jatekos2 = new Jatekosok(masodikNeve);
        Jatekosok jatekos3 = new Jatekosok(harmadikNeve);
        Kartyak kartyak = new Kartyak();

        System.out.println(jatekos1.getName() + ": " + kartyak.generator());
        System.out.println(jatekos2.getName() + ": " + kartyak.generator());
        System.out.println(jatekos3.getName() + ": " + kartyak.generator());
    }

}
