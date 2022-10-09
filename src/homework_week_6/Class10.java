package homework_week_6;
/**  Write a Java program that takes a number as input and prints its
 multiplication table up to 10.
 Test Data: Input a number: 8
 Expected Output :
 8 x 1 = 8
 8 x 2 = 16
 8 x 3 = 24
 ...
 8 x 10 = 80
 */
public class Class10 {
    public static void main(String [] args){
    // number n for which we have to print the
    // multiplication table
    int N = 8;
    // looping from 1 to 10 to print the multiplication
    // table of the number
    //using for loop
    for (int i = 1; i <=10; i++) {
    // printing the N*i,ie ith multiple of N.
    System.out.println(N + " * " + i + " = " + N * i);
        }
    }
}
