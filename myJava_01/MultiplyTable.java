
import java.util.Scanner;
class MultiplyTable {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int value = sc.nextInt();

        // printTable(value);

        int sum = sc.nextInt();
        System.out.println(sumTo(sum));

    }

    public static void printTable(int value)
    {
        for(int i = 0 ; i <= 12 ; i ++)
        {
            System.out.println(value + "x" + i + "= " + value*i);

        }
    }

    public static int sumTo(int value)
    {
        if(value < 0) 
        {
            value = -value;
            return (value == 0) ? 0 : -value - sumTo(--value);
        }
        return (value == 0) ? 0 : value + sumTo(--value) ;
    }
}