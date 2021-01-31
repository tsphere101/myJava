
import java.util.Vector;
import java.util.Scanner;

public class BankNote {
    public static void main(String[] args)
    {
        double amount = 0;
        while(amount >= 0)
        {

        
        Scanner sc = new Scanner(System.in);
        
        int note_1000 = 0;
        int note_500= 0;
        int note_100= 0;
        int note_50= 0;
        int note_20= 0;
        int coin_10= 0;
        int coin_5= 0;
        int coin_2= 0;
        int coin_1= 0;
        int coin_05= 0;
        int coin_025= 0;
        double remainder = 0;

        Vector<Integer> my_vect = new Vector<Integer>();
        
        my_vect.add(note_1000);
        my_vect.add(note_500);
        my_vect.add(note_100);
        my_vect.add(note_50);
        my_vect.add(note_20);
        my_vect.add(coin_10);
        my_vect.add(coin_5);
        my_vect.add(coin_2);
        my_vect.add(coin_1);
        my_vect.add(coin_05);
        my_vect.add(coin_025);

        //System.out.println("Vector size : " + my_vect.size());

        System.out.println("Input Amount to convert : ");
        amount = sc.nextDouble();
        double temp = amount;
        while(temp >= 1000)
        {
            temp-=1000;
            note_1000++;
        }
        while(temp >= 500)
        {
            temp-=500;
            note_500++;
        }
        while(temp >= 100)
        {
            temp-=100;
            note_100++;
        }
        while(temp >= 50)
        {
            temp-=50;
            note_50++;
        }
        while(temp >= 20)
        {
            temp-=20;
            note_20++;
        }
        while(temp >= 10)
        {
            temp -= 10;
            coin_10++;
        }
        while(temp >= 5)
        {
            temp -= 5;
            coin_5++;
        }
        while(temp >= 2)
        {
            temp -= 2;
            coin_2++;
        }
        while(temp >= 1)
        {
            temp -= 1;
            coin_1++;
        }
        while(temp >= 0.5)
        {
            temp -= 0.5;
            coin_05++;
        }
        while(temp >= 0.25)
        {
            temp -= 0.25;
            coin_025++;
        }
        remainder = (double)Math.round(temp*100)/100;

        if(note_1000 > 0)
        System.out.println("1000 : " + note_1000);
        if(note_500 > 0)
        System.out.println("500 : " + note_500);
        if(note_100 > 0)
        System.out.println("100 : " + note_100);
        if(note_50 > 0)
        System.out.println("50 : " + note_50);
        if(note_20 > 0)
        System.out.println("20 : " + note_20);
        if(coin_10 > 0)
        System.out.println("10 : " + coin_10);
        if(coin_5 > 0)
        System.out.println("5 : " + coin_5);
        if(coin_2 > 0)
        System.out.println("2 : " + coin_2);
        if(coin_1 > 0)
        System.out.println("1 : " + coin_1);
        if(coin_05 > 0)
        System.out.println(".5 : " + coin_05);
        if(coin_025 > 0)
        System.out.println(".25 : " + coin_025);
        if(remainder > 0)
        System.out.println("Remainder : " + remainder);

        
    }
    }
}
