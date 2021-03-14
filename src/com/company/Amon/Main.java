/*
Benton Amon
Exercise 8
Stores contacts (business or normal) into a contact list and has a custom display depending on the type of person.
 */

package com.company.Amon;

public class Main {

    public static void main(String[] args) {

        // Create the contact list
        ContactList book = new ContactList();

        // Create people
        Person person1 = new Person("Tom", "cat@gmail.com");
        Person person2 = new Person("Jerry", "mouse@gmail.com");
        BusinessPerson person3 = new BusinessPerson("Master Chief", "halo@reach.com", "614-983-6984");
        BusinessPerson person4 = new BusinessPerson("Bill Gates", "applesux@outlook.com", "928-234-1245");
        Person person5 = new Person("Jeff", "jeff@fordmotors.com");

        // Add people to the contact list
        book.add(person1);
        book.add(person2);
        book.add(person3);
        book.add(person4);
        book.add(person5);

        // Display the contact list
        book.dumpList();


    }
}
