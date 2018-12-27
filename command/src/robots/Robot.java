package robots;

public class Robot implements Receiver {
    @Override
    public void start() {
        System.out.println("Robot started");
    }

    @Override
    public void forward() {
        System.out.println("Robot moving forward");
    }

    @Override
    public void stop() {
        System.out.println("Robot stopped");
    }
}
