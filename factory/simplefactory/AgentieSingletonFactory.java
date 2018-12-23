package simplefactory;

public class AgentieSingletonFactory {

    public static AgentieSingletonFactory instanta = null;

    private  AgentieSingletonFactory(){};

    public static synchronized AgentieSingletonFactory getInstanta(){
        if(instanta == null){
            instanta = new AgentieSingletonFactory();
        }
        return instanta;
    }

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
