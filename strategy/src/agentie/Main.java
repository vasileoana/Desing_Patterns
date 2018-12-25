package agentie;


// Este folosit atunci când avem mai mulți algoritmi pentru rezolvarea unei  probleme, iar alegerea implementării se face la run-time.
// Fiecare comportament este dat de o clasă. Definește strategia adoptată la run-time.

public class Main {
    public static void main(String[] args){
        Client client=new Client("Popescu");

        client.setModPlata(new Card());
        client.plateste(300);

        client.setModPlata(new Cash());
        client.plateste(100);
    }
}
