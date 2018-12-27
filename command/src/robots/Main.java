package robots;

public class Main {

    public static void main(String[] args) {
        Receiver robotMK1 = new Robot();
        Receiver robotMK2 = new DefectiveRobot();

        Command start1 = new GoCommand(robotMK1);
        Command start2 = new GoCommand(robotMK2);
        Command stop1 = new StopCommand(robotMK1);
        Command stop2 = new StopCommand(robotMK2);

        System.out.println("testing the robots!");

        Invoker invoker = new SimpleInvoker();
        invoker.setCommand(start1);
        invoker.run();
        invoker.setCommand(start2);
        invoker.run();
        invoker.setCommand(stop2);
        invoker.run();
    }
}
