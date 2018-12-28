public class Main {
    public static void main(String[] args) {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.doTask(new SyncTask("testsync", null));

        Responder responder = new Responder();
        dispatcher.doTask(new AsyncTask("testasync", responder));
    }
}
