
public class BankAccount {
    private String userName;
    private double accountBalance;

    /*
    Initialize the bank account.
     */
    public BankAccount(String in_userName, double in_accountBalance)
    {
        // write your code here

    }

    /*
    Returns the name of the account owner.
    */
    public String GetName()
    {
        // write your code here

        return "";
    }

    /*
    Returns the balance in the account.
     */
    public double GetBalance()
    {
        // write your code here

        return 0;
    }

    /*
    Deposits money to the account. The user can deposit any positive amount of money.
    If the number is not positive, the function does nothing except printing the following string:

    "Sorry, the amount deposited must be greater than 0."
     */
    public void Deposit(double amount)
    {
        // write your code here

    }

    /*
    Withdraw money from the account. The user must withdraw a positive amount of money,
    AND the user cannot withdraw more money than the account balance (the user can't
    withdraw more money than he has. Here are the error messages the function can print:

    "Sorry, the amount withdrawn must be greater than 0."
    "Sorry, you cannot withdraw more than the account balance."
     */
    public void Withdraw(double amount)
    {
        // write your code here

    }

    /*
    When money sits in a bank account, it accumulates interest. This function adds interest
    to the account balance.

    Interest added = account balance * number of years * interest rate

    Error messages:
    "Sorry, the number of years must be an integer greater than 0."
    "Sorry, the interest rate must be greater than 0."
     */
    public void AddInterest(int numYears, double interestRate)
    {
        // write your code here

    }


}
