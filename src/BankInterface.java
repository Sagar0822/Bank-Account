public interface BankInterface {

     //int getbalance();
    String depositMoney(int amount);
    String widhdraw(int amount , String password);
    double calculateInterest(int time);
}
