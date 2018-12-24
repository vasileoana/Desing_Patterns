package adapterobiecte;
//
//  Design pattern-ul Adapter rezolva problema utilizării anumitor clase din framework-uri diferite, care nu au o interfață comună.
//  Clasele existente nu se vor modfică ci se va adăuga noi clase pentru realizarea unui Adapter între acestea. Clasa Wrapper.
//  Utilizarea claselor existente se va face mascat prin intermediul adapterului creat.
//  Important: Adapterul nu adaugă funcționalitate. Funcționalitatea este realizată de clasele existente.

public class Main {

    private static void printeazaRezervare(PachetTuristic pachetTuristic){
        System.out.print("Pentru client: ");
        pachetTuristic.descriere();
        System.out.print("Pentru Operator: ");
        pachetTuristic.rezervaPachet();
    }

    public static void main(String[] args){

        PachetTuristic pachetCazare = new PachetCazare();
        printeazaRezervare(pachetCazare);

        Masina masina = new Masina("Renault", 1400);
        PachetMasinaInchiriata pachetMasinaInchiriata = new PachetMasinaInchiriata(new MasinaInchiriata(masina));
        printeazaRezervare(pachetMasinaInchiriata);

    }
}
