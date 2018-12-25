package undo;

public class Main {

    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare(234);

        Operator operator = new Operator();

        Command vz = new ComandaVanzare(pachetTuristic);
        Command rz = new ComandaRezervare(pachetTuristic);

        operator.invoca(rz);
        operator.invoca(vz);

        operator.undo();
        operator.undo();

    }
}
