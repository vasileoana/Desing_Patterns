public class Producer implements Runnable {

    private Broker broker;
    private static final int BUFFER = 10;

    public Producer(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        for(int i=0; i< BUFFER; i++){
            System.out.println("Produced: " + i);

            try {
                broker.getSharedQueue().put(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
