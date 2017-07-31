package modell;

import java.util.Scanner;

public class Jatekos {

    private String neve;
    private Scanner input = new Scanner(System.in);

    public Jatekos() {
        System.out.println("Játékos neve:");
        this.neve = input.nextLine();
    }

    public String getName() {
        return neve;
    }

    public void setName() {
        this.neve = input.nextLine();
    }

}
