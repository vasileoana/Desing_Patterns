package agentie;

public class PaxhetCazare implements PachetTuristic {

    private int cod;

    public PaxhetCazare(int cod) {
        this.cod = cod;
    }

    @Override
    public void vanzare() {
        System.out.println("Pachetul de cazare cu codul " + cod + " a fost vandut");

    }

    @Override
    public void rezervare() {
        System.out.println("Pachetul de cazare cu codul " + cod + " a fost rezervat");

    }
}
