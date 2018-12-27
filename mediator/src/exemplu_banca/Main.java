package exemplu_banca;

public class Main {
    public static void main(String[] args) {
        PaymentMediator mediator = new PaymentMediator();
        Bank bank = new Bank(mediator);
        Shop shop = new Shop(mediator);
        bank.setAmmout(1000);
        Client client = new Client(mediator);
        mediator.setBank(bank);
        mediator.setClient(client);
        mediator.setShop(shop);

        client.go(new Message("payShop", 680));
    }
}
