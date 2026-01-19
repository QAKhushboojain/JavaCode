package ForLoops;

public class For_Loop_Day42 {
    public static void main(String[] args) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        list.add(1); list.add(2); list.add(3);
        for(int i=0;i<list.size();i++){
            if(list.get(i)==2) list.remove(i);
        }
        System.out.println(list);
// Explanation: removing shifts indices — show pitfalls; suggest iterators as fix.
    }
}
