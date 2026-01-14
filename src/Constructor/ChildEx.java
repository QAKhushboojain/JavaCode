package Constructor;
// Constructor used with inheritance and exception declared (checked)
public class ChildEx extends ParentEx {
    ChildEx() throws Exception {
        System.out.println("C");
    }

    public static void main(String[] args) {
        try {
            new ChildEx();
        } catch (Exception e) {
        }
// Explanation: Parent ctor must be handled/declared; called before child prints
    }
}
