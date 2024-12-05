/**
 * This class creates and manages a bank account
 *
 * @author Jiaxin 
 */
public class BankAccount{
    /**Declares two private variables, one string named "acocuntType" and one double named "balance"*/
    private String accountType;
    private double balance;

    /**
     * Instantiates a BankAccount object
     *
     * @param accountType The account type 
     * @param balance The balance
     */    
    BankAccount(String accountType, double balance){
      this.accountType = accountType;
      this.balance = balance;
    }

     /**
     * Returns the current bank balance. 
     * 
     * @return the balance of the bank account.
     */
    public double getBalance(){
      return balance;
    }

    /**
     * Adds an amount to the balance of the account and rounds balance to nearest hundredth.
     *
     * @param amount The amount that'll be added to the balance.
     */
    public void deposit(double amount) {
      balance = round(balance + amount);
    }

     /**
     * Withdraws an amount from the balance and rounds balance to the nearest one hundredth.
     * <p>
     * PRECONDITION: the amount is assumed to be less than the balance.
     * 
     * @param amount The amount that'll be withdrawn from the account.
     */
    public void withdraw(double amount) {
      balance = round(balance - amount);
    }

    /**
     * Rounds a number to the nearest one hundredth.
     *
     * @param amount The number that'll be rounded to the nearest hundredth.
     */    
    public double round(double amount){
      return Math.round(amount * 100.0)/100.0;
    }
}
