package agentie;

public class Main {
    public static void main(String[] args) {
        ClientFidel clientPopescu=new ClientFidel("Popescu");
        ClientFidel clientIonescu=new ClientFidel("Ionescu");
        ClientFidel clientVasilescu=new ClientFidel("Vasilescu");

        Agentie agentie=new Agentie("AgeTur");

        agentie.adaugaObserver(clientVasilescu);
        agentie.adaugaObserver(clientIonescu);
        agentie.notificareOfertaNoua();
        agentie.adaugaObserver(clientPopescu);
        agentie.notificareReducerePret();
    }

}
