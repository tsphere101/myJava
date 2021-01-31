import java.util.List;
import java.util.ArrayList;
public class List01 {
    public static void main(String[] args) {
        
        List<Integer> myList = new ArrayList<Integer>();

        myList.add(0,300); // add an element to list by index
        myList.add(600); // add an element to list
        myList.add(900); // add an element to list
        myList.add(900); // add an element to list

        for(int i = 0 ; i< myList.size() ; i++)
        {
            System.out.println(myList.get(i)); // use .get() method to access element of list
        }

        System.out.println(myList.indexOf(900)); // use indexOf to get the index of the element

        System.out.println(myList.contains(600)); // .contains() method returns boolean if the List contains the elements that has that value 

        System.out.println(myList.isEmpty());  // use .isEmpty() method to check if The List is empty or not.
        
        while(!myList.isEmpty())
        {
            
            //Printing the elements of the list
            for(int i = 0 ; i< myList.size() ; i++)
            {
                System.out.print( myList.get(i) +" ");
            }
            System.out.println();
            myList.remove(myList.size()-1); // use .remove(index) method to remove element of The List by index.
        }

        System.out.println("is now the list is empty? :" + myList.isEmpty());


        for(int i = 0 ; i < 500 ; i++)
        {
            myList.add(1500);
        }

        myList.clear(); // use .clear() method to remove all of the elements of the List;

        System.out.println(myList.isEmpty());


        
    }
}
