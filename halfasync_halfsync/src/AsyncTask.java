public class AsyncTask extends Task implements Runnable {


    public AsyncTask( String name, Responder responder) {
        super(TaskType.LONG, name, responder);
    }

    @Override
    public void run() {
        System.out.println("running async task: " + name);
        responder.notify("finished: " + name);
    }
}
