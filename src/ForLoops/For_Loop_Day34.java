package ForLoops;

public class For_Loop_Day34 {
    public static void main(String[] args) {
        int n = 3, num = 1;
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j <=i; j++)
            {
                System.out.print(num++ + " ");
            }
            System.out.println();
            // Explanation: sequential numbering in nested loops.
        }
    }
}
