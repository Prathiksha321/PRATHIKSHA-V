import java.util.*;

public class MultipleCounter {
    public static void main(String[] args) {
        // You can change the input array as needed
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        // Map to store count for each number from 1 to 9
        Map<Integer, Integer> countMap = new LinkedHashMap<>();
        for (int i = 1; i <= 9; i++) {
            countMap.put(i, 0);
        }

        for (int num : numbers) {
            for (int i = 1; i <= 9; i++) {
                if (num % i == 0) {
                    countMap.put(i, countMap.get(i) + 1);
                }
            }
        }

        // Print output in the required format
        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            System.out.print(i + ": " + countMap.get(i));
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
