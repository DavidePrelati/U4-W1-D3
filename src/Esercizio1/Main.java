package Esercizio1;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo();
        rettangolo.setBase(3.0);
        System.out.println("Base: " + rettangolo.getBase());

        rettangolo.setAltezza(5.0);
        System.out.println("Altezza: " + rettangolo.getAltezza());

        System.out.println("Perimetro: " + rettangolo.calcolaPerimetro());
        System.out.println("Area: " + rettangolo.calcolaArea());
        System.out.println(rettangolo);
    }
}
