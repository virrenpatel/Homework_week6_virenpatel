package homework_week_6;
/**Write a java programme using the following steps.
 * 4.1 Declare two instance and two static variables
 * 4.2 Declare one instance method
 * 4.3 Declare one static method
 * 4.4 Call all four instance and static variable into both instance and static methods inside the print statement
 * 4.5 Declare main method
 * 4.6 Call both instance and static method into the main method and run the programme.
 */
public class Class4 {
    int a = 20;
    int b = 10;
    static String name = "Viren";
    static String name1 = "Patel";
    public static void main(String[] args) {
        Class4 obj = new Class4();
        obj.myName();
        myWork();
    }
    //instance method
    public void myName() {
        System.out.println(a);
        System.out.println(b);
    }
    //static method
    public static void myWork() {
        System.out.println(name);
        System.out.println(name1);
    }
}
