package main;

import modell.Jatekos;
import modell.Kartya;
import modell.Szolgaltatasok;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Szolgaltatasok szolgaltatasok = new Szolgaltatasok();
        Map<Jatekos, Kartya> jatekosKartyaMap = new HashMap<>();
        ArrayList<Integer> osszegek = new ArrayList<>();

        //játékosok számának meghatározása
        int jatekosokSzama = szolgaltatasok.jatekosSzamlalo();

        //játékosok nevei és első kártya
        for (int k = 0; k < jatekosokSzama; k++) {

            Jatekos jatekos = new Jatekos();
            Kartya kartya = new Kartya();
            jatekosKartyaMap.put(jatekos, kartya);

        }

        for (; ; ) {

            Scanner uj = new Scanner(System.in);

            //alap tét megadása
            int tet = szolgaltatasok.tet();
            int fogadas = jatekosokSzama * tet;

            //játékosok körei
            for (Map.Entry<Jatekos, Kartya> entry : jatekosKartyaMap.entrySet()) {

                System.out.println(entry.getKey().getName() + " jatekos kore, kartyai: ");
                entry.getKey().setPenz(entry.getKey().getPenz() - tet);
                System.out.println("Tet levonva.\nOsszes penz: " + entry.getKey().getPenz());
                entry.getValue().setKartyai();
                for (int i = 0; i < entry.getValue().getKartyai().size(); i++) {
                    System.out.print(szolgaltatasok.kartyak().get(entry.getValue().getKartyai().get(i)) + " ");
                }
                System.out.println();
                int osszeg = entry.getValue().getKartyai().stream().mapToInt(Integer::intValue).sum();

                for (int j = 0; osszeg < 21; j++) {

                    String valasz = szolgaltatasok.osztas();

                    if (valasz.equals("igen")) {

                        entry.getValue().setKartyai();
                        osszeg = entry.getValue().getKartyai().stream().mapToInt(Integer::intValue).sum();
                        System.out.println("A kapott lap: "
                                + szolgaltatasok.kartyak().get(entry.getValue().getKartyai().get(entry.getValue().getKartyai().size() - 1)) + "\n"
                                + entry.getKey().getName() + " kartyai:");
                        for (int i = 0; i < entry.getValue().getKartyai().size(); i++) {
                            System.out.print(szolgaltatasok.kartyak().get(entry.getValue().getKartyai().get(i)) + " ");
                        }
                        System.out.println();
                    } else {
                        if (valasz.equals("nem")) {
                            break;
                        } else {
                            System.out.println("\"igen\"-el vagy \"nem\"-el valaszolj!");
                        }
                    }
                }
                if (osszeg <= 21) {
                    osszegek.add(osszeg);
                } else {
                    osszegek.add(0);
                }
            }

            //kivetel kezelese egyenlo osszeg
            Collections.sort(osszegek);
            int dupla = Collections.frequency(osszegek, osszegek.get(jatekosokSzama - 1));
            if (dupla > 1) {
                fogadas = fogadas / dupla;
                System.out.println(fogadas);
                System.out.println(dupla);
            }

            //Gyoztes megallapitasa
            for (Map.Entry<Jatekos, Kartya> entry : jatekosKartyaMap.entrySet()) {
                if (osszegek.get(jatekosokSzama - 1) == entry.getValue().getOsszeg()) {
                    System.out.println(entry.getKey().getName() + " NYERT!" + "\nOsszege: " + entry.getValue().getOsszeg() + "\nKartyai:");
                    for (int i = 0; i < entry.getValue().getKartyai().size(); i++) {
                        System.out.print(szolgaltatasok.kartyak().get(entry.getValue().getKartyai().get(i)) + " ");
                    }
                    System.out.println("\n");
                    entry.getKey().setPenz(entry.getKey().getPenz() + fogadas);
                    entry.getValue().clearKartyai();
                } else {
                    System.out.println(entry.getKey().getName() + " nem nyert!");
                    entry.getValue().clearKartyai();
                }
                System.out.println(entry.getKey().getName() + " Penze: " + entry.getKey().getPenz() + "\n");
            }

            //Uj jatek kerdese
            System.out.println("Mehet egy következő kör?");
            String ujJatek = uj.nextLine();
            if (ujJatek.equals("igen")) {
                osszegek.clear();
                System.out.println("------- Új kör -------");
            } else {
                if (ujJatek.equals("nem")) {
                    break;
                } else {
                    System.out.println("\"igen\"-el vagy \"nem\"-el valaszolj!");
                }
            }
        }
    }
}