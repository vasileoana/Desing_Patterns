public class Main {
    public static void main(String[] args) {
        BoundList list = new BoundList(5);

        IntegerProducerTask producerTask = new IntegerProducerTask(list);
        IntegerConsumerTask consumerTask = new IntegerConsumerTask(list);
        new Thread(producerTask).start();
        new Thread(consumerTask).start();
    }
}
