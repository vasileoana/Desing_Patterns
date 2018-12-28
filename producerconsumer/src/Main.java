import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        BlockingQueue sharedQueue = new LinkedBlockingQueue();
        Broker broker = new Broker(sharedQueue);
        Thread producer = new Thread(new Producer(broker));
        Thread consumer = new Thread(new Consumer(broker));

        producer.start();
        consumer.start();

    }
}
