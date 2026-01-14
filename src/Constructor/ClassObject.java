package Constructor;

public class ClassObject {
    ClassObject()
    {
        System.out.println("No Argument");
    }
    ClassObject(int x)
    {
        System.out.println("int "+x);
    }

    public static void main(String[] args) {
        ClassObject arr [] = {new ClassObject(), new ClassObject(3)};
        // Explanation: Each array element constructs object in declared order.
    }
}
