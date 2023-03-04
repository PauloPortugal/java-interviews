package com.interview.problems;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseGenericArray {

    /**
     * Reverses a generic Array
     *
     * @param array input array
     * @return return a reversed array if array is not null and has at least one element
     */
    public static <T> T[] reverse(T[] array) {
        if (isEmpty(array)) {
            return null;
        }

        if (array.length == 1) {
            return array;
        }

        return IntStream.range(0, array.length)
                .mapToObj(i -> array[array.length - 1 - i])
                .collect(ArrayList<T>::new, ArrayList::add, ArrayList::addAll)
                .toArray(Arrays.copyOf(array, array.length));
    }

    private static <T> boolean isEmpty(T[] array) {
        return (array == null || array.length == 0);
    }
}
