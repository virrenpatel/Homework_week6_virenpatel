package homework_week_6;
/** Write a program to insert any temperature value in degree Fahrenheit and
 convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */
import java.util.Scanner;

public class Class7 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("scanner a degree in Fahrenheit:");
    double fahrenheit = scanner.nextDouble();
    double celsius =(( 5 * (fahrenheit - 32.0)) / 9.0);
    System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
    scanner.close();
    }
}
