import java.util.Scanner;

public class StringMethod {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        String lower = "ALL OF THIS IS LOWER CASE ISN'T IT???";
        String upper = "all of this is Upper Case isn't it?";


        System.out.println(lower.toLowerCase());
        System.out.println(upper.toUpperCase() + " and have " + upper.length() + " Characters");
        

    }
}