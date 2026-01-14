package Finding_Missing_Second_largest_Array;

public class Array_Day36 {
    public static void main(String[] args) {
        int a [] = {1,2,4,5}; // here 3 is missing
        int n = 5;
        int total = n*(n+1)/2;
        int sum = 0;
        for (int v :a)
        {
            sum += v;
        }
        System.out.println(total-sum);
        // Explanation: sum difference = missing number.
    }
}
