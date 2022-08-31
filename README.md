Project 1
=========

Good work pledge
-----
We are here to broaden your exposure to Computer Science. We can only achieve that purpose when you work hard and honestly. It may be tempting to copy-paste code from a classmate, or let a classmate do all your work for you—don't! You will be cheating yourself from the most valuable thing course has to offer—overcoming challenges.

We know that hard, and honest work doesn't come easily. If you feel like you are falling behind

1. Don't copy-paste code, or let someone do your work for you
2. Ask for help!
3. Tell the teaching-team you need more time 

Getting started
-----
Go to the [IntelliJ Setup Page](https://holynamesseattle-my.sharepoint.com/personal/ecudaback_holynames-sea_org/_layouts/OneNote.aspx?id=%2Fpersonal%2Fecudaback_holynames-sea_org%2FDocuments%2FClass%20Notebooks%2FProjects%20in%20CS%20MW%20P7%2017-18&wd=target%28_Content%20Library%2FUsing%20the%20Content%20Library.one%7CAF912239-6A74-48A4-BA23-3D819CB96383%2FIntelliJ%20Setup%7CEA8F2C82-E1EE-459F-8521-D24F0460F650%2F%29) in the OneNote (I suggest you look in the OneNote, since it also has screenshots to follow along with, but the instructions are also below) and follow the instructions under "Getting Started With The First Assignment".

1. Go to this link:  https://classroom.github.com/a/9EhOlYCR and accept the assignment. It should take you to your project page. (If it doesn't, click on the link above again, and click on the link to the project page).
2. On the GitHub project page, click on the green "Clone or Download" button and copy the link.
3. Open Intellij, click on the "Checkout from Version Control" drop down and select "GitHub"
4. On the next page paste the link you copied into the "Git Repository URL" box. 
5. Click Clone. You may have to enter your GitHub username and password.
6. If it asks you whether you want to open the project or not, select yes.
7. You should see your project open. If you need to reopen the project, you should see it under "File > Open Recent"

The Project
-----
This project has two parts. The first part is called ShapeMaker. In ShapeMaker, you will implement functions that print out shapes using the '\*' symbol and whitespace. It will be a good exercise to warm up your for loops and if statements. The second part is called BankAccountManager. The BankAccountManager is a bare bones application that allows the user to manage a single bank account by making withdrawals, deposits, and checking the balance. You will implement a BankAcocunt class that manages all of the functionality of a bank account.

ShapeMaker
-----
In order to run ShapeMaker, click on the dropdown next to the play button in the top right and select "ShapeMaker". Then hit play. Since none of the functions have been implemented yet, the program will print nothing. That's okay, though! You shouldn't have hit any compile errors, and that means you are in the perfect place to start.

All of the functionality that you will need to implement is located in the ShapeMaker class. Open this class, and you will see a list of functions that must be implemented, with instructions above each function. Follow the instructions exactly. 

**Extra Credit Opportunity:** write the functions so they don't have extra spaces at the end of the line if they are not needed. So the first line of PrintSquare() should be "\* \* \*" rather than "\* \* \* " (the second one has an extra space at the end). The extra "ShapeMakerExtraCreditTest" config is so that you can test your functions for the extra credit (More on unit tests below).

Start by implementing the first function. Then hit play and see the program run, and see if you implemented it properly. If you get it right, move onto the next function. Otherwise, make whatever corrections you need to make and run it again. I recommend running the program very often. That will allow you to make sure you are on the right track. You should absolutely be running it after each function that you implement.

BankAccountManager
-----
The BankAccountManager is a command line application that allows you to maintain a bank account. First you set up the bank account with a name and a starting balance. After that, it continuously asks the user for a command. It can take several commands:

| Command	| Description |
| ------- | ----------- |
| Balance |	Prints the name and account balance. |
| Deposit <amount> ("Deposit 43") |	Deposit takes in a dollar amount and adds it to the account balance. |
| Withdraw <amount> ("Withdraw 13") |	Withdraw takes in a dollar amount and subtracts it from the account balance, as long as there is enough money in the account. Otherwise, it just prints an error message to the user. |
| AddInterest <num years> <interest rate> ("AddInterest 2 .05") |	Takes in a number of years and an interest rate and calculates the new balance with interest added. For our purposes, we're just using simple interest (Interest = Balance \* Time \* Rate and New Balance = Old Balance + Interest). |
| Quit |	Exits the program. |

Your job is to implement the BankAccount class so that it keeps track of the name and account balance. You will have to implement the constructor, a couple of getters, and a couple of methods. All of those methods can be found in the BankAccount class. You will also have to implement "PrintAccountInfo" function, located in BankAccountManager.

Unit Tests
-----
You'll notice that there are also 3 other configs in the dropdown by the play button. These are 'ShapeMakerTest', 'BankAccountTest', and 'ShapeMakerExtraCreditTest'. These configs allow you to run Unit Tests. We'll learn more about Unit Tests in the next unit, but for now, know that unit tests are test cases that allow you to test specific functions and classes. There is a unit test for almost every function that you will be writing. Unit tests help you determine if you wrote the function correctly. If a unit test passes, that means you are on the right track. Because the unit tests we've given you are not comprehensive (they don't test every possible scenario), it DOES NOT guarantee that you're code is completely right. Make sure you test the functions yourself with different inputs. However, a major portion of the grade will be based on if your unit tests pass, so make sure to run them before you turn them in. You only need to run the The'ShapeMakerExtraCreditTest' unit tests if you plan on completing the extra credit.

