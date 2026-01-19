package ForLoops;

public class For_Loop_Day28 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        for(int i = 0; i<a.length; i++)
        {
            if(a[i]%2==0)
                continue;
            System.out.println(a[i] + "");
            // Explanation: prints only odd elements.
        }
    }
}
