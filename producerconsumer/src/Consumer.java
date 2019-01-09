public class Consumer implements Runnable {

    Broker broker;

    public Consumer(Broker broker) {
        this.broker = broker;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try{
                System.out.println("Consumed: " + broker.getSharedQueue().take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
