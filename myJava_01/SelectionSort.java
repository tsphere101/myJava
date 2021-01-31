import java.util.Arrays;

import java.util.ArrayList;
public class SelectionSort {
    public static void main(String[] args)
    {
        int a[] = {16,7,3,8,5,2,1};
        
        
        
    }

    

    public static void SelectionSort(int[] arr) // Already pass by reference
    {
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  


    }

    public static void printArray(int a[])
    {
        for(int i = 0; i < a.length ; i++)
        {
            System.out.print(a[i]+" ");
        }
    }

    public static class Compa {

        public static double whichMax(double a, double b )
            {
                if(a > b)
                return a;
                else return b;
            }
            public static int whichMax(int a , int b)
            {
                if(a > b)
                return a;
                else return b;
            }

    
            public static double whichMin(double a, double b)
            {
                if(a < b) return a;
                else return b;
            }
            public static int whichMin(int a, int b)
            {
                if(a> b) return a;
                else return b;
            }
    
            public static boolean isEquals(double a,double  b)
            {
                if(a == b) return true;
                else return false;
            }
            public static boolean isEquals(int a , int b)
            {
                if(a== b) return true;
                else return false;
            }
    }
    
}
