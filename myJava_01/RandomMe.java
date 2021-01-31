import java.util.Scanner;
import java.util.Random;

public class RandomMe
{
    public static void main(String[] args)
    {
        Random random_me = new Random();
        Scanner sc = new Scanner(System.in);


        

        //Ask for draw
        int times = sc.nextInt();
        
        for(int i = 0 ; i < times; i++)
        {
            System.out.println(getColor(random_me.nextInt(2))+" "+getCardFace(random_me.nextInt(3)) + " " + getNumber(random_me.nextInt(12)+1));
        }

    }
    public static String getColor(int number)
    {
        if(number %2 == 0) return "Red"; else return "Black";
    }
    public static String getCardFace(int number)
    {
        if (number == 0) return "Hearts";
        else if (number == 1) return "Diamonds";
        else if (number == 2) return "Clubs";
        else return "Splades";
    }

    public static String getNumber(int number)
    {
        if(number == 1) return "A";
        if(number == 10) return "J";
        if(number == 11) return "Q";
        if(number == 12) return "K";
        return Integer.toString(number);
    }


}