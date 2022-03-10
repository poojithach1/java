package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("222 445 0151");
    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice : ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    mobilePhone.printContact();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    showContactArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }
    private static void  printInstructions() {
         System.out.println("0 => to show options");
         System.out.println("1 => to print the list of contacts");
         System.out.println("2 => to add the new contact to contact list");
         System.out.println("3 => to modify the contact in contact list ");
         System.out.println("4 => to remove the contact from contact list");
         System.out.println("5 => to search the contact from contact list");
         System.out.println("6 => to show the contact list array");
         System.out.println("7 => to quit the application");
    }
    private static  void addContact() {
         System.out.println(" enter new contact name : ");
         String name = scanner.nextLine();
         System.out.println(" enter the phone number : ");
         String  phone = scanner.nextLine();
         Contact newContact = Contact.createContact(name,phone);
         if(mobilePhone.addNewContact(newContact)) {
             System.out.println("new contact added: "+name+", phone = "+phone);
         }else{
             System.out.println("cannot add,"+ name +" already in file.");
         }
    }
    public static void updateContact() {
        System.out.println("enter  contact name : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("contact is not found.");
            return;
        }
        System.out.println("enter new contact : ");
        String  newName = scanner.nextLine();
        System.out.println("enter phone number : ");
        String  newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newPhone);
        if (mobilePhone.updateContact(existingContact,newContact)){
            System.out.println("successfully updated new contact.");
        }else{
            System.out.println("Error updating the contact.");
        }


    }
    public static void removeContact() {
        System.out.println("enter  contact name : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("contact is not found");
            return;
        }
        if(mobilePhone.removeContact(existingContact)) {
            System.out.println("successfully deleted the contact");
        }else {
            System.out.println("error deleting the contact");
        }
    }
    public static void showContactArrayList() {
        ArrayList<Contact> newArray = new ArrayList<Contact>();
        newArray.addAll(mobilePhone.getMyContacts());
        String[] myArray = new String[mobilePhone.getMyContacts().size()];
        myArray = mobilePhone.getMyContacts().toArray(myArray);
        System.out.print(Arrays.toString(myArray));

    }
    public static void queryContact(){
        System.out.println("enter  contact name : ");
        String name = scanner.nextLine();
        Contact existingContact = mobilePhone.queryContact(name);
        if (existingContact == null) {
            System.out.println("contact is not found.");
            return;
        }
        System.out.println("Name: "+existingContact.getName()+" phone number: "+existingContact.getPhoneNumber());
    }
    }
