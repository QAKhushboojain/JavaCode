package Constructor;
// Constructor used in anonymous class
public class Abc {
    Abc()
    {
        System.out.println("ABC");
    }
    public class Main2{
        public static void main(String[] args) {
            Abc a = new Abc();
            // Explanation: Anonymous subclass of Abc created; Abc constructor runs.
        }
    }
}
