package Constructor;
// Constructor and inheritance with fields initialization
public class ClassB1 extends ClassA1{
    ClassB1()
    {
        System.out.println("B1 "+x);
    }

    public static void main(String[] args) {
        new ClassB1();
        // Explanation: Field x initialized to 10 before A1 constructor prints; A1 then sets x=20; B1 prints updated value.
    }
}
