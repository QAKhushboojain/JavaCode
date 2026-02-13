package Static_Non_Static_Behavior;

public class A6 {
    static int s = 1;
    int i = 2;
    void display()
    {
        System.out.println(s + " " + i);
    }

    public static void main(String[] args) {
        new A6().display();
        // Explanation: instance method can access both static and instance members.
        //Can instance method access static and instance members
    }
}
