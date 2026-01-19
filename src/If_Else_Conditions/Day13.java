package If_Else_Conditions;

public class Day13 {
    public static void main(String[] args) {
        int marks = 92;
        String grade = (marks >= 90) ? "A+" : (marks >= 80 ? "A" : "B");
        System.out.println(grade);
    }
}
