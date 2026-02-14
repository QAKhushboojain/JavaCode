package Static_Non_Static_Behavior;

public class A16 {
    static int get()
    {
        return 5;
    }

    public static void main(String[] args) {
        System.out.println(get()*2);
        // Explanation: static method returns int used in calculation.
        // Static method with return value used in expression
    }
}
