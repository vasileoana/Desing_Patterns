package agentie;

public class Card implements  ModPlata {
    @Override
    public void plateste(String client, double suma) {
        System.out.println(client + " plateste cu cardul suma de " + suma + " RON");

    }
}
