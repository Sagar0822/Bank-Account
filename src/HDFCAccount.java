import java.util.UUID;

public class HDFCAccount implements BankInterface{

    private String name;
    private String AccountNo;
    private String password;
    private int balance;
    private double rateOfInterest;

    public HDFCAccount(String name, String password, int balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;

        this.rateOfInterest = 5.5;
        this.AccountNo = String.valueOf(UUID.randomUUID());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return AccountNo;
    }

    public void setAccountNo(String accountNo) {
        AccountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "Successfuly added " + amount + '\n' + "New balance is " + this.getBalance();
    }

    @Override
    public String widhdraw(int amount, String enterPassword) {
        if(enterPassword.equals(this.password)){
            if(this.balance < amount)
                return "Insufficient balance";
            else {
                this.balance -= amount;
                return "Successfuly added " + amount + '\n' + "New balance is " + this.getBalance();
            }
        }
        else{
            return "Password incorrect";
        }
    }

    @Override
    public double calculateInterest(int time) {
        return (balance*time*rateOfInterest)/100;
    }
}
