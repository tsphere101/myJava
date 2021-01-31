import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List03 {
    public static void main(String[] args) {
        
        List<Integer> result = new ArrayList<Integer>(); // Pre declare the result list
        List<Integer> myList = Arrays.asList(15,3,4,5,7,8,9,11,13,14,15); // Declare the list of numbers;

        for(int e : myList) // use for each loop to iterate through the list 
        {
            if(e%2 == 1) // if the element is odd number
                result.add(e); // add the element that is odd to the declared result list
        }
        
        Collections.sort(result,Collections.reverseOrder()); // sort the result list to descending order;

        System.out.println(Arrays.toString(result.toArray())); // print the list : turning the list into an array then turn the array to string;

    }
}
