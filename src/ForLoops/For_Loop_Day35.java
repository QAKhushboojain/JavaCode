package ForLoops;

public class For_Loop_Day35 {
    public static void main(String[] args) {
        int n = 3;
        for(int i = 1; i<=n; i++)
        {
            for(int j = 1; j<=n ; j++){
                System.out.print(i*j + " ");

            }
            System.out.println();
            // Explanation: nested loops produce table.
        }
    }
}
