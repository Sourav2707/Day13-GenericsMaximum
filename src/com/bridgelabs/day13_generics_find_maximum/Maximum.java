package com.bridgelabs.day13_generics_find_maximum;

public class Maximum {
    public int findMaximum(Integer a, Integer b, Integer c) {
        int max = 0;
        if(a.compareTo(b) > 0 && a.compareTo(c) > 0) {
            max = a;
        }
        else if(b.compareTo(a) > 0 && b.compareTo(c) > 0) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }
}
