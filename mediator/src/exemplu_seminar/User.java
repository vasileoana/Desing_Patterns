package exemplu_seminar;

public abstract class User {
    public Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void sendMessage(String message);

    public abstract void receiveMessage(String message);
}
