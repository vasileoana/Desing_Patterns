public class IntegerConsumerTask implements Runnable {
    private BoundList list;

    public IntegerConsumerTask(BoundList list) {
        this.list = list;
    }

    @Override
    public void run() {
        while(true){
            Integer item;
            try{
                item = list.get();
                System.err.println("processed : " + item);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
