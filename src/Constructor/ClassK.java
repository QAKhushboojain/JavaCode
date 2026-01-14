package Constructor;

public class ClassK {
    private ClassK()
    {
        System.out.println("Private");
    }
    public static ClassK get()
    {
        return new ClassK();
    }

    public static void main(String[] args) {
      ClassK obj = new  ClassK().get();
        // Explanation: Private ctor can be called within same class (factory method), prints message.
    }

}
