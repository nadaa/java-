public class Account {

    String name;
    private int balance;


    public Account(String name) {
        this.name=name;
    }

    public void deposit(int amount){
        balance+=amount;
    }

    public String getName(){
        return name;
    }

    public int getBalance(){

        return balance;
    }

    public void setAmount(int amount){
        balance=amount;
}

    public int getAmount(){
        return balance;
}

}
