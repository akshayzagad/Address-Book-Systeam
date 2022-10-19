package com.bridzlabz;

import java.util.Scanner;

public class AddressBook {
        Contact contact=new Contact();
    public void addContact() {

            System.out.println("WelCome To AddressBook Program");
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter the first name");
            contact.setFirstName(sc.next());
            System.out.println("Enter the last Name");
            contact.setLastName(sc.next());
            System.out.println("Enter the city");
            contact.setStreet(sc.next());
            System.out.println("Enter the Address");
            contact.setCity(sc.next());
            System.out.println("Enter the State");
            contact.setState(sc.next());
            System.out.println("Enter the zip");
            contact.setZip(sc.next());
            System.out.println("Enter the Phone no");
            contact.setPhoneNo(sc.next());;
            System.out.println("Enter the mail");
            contact.setEmail(sc.next());;
    }
    public  void displayCotact(){
            System.out.println(contact.toString());
    }
}
