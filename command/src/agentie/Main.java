package agentie;

//Este folosit pentru implementarea lose coupling.
//In acest mod ascunde aplicarea de comenzi, fără se știe concret ce presupune acea comandă.
//Astfel clientul este decuplat de cel ce execută acțiunea.
public class Main {
    public static void main(String[] args) {
    PachetTuristic pachetTuristic = new PaxhetCazare(2);
    Operator operator = new Operator();

    Command vanzare = new ComandaVanzare(pachetTuristic);
    Command rezervare = new ComandaRezervare(pachetTuristic);

    operator.invoca(vanzare);
    operator.invoca(rezervare);

    }
}
