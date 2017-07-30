package modell;

import java.util.Scanner;

public class Szolgaltatasok {

    Scanner input = new Scanner(System.in);

    public String osztas(){

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

}
