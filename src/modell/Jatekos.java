package modell;

import java.util.ArrayList;
import java.util.Scanner;

public class Jatekos {

    private String neve;
    private Kartya kartya = new Kartya();
    private Scanner input = new Scanner(System.in);
    private ArrayList<Integer> kartyai = new ArrayList<Integer>();

    public Jatekos() {
        this.neve = input.nextLine();
        this.kartyai.add(kartya.generator());
    }

    public ArrayList<Integer> getKartyai() {
        return kartyai;
    }

    public void setKartyai() {
        this.kartyai.add(kartya.generator());
    }

    public String getName() {
        return neve;
    }

    public void setName() {
        this.neve = input.nextLine();
    }

}
