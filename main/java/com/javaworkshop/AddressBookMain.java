package com.javaworkshop;

import java.util.ArrayList;
import java.util.List;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("--Welcome to Address Book Program--");
    }

    /**
     * For Testing created Method
     * @param contactList
     * @return
     */
    public Boolean addContact(Contacts contactList) {
        List<Contacts> contacts = new ArrayList<>();
        if(contacts.add(contactList)) {
            return true;
        }
        return false;
    }
}
