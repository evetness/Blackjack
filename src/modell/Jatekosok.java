package modell;

import java.util.Scanner;

public class Jatekosok {

    private String name;

    Scanner input = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jatekosok() {
        System.out.println("Játékos neve:");
        this.name = input.nextLine();
    }

}
