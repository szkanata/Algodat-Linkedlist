
public class StackCode {
    Node top = null;

    void push(char c) {
        Node d = new Node(c);
        d.next = top;
        top = d;
    }

    char pop() {
        if (isEmpty()) {
            throw new IllegalStateException(
                "Stack kosong! Tidak bisa melakukan POP."
            );
        }

        char removedChar = top.data;
        top = top.next;

        return removedChar;
    }

    char peek() {
        if (isEmpty()) {
            throw new IllegalStateException(
                "Stack kosong! Tidak bisa melakukan PEEK."
            );
        }

        return top.data;
    }

    boolean isEmpty() {
        return top == null;
    }

    int search(char data) {

        if (isEmpty()) {
            System.out.println(
                "Stack kosong! Tidak ada data yang bisa dicari."
            );
            return -1;
        }

        Node current = top;
        int position = 1;

        while (current != null) {

            if (current.data == data) {
                return position;
            }

            current = current.next;
            position++;
        }

        System.out.println("Data tidak ditemukan!");
        return -1;
    }

    void display() {

        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return;
        }

        Node current = top;

        System.out.println("Isi Stack:");

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}
