package ForLoops;

public class For_Loop_Day38 {
    public static void main(String[] args) {
        int i = 0;
        for(; i<10; i = i + i/2 + 1){
            System.out.print(i + " ");
        }
// Output (dry-run): start 0 -> 0 + 0/2 +1 =1; prints 0, then i=1 -> 1 + 0 +1 =2 -> prints 1 etc. Sequence:
//0 1 2 3 4 6 9
//Explanation: non-linear increments—dry run required (good advanced question).
        // Output (dry-run): start 0 -> 0 + 0/2 +1 =1; prints 0, then i=1 -> 1 + 0 +1 =2 -> prints 1 etc. Sequence:
        //0 1 2 3 4 6 9
        //Explanation: non-linear increments—dry run required (good advanced question).
    }
}
