package homework_week_6;
/**   Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.
 */
import java.util.Scanner;

public class Class13 {
    public  static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Input the first number:");
    double x = scanner.nextDouble();
    System.out.println("Input the second number:");
    double y = scanner.nextDouble();
    System.out.println("Input the third number:");
    double z = scanner.nextDouble();
    System.out.println("The average value is " +average(x, y, z)+"\n");
    }
    public static double average(double x, double y, double z)
    {
    return  (x + y + z) / 3;
    }
}
