package agentie;

public class Paypal implements ModPlata {
    @Override
    public void plateste(String client, double suma) {
        System.out.println(client + " plateste prin PayPal suma de "+suma+" RON");

    }
}
