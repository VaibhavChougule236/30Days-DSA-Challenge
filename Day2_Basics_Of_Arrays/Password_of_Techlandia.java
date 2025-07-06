package Day1_Day30_Dsa.Day2_Basics_Of_Arrays;

import java.util.*;

public class Password_of_Techlandia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> password = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            password.add(scanner.nextInt());
        }
        String[] validationResult = new String[1];
        int[] mostFrequentElement = new int[1];
        validatePassword(password, validationResult, mostFrequentElement);
        System.out.println(validationResult[0]);
        System.out.println(mostFrequentElement[0]);
    }

    private static void validatePassword(List<Integer> password, String[] result, int[] mostFrequentElement) {
//        Every number must appear an even number of times.
//
//         At least one number must appear exactly twice.
//
//         Also, you must output the most frequent number (if there’s a tie, pick the smallest).
if(password.size()%2!=0) result[0]="INVALID";
        Map<Integer,Integer> map=new HashMap<>();
        for(int i = 0; i < password.size(); i++) {
            map.put(password.get(i),map.getOrDefault(password.get(i),0)+1);
        }

        boolean hasExactlyTwo = false;
        boolean isValid = true;
        int maxFreq = 0;
        int minElement = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int count = entry.getValue();

            if (count % 2 != 0) {
                isValid = false;  // found odd count
            }
            if (count == 2) {
                hasExactlyTwo = true;
            }

            if (count > maxFreq) {
                maxFreq = count;
                minElement = key;
            } else if (count == maxFreq && key < minElement) {
                minElement = key;
            }
        }

        if (!isValid || !hasExactlyTwo) {
            result[0] = "INVALID";
        } else {
            result[0] = "VALID";
        }
        mostFrequentElement[0] = minElement;
    }



}
