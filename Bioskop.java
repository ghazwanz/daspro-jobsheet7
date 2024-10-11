import java.util.Scanner;

public class Bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double diskon = 0;
        int tiket, totalTiket = 0, harga,totalHarga, totalPenjualan = 0;
        String namaPelanggan;

        while (true) {
            harga = 50000;
            totalHarga = 0;
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = input.nextLine();

            if (namaPelanggan.equalsIgnoreCase("batal")) break;

            System.out.print("Masukkan jumlah pembelian tiket : ");
            tiket = input.nextInt();
            if (tiket > 0) {
                if (tiket > 4 && tiket <= 10) {
                    diskon = 0.1;
                    System.out.println("Pelanggan mendapat diskon 10%");
                } else if (tiket > 10) {
                    diskon = 0.15;
                    System.out.println("Pelanggan mendapat diskon 15%");
                }
                harga = harga * tiket;
                totalHarga = (int) (harga - (harga * diskon));

                System.out.println("Jumlah Tiket: " + tiket);
                System.out.println("Total Harga: Rp. " + totalHarga);

                totalTiket += tiket;
                totalPenjualan += totalHarga;

            } else {
                System.out.println("Input Tidak valid");
                continue;
            }
            input.nextLine();
        }

        input.close();
        System.out.println("Jumlah tiket yang terjual hari ini = " + totalTiket);
        System.out.println("Total penjualan tiket hari ini = Rp. " + totalPenjualan);

    }
}