
import java.util.*;

public class Assignment {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 2, -4, -6, -2, 8 };
        int k = 4;
        Arrays.sort(arr);
        ArrayList<Integer> ans = findPair(arr, k, arr.length);
        System.out.println("Required combination of  target digit:");
        System.out.println(ans);
    }

    public static int search(int[] arr, int start, int end, int x, int k) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (x == arr[mid])
                return arr[mid];
            else if (arr[mid] > x)
                end = mid - 1;
            else
                start = mid + 1;
        }
        return arr[arr.length - 1];
    }

    public static ArrayList<Integer> findPair(int[] arr, int k, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = k - arr[i];
            // System.out.print(x+" ");
            if (x == search(arr, i + 1, n - 1, x, k)) {
                list.add(arr[i]);
                list.add(x);
            }
        }
        return list;
    }
}
