package If_Else_Conditions;

public class Day7 {
    public static void main(String[] args) {
        boolean flag = false;
        if(flag = true)
        {
            System.out.println("Hi");
        }
        else {
            System.out.println("Bye");
            // Hi
            // Because flag = true assigns true, not compares.
            //Always use == for comparison.
        }
    }
}
