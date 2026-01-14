package Constructor;

public class Child extends Parent{

      public  Child()
        {
            System.out.println("Child()");
        }

        public static void main(String[] args) {
            new Child();
            // Explanation: super() implicitly called first; parent ctor runs before child.
        }
    }

