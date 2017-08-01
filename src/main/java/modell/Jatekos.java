package modell;

import java.util.Scanner;

public class Jatekos {

    private String neve;
    private Integer penz;
    private Scanner input = new Scanner(System.in);

    public Jatekos() {
        System.out.println("Jatekos neve:");
        this.neve = input.nextLine();
        this.penz = 500;
    }

    public Integer getPenz() {
        return penz;
    }

        public void setPenz(Integer penz) {
        this.penz = penz;
    }

    public String getName() {
        return neve;
    }

    public void setName() {
        this.neve = input.nextLine();
    }

}
