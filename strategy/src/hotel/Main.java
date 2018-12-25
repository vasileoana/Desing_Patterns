package hotel;

public class Main {
    public static void main(String[] args){
        Client client = new Client("Gigel", new VerificareAmericani());
        client.verificareDocumente();
        client.setModVerificare(new VerificareEuropeniUE());
        client.verificareDocumente();
    }


}
