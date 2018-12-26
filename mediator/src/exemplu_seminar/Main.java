package exemplu_seminar;

public class Main {
    public static void main(String[] args) {

        Mediator mediator = new Chat();
        ((Chat) mediator).addUser(new Web(mediator));
        ((Chat) mediator).addUser(new Mobile(mediator));
        User user = new Mobile(mediator);
        user.sendMessage("llalala");
    }
}
