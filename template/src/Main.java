public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare(21312);
        pachetTuristic.vindePachet();

        PachetTuristic pachetTuristicVz = new PachetCazareTransport(56);
        pachetTuristicVz.vindePachet();
    }
}
