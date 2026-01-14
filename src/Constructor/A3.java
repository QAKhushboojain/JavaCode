package Constructor;
//  Creating array of objects — constructors invoked when elements created
public class A3 {
    A3()
    {
        System.out.println("A3");
    }
    public class Main{
        public static void main(String[] args) {
            A3 arr [] = new A3[3];
            arr[0] = new A3();
            // Explanation: new A3[3] creates array only (no object construction); elements constructed when new A3() called.
        }
    }
}
