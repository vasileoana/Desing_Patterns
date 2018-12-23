package factorymethod;

public class Main {

//Este asemănător cu Simple Factory doar că nu mai folosește enum ci abstractizează nivelul de creare
    public static void main(String[] args) {
        afisare(new FactoryPachetAlInclusive());
    }

    public static void afisare(Factory factory){
        PachetTuristic pachetTuristic = factory.createPachet();
        pachetTuristic.descriere();
    }
}
