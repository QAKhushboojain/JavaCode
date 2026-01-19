package ForLoops;

public class For_Loop_Day20 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        for(int i = 0; i<a.length; i++)
        {
            for(int j = 0; j<a.length; j++)
            {
                System.out.print(a[i] + a[j] + "");
            }
            System.out.println();
            // Explanation: pairwise sums matrix.
        }
    }
}
