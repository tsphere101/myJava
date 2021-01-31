public class Array01 {
    
    

    public static void main(String args[])
    {
        //Removing array elements by index
        int[] arr = new int[4];
        arr[0] = 64;
        arr[1] = 128;
        arr[2] = 256;
        arr[3] = 512;

        //Displaying
        for(int i = 0 ; i < arr.length ; i ++)
        System.out.print(arr[i]+" ");
        System.out.println();

        //Removing last
        arr = removeElementByIndex(arr, 2);    

        for(int i = 0 ; i < arr.length ; i ++)
        System.out.print(arr[i]+" ");

    }

    public static int[] removeLastElement(int[] arr)
    {
        int[] temp = new int[arr.length-1];

        for(int i = 0 ; i < arr.length-1 ; i++)
        {
            temp[i] = arr[i];
        }

        return temp;

    }

    public static int[] removeElementByIndex(int[] arr, int index)
    {
        int[] temp = new int[arr.length-1];

        //First Half
        for (int i = 0 ; i< index ;i ++)
        {
            temp[i] = arr[i];
        }

        //Second Half
        for(int i = index ; i<arr.length-1 ; i++)
        {
            temp[i] = arr[i+1];
        }

        return temp;
    }

}
