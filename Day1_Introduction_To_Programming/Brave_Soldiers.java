package Day1_Day30_Dsa.Day1_Introduction_To_Programming;

import java.util.Scanner;

public class Brave_Soldiers {
    public static int countBraveSoldiers(int n) {
        int count=0;
        for(int i=1;i<=n;i++){
            if(isBrave(i)){
                count++;
            }
        }
        return count;
    }

    public static boolean isBrave(int n){
        if(n<=1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countBraveSoldiers(n);
        System.out.println(result);
    }
}
