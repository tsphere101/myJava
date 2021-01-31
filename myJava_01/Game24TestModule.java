import java.util.Scanner;
import java.lang.StringBuffer;
import java.lang.String;

public class Game24TestModule {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        StringBuffer number = new StringBuffer();
        StringBuffer alphabet = new StringBuffer();
        StringBuffer symbol = new StringBuffer();
        String input_temp = new String();

        System.out.println("Please enter the text :");
        input_temp = sc.nextLine();
        
        for(int i = 0 ; i < input_temp.length(); i++)
        {
            if(Character.isAlphabetic(input_temp.charAt(i)))
            {
                alphabet.append(input_temp.charAt(i));
            }
            else if(Character.isDigit(input_temp.charAt(i)))
            {
                number.append(input_temp.charAt(i));
            }
            else 
            {
                symbol.append(input_temp.charAt(i));
            }
        }

        System.out.println(alphabet);
        System.out.println(number);
        System.out.println(symbol);

        

        sc.close();
    }
}