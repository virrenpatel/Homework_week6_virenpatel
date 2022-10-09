package homework_week_6;
/** Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r).
 */
import java.util.Scanner;

public class Class6 {
    public static void main(String [] args){
    int r;
    double pi = 3.14, area;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter radius of circle:");
    r = scanner.nextInt();
    area = pi * r * r;
    System.out.println("Area of circle:"+area);
    scanner.close();
    }
}
