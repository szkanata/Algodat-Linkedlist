package tugaslinkedlist;

public class Hewan extends Linkedlist {
    String nama;
    String jenis;
    
    public Hewan(String nama, String jenis) {
        super();
        this.nama = nama;
        this.jenis = jenis;
    }
    
    @Override
    public String toString() {
        return nama + " (" + jenis + ")";
    }
}
