package Constructor;
// Constructor & final fields initialization
public class Fin {
    final int x;
    Fin(int v)
    {
        x = v;
    }

    public static void main(String[] args) {
        System.out.println(new Fin(7).x);
        // Explanation: Final fields must be initialized; done in constructor.
    }
}
