package robots;

public class DefectiveRobot implements Receiver {
    @Override
    public void start() {
        System.out.println("Robot started");
    }

    @Override
    public void forward() {
        System.out.println("Attempting to kill all humans");

    }

    @Override
    public void stop() {
        System.out.println("Robot stopped from mission control");

    }
}
