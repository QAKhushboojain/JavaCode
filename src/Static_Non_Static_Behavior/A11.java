package Static_Non_Static_Behavior;

public class A11 {
    int i = 10;
    void show()
    {
        System.out.println(this.i);
    }

    public static void main(String[] args) {
        new A11().show();
        // Explanation: this refers to current instance; OK only in instance methods/constructors.
        // Using this in instance method
    }
}
