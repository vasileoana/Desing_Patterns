package robots;

public class SimpleInvoker implements Invoker {

   private Command command;
   

    @Override
    public void run() {
        command.execute();
    }

    @Override
    public void setCommand(Command c) {
        this.command = c;
    }
}
