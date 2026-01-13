package Reverse_Rotate_Swap_Array;

public class Array_Day19 {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        int b[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length - 1 - i] = a[i];
        }
        for (int v : b) {
            System.out.println(v);
            // Explanation: reversed into new array
            /* Line 2: int b[] = new int[a.length];

Creates a new array b with same size as a.

Since it's an int array, default values are:

b = [0, 0, 0, 0, 0]


This array will store the reversed values.

Line 3: for(int i = 0; i < a.length; i++)

Loop runs from i = 0 to i = 4.

Line 4: b[a.length - 1 - i] = a[i];

This is the main reverse logic.

🔹 a.length - 1 - i

This gives index from the end of array b.

When i = 0:

b[5 - 1 - 0] = b[4] = a[0] = 1


When i = 1:

b[3] = a[1] = 2
When i = 2:

b[2] = a[2] = 3


When i = 3:

b[1] = a[3] = 4


When i = 4:
b[0] = a[4] = 5
So array b becomes:

Index	0	1	2	3	4
Value	5	4	3	2	1
             */
        }
    }
}

