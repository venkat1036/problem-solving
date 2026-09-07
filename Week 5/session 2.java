TASK:3
  import java.io.*;
import java.util.*;

public class Solution {

    static int[] maxSubarray(List<Integer> arr) {

        // Maximum subarray
        int currentSum = arr.get(0);
        int maxSubarray = arr.get(0);

        // Maximum subsequence
        int maxSubsequence = 0;
        int largest = arr.get(0);
        boolean hasPositive = false;

        for (int i = 0; i < arr.size(); i++) {
            int value = arr.get(i);

            // Kadane's algorithm
            if (i > 0) {
                currentSum = Math.max(value, currentSum + value);
                maxSubarray = Math.max(maxSubarray, currentSum);
            }

            // Maximum subsequence
            if (value > 0) {
                maxSubsequence += value;
                hasPositive = true;
            }

            // Largest value, needed when all are negative
            if (value > largest) {
                largest = value;
            }
        }

        if (!hasPositive) {
            maxSubsequence = largest;
        }

        return new int[] {maxSubarray, maxSubsequence};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            List<Integer> arr = new ArrayList<Integer>();

            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            int[] result = maxSubarray(arr);

            System.out.println(result[0] + " " + result[1]);
        }

        sc.close();
    }
}

Input (stdin)
2
4
1 2 3 4
6
2 -1 2 3 4 -5
Your Output (stdout)
10 10
10 11

 TASK:4
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0;

        int maxSum = nums[0];
        int currentMax = 0;

        int minSum = nums[0];
        int currentMin = 0;

        for (int num : nums) {
            // Kadane's algorithm for maximum subarray
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Kadane's algorithm for minimum subarray
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            total += num;
        }

        // If all numbers are negative, circular sum would incorrectly
        // represent an empty subarray, so return the normal maximum.
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum circular sum = total sum - minimum subarray sum
        return Math.max(maxSum, total - minSum);
    }
}

Input
nums =
[1,-2,3,-2]
Output
3
  
  
