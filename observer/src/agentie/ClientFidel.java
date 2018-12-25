package agentie;

public class ClientFidel implements Observer {
    private String numeClient;

    public ClientFidel(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void receptionareMesaj(String mesaj) {
        System.out.println(numeClient + " ai pimit mesajul: " + mesaj);
    }
}
