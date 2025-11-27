public class PengunjungCafe27 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung Cafe:");
        for (String i : namaPengunjung){ 
            System.out.println("- " + i);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra");
        daftarPengunjung("Ali");
        daftarPengunjung("Doni", "Eti", "Fatmi", "Galih");
    }
}
