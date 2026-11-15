
public class QuickSort {

    private static Node getLast(Node node) {
        while (node.next != null) {
            node = node.next;
        }

        return node;
    }
    
    private static void swap(Node a, Node b) {
        int temp = a.data;
        a.data = b.data;
        b.data = temp;
    }
    
    private static Node partition(Node low, Node high) {
        int pivot = high.data;

        Node i = low;
        Node j = low;

        while (j != high) {
            if (j.data <= pivot) {
                swap(i, j);
                i = i.next;
            }

            j = j.next;
        }

        swap(i, high);

        return i;
    }
    
    private static void quickSortRecursive(Node low, Node high) {
        if (low == null || high == null || low == high) {
            return;
        }

        Node pivot = partition(low, high);

        if (pivot != low) {
            Node current = low;

            while (current.next != pivot) {
                current = current.next;
            }

            quickSortRecursive(low, current);
        }

        if (pivot != high) {
            quickSortRecursive(pivot.next, high);
        }
    }
    
    public static void sort(Linkedlist list) {
        if (list.head == null || list.head.next == null) {
            return;
        }

        Node last = getLast(list.head);

        quickSortRecursive(list.head, last);
    }
}

