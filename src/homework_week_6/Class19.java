package homework_week_6;
/**   Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.
 */
import java.util.Scanner;

public class Class19 {
    public static void main(String [] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input a String: ");
    String line = scanner.nextLine();
    line = line.toLowerCase();
    System.out.println(line);
    scanner.close();
    }
}


