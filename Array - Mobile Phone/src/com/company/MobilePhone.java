package com.company;

import java.util.ArrayList;

public class MobilePhone {
    private  String myNumber;
    private ArrayList <Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public boolean addNewContact(Contact contact) {
      if(findContact(contact.getName())>=0){
         System.out.println("contact is already in file");
         return false;
      }else {
          myContacts.add(contact);
          return true;
      }
    }
    public void printContact() {
       System.out.println("you have "+myContacts.size() +" contact in mobile phone");
        System.out.println("[");
       for(int i=0; i<myContacts.size();i++) {
           System.out.println(String.format(" %s => %s",myContacts.get(i).getName(),myContacts.get(i).getPhoneNumber()));
//           System.out.println((i+1)+"."+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber()+". ");
       }
        System.out.println("]");
    }
    public boolean updateContact(Contact oldContact, Contact newContact) {
        int findPosition = findContact(oldContact);
        if(findPosition < 0) {
            System.out.println(oldContact.getName() +" was not found in contact list");
            return false;
        }else if(findContact(newContact.getName()) != -1) {
            System.out.println("contact "+newContact.getName()+" already present in contact list.Updated is not successful.");
            return false;
        }else {
            this.myContacts.set(findPosition, newContact);
            System.out.println(oldContact.getName() + " is replaced with " + newContact.getName());
            return true;
        }
    }
    public boolean removeContact(Contact contact) {
        int findPosition = findContact(contact);
        if (findPosition >=0) {
            myContacts.remove(findPosition);
            System.out.println(contact.getName()+" is removed form contact list");
            return true;
        }else{
            System.out.println(contact.getName()+ " was not found in contact list");
            return  false;
        }
    }
    private int findContact(Contact contact) {
      return this.myContacts.indexOf(contact);
    }
    private int  findContact(String contactName) {
        for (int i=0; i<this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }
    public String queryContact(Contact contact){
       if (findContact(contact)>=0){
           return contact.getName();
       }
       return null;
    }
    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }
}
