
public class mergesort {

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int midpoint = array.length / 2;

        int[] left = new int[midpoint];
        int[] right;
        if (array.length % 2 == 0) // even size
        {
            right = new int[midpoint];
        } else {
            right = new int[midpoint + 1]; // odd size
        }

        for (int i = 0; i < midpoint; i++) // populate the left array.
        {
            left[i] = array[i];
        }
        for (int j = 0; j < right.length; j++) // populate the right array.
        {
            right[j] = array[midpoint + j];
        }

        int[] result = new int[array.length];
        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);

        return result;

    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int leftPointer, rightPointer, resultPointer;
        leftPointer = rightPointer = resultPointer = 0; // Initialize 0

        while (leftPointer < left.length || rightPointer < right.length) // ensure that we have something to merge
        {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer] < right[rightPointer]) {

                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            }

            else if(leftPointer < left.length) // reiterate if there' only elements in the left array.
            {
                result[resultPointer++] = left[leftPointer++];
            }

            else if(rightPointer < right.length) // there's only elements in the right array.
            {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;

    }

}
