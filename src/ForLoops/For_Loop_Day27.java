package ForLoops;

public class For_Loop_Day27 {
    public static void main(String[] args) {
        int i = 0;
        for(; i<6 ;)
        {
            System.out.println(i);
            i+= (i%2==0)? 1:2;
            // Explanation: non-linear increment pattern
        }
    }
}
