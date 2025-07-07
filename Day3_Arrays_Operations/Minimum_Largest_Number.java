package Day1_Day30_Dsa.Day3_Arrays_Operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minimum_Largest_Number {
    public static int findLargestNumber(List<Integer> arr) {
        if (arr == null || arr.size() < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num < firstMin) {
                secondMin = firstMin;
                firstMin = num;
            } else if (num < secondMin) {
                secondMin = num;
            }
        }

        int num1 = firstMin * 10 + secondMin;
        int num2 = secondMin * 10 + firstMin;

        return Math.max(num1, num2); // Placeholder return value
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        // Call user logic function and print the output
        int result = findLargestNumber(arr);
        System.out.println(result);
    }
}

