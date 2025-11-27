public class PengunjungCafe27 {
    static void daftarPengunjung(String...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung Cafe:");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Andi", "Budi", "Citra");
        daftarPengunjung("Ali");
        daftarPengunjung("Doni", "Eti", "Fatmi", "Galih");
    }
}
