TASK 1
class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}

Input
nums =
[-2,1,-3,4,-1,2,1,-5,4]
Output
6

  
TASK 2
  import java.io.*;
import java.util.*;

public class Solution {

    static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int sum = 0;

        // Calculate sum of first m elements
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        if (sum == d) {
            count++;
        }

        // Slide the window
        for (int i = m; i < s.size(); i++) {
            sum = sum + s.get(i) - s.get(i - m);

            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Integer> s = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(birthday(s, d, m));

        sc.close();
    }
}

Input (stdin)
5
1 2 1 3 2
3 2
Your Output (stdout)
2
Expected Output
2
