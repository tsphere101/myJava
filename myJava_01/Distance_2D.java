import java.util.Scanner;
import java.lang.Math;
public class Distance_2D {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
//Promtp User
System.out.print("X1 : ");
double x1 = sc.nextDouble();
System.out.print("Y1 : ");
double y1 = sc.nextDouble();
System.out.print("X2 : ");
double x2 = sc.nextDouble();
System.out.print("Y2 : ");
double y2 = sc.nextDouble();

double dx = x1-x2;
if(dx < 0) dx = -dx;
double dy = y1-y2;
if (dy < 0) dy = -dy;

double result = Math.sqrt(dx*dx + dy*dy);
System.out.println("result is : " +result);

}

}
