import java.util.Scanner;

public class bookingHotel {
    public static void main(String[] args) {

        // Deklarasi Scanner
        Scanner hotel = new Scanner (System.in);

        // Deklarasi Variabel
        String nama, asal;
        int usia, lama_menginap;
        long tarif, total;

        // Isi Variabel
        tarif = 250000;

        // Syntax input
        System.out.println("Masukkan nama : ");
        nama = hotel.next();
        System.out.println("Masukkan usia : ");
        usia = hotel.nextInt();
        System.out.println("Masukkan asal daerah/domisili anda : ");
        asal = hotel.next();
        System.out.println("Masukkan waktu lama menginap anda : ");
        lama_menginap = hotel.nextInt();

        // Syntax perhitungan total biaya hotel
        total = tarif * lama_menginap;

        // Syntax menampilkan output
        System.out.println("\n=== DETAIL PEMESANAN ===\n");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia + " Tahun");
        System.out.println("Asal Daerah : " + asal + "\n");
        System.out.println("Pelanggan " + nama + " menginap selama : " + lama_menginap + " malam");
        System.out.println("Biaya per malam : Rp " + tarif + ",00");
        System.out.println(tarif + " x " + lama_menginap + " = " + total);
        System.out.println("Total biaya pemesanan Hotel : Rp " + total + ",00\n");
        System.out.println("=== TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!! === \n *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel \n *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan\n");
    }
    
}
