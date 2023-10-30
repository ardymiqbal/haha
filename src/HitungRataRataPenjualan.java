import java.util.Scanner;

public class HitungRataRataPenjualan {
    /**
     *
     * @param args
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nama Penjual");
        String penjual = scanner.nextLine();
        System.out.print("Masukkan jumlah hari penjualan: ");
        int jumlahPenjualan = scanner.nextInt();

        int totalPenjualan = 0;
        for (int i = 1; i <= jumlahPenjualan; i++) {
            System.out.print("Masukkan Penghasilan penjualan barang pada hari ke-" + i + ": ");
            int penjualan = scanner.nextInt();
            totalPenjualan += penjualan;
        }

        double rataRata = (double) totalPenjualan / jumlahPenjualan;
        System.out.println("Rata-rata Penghasilan penjualan barang adalah: " + rataRata);

        scanner.close();
    }
}
