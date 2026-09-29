package tugaslinkedlist;

public class Bunga extends Linkedlist{
    String nama;
    String jenis;
    
    public Bunga(String nama, String jenis) {
        super();
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
    public String toString() {
        return nama + " (" + jenis + ")";
    }
}
