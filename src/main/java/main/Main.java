package main;

import modell.Jatekos;
import modell.Kartya;
import modell.Szolgaltatasok;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Szolgaltatasok szolgaltatasok = new Szolgaltatasok();
        Map<String, Map<String, Integer>> kartyaMap = new HashMap<>();
        Map<String, ArrayList<Integer>> jatekosKartyaMap = new HashMap<>();

        //játékosok számának meghatározása
        int jatekosokSzama = szolgaltatasok.jatekosSzamlalo();

        //játékosok nevei és első kártya
        for (int k = 0; k < jatekosokSzama; k++) {

            Jatekos jatekos = new Jatekos();
            Kartya kartya = new Kartya();
            jatekosKartyaMap.put(jatekos.getName(), kartya.getKartyai());

        }

        for (Map.Entry<String, ArrayList<Integer>> entry : jatekosKartyaMap.entrySet()) {

            System.out.println(entry.getKey() + " játékos köre, kártyái: " + entry.getValue());
            int osszeg = entry.getValue().stream().mapToInt(Integer::intValue).sum();

            for (int j = 0; osszeg < 21; j++) {

                String valasz = szolgaltatasok.osztas();

                if (valasz.equals("igen")) {

                    entry.getValue().add(szolgaltatasok.kartyaGenerator());
                    System.out.println("A kapott lap: " + entry.getValue().get(entry.getValue().size() - 1));
                    osszeg = entry.getValue().stream().mapToInt(Integer::intValue).sum();
                    System.out.println(entry.getKey() + " kártyái:" + entry.getValue() + ", összesen: " + osszeg);

                } else {

                    System.out.println(entry.getKey() + " kártyái:" + entry.getValue() + ", összesen: " + osszeg);
                    break;

                }
            }
        }
    }
}