package Esercizio2;

public class SIM {
    private String numeroTelefono;
    private double credito;
    private Chiamata[] ultimeChiamate;
    private int indiceProssimaChiamata;


    public SIM(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
        this.credito = 0.0;
        this.ultimeChiamate = new Chiamata[5];
        this.indiceProssimaChiamata = 0;
    }


    public void stampaDatiSIM() {
        System.out.println("Numero di telefono: " + numeroTelefono);
        System.out.println("Credito disponibile: " + credito + "€");
        System.out.println("Ultime 5 chiamate:");
        for (Chiamata chiamata : ultimeChiamate) {
            if (chiamata != null) {
                System.out.println(chiamata);
            }
        }
    }

    
    public void aggiungiChiamata(String numeroChiamato, int durataMinuti) {
        ultimeChiamate[indiceProssimaChiamata] = new Chiamata(numeroChiamato, durataMinuti);
        indiceProssimaChiamata = (indiceProssimaChiamata + 1) % 5;
    }


    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public double getCredito() {
        return credito;
    }

    public Chiamata[] getUltimeChiamate() {
        return ultimeChiamate;
    }
}
