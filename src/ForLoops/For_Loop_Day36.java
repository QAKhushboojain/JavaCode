package ForLoops;

public class For_Loop_Day36 {
    public static void main(String[] args) {
        for(int i=0; i<3; i--){
            System.out.println(i);
        }
// (infinite loop until memory/stack issues or manual stop)
//Explanation: wrong decrement causes infinite loop.
    }
}
