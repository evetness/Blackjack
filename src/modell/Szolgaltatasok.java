package modell;

import java.util.Scanner;

public class Szolgaltatasok {

    Scanner input = new Scanner(System.in);

    public String osztas(){

        System.out.println("Kérsz még lapot?");
        String valasz = input.nextLine();
        return valasz;

    }

//    public Integer jatekosok(){
//        System.out.println("Játékosok száma?");
//        int jatekosokSzama = input.nextInt();
//        return jatekosokSzama;
//    }
}
