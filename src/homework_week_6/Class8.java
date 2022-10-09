package homework_week_6;
/** Write a program to calculate the area of a triangle.
 */
import java.util.Scanner;

public class Class8 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the width of the Triangle:");
    double base = scanner.nextDouble();
    System.out.println("Enter the height of the Triangle:");
    double height = scanner.nextDouble();
    //Area = (width*height)/2
    double area = (base* height)/2;
    System.out.println("Area of Triangle is:" + area);
    }
}
