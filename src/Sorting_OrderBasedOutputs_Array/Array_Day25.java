package Sorting_OrderBasedOutputs_Array;

public class Array_Day25 {
    public static void main(String[] args) {
        int a [] = {3,1,2};
        java.util.Arrays.sort(a);
        System.out.println(a[a.length-1]);
        //Explanation: last element after sort = max.
        /* java.util.Arrays.sort(a);
✅ Step 2: Sort the array in ascending order
After sorting:

ini
Copy code
a = {1, 2, 3}
Sorting happens inside the same array (no new array).

java
Copy code
System.out.println(a[a.length-1]);

Step 3: Print last element

Let’s break it:

🔹 a.length

= 3

🔹 a.length - 1

= 2 (last index)

So:

a[2] = 3


That is the largest number in sorted array.
         */
    }
}
