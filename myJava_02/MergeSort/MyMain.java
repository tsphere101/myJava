public class MyMain {
    public static void main(String[] args) {
        int [] array = {5,4,3,2,1};

        System.out.println("Initial Array: ");
        mergesort.printArray(array);

        array = mergesort.mergeSort(array);

        System.out.println("Sorted array:");
        mergesort.printArray(array);
    }
    
}
