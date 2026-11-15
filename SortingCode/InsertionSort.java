public class InsertionSort {

    public static void sort(Linkedlist list) {
        if (list.head == null || list.head.next == null) {
            return;
        }

        Node sorted = null;
        Node current = list.head;

        while (current != null) {
            Node nextNode = current.next;

            if (sorted == null || current.data < sorted.data) {
                current.next = sorted;
                sorted = current;
            } else {
                Node temp = sorted;

                while (temp.next != null &&
                       temp.next.data <= current.data) {
                    temp = temp.next;
                }

                current.next = temp.next;
                temp.next = current;
            }

            current = nextNode;
        }

        list.head = sorted;
    }
}
