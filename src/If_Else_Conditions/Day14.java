package If_Else_Conditions;

public class Day14
{
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        if(s1==s2)
        {
            System.out.println("Equal");
        }
        else {
            System.out.println("Not Equal");
            //  Because == compares memory, not content.
        }
    }
}

