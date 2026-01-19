package ForLoops;

public class For_Loop_Day47 {
    public static void main(String[] args) {
        int m[][] = {{1,2},{3,4},{5,6}};
        int x=4;
        int r=-1,c=-1;
        outer:
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                if(m[i][j]==x){ r=i; c=j; break outer; }
            }
        }
        System.out.println(r + "," + c);
// Explanation: locate element coordinates; labeled break to stop early.
    }
}
