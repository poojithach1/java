package com.company;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("you have " + groceryList.size() + " item in grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + "." + groceryList.get(i));
        }
    }
    public void modifyGroceryList(String currentItem,String newItem) {
        int position =findItem(currentItem);
        if(position>=0){
            modifyGroceryList(position,newItem);
        }
    }
    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position>=0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }
    private int findItem(String item){
        return groceryList.indexOf(item);
    }
    public boolean onFile(String item) {
        int position = groceryList.indexOf(item);
        if (position >= 0) {
            return true;
        }
        return false;
    }

}