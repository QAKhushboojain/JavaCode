package ForLoops;

public class For_Loop_Day40 {
    public static void main(String[] args) {
        outer:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i*j>1) break outer;
                System.out.println(i + " " + j);
            }
        }
// Explanation: labeled break jumps out of both loops.
    }
}
