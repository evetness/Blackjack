package modell;

public class Kartyak {

    public int generator(){

        int[] kartyak = {11,10,9,8,7,4,3,2};
        int random = (int) (Math.random() * kartyak.length);

        Integer kartya = kartyak[random];

        return kartya;
    }

}
