//NAMA  : ARI PERDIAN
//KELAS : TI22J
//NIM   : 20220040072

import java.util.ArrayList;

public class ArrayListMain {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan objek Mahasiswa
        ArrayList<Mahasiswa<String, String, Integer>> daftarMahasiswa = new ArrayList<>();

        // Menambahkan objek Mahasiswa ke dalam ArrayList
        Mahasiswa<String, String, Integer> m1 = new Mahasiswa<>();
        m1.setNim("1102020");
        m1.setName("Ferdi");
        m1.setClas(21);
        daftarMahasiswa.add(m1);

        // Menampilkan informasi Mahasiswa dari ArrayList
        for (Mahasiswa<String, String, Integer> m : daftarMahasiswa) {
            System.out.println("NIM: " + m.getNim());
            System.out.println("Nama: " + m.getName());
            System.out.println("Kelas: " + m.getClas());
        }
    }
}