import java.util. LinkedList;
import java.util. ListIterator;
import java.util. Scanner;

class Data implements Comparable<Data> {
    private String mataKuliah;
    private String tugas;
    private String deadline;
    
    public Data() {
        Scanner alya = new Scanner(System.in);
        System.out.println("\nMasukan Nama Mata Kuliah: ");
        this.mataKuliah = alya.nextLine();
        System.out.println("Masukan Tugas: ");
        this.tugas = alya.nextLine();
        System.out.println("Masukan Deadline: ");
        this.deadline = alya.nextLine();
    }
    public String getMataKuliah() {
        return mataKuliah;
    }
    @Override
    public String toString() {
        return "Data [mataKuliah=" + mataKuliah + ", tugas=" + tugas + ", deadline=" + deadline + "]";
    }
    @Override
    public int compareTo(Data o) {
        return this.getMataKuliah().compareTo(o.getMataKuliah());
    }
}
public class Jurnal04 {
        public static void main(String[] args) {
            LinkedList<Data> list = new LinkedList<Data>();
            Scanner alya = new Scanner(System.in);
            while (true) {
                System.out.println("\n1. Input Tugas\n2. Delete Tugas\n3. Lihat List Tugas\n4. Keluar");
                int pilihan = alya.nextInt();
                switch (pilihan) {
                    case 1:
                        list.addFirst(new Data());
                        break;
                    case 2:
                        System.out.println("1. Hapus tugas terakhir\n2. Hapus tugas sesuai mata kuliah\n3. Hapus tugas pertama");
                        int pilihan2 = alya.nextInt();
                        if (pilihan2 ==1 ) {
                            list.removeLast();
                        } else if (pilihan2 == 2) {
                            System.out.println("Masukan nama mata kuliah: ");
                            String namaLagu= alya.nextLine();
                            ListIterator<Data> it1 = list.listIterator();
                            while (it1.hasNext()) {
                                if (it1.next().getMataKuliah().equals(namaLagu)) {
                                it1.remove();
                                break;
                            }
                        }
                    } else if (pilihan2 == 3){
                    list.removeFirst();
                    } else {
                    System.out.println("Input salah");
                    }
                    break;
                    case 3:
                    System.out.println("\n1. Print Belakang\n2. Print Awal");
            ListIterator<Data> it2 = list.listIterator();
            int pilihan3 = alya.nextInt();
                if (pilihan3 == 1) {
                System.out.println("\nMenampilkan daftar tugas dari Akhir: ");
                while (it2.hasNext()) {
                System.out.println(it2.next());
                }
                } else {
                System.out.println("\nMenampilkan daftar tugas dari Awal: ");
                while (it2.hasPrevious()) {
                System.out.println(it2.previous());
                }
                    }
                    break;
                    case 4:
                    alya.close();
                    System.exit(0);
                    default:
                    System.out.println("Salah Input");
                    break;
            }
        }
    }
}
