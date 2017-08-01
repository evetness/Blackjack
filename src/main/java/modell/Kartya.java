package modell;

import java.util.ArrayList;

public class Kartya {

    private Szolgaltatasok szolgaltatasok = new Szolgaltatasok();
    private ArrayList<Integer> kartyai = new ArrayList<>();

    public Kartya() {
    }

    public ArrayList<Integer> getKartyai() {
        return kartyai;
    }

    public void setKartyai() {
        this.kartyai.add(szolgaltatasok.kartyaGenerator());
    }

}
