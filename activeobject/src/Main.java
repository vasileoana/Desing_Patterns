public class Main {
    public static void main(String[] args) throws InterruptedException {
        AccountTask task = new AccountTask();
        task.deposit(100);
        task.withdraw(50);
        //actiunile se vor face sincron datorita structurii BlockingQueue
    }
}
