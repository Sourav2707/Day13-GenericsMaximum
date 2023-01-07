package com.bridgelabs.day13_generics_find_maximum;
import java.util.Scanner;
public class Main {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        Maximum maximum;
        System.out.println("Menu 1.Find Maximum Integer 2. Find Maximum Float 3. Find Maximum String 4. Exit");
        int option = scanner.nextInt();
        int n = 0;
        switch (option) {
            case 1:
                System.out.println("Enter the range to find max Integer");
                n = scanner.nextInt();
                Integer[] arr1 = new Integer[n];
                for(int i = 0; i < arr1.length; i++) {
                    System.out.println("Enter the values");
                    arr1[i] = scanner.nextInt();
                }
                maximum = new Maximum(arr1);
                maximum.findMaximum();
                menu();
                break;
            case 2:
                System.out.println("Enter the range to find max Float");
                n = scanner.nextInt();
                Float[] arr2 = new Float[n];
                for(int i = 0; i < arr2.length; i++) {
                    System.out.println("Enter the values");
                    arr2[i] = scanner.nextFloat();
                }
                maximum = new Maximum(arr2);
                maximum.findMaximum();
                menu();
                break;
            case 3:
                System.out.println("Enter the range to find max String");
                n = scanner.nextInt();
                String[] arr3 = new String[n];
                for(int i = 0; i < arr3.length; i++) {
                    System.out.println("Enter the values");
                    arr3[i] = scanner.next();
                }
                maximum = new Maximum(arr3);
                maximum.findMaximum();
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
