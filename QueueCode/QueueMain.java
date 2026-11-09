public class QueueMain {
    public static void main(String[] args) {
        QueueCode queue = new QueueCode();

        // ENQUEUE
        queue.enqueue('A');
        queue.enqueue('B');
        queue.enqueue('C');

        queue.display();

        // PEEK
        System.out.println("Front: " + queue.peek());

        // SIZE
        System.out.println("Jumlah data: " + queue.size());

        // DEQUEUE
        System.out.println("Data keluar: " + queue.dequeue());

        queue.display();

        // DEQUEUE lagi
        System.out.println("Data keluar: " + queue.dequeue());

        queue.display();

        // ENQUEUE lagi
        queue.enqueue('D');

        queue.display();
    }
}
