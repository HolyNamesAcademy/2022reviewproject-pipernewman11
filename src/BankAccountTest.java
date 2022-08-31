import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {
    BankAccount bankAccount;
    @Before
    public void setUp() throws Exception {
        bankAccount = new BankAccount("Joe", 1000);
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Joe", bankAccount.GetName());
    }

    @Test
    public void getBalance() throws Exception {
        assertEquals(1000, bankAccount.GetBalance(), .01);
    }

    @Test
    public void deposit() throws Exception {
        bankAccount.Deposit(500);
        assertEquals(1500, bankAccount.GetBalance(), .01);
    }

    @Test
    public void withdraw() throws Exception {
        bankAccount.Withdraw(200);
        assertEquals(800, bankAccount.GetBalance(), .01);
    }

    @Test
    public void addInterest() throws Exception {
        bankAccount.AddInterest(5, .02);
        assertEquals(1100, bankAccount.GetBalance(), .01);

    }

}