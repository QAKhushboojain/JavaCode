package ForLoops;

public class For_Loop_Day26 {
    public static void main(String[] args) {
        for(int i = 0; i<4; i++)
        {
            for(int j= 0; j<i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
            // Explanation: prints growing stars.
        }
    }
}
