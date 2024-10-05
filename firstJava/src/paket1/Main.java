package paket1;

public class Main {
    public static void main(String[] args) {
        BinekArac binekArac= new BinekArac("Audi","TT",2);
        System.out.println(binekArac.Marka);

        Arac arac = new Arac("Audi","TT",2);
        System.out.println(arac.Marka);
    }
}