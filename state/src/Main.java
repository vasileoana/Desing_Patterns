public class Main {
    public static void main(String[] args) {

        Rezervare rezervare = new Rezervare(32);
        StareNeplatita stareNeplatita = new StareNeplatita();
        stareNeplatita.doAction(rezervare);

        StarePlatita starePlatita = new StarePlatita();
        starePlatita.doAction(rezervare);

    }
}
