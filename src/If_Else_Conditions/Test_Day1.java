package If_Else_Conditions;
// Simple If Condition
public class Test_Day1 {
    public static void main(String[] args) {
        int a = 10;
        if(a>5)
        {
            System.out.println("Inside IF");
            System.out.println("Outside IF");
            // Condition a > 5 → true → first print executes.
            //Second print executes always (not part of if).
        }
    }
}
