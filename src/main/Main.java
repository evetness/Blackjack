package main;

import modell.Jatekos;
import modell.Szolgaltatasok;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Szolgaltatasok szolgaltatasok = new Szolgaltatasok();
        ArrayList<Jatekos> jatekosokOsszesen = new ArrayList<>();

//        int jatekosokSzama = szolgaltatasok.jatekosok();

        System.out.println("Játékosok száma?");
        int jatekosokSzama = input.nextInt();

        for(int k = 0 ;k <= jatekosokSzama - 1 ; k++ ){
            System.out.println("Játékos neve:");
            Jatekos jatekos = new Jatekos();
            jatekosokOsszesen.add(jatekos);
        }

        for (int i = 0; i <= jatekosokOsszesen.size()-1; i++) {

            System.out.println(jatekosokOsszesen.get(i).getName() + " játékos köre!");
            int osszeg = jatekosokOsszesen.get(i).getKartyai().stream().mapToInt(Integer::intValue).sum();
            System.out.println(jatekosokOsszesen.get(i).getName() + " kártyái:" + jatekosokOsszesen.get(i).getKartyai() + ", összesen: " + osszeg);

            for (int j = 0; osszeg < 21; j++){

                String valasz = szolgaltatasok.osztas();

                if (valasz.equals("igen")) {

                    jatekosokOsszesen.get(i).setKartyai();
                    System.out.println("A kapott lap: " + jatekosokOsszesen.get(i).getKartyai().get(jatekosokOsszesen.get(i).getKartyai().size()-1));
                    osszeg = jatekosokOsszesen.get(i).getKartyai().stream().mapToInt(Integer::intValue).sum();
                    System.out.println(jatekosokOsszesen.get(i).getName() + " kártyái:" + jatekosokOsszesen.get(i).getKartyai() + ", összesen: " + osszeg);

                } else {

                    System.out.println(jatekosokOsszesen.get(i).getName() + " kártyái:" + jatekosokOsszesen.get(i).getKartyai() + ", összesen: " + osszeg);
                    break;

                }
            }

        }

        for (int i = 0; i <= jatekosokOsszesen.size() - 1; i++) {

            System.out.println(jatekosokOsszesen.get(i).getName() + " kártyái:" + jatekosokOsszesen.get(i).getKartyai() + ", összesen: " + jatekosokOsszesen.get(i).getKartyai().stream().mapToInt(Integer::intValue).sum());
            jatekosokOsszesen.get(i).getKartyai().stream().mapToInt(Integer::intValue).sum();

        }


    }

}