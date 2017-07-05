package modell;

public class Kartyak {

    public Integer generator(){

        int[] kartyak = {11,10,9,8,7,4,3,2};
        int veletlen = (int) (Math.random() * kartyak.length);

        Integer kartya = kartyak[veletlen];

        return kartya;
    }

}
