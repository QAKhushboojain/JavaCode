package ForLoops;

public class For_Loop_Day41 {
    public static void main(String[] args) {
        int a [] = {1,2,3,4};
        boolean found=false;
        for(int i=0;i<a.length;i++){
            if(a[i]==3){ found=true; break; }
        }
        System.out.println(found);
// Explanation: typical search pattern using break.
    }
}
