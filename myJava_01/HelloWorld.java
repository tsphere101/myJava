import java.lang.Math;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args)
    {
        while(true)
        {
        System.out.println(power(5,5));    
        Scanner sc = new Scanner(System.in);
        System.out.print("Weight(kg) : ");
        double weight = sc.nextDouble();
        System.out.print("Height(cm) : ");
        double height = sc.nextDouble();
        double bmi =weight/(power(height/100.0));
        bmi = (double)Math.round(bmi*100)/100;
        System.out.println("Your BMI is " + bmi);
        System.out.println("\n\n\n\n\n");
    }

    }

    public static double power(double value, int times)
    {
        //Power Recussive Function
        if (times == 0) return 1;
        return value*power(value, --times);
    }

    public static double power(double value)
    {
        //Overload for square
        return value*value;
    }
}
