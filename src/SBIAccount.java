import java.util.UUID;

public class SBIAccount implements BankInterface {

    private String name;   //private for encapsulation
    private String accountNo;    //string for unique account no. UUID implement
    private int balance;
    private String password;
    private double rateOfInterest;

    public SBIAccount(String name, int balance, String password) {  //generate constructur
        this.name = name;     // this 3 things user decide
        this.balance = balance;
        this.password = password;

        this.rateOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {   //all methods created by go generate -> setter & getter
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getbalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance +=amount;
        return "Successfully added" + balance;
    }

    @Override
    public String widhdraw(int amount , String enteredPassword) {
        if(enteredPassword.equals(this.password)){
            if(balance<amount)
                return "Insufficient balance";
            else{
                this.balance -= amount;
                return "Successfully widhdrow";
            }
        }
        else{
            return "Password incorrect";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100;
    }
}
