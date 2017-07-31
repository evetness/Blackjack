package modell;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Szolgaltatasok {

    public String osztas(){

        Scanner input = new Scanner(System.in);
        System.out.println("Kérsz még lapot?");
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
        System.out.println("Játékosok száma?");
        int jatekosokSzama = input.nextInt();
        return jatekosokSzama;

    }

}
