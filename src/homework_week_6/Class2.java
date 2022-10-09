package homework_week_6;
/**Write a java programme using the following steps.
 * 2.1 Declare two static variables
 * 2.2 Declare one static method
 * 2.3 Call both static variables into the static method inside the print statement
 * 2.4 Declare main method
 * 2.5 Call the above static method into the main method and run the programme.
 */
public class Class2 {
    static int a = 25;// static variable
    static String name = "Viren Patel";// static variable
    public static void main(String[] args) {
        myMethod();
    }
    //static method
    public static void myMethod(){
        System.out.println(a);
        System.out.println(name);
    }
}
