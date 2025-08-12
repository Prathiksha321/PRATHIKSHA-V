import java.util.Scanner;

public class OddSeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            int term = 2 * i + 1;
            if (i < a - 1) {
                System.out.print(term + ", ");
            } else {
                System.out.print(term);
            }
        }
        scanner.close();
    }
}
