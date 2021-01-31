import java.text.DecimalFormat;
import java.util.Scanner;

class BTC_spc {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Variables
        double amount_THB;
        double amount_BTC;
        double sell_at;
        double buy_at;
        double sold_price;
        double profit;
        
        String temp_input;

        DecimalFormat df = new DecimalFormat("0.00000000");

        while(true)
        {
            // Input
            System.out.print("Trade amount(THB) :");
            temp_input = sc.nextLine();
            if(temp_input.charAt(temp_input.length()-1) == 'k' || temp_input.charAt(temp_input.length()-1) == 'K')
            {
                temp_input=removeLastCharacter(temp_input);
                amount_THB = 1000.0 * Double.parseDouble(temp_input);
            }
            else if (temp_input.charAt(temp_input.length()-1) == 'm' || temp_input.charAt(temp_input.length()-1) == 'M')
            {
                temp_input=removeLastCharacter(temp_input);
                amount_THB = 1000000.0 * Double.parseDouble(temp_input);
            }
            else 
            {
                amount_THB = Double.parseDouble(temp_input);
            }
            
            if(amount_THB == -1) break;
            System.out.println(amount_THB);

            System.out.print("Buy price(THB) :");
            temp_input = sc.nextLine();
            if(temp_input.charAt(temp_input.length()-1) == 'k' || temp_input.charAt(temp_input.length()-1) == 'K')
            {
                temp_input=removeLastCharacter(temp_input);
                buy_at = 1000.0 * Double.parseDouble(temp_input);
            }
            else if (temp_input.charAt(temp_input.length()-1) == 'm' || temp_input.charAt(temp_input.length()-1) == 'M')
            {
                temp_input=removeLastCharacter(temp_input);
                buy_at = 1000000.0 * Double.parseDouble(temp_input);
            }
            else 
            {
                buy_at = Double.parseDouble(temp_input);
            }
            if(buy_at == -1) break;
            
            System.out.print("Sell price(THB) :");
            temp_input = sc.nextLine();
            if(temp_input.charAt(temp_input.length()-1) == 'k' || temp_input.charAt(temp_input.length()-1) == 'K')
            {
                temp_input=temp_input.substring(0, temp_input.length()-1);
                sell_at = 1000.0 * Double.parseDouble(temp_input);
            }
            else if (temp_input.charAt(temp_input.length()-1) == 'm' || temp_input.charAt(temp_input.length()-1) == 'M')
            {
                temp_input=temp_input.substring(0, temp_input.length()-1);
                sell_at = 1000000.0 * Double.parseDouble(temp_input);
            }
            else 
            {
                sell_at = Double.parseDouble(temp_input);
            }
            if(sell_at == -1) break;

            // Calculate
            amount_BTC = amount_THB / buy_at;
            sold_price = amount_BTC * sell_at;
            profit = sold_price - amount_THB;
            

            // OUTPUT

            System.out.print("\nSelling " + df.format(amount_BTC) + " BTC for " + sold_price + "THB\t\n");
            System.out.print("Profitting : ");
            if(profit > 0) System.out.print("+");
            System.out.println(Math.round(profit*100)/100.0 + " THB\n\n");

        }

        System.out.println("Exited");

    }

    public static String removeLastCharacter(String str)
    {
        return str.substring(0,str.length()-1);
    }

    

}