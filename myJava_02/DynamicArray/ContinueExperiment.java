import java.util.Arrays;

public class ContinueExperiment {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6,7,8};
        int[] new_arr = new int[arr.length-1];
        int index = 7;


        /* Shift element by 1 from the rm_index */
        int rm_index = 1;
        for(int i = rm_index ; i< arr.length-1 ;i++)
        {
            arr[i] = arr[i+1];
        }
        index--;
        for(int i = 0 ; i < new_arr.length;i++)
        {
            new_arr[i] = arr[i];
        }

        arr = new_arr;

        /* Remove Method Testing. */

        int[] myarr = {1,2,3,45,65};
        System.out.println(Arrays.toString(myarr));
        myarr = remove(myarr,1);
        System.out.println(Arrays.toString(myarr));



    }

    public static int[] remove(int[] arr, int rm_index)
    {
        int[] new_arr = new int[arr.length-1];
        for(int i = rm_index ; i < arr.length-1 ; i++)
        {
            arr[i] = arr[i+1];
        }
        /* Copy to new array */
        for(int i = 0 ; i < new_arr.length; i++)
        {
            new_arr[i] = arr[i];
        }

        return new_arr;
    }
    
}
