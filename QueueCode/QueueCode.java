public class QueueCode {
    Node front = null;
    Node rear = null;

    void enqueue(char data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    char dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException(
                "Queue kosong! Tidak bisa melakukan DEQUEUE."
            );
        }

        char removedData = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return removedData;
    }

    char peek() {
        if (isEmpty()) {
            throw new IllegalStateException(
                "Queue kosong! Tidak bisa melakukan PEEK."
            );
        }

        return front.data;
    }

    boolean isEmpty() {
        return front == null;
    }

    int size() {
        int count = 0;
        Node current = front;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return;
        }

        Node current = front;

        System.out.println("Isi Queue (Front -> Rear):");

        while (current != null) {
            System.out.print(current.data + " ");

            current = current.next;
        }

        System.out.println();
    }
}
