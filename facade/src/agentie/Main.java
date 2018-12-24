package agentie;


//Ușurează lucrul cu framework-uri foarte complexe.
//Realizează o fațadă pentru aceste framework-uri, iar cine dorește să
//utilizeze acele framework-uri, poate folosi această fațadă, fără a fi
//necesară cunoașterea tuturor claselor, metodelor și atributelor din cadrul framework-ului
//ascunde complexitatea framework-ului

public class Main {
    public static void main(String[] args){
        Facade rezervareSejur=new Facade();
        rezervareSejur.rezervaPachetCazareTransport("Bucuresti", "Moeciu de Sus");
    }
}
