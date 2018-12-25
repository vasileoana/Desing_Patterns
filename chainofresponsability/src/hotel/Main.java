package hotel;

import hotel.observer.Client;
import hotel.observer.Hotel;
import hotel.observer.Observer;

public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Observer client1=new Client("Gigel", "07234456", "gigel@gmail.com");
        Observer client2=new Client("Tom", null, "gigel@gmail.com");
        Observer client3=new Client("Bob", null, null);

        hotel.adaugaObserver(client1);
        hotel.adaugaObserver(client2);
        hotel.adaugaObserver(client3);

        hotel.trimiteNotificare("Astazi nu este apa calda intre 15-17");
    }
}
