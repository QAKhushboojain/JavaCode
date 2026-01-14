package Constructor;

public class Constructor_Day1_ClassA {
    // Default constructor printed
    int x ; // instance variable
        public Constructor_Day1_ClassA()
        {
            x  = 5;
            System.out.println("A()");
        }

        public static void main(String[] args) {
            Constructor_Day1_ClassA a = new Constructor_Day1_ClassA();
            System.out.println(a.x);
            // Explanation: Constructor runs when object created; it prints "A()" then x=5 printed.
        }
    }

