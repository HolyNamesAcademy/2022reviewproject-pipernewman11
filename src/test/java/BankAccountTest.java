import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    @Test
    public void canGetNameOfBankAccountOwner() throws Exception {
        String expectedName = "Joe";
        BankAccount bankAccount = new BankAccount(expectedName, 100);
        assertEquals(expectedName, bankAccount.GetName());
    }

    @Test
    public void canGetAccountBalance() throws Exception {
        double expectedBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", expectedBalance);

        assertEquals(expectedBalance, bankAccount.GetBalance(), .01);
    }

    @Test
    public void canDepositFunds() throws Exception {
        double amountToDeposit = 500;
        double startingBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        double amountDeposited = bankAccount.Deposit(amountToDeposit);

        assertEquals(startingBalance + amountToDeposit, bankAccount.GetBalance(), .01);
        assertEquals(amountToDeposit, amountDeposited, .01);
    }

    @Test
    public void doesNotDepositIfDepositAmountIsInvalid() throws Exception {
        double amountToDeposit = -50;
        double startingBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        double amountDeposited = bankAccount.Deposit(amountToDeposit);

        assertEquals(startingBalance, bankAccount.GetBalance(), .01);
        assertEquals(0, amountDeposited, .01);
    }

    @Test
    public void canWithdrawFunds() throws Exception {
        double amountToWithdraw = 200;
        double startingBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        double amountWithdrawn = bankAccount.Withdraw(amountToWithdraw);

        assertEquals(startingBalance - amountToWithdraw, bankAccount.GetBalance(), .01);
        assertEquals(amountToWithdraw, amountWithdrawn, .01);
    }

    @Test
    public void doesNotWithdrawIfWithdrawalAmountIsInvalid() throws Exception {
        double amountToWithdraw = -100;
        double startingBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        double amountWithdrawn = bankAccount.Withdraw(amountToWithdraw);

        assertEquals(startingBalance, bankAccount.GetBalance(), .01);
        assertEquals(0, amountWithdrawn, .01);
    }

    @Test
    public void doesNotWithdrawIfInsufficientFunds() throws Exception {
        double amountToWithdraw = 200;
        double startingBalance = 50;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        double amountWithdrawn = bankAccount.Withdraw(amountToWithdraw);

        assertEquals(startingBalance, bankAccount.GetBalance(), .01);
        assertEquals(0, amountWithdrawn, .01);
    }

    @Test
    public void canAddInterest() throws Exception {
        double startingBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        bankAccount.AddInterest(5, .02);

        assertEquals(1100, bankAccount.GetBalance(), .01);
    }

    @Test
    public void doesNotAddInterestIfNumberOfYearsIsInvalid() throws Exception {
        double startingBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        double interestAdded = bankAccount.AddInterest(-1, .02);

        assertEquals(startingBalance, bankAccount.GetBalance(), .01);
        assertEquals(0, interestAdded, .01);
    }

    @Test
    public void doesNotAddInterestIfInterestRateIsInvalid() throws Exception {
        double startingBalance = 1000;
        BankAccount bankAccount = new BankAccount("Joe", startingBalance);

        double interestAdded = bankAccount.AddInterest(5, -.04);

        assertEquals(startingBalance, bankAccount.GetBalance(), .01);
        assertEquals(0, interestAdded, .01);
    }
}