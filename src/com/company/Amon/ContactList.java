package com.company.Amon;

import java.util.*;

public class ContactList {
    private List<Person> contacts;

    public ContactList() {
        contacts = new ArrayList<>();
    }

    public boolean add(Person a) {
        return(contacts.add(a));
    }

    public void setContacts(List<Person> contacts) {
        this.contacts = contacts;
    }

    public void dumpList() {
        System.out.println(contacts);
    }
}
