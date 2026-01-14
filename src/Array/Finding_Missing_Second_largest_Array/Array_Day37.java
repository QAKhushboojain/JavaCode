package Array.Finding_Missing_Second_largest_Array;

public class Array_Day37 {
    public static void main(String[] args) {
        int a [] = {1,2,3,2,4};
        for(int i = 0; i<a.length; i++)
        {
            for(int j = i+1; j<a.length; j++)
            {
                if(a[i] == a[j])
                    System.out.println(a[i]);
                // Explanation: prints repeating element.
            }
        }
    }
}
