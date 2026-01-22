package InheritancePolymorphism;

public class Test36 {
    public static void main(String[] args) {
        I11 i11= new G();
        I12 i12 = (I12) i11;
// Exception in thread "main" java.lang.ClassCastException: A cannot be cast to I2
//Explanation: A does not implement I2.
    }
}
