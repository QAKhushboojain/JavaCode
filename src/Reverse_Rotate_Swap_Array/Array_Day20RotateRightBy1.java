package Reverse_Rotate_Swap_Array;

public class Array_Day20RotateRightBy1 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        int last = a[a.length-1];
        for(int i = a.length-1; i>0; i--)
        {
            a[i] = a[i-1];
        }
        a[0] = last;
        for(int v : a)
            System.out.println(v);
        /* Step 2: Store last element

a.length - 1 = 3

So:

last = a[3] = 4;


We save it because it will be overwritten during shifting.

for(int i = a.length-1; i > 0; i--)
    a[i] = a[i-1];

    Step 3: Shift elements to the right

Loop runs from:

i = 3 → 2 → 1

Let’s see each step:

▶ i = 3
a[3] = a[2];   // 3


Array → [1, 2, 3, 3]

▶ i = 2
a[2] = a[1];   // 2
Array → [1, 2, 2, 3]

▶ i = 1
a[1] = a[0];   // 1


Array → [1, 1, 2, 3]

Now all elements have shifted one step right.
Index 0 is still old value and will be replaced next.

a[0] = last;
Step 4: Put last element at first position

We stored:

last = 4


So:

a[0] = 4;
Final array becomes:

[4, 1, 2, 3]
         */
        // Explanation: last moved to front, others shift right
    }
}
