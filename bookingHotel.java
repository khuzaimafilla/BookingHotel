import java.util.Scanner;

public class bookingHotel {
    public static void main(String[] args) {

        // Deklarasi Scanner
        Scanner hotel = new Scanner (System.in);

        // Deklarasi Variabel
        String nama, asal;
        int usia, lama_menginap, jmlTamu;
        long tarif1, tarif2, tarif3, total;

        // Isi Variabel
        tarif1 = 500000;
        tarif2 = 1000000;
        tarif3 = 1500000;

        // Syntax input
        System.out.println("Masukkan nama : ");
        nama = hotel.next();
        System.out.println("Masukkan usia : ");
        usia = hotel.nextInt();
        System.out.println("Masukkan asal daerah/domisili anda : ");
        asal = hotel.next();
        System.out.println("Masukkan waktu lama menginap anda (Malam) : ");
        lama_menginap = hotel.nextInt();
        System.out.println("Masukkan jumlah tamu dalam satu kamar : ");
        jmlTamu = hotel.nextInt();

        if (jmlTamu <= 4) {
            System.out.println("1. Standard \nRincian Kamar : \nHarga : 500.000/nett \nFasilitas : AC, TV \n\n\n2. Superior \nRincian Kamar : \nHarga : 1.000.000/nett \nFasilitas : AC, TV, Kolam renang \n\n\n3. Delux \nRincian Kamr : \nHarga : 1.500.000/nett \nFasilitas : Ruang tamu, triple AC, TV, Pantry");
            System.out.println("Pilih jenis kamar : ");
            int menu;
            menu = hotel.nextInt();
            if (menu == 1){
                total = lama_menginap * tarif1;
                System.out.println("\n=== DETAIL PEMESANAN ===\n");
                System.out.println("Nama : " + nama);
                System.out.println("Usia : " + usia + " Tahun");
                System.out.println("Asal Daerah : " + asal);
                System.out.println("Total pembayaran selama " + lama_menginap + " malam : Rp" + total);
                System.out.println("=== TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!! === \n *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel \n *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan\n");
            } else if (menu == 2){
                System.out.println("Harga kamar Superior per malam 1000000");
                total = lama_menginap * tarif2;
                System.out.println("\n=== DETAIL PEMESANAN ===\n");
                System.out.println("Nama : " + nama);
                System.out.println("Usia : " + usia + " Tahun");
                System.out.println("Asal Daerah : " + asal);
                System.out.println("Total pembayaran selama " + lama_menginap + " malam : Rp" + total);
                System.out.println("=== TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!! === \n *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel \n *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan\n");
            } else {
                System.out.println("Harga kamar Delux per malam 1500000");
                total = lama_menginap * tarif3;
                System.out.println("\n=== DETAIL PEMESANAN ===\n");
                System.out.println("Nama : " + nama);
                System.out.println("Usia : " + usia + " Tahun");
                System.out.println("Asal Daerah : " + asal);
                System.out.println("Total pembayaran selama " + lama_menginap + " malam : Rp" + total);
                System.out.println("=== TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!! === \n *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel \n *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan\n");
            }
            
        } else {
            System.out.println("Dilarang membawa tamu lebih dari 4");
        }
    }
    
}
