package arraySorter;
public  class QuickSort<T extends Comparable<? super T>> implements ArraySort<T> {

    public int createPartition(T[] array, int lower, int upper){
        int piv = (lower + upper)/2; //This generates the first pivot point (an average of the 2 given points)
        T pivValue = array[piv]; //This sets the pivot value
        lower--;
        upper++;

        while(true){
            //Begin at the first index given of the array and add 1 to it
            //until we discover a value that is greater than the pivot
            do lower++; while (array[lower].compareTo(pivValue) < 0);
            //Begin at the last index given of the array and subtract 1 from it
            //until we discover a value that is less than the pivot
            do upper--; while (array[upper].compareTo(pivValue) > 0);

            if (lower >=upper){
                return upper;
            }
            //Swap the two values
            T t = array[lower];
            array[lower] = array[upper];
            array[upper] = t;
            //This section of code just swaps the values by creating a third temporary variable
        }
    }

    public T[] quickSort(T[] array, int lower, int upper){
        if (lower<upper){
            int partitionIndex = createPartition(array,lower,upper);

            //Sort the left hand side array
            quickSort(array, lower, partitionIndex);
            //Sort the right hand side array
            quickSort(array, partitionIndex+1, upper);
        }
        return array;
    }

    public T[] sort(T[] array){
        quickSort(array, 0, array.length-1); //Create the values for the partitioning and sorting code and run it
        return array;
    }
}

