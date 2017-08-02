package modell;

import java.util.ArrayList;

public class Kartya {

    private Szolgaltatasok szolgaltatasok = new Szolgaltatasok();
    private ArrayList<Integer> kartyai = new ArrayList<>();
    private int osszeg;

    public Kartya() {
    }

    public int getOsszeg() {
        return osszeg;
    }

    public void setOsszeg() {
        this.osszeg = getKartyai().stream().mapToInt(Integer::intValue).sum();
    }

    public ArrayList<Integer> getKartyai() {
        return kartyai;
    }

    public void setKartyai() {
        this.kartyai.add(szolgaltatasok.kartyaGenerator());
        this.osszeg = getKartyai().stream().mapToInt(Integer::intValue).sum();
    }

    public void clearKartyai(){
        this.kartyai.clear();
        this.osszeg = 0;
    }

}
