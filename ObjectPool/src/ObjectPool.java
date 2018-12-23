
import java.util.concurrent.ConcurrentLinkedQueue;

public class ObjectPool {
    private ConcurrentLinkedQueue<Resursa> list;
    private static ObjectPool instance = null;

    public static ObjectPool getInstance() {
        if (instance == null) {
            instance = new ObjectPool();
        }
        return instance;
    }

    private ObjectPool() {
        list = new ConcurrentLinkedQueue<>();
        list.add(new Resursa(1, "desc"));
        list.add(new Resursa(2, "desc2"));
    }

    public Resursa getResursa() {
        System.out.println("Mai sunt: " + instance.list.size() + " resurse!");
        Resursa r = instance.list.poll();
        return r;
    }

    public void releaseResursa(Resursa r) {
        if (r != null) {
            instance.list.offer(r);
        }
    }


}
