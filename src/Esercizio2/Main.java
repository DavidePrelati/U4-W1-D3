package Esercizio2;

public class Main {
    public static void main(String[] args) {

        SIM sim = new SIM("123-456-7890");


        sim.aggiungiChiamata("987-654-3210", 10);
        sim.aggiungiChiamata("456-789-0123", 5);
        sim.aggiungiChiamata("321-654-9870", 7);
        sim.aggiungiChiamata("789-012-3456", 2);
        sim.aggiungiChiamata("654-321-0987", 4);


        sim.stampaDatiSIM();
    }
}
