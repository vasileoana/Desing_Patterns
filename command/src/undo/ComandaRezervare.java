package undo;


public class ComandaRezervare implements Command {
    PachetTuristic pachetTuristic;

    public ComandaRezervare(PachetTuristic pachetTuristic) {
        this.pachetTuristic = pachetTuristic;
    }

    @Override
    public void executa() {
        pachetTuristic.rezervare();
    }

    @Override
    public void unexecute() {
        pachetTuristic.anulareRezervare();
    }
}
