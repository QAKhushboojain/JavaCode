package Constructor;
//  Multiple object creation order in single expression
public class O {
    O()
    {
        System.out.println("O");
    }

    public static void main(String[] args) {
        O a = new O(),
        b = new O();
        // Explanation: Objects created left to right in declaration.
    }
}
