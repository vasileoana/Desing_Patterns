package exemplu_banca;

public class Message {
    private String state;
    private int amount;

    public Message(String state, int amount) {
        this.state = state;
        this.amount = amount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
