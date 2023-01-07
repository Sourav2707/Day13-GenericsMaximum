package com.bridgelabs.day13_generics_find_maximum;
import java.util.Scanner;
public class Main {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Maximum maximum;
        System.out.println("Menu 1.Find Maximum Integer 2. Find Maximum Float 3. Find Maximum String 4. Exit");
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
                maximum = new Maximum(a, b, c);
                System.out.println(maximum.findMaximum()+" is maximum of "+a+","+b+","+c);
                menu();
                break;
            case 2:
                float d, e, f;
                System.out.println("In order to find maximum of three integers, enter the values\na:");
                d= scanner.nextFloat();
                System.out.println("b:");
                e = scanner.nextFloat();
                System.out.println("c:");
                f = scanner.nextFloat();
                maximum = new Maximum(d, e, f);
                System.out.println(maximum.findMaximum()+" is maximum of "+d+","+e+","+f);
                menu();
                break;
            case 3:
                String g, h, i;
                System.out.println("In order to find maximum of three integers, enter the values\na:");
                g= scanner.next();
                System.out.println("b:");
                h = scanner.next();
                System.out.println("c:");
                i = scanner.next();
                maximum = new Maximum(g, h, i);
                System.out.println(maximum.findMaximum()+" is maximum of "+g+","+h+","+i);
                menu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
    }
    public static void main(String[] args) {
        Main.menu();
    }
}
