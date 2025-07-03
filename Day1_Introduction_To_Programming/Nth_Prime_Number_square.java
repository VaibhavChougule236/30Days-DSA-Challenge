package Day1_Day30_Dsa.Day1_Introduction_To_Programming;

import java.util.Scanner;

public class Nth_Prime_Number_square {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N= sc.nextInt();
        System.out.println(squareOfNthPrimeNumber(N));
    }
    public static int squareOfNthPrimeNumber(int n){
        int i=0;
        int num=2;
        int prime=2;
        while(i<n){
            if(isPrime(num)){
                prime=num;
                i++;
            }
            num++;
        }
        return prime*prime;

    }
    public static boolean isPrime(int n){
        if (n <= 1) return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }

        }
        return true;
    }
}
