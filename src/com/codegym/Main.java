package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int size;
        int[] array;
        Scanner scanner =new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size=scanner.nextInt();
            if (size>30){
                System.out.println("Size should not exceed 30");
            }
        }while (size>30);
        array= new int[size];
        int j=0;
        while (j<array.length){
            System.out.print("Enter a mark for student " + (j + 1) + ": ");
            array[j]=scanner.nextInt();
            j++;
        }
        int count =0;
        System.out.println("List of mark: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        if (array[i]>=5 && array[i]<=10){
            count++;
        }}
        System.out.println("The number of students passing the exam is " + count);
    }
}
