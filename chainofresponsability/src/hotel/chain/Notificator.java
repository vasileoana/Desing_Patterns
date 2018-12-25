package hotel.chain;

import hotel.observer.Client;

public abstract class Notificator {

    public Notificator succesor;

    public Notificator getSuccesor(){
        return this.succesor;
    }

    public void setSuccesor(Notificator succesor) {
        this.succesor = succesor;
    }

    public abstract void notifica(Client client, String mesaj);
}
