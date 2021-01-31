import java.math.BigInteger;
import java.util.Scanner;

public class Factorial 
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        BigInteger num;
        System.out.print("Input number for factorial :");
        
        while(true)
        {
            num = sc.nextBigInteger();
            System.out.println(Fact(num));
        }
        
        
    }   
    
    public static BigInteger Fact(BigInteger num)
    {
        BigInteger ZERO = new BigInteger("0");
        BigInteger ONE = new BigInteger("1");
        if(num.compareTo(ZERO) == 0) return ONE;
        else return num.multiply(Fact(num.subtract(ONE)));
    }
}
