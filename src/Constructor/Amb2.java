package Constructor;
// Ambiguous constructor call (compile-time)
public class Amb2 {
    Amb2(Integer i, Long l)
    {}
    Amb2(Long l, Integer i)
    {}

    public static void main(String[] args) {
      //  Amb2 a = new Amb2(null, null);
      //  Output
     //   Compile-time error: reference to Amb2 is ambiguous
     //   Explanation: Two overloads equally applicable for null,null leading to ambiguity.

    }
}
