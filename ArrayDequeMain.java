//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

import java.util.ArrayDeque;

public class ArrayDequeMain {
    public static void main(String[] args) {
        // Membuat ArrayDeque untuk menyimpan objek Mahasiswa
        ArrayDeque<Mahasiswa<String, String, Integer>> dequeMahasiswa = new ArrayDeque<>();

        // Menambahkan objek Mahasiswa ke dalam ArrayDeque
        Mahasiswa<String, String, Integer> m1 = new Mahasiswa<>();
        m1.setNim("1102020");
        m1.setName("Ferdi");
        m1.setClas(21);
        dequeMahasiswa.add(m1);

        // Menampilkan informasi Mahasiswa dari ArrayDeque
        while (!dequeMahasiswa.isEmpty()) {
            Mahasiswa<String, String, Integer> m = dequeMahasiswa.poll();
            System.out.println("NIM: " + m.getNim());
            System.out.println("Nama: " + m.getName());
            System.out.println("Kelas: " + m.getClas());
        }
    }
}
