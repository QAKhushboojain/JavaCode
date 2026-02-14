package Static_Non_Static_Behavior;
//  Instance method called inside same object multiple times (state change)
public class A14 {
    int count = 0;
    void inc()
    {
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        A14 a = new A14();
        a.inc();
        a.inc();
        // Explanation: instance state persists in the object.
    }
}
