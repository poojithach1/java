package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        int[] myArray = printIntegers(count);
        int[] sorted = SortedArray(myArray);
        int[] reversed = reverseArray(myArray);


        System.out.println("average of array is "+getAverage(myArray));
        System.out.println("my int array = "+Arrays.toString(myArray));
        System.out.println("min value in array is : "+findMinNumber(myArray));
        System.out.println("my int reversed array = "+Arrays.toString(reversed));
        System.out.println("my int sorted array = "+Arrays.toString(sorted));

    }

    //it is for different count integers
    public static int[] printIntegers(int count) {
        int[] array = new int[count];
        for(int i=0;i<array.length;i++) {
            System.out.println("Enter number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    /*it for constant count integers
    public static int[] getIntegers(int number){
         System.out.println("enter "+ number +"integer values");
         int[] value = new int[number];

         for (int i=0; i<value.length; i++) {
             value[i] = scanner.nextInt();
         }
        return value;
    }*/

    //it is to get average of array
    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0;i<array.length;i++) {
            sum += array[i];
        }
        return (double) sum / (double) array.length;
    }
    public static int[] SortedArray(int[] array) {
/*        int[] sortedArray = new int[array.length];
         for(int i=0; i<array.length; i++) {
           sortedArray[i] = array[i];
        }*/
        //otherwise
        int[] sortedArray = Arrays.copyOf(array,array.length);
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for(int i=0;i< sortedArray.length-1;i++) {
                if(sortedArray[i]<sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

    //it is to find min in array
    private  static int findMinNumber(int[] array){
        int min=Integer.MAX_VALUE;
        //for max number we MIN_VALUE
        for (int i=0;i<array.length;i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static int[] reverseArray(int[] array) {
        int[] reversed = Arrays.copyOf(array,array.length);
        int maxIndex = reversed.length - 1;
        int halfLength = reversed.length/2;
        for (int i=0; i<halfLength; i++) {
            int temp ;
            temp=reversed[i];
            reversed[i]=reversed[maxIndex-i];
            reversed[maxIndex-i]=temp;
        }
        return reversed;
    }
}
