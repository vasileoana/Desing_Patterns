import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class WorkQueue {
    private BlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();


    public void enqueue(AsyncTask task){
        taskQueue.add(task);
    }

    public WorkQueue(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(taskQueue.isEmpty());
                ExecutorService executorService = Executors.newFixedThreadPool(10);
                try{
                    while(true){
                        executorService.submit((Runnable)taskQueue.take());
                    }
                } catch (InterruptedException e) {
                    System.out.println("Task execution failed");
                }
                finally {
                    executorService.shutdown();
                }
            }
        }).start();
    }
}
