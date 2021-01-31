import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class List02 {
    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<Integer>(); // Default List declaration
        List<Integer> fastList = Arrays.asList(1,3,6,8,17,32); // In order to initiate the list in one line use The Arrays.asList(elements, elements) 

        System.out.println(Arrays.toString(fastList.toArray())); // we can use .toArray() method to convert the List to an Array;

        for(int e : fastList) // For each loop : for([type] [variableName] : [where's it from]) {sysout([variableName])}
        {
            System.out.println(e);
        }

    }
}
