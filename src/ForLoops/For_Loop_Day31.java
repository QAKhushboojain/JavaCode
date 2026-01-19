package ForLoops;

public class For_Loop_Day31 {
    public static void main(String[] args) {
        int i = 0;
        while (i<3)
        {
            int j = 0;
            while (j<i)
            {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
            i++;
            // Explanation: nested while triangular.
        }
    }
}
