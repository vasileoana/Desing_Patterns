//Este folosit pentru modificarea funcționalității unui obiect la runtime
//Este folosit de asemenea pentru adăugarea de noi funcționalități unui obiect la runtime.

public class Main {
    public static void main(String[] args) {
        PachetTuristic pachetTuristic = new PachetCazare();
        pachetTuristic.descriere();
        //acest pachet nu include anularea rezervarii

        OfertaPachetTuristic ofertaPachetTuristic = new OfertaPachetCazare(pachetTuristic);
        ofertaPachetTuristic.descriere();
        ofertaPachetTuristic.anulareRezervare();
        //acest pachet include anularea rezervarii

    }
}
