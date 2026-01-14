package Constructor;

public class Constructor_Day1_A {
    // Default constructor printed
    int x ; // instance variable
        public Constructor_Day1_A()
        {
            x  = 5;
            System.out.println("A()");
        }

        public static void main(String[] args) {
            Constructor_Day1_A a = new Constructor_Day1_A();
            System.out.println(a.x);
            // Explanation: Constructor runs when object created; it prints "A()" then x=5 printed.
        }
    }

