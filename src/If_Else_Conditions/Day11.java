package If_Else_Conditions;

public class Day11
{
    public static void main(String[] args) {
        int n = 3;
        if(n % 2 == 0){
            System.out.println("Even");
        }
        else {
            if (n>0)
            {
                System.out.println("Odd Positive");
            }
            else {
                System.out.println("Odd Negative");
            }
        }
    }
}
