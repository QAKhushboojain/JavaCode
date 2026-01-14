package Array.TwoArrays_SetOperations;

public class Array_Day39 {
    public static void main(String[] args) {
        int a [] = {1,2,2,3};
        int b [] = {2,2,4};
        java.util.Set<Integer> s = new java.util.HashSet<>();
        java.util.Set<Integer> Inter = new java.util.HashSet<>();
        for(int v : a)
        {
            s.add(v);
        }
        for(int v : b)
        {
            if(s.contains(v)) Inter.add(v);
        }
        System.out.println(Inter);
        // Explanation: intersection unique = {2}.
    }
}
