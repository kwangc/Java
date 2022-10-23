package Ex44ArrayList;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getName()) >= 0) {
            System.out.println("The contact already exists");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if (position < 0) {
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() + " already exists.");
            return false;
        }

        myContacts.set(position, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position < 0) {
            System.out.println(contact.getName() + " was not found.");
            return false;
        }
        myContacts.remove(position);
        return true;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i=0; i<myContacts.size(); i++) {
            Contact currentContact = myContacts.get(i);
            System.out.println((i+1) + ". " + currentContact.getName() + " -> " + currentContact.getPhoneNumber());
        }
    }

    // find the contact using the contact's name.
    public Contact queryContact(String contactName) {
        int position = findContact(contactName);
        return myContacts.get(position);
    }

    // find the position using the contact object itself.
    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    // find the position using the contact's name.
    private int findContact(String contactName) {
        for (int i=0; i<myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }
}
