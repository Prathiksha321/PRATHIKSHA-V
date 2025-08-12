import java.util.Scanner;

public class OddSeriesCustom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for a: ");
        int a = scanner.nextInt();

        int terms = (a % 2 == 0) ? a - 1 : a;

        for (int i = 0; i < terms; i++) {
            int term = 2 * i + 1;
            if (i < terms - 1) {
                System.out.print(term + ", ");
            } else {
                System.out.print(term);
            }
        }
        scanner.close();
    }
}
