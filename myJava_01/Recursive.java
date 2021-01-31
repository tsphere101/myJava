import java.util.Scanner;

public class Recursive{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println(Square(5));

    }


    public static int Square(int a, int b)
    {
        if(b <= 0) return 1;
        return a*Square(a,b-1);
    }
    //OverLoad for square
    public static int Square(int a)
    {
        return a*a;
    }

    public static int SumTo(int a)
    {
        if(a<0) 
        {
            a = -a;
            return -(SumTo(a));
        }
        if(a == 0 ) return 0;
        return a+SumTo(a-1);
    }
}