package se.lexicon;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculation = true;
        double result = 0;

        while (continueCalculation) {
            System.out.print("Enter 1st number: ");
            double number1 = scanner.nextDouble();

            System.out.print("Enter operators + - * /: ");
            char operator = scanner.next().charAt(0);

            System.out.print("Enter 2nd number: ");
            double number2 = scanner.nextDouble();
            try {
                switch (operator) {
                    case '+':
                        result = number1 + number2;
                        break;
                    case '-':
                        result = number1 - number2;
                        break;
                    case '*':
                        result = number1 * number2;
                        break;
                    case '/':
                        if (number2 != 0) {
                            result = number1 / number2;
                        } else {
                            System.out.println("""
                                    Division by zero is not possible""");
                        }
                        break;
                    default:
                        System.out.println("Invalid operators use the given operator");
                        continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
                continue;
            }
                System.out.println("Result = " + result);
                System.out.print("Do you want to perform another calculation? (y/n): ");
            char choice = scanner.next().charAt(0);
            continueCalculation = (choice == 'y' || choice == 'Y');
        }

        System.out.println("Thank you for using the calculator!");
        scanner.close();

    }
}

