package Reverse_Rotate_Swap_Array;

public class Array_Day18 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5};
        for(int i = 0; i<a.length/2; i++)
        {
            int t = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = t;
        }
        for(int v : a)
            System.out.println(v);
        /* This loop runs only till half of the array.

🔹 Why only half?

Because:

In each step, we swap two elements:

one from the start

one from the end

So swapping half is enough to reverse the whole array.

🔹 a.length / 2 = 5 / 2 = 2 (integer division)
So loop runs for:

i = 0, 1

Line 3: int t = a[i];

Stores the current left-side value in a temporary variable.

Example when i = 0:

t = a[0] = 1


We save it so it’s not lost during swapping.

Line 4: a[i] = a[a.length - 1 - i];

This assigns the right-side value to the left position.

🔹 a.length - 1 - i

This gives the matching index from the end.

When i = 0:

a.length - 1 - i = 5 - 1 - 0 = 4


So:

a[0] = a[4];   // a[0] = 5
Array becomes:

scss
Copy code
[5, 2, 3, 4, 5]   (last value still not replaced yet)

Line 5: a[a.length - 1 - i] = t;

Now we put the saved value t into the right-side position.

When i = 0:

a[4] = t = 1

Array becomes:

[5, 2, 3, 4, 1]
First and last elements are swapped.

Step-by-step:

t = a[1] = 2

a[1] = a[3] = 4

a[3] = t = 2
         */
    }
}
