package agentie;

public class NotificatorManager extends Notificator {
    @Override
    public void notifica(Client client, String mesaj) {
        System.out.println("Domnule manager, agentia nu detine date de contact pentru clientul: " + client.getNume());
    }
}
