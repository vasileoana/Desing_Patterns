package exemplu_banca;

public class PaymentMediator implements Mediator {

    private Bank bank;
    private Shop shop;
    private Client client;

    @Override
    public void handle(Message message) {
        switch (message.getState()) {
            case "payShop":
                shop.go(message);
                break;
            case "contactBank":
                message.setState("debitAccount");
                bank.go(message);
                break;
            case "fundsOK":
                shop.go(message);
                message.setState("paymentSuccess");
                client.go(message);
                break;
            case "fundsNOK":
                message.setState("error");
                client.go(message);
                break;
            default:
                message.setState("error");
                client.go(message);


        }
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
