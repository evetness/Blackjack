package modell;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Kartya {

    private Szolgaltatasok szolgaltatasok = new Szolgaltatasok();
    private ArrayList<Integer> kartyai = new ArrayList<Integer>();

    public Kartya() {
        this.kartyai.add(szolgaltatasok.kartyaGenerator());
    }

    public ArrayList<Integer> getKartyai() {
        return kartyai;
    }

    public void setKartyai() {
        this.kartyai.add(szolgaltatasok.kartyaGenerator());
    }

}
