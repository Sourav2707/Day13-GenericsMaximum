package com.bridgelabs.day13_generics_find_maximum;

import java.util.Arrays;

public class Maximum <T extends Comparable>{ //as per uc we have extended comparable so that compareTo method will work
    T[] arr;
    public Maximum(T[] arr) {
        this.arr = arr;

    }
    public T findMaximum()
    {
        Arrays.sort(arr);
        printMax();
        return arr[arr.length - 1];
    }
    public void printMax() {
        System.out.println(arr[arr.length - 1]);
    }

}
