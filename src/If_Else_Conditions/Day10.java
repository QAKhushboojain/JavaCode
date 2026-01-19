package If_Else_Conditions;

public class Day10 {
    public static void main(String[] args) {
        int x = 10, y = 20;
        if(x>y)
            if(x>5){
                System.out.println("A");
            }
        else {
                System.out.println("B");
                // Outer if(x>y) false → inner block skipped.
            }
    }
}
