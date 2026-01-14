package Array.TwoPointers_SumPairs_Array;

public class Array_Day26 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int sum = 7;
        for(int i = 0; i<a.length; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                if(a[i]+ a[j] == sum)
                    System.out.println(a[i] + " " + a[j]);
                // Explanation: prints all pairs sum=7
            }
        }
    }
}
