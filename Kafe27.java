import java.util.Scanner;
public class Kafe27 {
    static Scanner sc = new Scanner(System.in);
    public static void Menu(String namaPelanggan, boolean isMember) {
        System.out.println("Selamat datang, " + namaPelanggan + " !");

        if (isMember) {
            System.out.println("Anda adalah member , dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("====MENU RESTO KAFE====");
        System.out.println("1.Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappucino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("=========================");
        System.out.println("Silahkan Pilih Menu yang anda inginkan");
    }

    public static double  pesanan(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        double pesanan = hargaItems[pilihanMenu - 1] * banyakItem;
        return pesanan;
    }
    
    public static double promo(String kodePromo){
        double diskon = 0;
        if ("DISKON50".equals(kodePromo)) {
            System.out.println("Kode promo valid! Dapatkan diskon 50%");
            diskon = 0.5;
        } else if ("DISKON30".equals(kodePromo)) {
            System.out.println("Kode promo valid! Dapatkan diskon 30%");
            diskon = 0.7;
        } else {
            System.out.println("kode promo invalid");
        }
        return diskon;
    }

    public static void main(String[] args) {
        String[] nameMenu = {"Kopi Hitam", "Cappucino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};
        int pilihanMenu, banyakItem, totalHarga = 0;
        String daftarPesanan = "";
        Menu("Andi", false);
        do {
            System.out.print("Masukkan nomor menu yang dipilih: ");
            pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            banyakItem = sc.nextInt();
            sc.nextLine(); // Clear the newline character
            double pesanan = pesanan(pilihanMenu, banyakItem);
            totalHarga += pesanan;
            String namaItem = nameMenu[pilihanMenu - 1];
            daftarPesanan += namaItem + " x " + banyakItem + " = Rp." + (int)pesanan + "\n";
            System.out.print("Ada pesanan lagi? (Y/N): ");
            String lagi = sc.nextLine();
            if (lagi.equalsIgnoreCase("N")) {
                break;
            }
        } while (true);
        System.out.print("Masukkan kode promo (jika ada): ");
        String kodePromo = sc.nextLine();
        totalHarga *= promo(kodePromo);
        System.out.println("====Rincian Pesanan====");
        System.out.print(daftarPesanan);
        System.out.println("Total harga untuk pesanan Anda: Rp." + totalHarga);
    }
}