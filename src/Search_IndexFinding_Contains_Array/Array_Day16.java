package Search_IndexFinding_Contains_Array;

public class Array_Day16 {
    public static void main(String[] args) {
        int a [] = {5,10,15,20};
        int x = 15;
        int idx = -1;
        for(int i = 0; i<a.length; i++)
        {
            if(a[i] == x)
            {
                idx = i;
                break;
            }
        }
        System.out.println(idx);
        // Explanation: 15 found at index 2
    }
}
