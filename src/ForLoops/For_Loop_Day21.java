package ForLoops;

public class For_Loop_Day21 {
    public static void main(String[] args) {
        for(int i = 0; i<3; i++)
        {
            for(int j = 0; j<3; j++)
            {
                if (i==j)
                    break;
                    System.out.print(i+""+j+ " ");
            }
            System.out.println();
        }
    }
}
