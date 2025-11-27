import java.util.Scanner;
public class HitungBalok27 {
    static int hitungLuas(int p, int l) {
        return p * l;
    }

    static int hitungVolume(int p, int l, int t) {
        return p * l * t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l, t, L, vol;

        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();

        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();

        System.out.print("Masukkan tinggi: ");
        t = sc.nextInt();

        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah " + L);
        vol = hitungVolume(p, l, t);
        System.out.println("Volume balok adalah " + vol);

        sc.close();
    }
}
