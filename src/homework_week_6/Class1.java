package homework_week_6;

/**Write a java programme using the following steps.
 * 1.1 Declare two instance variables
 * 1.2 Declare one instance method
 * 1.3 Call both instance variables into the instance method inside the print statement
 * 1.4 Declare main method
 * 1.5 Call the above instance method into the main method and run the programme.
 */
public class Class1 {
    int a = 10; // instance variable
    int b = 20; // instance variable
    public static void main(String[] args) {
        Class1 obj = new Class1();
        obj.myMethod();
    }
    // instance method
    public void myMethod() {
        System.out.println(a);
        System.out.println(b);
    }
}
