package com.bridzlabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        AddressBook addressBook=new AddressBook();
        Scanner sc =new Scanner(System.in);
        int OperationNo;
        do {
            System.out.println("WelCome To AddressBook Program");
            System.out.println("1.Add Contact \n2. Display Contact \n3.Exit");
            System.out.println(("Enter the Operation Number"));
            OperationNo = sc.nextInt();
            switch (OperationNo){
                case 1:
                addressBook.addContact();
                break;
                case 2:
                    addressBook.displayCotact();
                    break;
                default:
                    System.out.println("Wrong Opration Number");
            }
        }while (OperationNo!= 3);
    }
}
