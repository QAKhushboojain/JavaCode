package If_Else_Conditions;

public class Day6 {
    public static void main(String[] args) {
        int x = 10;
        if(x == 20)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
            // Compilation Error – can’t assign in condition.
            //✅ Use == instead of =
        }
    }
}
