
public class Main {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();

        list.add(40);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(30);

        System.out.println("Sebelum Sorting:");
        list.display();

        BubbleSort.sort(list);

        System.out.println("Setelah Sorting:");
        list.display();
    }
}

