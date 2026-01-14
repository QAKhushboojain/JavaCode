package Constructor;
// Constructor with varargs
public class Var {
    Var(int... v) {              // ✅ varargs constructor
        System.out.println(v.length);
    }

    public static void main(String[] args) {
        new Var();               // 0 arguments → length = 0
        new Var(1, 2, 3);        // 3 arguments → length = 3
    }
}
