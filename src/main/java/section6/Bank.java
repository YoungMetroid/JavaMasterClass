package section6;

public class Bank {

    public static void main(String[]args){

        BankAccount felipeAccount = new BankAccount();
        felipeAccount.SetAccountNumber(1994);
        felipeAccount.DepositFunds(1000);
        System.out.println("Felipe's current balance is: " + felipeAccount.getBalance());
        System.out.println("Felipe withdrew: " + felipeAccount.Withdraw(1200));
        System.out.println("Felipe withdrew: " + felipeAccount.Withdraw(500));
        System.out.println(felipeAccount.getBalance());

    }
}
