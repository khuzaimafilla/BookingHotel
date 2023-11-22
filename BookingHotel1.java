import java.util.Arrays;
import java.util.Scanner;

public class BookingHotel1 {
    public static void main(String[] args) {

        Scanner hotel = new Scanner(System.in);
        String nama, asal;
        int usia, lama_menginap, jmlTamu;
        long tarif1 = 500000, tarif2 = 1000000, tarif3 = 1500000, total;

        char pesanLagi;

        // Array nama kamar
        String[] daftarKamar = {"Standard", "Superior", "Delux"};
        // Array harga kamar
        long[] hargaKamar = {tarif1, tarif2, tarif3};

        do {
            System.out.println("Masukkan nama: ");
            nama = hotel.next();
            System.out.println("Masukkan usia: ");
            usia = hotel.nextInt();
            System.out.println("Masukkan asal daerah/domisili anda: ");
            asal = hotel.next();
            System.out.println("Masukkan waktu lama menginap anda (Malam): ");
            lama_menginap = hotel.nextInt();
            System.out.println("Masukkan jumlah tamu dalam satu kamar: ");
            jmlTamu = hotel.nextInt();

            if (jmlTamu <= 4) {
                // Menampilkan pilihan kamar yang tersedia
                System.out.println("Pilihan Kamar yang Tersedia: ");
                for (int i = 0; i < daftarKamar.length; i++) {
                    System.out.println((i + 1) + ". " + daftarKamar[i] + " - Harga: Rp " + hargaKamar[i]);
                }

                System.out.println("Pilih jenis kamar: ");
                int menu = hotel.nextInt();

                if (menu >= 1 && menu <= daftarKamar.length) {
                    total = lama_menginap * hargaKamar[menu - 1];
                    // Menampilkan detail pemesanan
                    System.out.println("\n=== DETAIL PEMESANAN ===\n");
                    System.out.println("Nama: " + nama);
                    System.out.println("Usia: " + usia + " Tahun");
                    System.out.println("Asal Daerah: " + asal);
                    System.out.println("Total pembayaran selama " + lama_menginap + " malam: Rp " + total);
                    System.out.println("=== TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!! === \n *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel \n *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan\n");
                } else {
                    System.out.println("Pilihan tidak valid");
                }
            } else {
                System.out.println("Dilarang membawa tamu lebih dari 4");
            }

            System.out.println("Apakah ada pemesanan lagi? (Y/N): ");
            pesanLagi = hotel.next().charAt(0);

        } while (pesanLagi == 'Y' || pesanLagi == 'y');
        System.out.println("kelompok 3");
        System.out.println(" nadya hapsari");
    }
}
