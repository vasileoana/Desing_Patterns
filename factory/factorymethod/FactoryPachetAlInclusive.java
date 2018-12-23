package factorymethod;

public class FactoryPachetAlInclusive implements Factory {
    @Override
    public PachetTuristic createPachet() {
        return new PachetAllInclusive();
    }
}
