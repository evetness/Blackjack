package modell;

import java.util.ArrayList;
import java.util.Scanner;

public class Jatekosok {

    private String neve;
    private Scanner input = new Scanner(System.in);
    private Kartyak kartyak = new Kartyak();
    private ArrayList<Integer> kartyai = new ArrayList<Integer>();

    public Jatekosok() {
        this.neve = input.nextLine();
        this.kartyai.add(kartyak.generator());
    }

    public ArrayList<Integer> getKartyai() {
        return kartyai;
    }

    public void setKartyai() {
        this.kartyai.add(kartyak.generator());
    }

    public String getName() {
        return neve;
    }

    public void setName(String neve) {
        this.neve = neve;
    }

}
