package If_Else_Conditions;

public class Day20 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;
        if(a>b)
            if(b>c)
            {
                System.out.println("A is Largest");
            }
        else {
                System.out.println("C is Largest");
            }
        else if (b>c)
        {
            System.out.println("B is Largest");
        }
        else {
            System.out.println("C is Largest");
        }
    }
}
