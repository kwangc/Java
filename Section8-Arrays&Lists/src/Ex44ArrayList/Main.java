package Ex44ArrayList;

import java.util.Scanner;

public class Main {

    private static Scanner s = new Scanner(System.in);
    private static MobilePhone myPhone = new MobilePhone("010-2667-4932");

    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
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
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("Available Actions: Press ");
        System.out.println("\t 0 - To print the a list of available actions");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To update a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addNewContact() {
        System.out.print("Please enter a name: ");
        String name = s.nextLine();
        System.out.print("Please enter a phone number: ");
        String number = s.nextLine();

        Contact newContact = Contact.createContact(name, number);

        if(myPhone.addNewContact(newContact)) {
            System.out.println("New contact added: name = " + name + ", and phone number = "+ number);
        }
    }

    public static void updateContact() {
        System.out.print("Enter the existing contact name: ");
        String name = s.nextLine();
        Contact oldContact = myPhone.queryContact(name);
        if (oldContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.print("Enter new contact name: ");
        String newName = s.nextLine();
        System.out.print("Enter new contact phone number: ");
        String newNumber = s.nextLine();

        Contact newContact = Contact.createContact(newName, newNumber);
        if (myPhone.updateContact(oldContact, newContact)) {
            System.out.println("Successfully updated record");
        }
    }

    public static void removeContact() {
        System.out.print("Enter the existing contact name: ");
        String name = s.nextLine();
        Contact oldContact = myPhone.queryContact(name);

        if (myPhone.removeContact(oldContact)) {
            System.out.println(oldContact.getName() + " was removed successfully.");
        };
    }

    public static void queryContact() {
        System.out.print("Enter the existing contact name: ");
        String name = s.nextLine();
        Contact existingContact = myPhone.queryContact(name);

        if (existingContact == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("The found contact's name is " + existingContact.getName() + ", and the number is " + existingContact.getPhoneNumber());
    }
}
