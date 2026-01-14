package Constructor;
// Constructor overloading resolution with null (ambiguous)
public class Amb {
    Amb(String s)
    {
        System.out.println("String");
    }
    Amb(Object o)
    {
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Amb a = new Amb(null);
        // Explanation: null matches both; compiler chooses most specific (String is more specific than Object).
    }
}
