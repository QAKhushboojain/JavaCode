package ForLoops;

public class For_Loop_Day19 {
    public static void main(String[] args) {
        for(int i = 1; i<=3; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.println(j + "");
            }
            System.out.println();
            // Explanation: common triangular pattern.
        }
    }
}
