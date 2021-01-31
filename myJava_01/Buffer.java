import java.util.Scanner;

public class Buffer
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int num = sc.nextInt();
        while(true)
        {
            if(num == -1) break;
            result += num;
            System.out.println(result);
            num = sc.nextInt();
        }
        
    }
}