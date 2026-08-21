import java.util.Scanner;

public class Bank {
    static double balance = 1000;

    static void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully.");
    }

    static void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;
        double amount;

        do {
            System.out.println("\n--- BANKING SYSTEM ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount: ");
                amount = sc.nextDouble();
                deposit(amount);
            }

            else if (choice == 2) {
                System.out.print("Enter amount: ");
                amount = sc.nextDouble();
                withdraw(amount);
            }

            else if (choice == 3) {
                System.out.println("Balance = ₹" + balance);
            }

            else if (choice == 4) {
                System.out.println("Thank you!");
            }

            else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}

Output:
--- BANKING SYSTEM ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 1
Enter amount: 10,000
Amount deposited successfully.

--- BANKING SYSTEM ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 2
Enter amount: 5000
Amount withdrawn successfully.

--- BANKING SYSTEM ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 3
Balance = ?6000.0

--- BANKING SYSTEM ---
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter choice: 4
Thank you!

=== Code Execution Successful ===
