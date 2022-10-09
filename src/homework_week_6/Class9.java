package homework_week_6;
/**  Write a program to convert the upper case to lower case.
 */
import java.util.Scanner;

public class Class9 {
    public static void main(String [] args){
    char chUpper, chLower;
    int ascii;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a Character in Uppercase:");
    chUpper = scanner.next().charAt(0);
    ascii = chUpper;
    ascii = ascii + 32;
    chLower = (char) ascii;
    System.out.println("\nEquivalent Character in Lowercase =" + chLower);
    scanner.close();
    }
}
