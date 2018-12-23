
public class Main {
    public static void main(String[] args) {

        //Asigurarea unei singure instanțe per cheie
        // Imposibilitatea de a instanția direct obiectele corespunzătoare unei chei

        PachetTuristic cazare = new PachetCazare();
        PachetCazare cazare2 = new PachetCazare();
        PachetTransport transport = new PachetTransport();

        try {
            RegistryPachete.register("Cazare", cazare);
            RegistryPachete.register("Transport", transport);
            //RegistryPachete.register("cazare", cazare2);

            RegistryPachete.getPachet("Cazare").descriere();
            RegistryPachete.getPachet("Transport").descriere();

        } catch( Exception ex){
            ex.printStackTrace();
        }

    }
}
