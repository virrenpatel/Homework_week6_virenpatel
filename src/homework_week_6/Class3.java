package homework_week_6;
/**Write a java programme using the following steps.
 * 3.1 Declare one instance and one static variables
 * 3.2 Declare one instance method
 * 3.3 Declare one static method
 * 3.4 Call both instance and static variable into both instance and static methods inside the print statement
 * 3.5 Declare main method
 * 3.6 Call both instance and static method into the main method and run the programme.
 */
public class Class3 {
    int a = 20;
    static String name = "Diya Patel";

    public static void main(String[] args) {
    Class3 obj = new Class3();
    obj.myName();
    myWork();
    }
    //instance method
    public void myName() {
        System.out.println(a);
    }
    //static method
    public static void myWork() {
        System.out.println(name);
    }
}
