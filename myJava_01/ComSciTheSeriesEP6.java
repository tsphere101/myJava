public class ComSciTheSeriesEP6 {
    public static void main(String args[])
    {
        int[] nums = {123,1523,2768,276,83};
        int[] result = new int[nums.length];

        for(int i = 0 ; i< nums.length ; i++)
        {
            //index of nums
            int me = 0;
            for(int j = 0 ; j<nums.length ; j++)
            {
                if(nums[j] < nums[i] )
                {
                    me++;
                }
            }
            result[i] = me;
        }

        for(int i = 0 ; i< result.length ; i++)
        {
            System.out.print(result[i] +" ");
        }

        

    }
}
