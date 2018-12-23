package simplefactory;

public class AgentieFactory {

    public PachetTuristic createPachet(TipPachet pachet) throws Exception {
        switch (pachet) {
            case CAZARE:
                return new PachetCazare();
            case TRANSPORT:
                return new PachetTransport();
            case CAZARETRANSPORT:
                return new PachetCazareTransport();
            default:
                throw new Exception("Tipul primit nu este corect");
        }
    }
}
