package com.bridgelabs.day13_generics_find_maximum;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maximum maximum = new Maximum();
        System.out.println("Menu 1.Find Maximum Integer 2. Find Maximum Float 3. Find Maximum String");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                int a, b, c;
                System.out.println("In order to find maximum of three integers, enter the values\na:");
                a= scanner.nextInt();
                System.out.println("b:");
                b = scanner.nextInt();
                System.out.println("c:");
                c = scanner.nextInt();
                System.out.println(maximum.findMaximum(a, b, c)+" is maximum of "+a+","+b+","+c);
                break;
            case 2:
                float d, e, f;
                System.out.println("In order to find maximum of three integers, enter the values\na:");
                d= scanner.nextFloat();
                System.out.println("b:");
                e = scanner.nextFloat();
                System.out.println("c:");
                f = scanner.nextFloat();
                System.out.println(maximum.findMaximum(d, e, f)+" is maximum of "+d+","+e+","+f);
                break;
            case 3:
                String g, h, i;
                System.out.println("In order to find maximum of three integers, enter the values\na:");
                g= scanner.next();
                System.out.println("b:");
                h = scanner.next();
                System.out.println("c:");
                i = scanner.next();
                System.out.println(maximum.findMaximum(g, h, i)+" is maximum of "+g+","+h+","+i);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
}
