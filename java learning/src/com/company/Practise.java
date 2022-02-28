package com.company;

import java.util.Scanner;

public class Practise {

    public static void someFunction () {
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter birth date:");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine();

        System.out.println("enter name:");
        String name = scanner.nextLine();
        int age = 2022 - yearOfBirth;

        if(age >= 0 && age <= 100) {
            System.out.println("name is " + name + " and you are " + age + " years old");
        }else {
            System.out.println("Invalid number");
        }
        scanner.close();
    }
    public static void userInput() {
        Scanner scanner=new Scanner(System.in);
        int counter=0;
        int sum=0;
        while (true){
            int order = counter + 1;
            System.out.println("enter number "+order+" : ");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if(counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("sum = "+sum);
        scanner.close();
    }
    public static void minAndMax() {
        Scanner scanner = new Scanner(System.in);
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        while (true) {
            System.out.println("enter number");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt) {
                int number = scanner.nextInt();
                if(number < min) {
                    min = number;
                }
                if(number > max) {
                    max= number;
                }
            } else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("min:"+min+" max:"+max);
        scanner.close();
    }
}

