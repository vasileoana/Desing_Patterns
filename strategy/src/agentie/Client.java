package agentie;

public class Client {

    private String nume;
    private ModPlata modPlata;

    public  void plateste(double sumaDePlata){
        modPlata.plateste(this.nume, sumaDePlata);
    }

    public Client(String nume, ModPlata modPlata) {
        this.nume = nume;
        this.modPlata = modPlata;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public ModPlata getModPlata() {
        return modPlata;
    }

    public void setModPlata(ModPlata modPlata) {
        this.modPlata = modPlata;
    }


    public Client(String nume) {
        this.nume = nume;
    }
}
