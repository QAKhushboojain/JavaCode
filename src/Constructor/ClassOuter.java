package Constructor;

public class ClassOuter {
    class Inner{
        Inner()
        {
            System.out.println("Inner");
        }

        public static void main(String[] args) {
            ClassOuter outer =  new ClassOuter();
            ClassOuter.Inner in = outer.new Inner();
            // Explanation: Non-static inner class constructor needs outer instance: outer.new Inner().
        }
    }
}
