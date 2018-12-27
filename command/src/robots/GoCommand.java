package robots;

public class GoCommand implements Command {

    private Receiver receiver;

    public GoCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.start();
        receiver.forward();
    }
}
