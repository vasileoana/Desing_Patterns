package adapterclase;

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
        PachetMasinaInchiriata pachetMasinaInchiriata = new PachetMasinaInchiriata(masina);
        printeazaRezervare(pachetMasinaInchiriata);

    }
}
