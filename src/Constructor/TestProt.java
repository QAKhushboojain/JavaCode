package Constructor;
// Constructor and protected accessibility across package (explain)
public class TestProt {
    public static void main(String[] args) {
        new Prot();
        // Explanation: protected allows access within same package; creation succeeds.
    }
}
