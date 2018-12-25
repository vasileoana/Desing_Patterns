package hotel;

public class Rezervare implements  IRezervare {

    private int numarNopti;
    private int codRezervare;

    public Rezervare(int numarNopti, int codRezervare) {
        this.numarNopti = numarNopti;
        this.codRezervare = codRezervare;
    }

    public int getNumarNopti() {
        return numarNopti;
    }

    public int getCodRezervare() {
        return codRezervare;
    }

    @Override
    public void anulareRezervare() {
        System.out.println("Rezervare cu codul "+codRezervare+" a fost anulata.");
    }
}
