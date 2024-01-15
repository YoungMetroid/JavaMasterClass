package section6;

public class BankAccount {

    private double accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public void SetAccountNumber(double accountNumber){
        this.accountNumber = accountNumber;
    }
    public double getAccountNumber(){
        return this.accountNumber;
    }
    public void SetBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void SetCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return this.customerName;
    }
    public void SetEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return this.email;
    }
    public void SetPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void DepositFunds(double amount){
        this.balance = this.balance + amount;
    }
    public double Withdraw(double amount){
        if(amount <= this.balance)
        {
            balance = balance - amount;
            return amount;
        }
        return 0;
    }
}
