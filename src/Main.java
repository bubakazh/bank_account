public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.depositMoney(1000, "checking");
        account.checkBalance();
        account.withdrawMoney(500, "checking");
        account.checkBalance();
        account.withdrawMoney(501, "checking");
        account.checkBalance();
        double cbal = account.getCheckingBalance();
        System.out.println(String.format("Chk current bal.: $%.2f", cbal));
        double sbal = account.getSavingsBalance();
        System.out.println(String.format("Sv current bal.: $%.2f", sbal));
        account.showAccountNumber();
        long accountNumber = account.showAccountNumber();
        System.out.println(accountNumber);
        // WHERE CAN I INSERT hashCode() AND STILL DISPLAY BOTH ACCT NUMBER & MATCHING HASH?
    }
}

