package Constructor;
// Copy constructor pattern (manual)
public class Copy {
    int x;
    Copy(int x)
    {
      this.x = x;
    }
    Copy(Copy other)
    {
        this.x = other.x;
        System.out.println("Copied");
    }

    public static void main(String[] args) {
        Copy a = new Copy(9);
        Copy b = new Copy(a);
        System.out.println(b.x);
        // Explanation: Java has no built-in copy ctor; user-defined copy constructor used.
    }
}
