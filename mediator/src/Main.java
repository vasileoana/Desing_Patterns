//Definește un obiect care încapsulează modul în care interacționează o mulțime de obiecte •Definește un intermediar pentru decuplarea relațiilor multiple
//Mediator pattern is used to reduce communication complexity between multiple objects or classes.
// This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.
public class Main {
    public static void main(String[] args) {
    User roger = new User("Roger");
    User john = new User("John");

    roger.sendMessage("HI JOHN");
    john.sendMessage("HI");
    }
}
