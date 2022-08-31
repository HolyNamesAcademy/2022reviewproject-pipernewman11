
public class BankAccount {
    private String name;
    private double accountBalance;

    /*
    Initialize the bank account.
     */
    public BankAccount(String in_name, double in_accountBalance)
    {
        // write your code here
        throw new UnsupportedOperationException();
    }

    /*
    Returns the name of the account owner.
    */
    public String GetName()
    {
        // write your code here
        throw new UnsupportedOperationException();
    }

    /*
    Returns the balance in the account.
     */
    public double GetBalance()
    {
        // write your code here
        throw new UnsupportedOperationException();
    }

    /*
    Deposits money to the account. The user can deposit any positive amount of money.
    If the number is not positive, the function does nothing except printing the following string:

    "Sorry, the amount deposited must be greater than 0."

    Returns the amount deposited. If there is an error, the amount deposited is 0.
     */
    public double Deposit(double amount)
    {
        // write your code here
        throw new UnsupportedOperationException();
    }

    /*
    Withdraw money from the account. The user must withdraw a positive amount of money,
    AND the user cannot withdraw more money than the account balance (the user can't
    withdraw more money than he has. Here are the error messages the function can print:

    "Sorry, the amount withdrawn must be greater than 0."
    "Sorry, you cannot withdraw more than the account balance."

    Returns the amount withdrawn. If there is an error, the amount withdrawn is 0.
     */
    public double Withdraw(double amount)
    {
        // write your code here
        throw new UnsupportedOperationException();
    }

    /*
    When money sits in a bank account, it accumulates interest. This function adds interest
    to the account balance.

    Interest added = account balance * number of years * interest rate

    Error messages:
    "Sorry, the number of years must be an integer greater than 0."
    "Sorry, the interest rate must be greater than 0."
    Returns the amount of interest added. If there is an error, the amount added is 0.
     */
    public double AddInterest(int numYears, double interestRate)
    {
        // write your code here
        throw new UnsupportedOperationException();
    }

    /* Returns true if two bank accounts are "equal". For our purposes,
    they are equal if the names and the balances are the same.
     */
    public boolean equals(Object other) {
        // If points to the same object, return true
        if (other == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(other instanceof BankAccount)) {
            return false;
        }

        BankAccount otherAccount = (BankAccount) other;

        if (!name.equals(otherAccount.name)) {
            return false;
        }

        if (Math.abs(accountBalance - otherAccount.accountBalance) > 0.1) {
            return false;
        }

        return true;
    }
}
