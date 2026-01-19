package ForLoops;

public class For_Loop_Day25 {
    public static void main(String[] args) {
        for(int i = 0; i<3; i++)
        {
            for(int j = i;  j<3; j++)
            {
                System.out.print(i+""+j + " ");
            }
            System.out.println();
            // Explanation: inner j starts from i — common triangular iteration.
        }
    }
}
