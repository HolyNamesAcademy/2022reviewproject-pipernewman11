import java.util.Scanner;

public class BankAccountManager {

    public static void Run() {
        // Initialize the scanner so we can read in user input
        Scanner input = new Scanner(System.in);

        // Read in user input
        System.out.println("What is your name?");
        String customerName = input.nextLine();

        System.out.println("What is your starting account balance?");
        double accountBalance = input.nextDouble();

        // Initialize Bank Account
        BankAccount bankAccount = new BankAccount(customerName, accountBalance);
        while (true)
        {
            // Give user the options and ask for a command
            System.out.println("List of Possible Commands:");
            System.out.println("SeeBalance");
            System.out.println("Deposit <amount>");
            System.out.println("Withdraw <amount>");
            System.out.println("AddInterest <num years> <interest>");
            System.out.println("Quit");
            System.out.print("Please enter a command:");

            // Read the command and process it
            String command = input.next().toLowerCase();
            switch (command)
            {
                case "balance":
                    // Do nothing, the balance will get printed at the end anyway
                    break;
                case "deposit":
                    double depositAmount = input.nextDouble();
                    bankAccount.Deposit(depositAmount);
                    break;
                case "withdraw":
                    double withdrawalAmount = input.nextDouble();
                    bankAccount.Withdraw(withdrawalAmount);
                    break;
                case "addinterest":
                    int numYears = input.nextInt();
                    double interestRate = input.nextDouble();
                    bankAccount.AddInterest(numYears, interestRate);
                    break;
                case "quit":
                    System.out.println("Thanks for using our bank account services. Have a nice day!");
                    return;
                default:
                    System.out.println("Sorry, this is an unrecognized command. Please try again.");
            }

            // Print Account Info and Balance to the user
            PrintAccountInfo(bankAccount);
            System.out.println();
        }
    }

    /*
    Prints the account information like this:

    Name: Serena Williams
    Account Balance: 1000000.00
     */
    public static void PrintAccountInfo(BankAccount account)
    {
        // write your code here

    }
}
