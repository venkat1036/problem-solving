import java.util.*;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Write your logic here

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

Output:
5
1
2
3
4
5
1 2 3 4 5 
=== Code Execution Successful ===
