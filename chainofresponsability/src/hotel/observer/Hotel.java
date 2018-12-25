package hotel.observer;


import hotel.chain.Notificator;
import hotel.chain.NotificatorEmail;
import hotel.chain.NotificatorManager;
import hotel.chain.NotificatorSMS;

import java.util.ArrayList;
import java.util.List;

public class Hotel implements Subject {

    List<Observer> observeri;

    public Hotel() {
        this.observeri = new ArrayList<>();
    }

    @Override
    public void trimiteNotificare(String mesaj) {
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorSms = new NotificatorSMS();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSms.setSuccesor(notificatorEmail);
        notificatorEmail.setSuccesor(notificatorManager);

        for(Observer observer: observeri){
            notificatorSms.notifica((Client)observer, mesaj);
        }
    }

    @Override
    public void adaugaObserver(Observer observer) {
        observeri.add(observer);
    }

    @Override
    public void stergerObserver(Observer observer) {
        observeri.remove(observer);
    }
}
