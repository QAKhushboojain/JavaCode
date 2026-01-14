package Constructor;
// Constructor with array parameter and autoboxing
public class Aarr {
    Aarr(int a [])
    {
        System.out.println("int []");
    }
    Aarr(Integer a [])
    {
        System.out.println("Integer []");
    }

    public static void main(String[] args) {
        Aarr a = new Aarr(new int [] {1,2} );
        // Explanation: Exact match chosen; primitive int[] used.
    }
}
