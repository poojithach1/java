package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private  static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }

        }
    }
    public static void printInstructions() {
        System.out.println("0 => to print choice options");
        System.out.println("1 => to print list of grocery items");
        System.out.println("2 => to add an item to the list");
        System.out.println("3 => to modify an item in the list ");
        System.out.println("4 => to remove an item in the list");
        System.out.println("5 => to search for an item in the list");
        System.out.println("6 => to print array ");
        System.out.println("7 => to quit the application");
    }
    public static void addItem() {
        System.out.print("Please enter the grocery item : ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem() {
        System.out.print(" Enter current item :");
        String itemNo = scanner.nextLine();
        System.out.print("Enter the replace item : ");
        String item = scanner.nextLine();
        groceryList.modifyGroceryList(itemNo,item);
    }
    public static void removeItem() {
         System.out.print("Enter the remove item : ");
         String  itemNo = scanner.nextLine();
         groceryList.removeGroceryItem(itemNo);
    }
    public static void searchItem() {
        System.out.print("Enter the search item :");
        String searchItem = scanner.nextLine();
        if(groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in the grocery list ");
        } else {
            System.out.println(searchItem+" not found in grocery list ");
        }
    }
    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());


        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
        System.out.print(Arrays.toString(myArray));

    }
}
