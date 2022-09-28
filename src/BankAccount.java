import java.util.Objects;
import java.util.Random;

public class BankAccount {

    private double checkingBalance;
    private double savingsBalance;
    private static int NUM_OF_ACCOUNTS;
    private static double ALL_THE_MONEY;
    private static int ACCOUNT_NUMBER;



    BankAccount(){
        NUM_OF_ACCOUNTS++;
    }

    public void depositMoney(double amount, String accountType){
        if(Objects.equals(accountType, "checking")){
            this.checkingBalance += amount;
        } else {
            this.savingsBalance += amount;
        }
        ALL_THE_MONEY += amount;
    }

    public void withdrawMoney(double amount, String accountType){
        // WE CAN DO BOTH CHECKS WITH && OR WITH NESTED IF STATEMENT.
        if(Objects.equals(accountType, "checking") && checkingBalance >= amount){
            checkingBalance -= amount;
        } else if(savingsBalance >= amount){
            this.savingsBalance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
        ALL_THE_MONEY -= amount;
    }

    public void checkBalance(){
        System.out.format("Total Balance: $%.2f\n", checkingBalance + savingsBalance);
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    private long genRandAccountNumber(){
        long accNum = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        return accNum;
    }

    public long showAccountNumber(){
        return genRandAccountNumber();
    }

}
