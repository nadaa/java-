public class CheckingAccount extends Account{

    public CheckingAccount(String name) {
        super(name);
    }

    public void  withdraw(int amount){
        int newAmount=getAmount()-amount;
        setAmount(newAmount);
    }
}