Bonus Assignment
-----
Before you work on the bonus assignment, make sure you commit and push, so you don't accidentally break your program for the rest of the assignment. Modify BankAccountManager to support two more commands:

| Command	| Description |
| ------- | ----------- |
| AddUser <name> <balance> ("AddUser John 40") |	First check if an account already exists with the given name. If it does, print an error such as "Sorry, that user already exists. Please pick a new name". If there is no account with that name, then create a new account with that name and balance. |
| SwitchUser <name> ("SwitchUser John") | If the user doesn't exist, print an error ("Sorry, that user doesn't exist. Please create an account for that user first."). Switch the current bank account to the account specified. Once you switch users all of the other commands apply to the new user (Balance shows the new user's balance). For example, if the current account name is "Amy", and the input is "SwitchUser John", first check if the account exists. If it does, set it as the current account. Now when the user inputs "Deposit 10", it will add 10 to John's account. |

In order to support this functionality, you will need to keep track of and store all of the bank accounts. To do that, you will need to use an ArrayList. Whenever you create a new bank account object, you will need to add the bank accounts to this array. You'll need to do this in two places: when you create the first account and when you call "AddUser". When "SwitchUser" is called, you will need to switch the current account to the new account that is specified. You should create a helper function to go through the array and return the account with a given name. 

**Note:** You should not do this in the BankAccount class. In our program, each class has a responsibility. BankAccount has the responsibility to do all operations associated with a single BankAccount. BankAccountManager has the responsibility to tell the BankAccount objects what to do (this includes creating them, storing them, and telling them to deposit or withdraw). So we should be creating the ArrayList and adding all of the new functionality in our BankAccountManager class, and using that to store and fetch BankAccounts. FYI, this isn't the only way to design this program, but it's the way I chose to design it. 

Committing your Changes and Turning In The Project
-----
The same instructions with screenshots are in the OneNote [here](https://holynamesseattle-my.sharepoint.com/personal/ecudaback_holynames-sea_org/_layouts/OneNote.aspx?id=%2Fpersonal%2Fecudaback_holynames-sea_org%2FDocuments%2FClass%20Notebooks%2FProjects%20in%20CS%20MW%20P7%2017-18&wd=target%28_Content%20Library%2FUsing%20the%20Content%20Library.one%7CAF912239-6A74-48A4-BA23-3D819CB96383%2FIntelliJ%20Setup%7CEA8F2C82-E1EE-459F-8521-D24F0460F650%2F%29).

At the end of every class period, you should commit your changes. "Committing your changes" is basically a fancy way of saving the changes you made. It is very important and useful for two reasons:

1. You save your changes online, so you can never lose them. Even if your computer breaks, your changes will still be saved somewhere.
2. You can go back to any previous version that you committed. So if you accidentally make a wrong change that breaks your program, you can always go back to a state where the program was working.

You can commit and push ("push" means send it to GitHub.com to save it there) by doing the steps below:

1. Once you are ready to save your changes, click on VCS > Commit Changes… in the taskbar. 
2. It will show you a list of files that you have made changes to. (It might also show changes to a file called workspace.xml, which you didn’t touch. That's ok, IntelliJ modifies that file behind the scenes). You can double click on any file and see the changes you've made to the file. 
3. Hover over the commit button and select "Commit and Push". It will prompt you, asking if you are sure. Select "Commit", and then on the next page, select "Push".
4. Go to your project page on GitHub, and make sure that your changes are there. 
5. That's it. The last change you submit before the deadline will be considered your turned in assignment. You can turn in additional submissions after the deadline, but remember that there is a 10% penalty added each week after the deadline you turn in the assignment.

Grading Rubric
-----
| | <h4>Points possible</h4>| <h4>Earned points</h4>|
| :----------- |---|------:|
| <h3>Units Tests</h3>| <h3>55 pts</h3>| |
| BankAccount Tests (5 pts * 5 tests) | 25 pts | |
| ShapeMaker Tests (5 pts * 6 tests)| 30 pts | |
| <h3>Code Quality</h3> | <h3>35 pts</h3> | |
| No compile errors | 12 pts | |
| [Responsible error handling](https://beginnersbook.com/2013/04/try-catch-in-java) <!--More advanced guide: https://stackify.com/best-practices-exceptions-java--> | 6 pts | |
| [Code spaced and indented properly](https://stackoverflow.com/questions/17879475/how-enable-auto-format-code-for-intellij-idea) | 12 pts | |
| [Descriptive variable names](http://www.makinggoodsoftware.com/2009/05/04/71-tips-for-naming-variables) | 5 pts | |
| Reasonable breakdown of packages and classes | N/A | |
| [Single-Responsibility Principle (methods and classes do one thing)](http://www.oodesign.com/single-responsibility-principle.html) | N/A | |
| <h3>Administrative</h3> | <h3>20 pts</h3> | |
| Correctly pushed to GitHub | 5 pts | |
| Turned in on time | 15 pts | |
| <h3>Extra Credit</h3> | <h3>10 pts</h3> | |
| No extra spaces at the end of the line | 10 pts | |
| <h3>Total (excluding extra credit)</h3>  | <h3>110 pts</h3> | |
