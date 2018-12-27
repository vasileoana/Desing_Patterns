import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class AccountTask {

    private int amount = 0;
    private BlockingQueue<Runnable> dispatchQueue = new LinkedBlockingDeque<>();

    public AccountTask(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    try {
                        dispatchQueue.take().run();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public void deposit(int sum) throws InterruptedException{
        dispatchQueue.put(new Runnable() {
            @Override
            public void run() {
                if(sum > 0){
                    amount += sum;
                }
                System.out.println("deposited " + sum);
            }
        });
    }

    public void withdraw(int sum) throws InterruptedException {
        dispatchQueue.put(
                new Runnable() {
                    @Override
                    public void run() {
                        if (amount - sum > 0) {
                            amount -= sum;
                        }
                        System.out.println("withdrawn " + sum);
                    }
                });
    }
}
