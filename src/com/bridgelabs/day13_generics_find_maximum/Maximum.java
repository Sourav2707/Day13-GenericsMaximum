package com.bridgelabs.day13_generics_find_maximum;

public class Maximum {
    public <T extends Comparable> T findMaximum(T a, T b, T c)
    {
        T max;
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
