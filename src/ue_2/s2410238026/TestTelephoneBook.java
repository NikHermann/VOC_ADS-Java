package ue_2.s2410238026;

import lecture.chapter03.SList;
import lecture.chapter03.IKey;

public class TestTelephoneBook {

    public static void main(String[] args) {
        MySList phoneBook = new MySList();

        TelephoneBookEntry e1 = new TelephoneBookEntry(
                "Theodore", "Roosevelt", "New York City", "0660 1234526");
        TelephoneBookEntry e2 = new TelephoneBookEntry(
                "Dwight D", "Eisenhower", "Washington CD", "0660 2345634", "0732 123434");
        TelephoneBookEntry e3 = new TelephoneBookEntry(
                "John F", "Kennedy", "Boston", "0650 9999935");

        phoneBook.append(e1);
        phoneBook.append(e2);
        phoneBook.append(e3);

        IKey keyRoosevelt = new TelephoneBookEntryKey("Theodore", "Roosevelt");

        Object found = phoneBook.search(keyRoosevelt);
        System.out.println("Ergebnis von search():");
        System.out.println(found);
        System.out.println("==========");

        IKey keyEisenhower = new TelephoneBookEntryKey("Dwight D", "Eisenhower");
        SList resultList = phoneBook.searchAll(keyEisenhower);

        System.out.println("Ergebnis von searchAll():");
        MySList resultAsMySList = (MySList) resultList;
        resultAsMySList.printAll();
    }
}
