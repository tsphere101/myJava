//1D Distance in java
import java.util.Scanner;
public class Distance_1D {

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);

double result = sc.nextDouble()-sc.nextDouble();
if(result < 0 ) result = -result;

System.out.println(result);

}
}