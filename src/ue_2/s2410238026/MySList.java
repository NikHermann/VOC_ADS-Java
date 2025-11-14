package ue_2.s2410238026;

import lecture.chapter03.IKey;
import lecture.chapter03.SList;

public class MySList extends SList {

    public void append(Object data) {
        Node newNode = new Node(data, null);

        // wenn Liste leer ist
        if (head == null) {
            head = newNode;
            return;
        }

        // Liste hat schon Elemente
        Node current = head;	// Start beim ersten Knoten
        while (current.next != null) {	// solange es noch Nachfolger gibt
            current = current.next;
        }

        current.next = newNode;	// der bisher letzte Knoten zeigt jetzt auf newNode
    }

    // alle Elemente ausgeben
    public void printAll() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data); // ruft bei Student toString() auf
            System.out.println("-----------");
            current = current.next;
        }
    }
    
    public boolean insert(Object prev, Object data) {
    	
    	Node current = head;
    	
    	while(current != null && !current.data.equals(prev)) {	// durch Liste laufen, bis data == prev gefunden
    		current = current.next;
    	}
    	
    	// falls prev nicht gefunden, return false
    	if (current == null) {
    		return false;
    	}
    	
    	//neuen Knoten hinter current einfuegen
    	Node newNode = new Node(data, current.next);
    	current.next = newNode;
    	
		return true;    	
    }
    
    public SList searchAll(IKey key) {
    	MySList result = new MySList();	// neue Liste fuer alle Treffer
    	Node current = head;
    	
    	while (current != null) {
            if (key.matches(current.data)) {
                result.append(current.data);   // Treffer in Ergebnisliste speichern
            }
            current = current.next;           // zum nächsten Knoten gehen
        }
   	    	
		return result;    	
    }
}
