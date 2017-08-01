package modell;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Szolgaltatasok {

    public Integer tet(){

        Scanner input = new Scanner(System.in);
        System.out.println("Mennyi legyen az alap tét?\n[5] [10] [20] [50]");
        Integer tet = input.nextInt();
        return tet;

    }

    public String osztas(){

        Scanner input = new Scanner(System.in);
        System.out.println("Kersz meg lapot?");
        String valasz = input.nextLine();
        return valasz;

    }

    public Integer kartyaGenerator(){

        int[] kartyak = {11,10,9,8,7,4,3,2};
        int veletlen = (int) (Math.random() * kartyak.length);

        Integer kartya = kartyak[veletlen];

        return kartya;
    }

    public Integer jatekosSzamlalo(){

        Scanner input = new Scanner(System.in);
        System.out.println("Jatekosok szama?");
        int jatekosokSzama = input.nextInt();
        return jatekosokSzama;

    }

    public Map<Integer,String> kartyak(){

        Map<Integer,String> kartyak = new HashMap<>();

        kartyak.put(11,"Asz");
        kartyak.put(10,"X");
        kartyak.put(9,"IX");
        kartyak.put(8,"VII");
        kartyak.put(7,"VII");
        kartyak.put(4,"Kiraly");
        kartyak.put(3,"Felso");
        kartyak.put(2,"Also");

        return kartyak;
    }

}
