import java.util.Scanner;

public class Calculator{
    private double a;
    private double b;
    private String operation;

    public Calculator(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public String calculate() {
        switch (operation) {
            case "addition":
            case "+":
                return String.valueOf(a + b);
            case "subtraction":
            case "-":
                return String.valueOf(a - b);
            case "multiplication":
            case "*":
                return String.valueOf(a * b);
            case "division":
            case "/":
                if (b == 0) {
                    return "Error: Division by zero.";
                }
                return String.valueOf(a / b);
            default:
                return "Error: Invalid operation type.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine(); // consume newline
        System.out.print("Enter operation (Addition, Subtraction, Multiplication, Division): ");
        String operation = scanner.nextLine();

        Calculator calc = new Calculator(a, b, operation);
        String result = calc.calculate();

        System.out.println("Result: " + result);
        scanner.close();
    }
}
