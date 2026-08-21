import java.util.Scanner;

public class ConstraintDesign {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // Constraints
        if (age >= 18 && marks >= 50) {
            System.out.println("Eligible for admission.");
        } else {
            System.out.println("Not eligible for admission.");
        }

        sc.close();
    }
}

Output:
Enter your age: 22
Enter your marks: 75
Eligible for admission.

=== Code Execution Successful ===
