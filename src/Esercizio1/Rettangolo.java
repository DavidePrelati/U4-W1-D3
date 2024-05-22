package Esercizio1;

public class Rettangolo {
    private double altezza;
    private double base;

    public Rettangolo() {
        this.altezza = altezza;
        this.base = base;
    }


    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Rettangolo{" +
                "altezza=" + altezza +
                ", base=" + base +
                '}';
    }

    public double calcolaPerimetro() {
        return 2 * (base + altezza);
    }


    public double calcolaArea() {
        return base * altezza;
    }
}
