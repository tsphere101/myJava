import java.util.List;
import java.util.ArrayList;
public class ninenine{
    public static void main(String[] args) {
        /** 0 - 999 999 999 */

        int ans= 0;

        for(int i = 0 ; i < 5000; i++)
        {
            int count = 0;
            for(int k = 0 ;k < getDigits(i).size(); k++)
            {
                if(getDigits(i).get(k) == 5)
                {
                    count++; 
                }
            }

            if(count == 2)
            {
            ans++;
            System.out.println("This contains 55 : " + i);
                
            }

        }

        System.out.println(ans);

    }

    public static ArrayList<Integer> getDigits(int num)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();

        if(num == 0){
            result.add(0); return result;
        } 
        
        while(num >= 1)
        {
            result.add(num%10);
            num /= 10;
        }

        return result;
    }

    
}