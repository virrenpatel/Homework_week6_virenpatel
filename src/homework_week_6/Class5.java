package homework_week_6;
/** Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)
 */
import java.util.Scanner;

public class Class5 {
    public static void main(String[] args) {
    char operator;
    double number1, number2, result;
    // create an object of scanner class
    Scanner scanner = new Scanner(System.in);
    // ask users to enter operator
    System.out.println("Choose an operator : +, -, *, or /");
    operator = scanner.next().charAt(0);
    // ask user to enter numbers
    System.out.println("Enter first number");
    number1 = scanner.nextDouble();
    System.out.println("Enter second number");
    number2 = scanner.nextDouble();
    switch (operator) {
    //performs addition between numbers
    case '+':
    result = number1 + number2;
    System.out.println(number1 + "+" + number2 + "=" + result);
    break;
    // performs subtraction between numbers
    case '-':
    result = number1 - number2;
    System.out.println(number1 + "-" + number2 + "=" + result);
    break;
    // performs multiplication between numbers
    case '*':
    result = number1 * number2;
    System.out.println(number1 + "*" + number2 + "=" + result);
    break;
    // performs division between numbers
    case '/':
    result = number1 / number2;
    System.out.println(number1 + "/" + number2 + "=" + result);
    break;
    default:
    System.out.println("Invalid operator !");
    break;
    }
    scanner.close();
        }

}

