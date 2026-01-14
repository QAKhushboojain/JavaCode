package Constructor;

public class ClassT {
    // Constructor throws exception (checked)
    ClassT() throws Exception
    {
        throw new Exception("Fail");
    }

    public static void main(String[] args) {
        try
        {
            new ClassT();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            // Explanation: Constructor can throw; must be handled by caller.
        }
    }
}
