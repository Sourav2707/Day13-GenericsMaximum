package com.bridgelabs.day13_generics_find_maximum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.println("In order to find maximum of three integers, enter the values\na:");
        a= scanner.nextInt();
        System.out.println("b:");
        b = scanner.nextInt();
        System.out.println("c:");
        c = scanner.nextInt();
        Maximum maximum = new Maximum();
        System.out.println(maximum.findMaximum(a, b, c)+" is maximum of "+a+","+b+","+c);
    }
}
