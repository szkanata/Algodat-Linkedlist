public class MergeSort {

    private static Node Middle(Node node) {
        Node slow = node;
        Node fast = node.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    
    public static void sort(Linkedlist list) {
        list.head = mergeSortRecursive(list.head);
    }

    private static Node mergeSortRecursive(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middle = Middle(node);
        Node secondHalf = middle.next;

        middle.next = null;

        Node left = mergeSortRecursive(node);
        Node right = mergeSortRecursive(secondHalf);

        return merge(left, right);
    }

    private static Node merge(Node left, Node right) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (left != null && right != null) {
            if (left.data <= right.data) {
                tail.next = left;
                left = left.next;
            } else {
                tail.next = right;
                right = right.next;
            }

            tail = tail.next;
        }

        if (left != null) {
            tail.next = left;
        } else {
            tail.next = right;
        }

        return dummy.next;
    }
}
