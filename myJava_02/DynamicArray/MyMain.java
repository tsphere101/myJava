public class MyMain {

    public static void main(String[] args) {

        DynamicArray<Integer> myarr = new DynamicArray<Integer>();


        addSequence(1024, myarr);

        myarr.log();

        myarr.remove(0);

        myarr.log();

        myarr.add(1);


    }

    public static void addSequence(int number, DynamicArray<Integer> dy)
    {
        for(int i =1 ; i <= number ; i++)
        {
            dy.add(i);
        }
    }

}
