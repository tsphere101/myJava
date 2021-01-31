public class Arrays03 {
    public static void main(String[] args) {
        int[][] numbers = { {1,2,4} , {8,16,32} , {64,128,256} ,{512,1024,2048,4096}}; // Test case 2 Dimension Array

        //Printing
        for(int i = 0 ; i< numbers.length; i++)
        {
            for(int k = 0 ; k < numbers[i].length ; k++)
            {
                System.out.print(numbers[i][k] + " ");
            }
            System.out.println();
        }
    }
}
