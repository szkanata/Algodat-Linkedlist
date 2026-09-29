package tugaslinkedlist;

public class Main {
    public static void main(String[] args) {
        Linkedlist mahklukhidup = new Linkedlist();
        Node hewan1 = new Node(new Hewan("Bleki", "Anjing"));
        Node hewan2 = new Node(new Hewan("Oyen", "Kucing"));
        Node bunga1 = new Node(new Bunga("Anggrek putih", "Anggrek"));
        Node bunga2= new Node(new Bunga("Mawar putih", "Mawar"));

        mahklukhidup.add(hewan1);
        mahklukhidup.add(hewan2);
        mahklukhidup.add(bunga1);
        mahklukhidup.add(bunga2);

        mahklukhidup.display();
        Bunga bunga3 = new Bunga("Mawar merah", "Mawar");
        mahklukhidup.insert(new Node(bunga3), 1);
        mahklukhidup.display();
        mahklukhidup.delete(4);
        mahklukhidup.display();
        mahklukhidup.isInList("Bleki (Anjing)");
    }
}