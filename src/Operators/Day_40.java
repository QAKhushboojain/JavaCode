package Operators;

public class Day_40 {
    public static void main(String[] args) {
        int a [] = {1,2,3};
        int i = 0;
        System.arraycopy(a, i++, a, i++, 1);
        System.out.println(java.util.Arrays.toString(a) + " i=" + i);
// Explanation: evaluation left→right:
//sourcePos = i++ -> 0 (i->1)
//destPos = i++ -> 1 (i->2)
//copies one element a[0] into a[1] -> a becomes [1,1,3]
    }
}
