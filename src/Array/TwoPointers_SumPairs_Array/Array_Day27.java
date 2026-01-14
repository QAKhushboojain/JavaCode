package Array.TwoPointers_SumPairs_Array;

public class Array_Day27 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        int l = 0, r = a.length-1;
        int sum = 6;
        while (l<r)
        {
          int s = a[l] + a[r];
          if(s == sum)
          {
              System.out.println(a[l] + " " + a[r]);
              l++;
              r--;
          }
          else if(s<sum)
              l++;
          else
              r--;
          // Explanation: two-pointer finds pairs in sorted array.
        }
    }
}
