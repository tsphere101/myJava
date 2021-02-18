import java.lang.Object;

public class DynamicArray<T> {

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 8;

    /**
     * Array of data.
     */
    private T[] arr;

    /**
     * The last index of element in the array.
     */
    private int length = 0;

    /**
     * Allocated array capacity.
     */
    private int capacity = 0;

    /**
     * Construct an emptry dynamic array with an initial capacity of 8.
     */
    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    /**
     * Construct an empty with the specified initial capacity.
     * 
     * @param capacity the initial capacity of the array
     * @throws IllegalArgumentException if the specified initial capacity is
     *                                  negative
     */
    public DynamicArray(int capacity) {
        if (capacity < 0)
            throw new IllegalArgumentException("Capacity cannot be less that 0");
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    /**
     * Get the number of the elements in this array.
     * 
     * @return Number of the elements in this array
     */
    public int getSize() {
        return this.length;
    }

    /**
     * Get the number of slot that has been allocated.
     * 
     * @return the number of allocated slot.
     */
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Return true if the array contains no elements.
     * 
     * @return true if this array contains to elements.
     */
    public boolean isEmpty() {
        if (this.getSize() == 0)
            return true;
        else
            return false;
    }

    public T get(int index) {
        return (T) arr[index];
    }

    /**
     * Replace the speified index of the array to be the specified element.
     * 
     * @param index   index of the array to be replaced
     * @param element element to be stored in specified index
     */
    public void set(int index, T element) {
        arr[index] = element;
    }

    /**
     * Remove all element from the array.
     */
    public void clear() {
        for (int i = 0; i < this.capacity; i++) {
            arr[i] = null;
        }
        this.length = 0;
    }

    /**
     * Appends the specified element to the last index of the array.
     * 
     * @param element element to be append on the array
     */
    public void add(T element) {
        this.ensureCapacity(this.length + 1);
        arr[this.length] = element; /* Add the element to the array. */
        this.length++; /* Keep track of last index. */
    }

    private void ensureCapacity(int size) {
        /* Resize the capacity. */
        if (this.getSize() + 1 >= this.capacity) {
            if (this.capacity == 0)
                this.capacity = 1;
            else
                this.capacity *= 2; /* Double the size. */
            T[] new_arr = (T[]) new Object[this.capacity];
            for (int i = 0; i < this.length; i++) {
                new_arr[i] = arr[i];
            }
            this.arr = new_arr;
        }
    }

    /**
     * Remove element from array by index.
     * 
     * @param rm_index index of element.
     * @return removed element.
     */
    public T remove(int rm_index) {
        T removing_data = this.arr[rm_index];
        if (rm_index >= this.length || rm_index < 0)
            throw new IndexOutOfBoundsException();
        for (int i = rm_index; i < this.length - 1; i++) {
            this.arr[i] = arr[i + 1]; /* Shifting all elements to the left by one, starting from rm_index. */
        }
        T[] new_arr = (T[]) new Object[this.length - 1];
        for (int i = 0; i < this.length - 1; i++) {
            new_arr[i] = this.arr[i];
        }
        this.length = this.length - 1;
        this.capacity = this.length;

        return removing_data;
    }

    /**
     * Remove object from array.
     * 
     * @param obj Obect to remove from array
     * @return True if remove successfully else return False
     */
    public boolean remove(Object obj) {

        for (int i = 0; i < this.length; i++) {
            if (arr[i].equals(obj)) {
                this.remove(i);
                return true;
            }
        }
        return false;

    }

    /**
     * Return the index of the specified element. Return -1 if array contains no
     * specified element.
     * 
     * @param obj element
     * @return index of specified element
     */
    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++)
            if (arr[i].equals(obj))
                return i;
        return -1;
    }

    public boolean contains(Object obj) {
        return this.indexOf(obj) != -1;
    }

    /**
     * Print out this CAPACITY,SIZE and IF-IT-IS-EMPTY.
     */
    public void log() {
        System.out.println("GET CAPACITY::" + this.getCapacity());
        System.out.println("GET SIZE::" + this.getSize());
        System.out.println("IS EMPTY::" + this.isEmpty());
    }

}