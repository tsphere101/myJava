import java.util.Scanner;
public class Exception {
    public static void main(String args[])
    {
        Scanenr sc = new Scanner(System.in);

        System.out.println("This program result the division"); 
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            if(b==0) throw 1;
        } catch (int x) {
            System.out.println("Cannot divided by zero!");
        }

        System.out.println((double)a/(double)b);
    }
}
