package Constructor;

public class ClassI {
    //  Field initializer vs instance block vs constructor
    int x = initX();
    int initX()
    {
        System.out.println("Field init");
        return  5;
    }
    {
        System.out.println("Instance Block");
    }
    ClassI()
    {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new ClassI();
        // Explanation: Field initializers run before instance blocks and constructor body.
    }

}
