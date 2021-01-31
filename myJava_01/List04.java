import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List04 {
    public static void main(String[] args) {
        List<List<Integer>> two_dimensional_list = new ArrayList<List<Integer>>(); // Declare the list of List<Integer> 
        
        two_dimensional_list.add(Arrays.asList(1,3,16,79,82,84,55,132)); // Push the element which is list into the List of list
        
        two_dimensional_list.add(Arrays.asList(3,46,66,95)); // Also do the same thing
        
        two_dimensional_list.add(Arrays.asList(1,-6,-88,43,56,-53,0)); // Same
        
        int[][] result = new int[two_dimensional_list.size()][two_dimensional_list.get(0).size()]; // Declare the result int[][] 

        //Printing 
        for(List<Integer> l : two_dimensional_list) // Iterate through the list
        {
            for(int e : l) // iterate through each member for each list
            {
                System.out.print(e + " "); // print out the element
            }
            System.out.println(); // new line
        }

        // Sorting as descending order
        for(List<Integer> _list : two_dimensional_list)
        {
            Collections.reverse(_list);
        }

        // Make the result array
        for(int i = 0 ; i < two_dimensional_list.size(); i++)
        {
            for(int j = 0 ; j < two_dimensional_list.get(i).size(); j++)
            {
                result[i][j] = two_dimensional_list.get(i).get(j);
            }
        }

        System.out.println(Arrays.deepToString(result));

        


        
    }
}
