package factorymethod;

public class FactoryPachetTransport implements Factory {
    @Override
    public PachetTuristic createPachet() {
        return new PachetTransport();
    }
}
