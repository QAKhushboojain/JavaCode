package Constructor;
// Static nested class constructor behaves like normal class
public class ClassOuter2 {
    static class InnerStatic
    {
        InnerStatic()
        {
            System.out.println("Inner Static");
        }

        public static void main(String[] args) {
            new InnerStatic();
            // Explanation: Static nested class is like top-level; no outer instance required.
        }
    }

}
