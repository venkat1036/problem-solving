import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int maxUnique = 0;

        for (int i = 0; i < n; i++) {

            // Add current element
            deque.addLast(arr[i]);
            set.add(arr[i]);

            // Window size maintain cheyyadaniki
            if (deque.size() > m) {
                int removed = deque.removeFirst();

                // Removed element in deque lo inka undho check
                if (!deque.contains(removed)) {
                    set.remove(removed);
                }
            }

            // Current window unique count
            if (deque.size() == m) {
                maxUnique = Math.max(maxUnique, set.size());
            }
        }

        System.out.println(maxUnique);
    }
}
