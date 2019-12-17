package arraySorter;

import java.util.Arrays;

public  class SelectionSort<T extends Comparable<? super T>> implements ArraySort<T> {

    public T[] sort(T[] array){


        for (int a = 0; a < array.length-1; a++){ //This runs the following code for as many times as there are elements -1.
            int minIndex = a; //Create a minIndex variable
            for (int b = a+1; b<array.length; b++){ //This runs the following code for as many times as there are elements
                if (array[b].compareTo(array[minIndex]) < 0){
                    minIndex = b;
                }
            }

            T t = array[minIndex];
            array[minIndex] = array[a];//Copies the minimum index to be the current iteration
            array[a] = t; //Assigns the current iteration to be the minimum index so far
            //This section of code just swaps the values by creating a third temporary variable
        }
    return array; //Returns the sorted array
    }
}

