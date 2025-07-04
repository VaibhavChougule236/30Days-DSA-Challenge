package Day1_Day30_Dsa.Day2_Basics_Of_Arrays;

import java.util.Scanner;

public class Pairin_Lucky_Stones {
    public static int findLuckyStonePairs(int p, int n, int m, int[] stones) {
        int luckyCount = 0;
        for (int i = 0; i < p; i++) {
            if (stones[i] % n == 0 || stones[i] % m == 0) {
                luckyCount++;
            }
        }
        return luckyCount * (luckyCount - 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] stones = new int[p];
        for (int i = 0; i < p; i++) {
            stones[i] = sc.nextInt();
        }
        int result = findLuckyStonePairs(p, n, m, stones);
        System.out.println(result);
    }
}