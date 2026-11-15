public class BubbleSort {

    public static void sort(Linkedlist list) {
        if (list.head == null || list.head.next == null) {
            return;
        }

        boolean swapped;

        do {
            swapped = false;
            Node current = list.head;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    int temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;

                    swapped = true;
                }

                current = current.next;
            }

        } while (swapped);
    }
}