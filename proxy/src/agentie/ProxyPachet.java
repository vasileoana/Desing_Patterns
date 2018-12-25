package agentie;

public class ProxyPachet implements PachetTuristic {

    private PachetTransport pachet;

    public ProxyPachet(PachetTransport pachet) {
        this.pachet = pachet;
    }

    public PachetTransport getPachet() {
        return pachet;
    }

    public void setPachet(PachetTransport pachet) {
        this.pachet = pachet;
    }

    @Override
    public void descriere() {
        pachet.descriere();
    }

    @Override
    public void rezervaPachet() {
        if(pachet.getPersoana().getVarsta() >= 65){
            pachet.rezervaPachet();
        } else {
            System.out.println("Rezervarea nu este permisa, deoarece " + pachet.getPersoana().getNume() + " are doar "
                    + pachet.getPersoana().getVarsta() + " ani.");
        }
    }
}
