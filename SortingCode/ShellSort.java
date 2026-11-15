
public class ShellSort {

    private static Node getNode(Node head, int index) {
        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }
    
    private static int getSize(Node node) {
        int size = 0;

        while (node != null) {
            size++;
            node = node.next;
        }

        return size;
    }
    
    public static void sort(Linkedlist list) {
        if (list.head == null || list.head.next == null) {
            return;
        }

        int size = getSize(list.head);

        for (int gap = size / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < size; i++) {

                Node current = getNode(list.head, i);
                int temp = current.data;

                int j = i;

                while (j >= gap) {
                    Node previous = getNode(list.head, j - gap);

                    if (previous.data <= temp) {
                        break;
                    }

                    Node target = getNode(list.head, j);
                    target.data = previous.data;

                    j -= gap;
                }

                Node target = getNode(list.head, j);
                target.data = temp;
            }
        }
    } 
}

