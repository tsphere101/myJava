import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List05 {
    public static void main(String[] args) {
        List<Integer> result = new ArrayList<Integer>();
        List<Integer> nums = (Arrays.asList(8,1,2,2,3));
        
        Collections.sort(nums);
        result = countLessThan(nums);
        printList(result);

        System.out.println();
        pop_back(result);
        pop_back(result);
        pop_back(result);
        printList(result);

    }

    public static void printList(List<Integer> l)
    {
        for(int e : l)
        {
            System.out.print(e + " ");
        }
    }

    public static List<Integer> countLessThan(List<Integer> l) // From ComSciTheSeriesEP6 YouTube: kongpangkongkwan 
    {
        List<Integer> result = new ArrayList<Integer>();
        int count = 0;
        for(int e : l)
        {
            count = 0;
            for(int ex : l)
            {
                if(ex < e) count++;
            }
            result.add(count);
        }
        return result;
    }

    public static void pop_back(List<Integer> l) // Remove the last element of list
    {
        l.remove(l.size()-1);
    }
}
