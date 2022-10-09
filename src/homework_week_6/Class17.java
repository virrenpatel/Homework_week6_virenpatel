package homework_week_6;
/**   Write a Java program to convert a decimal number to binary number.
 Input Data:
 Input a Decimal Number : 5
 Expected Output
 Binary number is: 101
 */
import java.util.Scanner;
import java.util.Stack;

public class Class17 {
    public static void main(String [] args) {
    Scanner scanner = new Scanner(System.in);
    // Create Stack object
    Stack<Integer> stack = new Stack<Integer>();
    // User input
    System.out.println("Enter decimal number: ");
    int num = scanner.nextInt();
    while (num != 0)
    {
    int d = num % 2;
    stack.push(d);
    num /= 2;
    }
    System.out.print("\nBinary representation is:");
    while (!(stack.isEmpty() ))
    {
    System.out.print(stack.pop());
    }
    System.out.println();
    scanner.close();
    }
}



