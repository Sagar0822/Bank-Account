import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String password = sc.next();
        int balance = sc.nextInt();

        System.out.println("Enter your name , password and initial balance");

        SBIAccount sagarAcc = new SBIAccount(name , balance, password);  // create object
        System.out.println("Your account number" + sagarAcc.getAccountNo());

        //getBalance
        System.out.println("Your current balance"+sagarAcc.getBalance());

        //getDeposit
        System.out.println(sagarAcc.depositMoney(500));
        System.out.println("New Balance is" + sagarAcc.getBalance());

        //get Widhdraw
        System.out.println("Enter withdraw amount");
        int amount = sc.nextInt();
        System.out.println("Enter password");
        String enteredPassword = sc.next();
        System.out.println(sagarAcc.widhdraw(amount , enteredPassword));

        //Interest
        System.out.println("Interest for 5 years on your current balance" + sagarAcc.getBalance() +"is"+sagarAcc.calculateInterest(5));
    }
}