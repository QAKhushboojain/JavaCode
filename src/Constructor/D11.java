package Constructor;
// Constructor and inheritance with method call inside constructor (polymorphism)
public class D11 extends B11{
    int x = 5;
    void print()
    {
        System.out.println("D11 "+x);
    }

    public static void main(String[] args) {
        new D11();
        // Explanation: During parent ctor call, child fields not yet initialized → x default 0 printed. (This demonstrates why calling overridable methods from constructors is dangerous.)
    }
}
