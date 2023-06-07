package practices;

    import java.util.Arrays;
    import java.util.Scanner;

    public class Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter two numbers
            System.out.print("Enter two numbers: ");
            double num1 = scanner.nextDouble();
            double num2 = scanner.nextDouble();

            // Prompt the user to enter an operator
            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform the calculation
            double result;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                // operator doesn't match any case constant (+, -, *, /)
                default:
                    System.out.print("Error! Operator is not correct");
                    return;
            }


            // Print the result
            System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result);
        }
    }

