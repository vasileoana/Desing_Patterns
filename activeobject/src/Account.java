public class Account {
    //This class does NOT conform to the active object pattern.
    //The class is dangerous in a multithreading scenario because both methods can be called simultaneously
    private int amount = 0;

    public int getAmount(){
        return amount;
    }

    public void deposit(int sum){
        if(sum > 0){
            amount += sum;
        }
    }

    public void withdraw(int sum){
        if(amount - sum > 0){
            amount -= sum;
        }
    }
}
