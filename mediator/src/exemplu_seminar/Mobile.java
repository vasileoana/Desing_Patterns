package exemplu_seminar;

public class Mobile extends User {

    public Mobile(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void sendMessage(String message) {
        super.mediator.sendMessage(message);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(message);
    }
}
