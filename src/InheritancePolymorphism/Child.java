package InheritancePolymorphism;

public class Child extends  Parent{
    public class Test1{
        public static void main(String[] args) {
            Child c = new Child();
            c.show();
            // Explanation: Child inherits show() from Parent.
        }
    }

}
