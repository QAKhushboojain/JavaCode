package Constructor;
// Constructor with side-effect on static field
public class St {
    static int count = 0;
    St()
    {
        count++;
    }

    public static void main(String[] args) {
        new St();
        new St();
        System.out.println(St.count);
        // Explanation: Constructor increments static counter each object creation.
    }
}
