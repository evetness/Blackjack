package modell;

import java.util.Scanner;

public class Jatekosok {

    private String neve;

    private Scanner input = new Scanner(System.in);

    public String getName() {
        return neve;
    }

    public void setName(String neve) {
        this.neve = neve;
    }

    public Jatekosok() {
        this.neve = input.nextLine();
    }

}
