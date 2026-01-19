package ForLoops;

public class For_Loop_Day53 {
    public static void main(String[] args) {
        for(int i =1; i<=5; i++)
        {
            if(i==3)
                continue;
            System.out.println(i);
            // Explanation: When i == 3, continue skips printing that iteration.
        }
    }
}
