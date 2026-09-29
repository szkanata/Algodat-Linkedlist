package tugaslinkedlist;

public class Linkedlist {
    Node head = null;
    Node tail = null;
    void add (Node newNode) {
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display () {
        Node current = head;
        int x = 0;
        while (current != null) {
            System.out.println("[" + x + "] " + current.data);
            current = current.next;
            x++;
        }
    }

    void delete (int index) {
        Node current = head;
        Node prev = null;
        int count = 0;
        while (current != null && index > count) {
            prev = current;
            current = current.next;
            count++;
        }

        if (index < 0 || current == null) {
            System.out.println("Index not found");
            return;
        }

        if (current == head) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
            return;
        } else if (current == tail) {
            prev.next = null;
            tail = prev;
            return;
        }

        prev.next = current.next;
    }

    void insert(Node newNode, int index) {
        if (newNode == null) {
            System.out.println("Data kosong");
            return;
        } 

        if (index < 0) {
            System.out.println("Index not found");
            return;
        }

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            if (tail == null) {
                tail = newNode;
            }
            return;
        }

        Node current = head;
        int count = 0;
        
        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index not found");
            return;
        }

        newNode.next = current.next;
        current.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
    }

    void isInList (String data) {
        Node current = head;

        while (current != null && !current.data.equals(data)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Index not found");
            return;
        }

        System.out.println(data + " is in list");
    }
}