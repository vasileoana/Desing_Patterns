package toma_example;

public class Main {
    public static void main(String[] args) {
        Elephant elephant = new Elephant();
        Cab cab = new Cab();
        elephant.visitElement(cab);
        Truck truck = new Truck();
        elephant.visitElement(truck);
        Person person = new Person();
        person.visitElement(cab);
        person.visitElement(truck);
    }
}
