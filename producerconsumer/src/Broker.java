import java.util.concurrent.BlockingQueue;

public class Broker {

   private BlockingQueue sharedQueue;

    public Broker(BlockingQueue sharedQueue) {
        this.sharedQueue = sharedQueue;
    }

    public BlockingQueue getSharedQueue() {
        return sharedQueue;
    }
}
