package ue_2.s2410238026;

import lecture.chapter03.SList;
import lecture.chapter03.tests.Student;
import lecture.chapter03.tests.StudentKeys;

public class TestMySList {
    public static void main(String[] args) {

        MySList list = new MySList();

        // Student-Objekte anlegen
        Student s1 = new Student("George", "Washington", "s0000000001");
        Student s2 = new Student("Thomas", "Jefferson", "s0000000003");
        Student s3 = new Student("Abraham", "Lincoln", "s0000000016");
        Student s4 = new Student("Harry S.", "Truman", "s0000000033");

        // append am Ende der Liste
        list.append(s1);
        list.append(s2);
        list.append(s3);
        
        // insert an einer beliebigen Stelle
        list.insert(s2, s4);
        
        // Ausgabe zur Kontrolle
        list.printAll();
        
        // es wird nach Nachname "Washington" gesucht
        StudentKeys.SurNameKey key = new StudentKeys.SurNameKey("Washington");
        SList result = list.searchAll(key);

        System.out.println("Gefundene Studenten mit Nachname 'Washington':");
        MySList resList = (MySList) result; 
        resList.printAll();
    }
}
