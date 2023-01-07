package com.bridgelabs.day13_generics_find_maximum;

public class Maximum <T extends Comparable>{ //as per uc we have extended comparable so that compareTo method will work
    T a, b, c; //T place holder
    public Maximum(T a, T b, T c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public T findMaximum()
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
