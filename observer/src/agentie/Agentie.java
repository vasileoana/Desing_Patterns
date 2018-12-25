package agentie;

import java.util.ArrayList;
import java.util.List;

public class Agentie implements Subject {
    private List<Observer> observerList;
    private String numeAgentie;

    public Agentie(String numeAgentie) {
        this.observerList = new ArrayList<>();
        this.numeAgentie = numeAgentie;
    }

    @Override
    public void adaugaObserver(Observer observer) {
        this.observerList.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        for (Observer observer : observerList) {
            observer.receptionareMesaj(mesaj);
        }
    }

    public void notificareOfertaNoua(){
        trimiteNotificare("A fost adaugata o noua oferta! Consultati catalogul de produse!");
    }

    public void notificareReducerePret(){
        trimiteNotificare("Preturile au fost reduse. Consultati noul catalog!");
    }
}
