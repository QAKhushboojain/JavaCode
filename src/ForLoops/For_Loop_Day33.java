package ForLoops;

public class For_Loop_Day33 {
    public static void main(String[] args) {
  for(int i =0; i<5; i++)
  {
      if(i==3)
          return; // // in main, ends program
      System.out.print(i + " ");
// Explanation: return exits method. For testers, note difference from break.
  }
    }
}
