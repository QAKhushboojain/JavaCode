package Operators;

public class Day_35 {
    public static void main(String[] args) {
        int i = 1;
        int x = i++ + ++i + i++;
        System.out.println(i + " " + x);
// Explanation (step-by-step):
//start i=1
//i++ yields 1, i->2
//++i increments i->3 yields 3
//i++ yields 3, i->4
//x = 1 + 3 + 3 = 7 — Wait checking math: that's 7. Some earlier examples had mismatches. Important: compute on paper step-by-step.
//(Trainer: these are confusing; explain step table.)
    }
}
