public class SelectionSort {

    public static void sort(Linkedlist list) {
        Node current = list.head;

        while (current != null) {
            Node min = current;
            Node temp = current.next;

            while (temp != null) {
                if (temp.data < min.data) {
                    min = temp;
                }

                temp = temp.next;
            }

            int value = current.data;
            current.data = min.data;
            min.data = value;

            current = current.next;
        }
    }
}