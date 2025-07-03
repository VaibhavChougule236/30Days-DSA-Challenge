package Day1_Day30_Dsa.Day2_Basics_Of_Arrays;
import java.util.*;

public class Mountains_and_Valley {
    public static int isMountainValleyPattern(int[] arr) {
        if (arr.length == 1) return 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) return 0; // no equal elements
        }

        boolean pattern1 = true;
        boolean pattern2 = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                if (!(arr[i] < arr[i + 1])) pattern1 = false;
                if (!(arr[i] > arr[i + 1])) pattern2 = false;
            } else {
                if (!(arr[i] > arr[i + 1])) pattern1 = false;
                if (!(arr[i] < arr[i + 1])) pattern2 = false;
            }
        }

        return (pattern1 || pattern2) ? 1 : 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int result = isMountainValleyPattern(arr);
        System.out.println(result);
    }
}