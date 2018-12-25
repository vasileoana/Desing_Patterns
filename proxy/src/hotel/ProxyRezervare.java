package hotel;

public class ProxyRezervare implements IRezervare {
    Rezervare rezervare;

    public ProxyRezervare(Rezervare rezervare) {
        this.rezervare = rezervare;
    }

    @Override
    public void anulareRezervare() {
        if(rezervare.getNumarNopti() == 1) {
            rezervare.anulareRezervare();
        } else {
            System.out.println("Anularea nu este permisa");
        }
    }
}
