package agentie;

public class Facade {
    public void rezervaPachetCazareTransport(String orasPlecare, String orasDestinatie){
        CompanieAeriana companieAeriana = new CompanieAeriana("Airline");
        Zbor zborDus = companieAeriana.rezervaBiletAvion(orasPlecare, orasDestinatie);
        Zbor zborIntors = companieAeriana.rezervaBiletAvion(orasDestinatie, orasPlecare);

        System.out.println(zborDus.toString());
        System.out.println(zborIntors.toString());

        Hotel hotel = new Hotel("Hotel");
        hotel.rezervaCamera(orasDestinatie);

    }
}
