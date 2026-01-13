package Sum_Aggregates_forEach_Array;

public class Array_Day13
{
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int sum = 0;
        for(int v : a)
        sum += v;
        System.out.println(sum);
        // Explanation: sum 1+2+3+4+5 = 15.
    }
}
