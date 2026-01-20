package InheritancePolymorphism;

public class Test3 {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        System.out.println(p.name);
        p.show();
        // Explanation: Field uses reference type, method uses runtime type
    }
}
