package exemplu_banca;

public class Bank extends Colleague {

    private int accountContent;

    public Bank(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void go(Message message) {
        switch (message.getState()) {
            case "debitAccount":
                if (accountContent > message.getAmount()) {
                    accountContent -= message.getAmount();
                    mediator.handle(new Message("fundsOK", accountContent));
                } else {
                    mediator.handle(new Message("fundsNOK", accountContent));

                }
                break;
            default:
                mediator.handle(message);
        }
    }

    public void setAmmout(int amount) {
        this.accountContent = amount;
    }
}
