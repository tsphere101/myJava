import java.util.Arrays;
public class Array02 {
    public static void main(String[] args) {
        
        //Sorting the array with the Arrays.sort method // Also Arryas.parallelSort works fine!
        int[] grades = {98,8,72,34,34,95,5};
        int[] grades2 = {98,8,72,34,34,95,5};
        
        Arrays.sort(grades); // Sorted
        Arrays.parallelSort(grades2); // Also sorted!

        System.out.println(Arrays.toString(grades));

        if(Arrays.equals(grades, grades2))
        {
            System.out.println("Equals");
        }

    }   
}
