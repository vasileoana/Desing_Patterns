package hotel;

//UTILIZARE =>
//De fiecare dată când se dorește realizarea de permisiuni pentru anumite
//obiecte sau pentru accesul la anumite modificări ale obiectelor.

public class Main {
    public static void main(String[] args){
        Rezervare rezervare=new Rezervare(2, 111);
        rezervare.anulareRezervare();

        ProxyRezervare proxy=new ProxyRezervare(rezervare) ;
        proxy.anulareRezervare();
    }
}
