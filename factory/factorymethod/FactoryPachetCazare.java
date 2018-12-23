package factorymethod;

public class FactoryPachetCazare implements Factory {
    @Override
    public PachetTuristic createPachet() {
        return new PachetCazare();
    }
}
