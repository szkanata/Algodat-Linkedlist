package tugaslinkedlist;

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node(Object obj) {
        this.data = obj.toString();
        this.next = null;
    }
}