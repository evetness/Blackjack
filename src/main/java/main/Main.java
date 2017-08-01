package main;

import modell.Jatekos;
import modell.Kartya;
import modell.Szolgaltatasok;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Szolgaltatasok szolgaltatasok = new Szolgaltatasok();
        Map<Jatekos, Kartya> jatekosKartyaMap = new HashMap<>();

        //játékosok számának meghatározása
        int jatekosokSzama = szolgaltatasok.jatekosSzamlalo();

        //játékosok nevei és első kártya
        for (int k = 0; k < jatekosokSzama; k++) {

            Jatekos jatekos = new Jatekos();
            Kartya kartya = new Kartya();
            jatekosKartyaMap.put(jatekos, kartya);

        }

        //alap tét megadása
        int tet = szolgaltatasok.tet();

        for (Map.Entry<Jatekos, Kartya> entry : jatekosKartyaMap.entrySet()) {

            int osszeg = 0;
            entry.getValue().setKartyai();
            System.out.println(entry.getKey().getName() + " jatekos kore, kartyai: ");
            for (int i=0; i < entry.getValue().getKartyai().size(); i++){
                System.out.print(szolgaltatasok.kartyak().get(entry.getValue().getKartyai().get(i))+" ");
            }
            System.out.println();

            for (int j = 0; osszeg < 21; j++) {

                String valasz = szolgaltatasok.osztas();

                if (valasz.equals("igen")) {

                    entry.getValue().setKartyai();
                    System.out.println("A kapott lap: " + szolgaltatasok.kartyak().get(entry.getValue().getKartyai().get(entry.getValue().getKartyai().size()-1)));
                    osszeg = entry.getValue().getKartyai().stream().mapToInt(Integer::intValue).sum();
                    System.out.println(entry.getKey().getName() + " kartyai:");
                    for (int i=0; i < entry.getValue().getKartyai().size(); i++){
                        System.out.print(szolgaltatasok.kartyak().get(entry.getValue().getKartyai().get(i))+" ");
                    }
                    System.out.println();

                } else {
                    if(valasz.equals("nem")){
                        break;
                    }else {
                        System.out.println("\"igen\"-el vagy \"nem\"-el valaszolj!");
                    }
                }
            }
        }

        jatekosKartyaMap.forEach((jatekos, kartya) -> System.out.println(jatekos.getName()+" kartyainak osszege: "+kartya.getKartyai().stream().mapToInt(Integer::intValue).sum()));

    }
}