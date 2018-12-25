package agentie;

public class Cash implements  ModPlata {
    @Override
    public void plateste(String client, double suma) {
        System.out.println(client + " plateste cash suma de " + suma);

    }
}
