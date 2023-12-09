import java.util.Scanner;
import java.util.Date;

public class bookinghotel2 {
    public static void main(String[] args) {

        // Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi Variable
        String[] namaTamu = new String[100]; // Array untuk nama tamu
        String[] asalTamu = new String[100]; // Array untuk asal tamu
        int[] usiaTamu = new int[100];       // Array untuk usia tamu
        int[] lamaMenginapTamu = new int[100];// Array untuk lama menginap tamu
        int[] jmlTamuKamar = new int[100];    // Array untuk jumlah tamu dalam satu kamar
        long[] totalPembayaran = new long[100];// Array untuk total pembayaran tamu
        boolean kembaliKeMenuCheckIn;
        char pesanLagi;

        // Deklarasi dan inisialisasi untuk tarif
        long tarif1 = 500000, tarif2 = 1000000, tarif3 = 1500000, total;

        // Inisialisasi array kelas kamar
        String[] kelasKamar = {"Standard", "Superior", "Deluxe"};

        // Inisialisasi array harga kamar
        long[] hargaKamar = {tarif1, tarif2, tarif3};

        // Inisialisasi array kamarTersedia
        boolean[] kamarTersedia = {true, true, true}; // array

        // Inisialisasi array daftar kamar (sample data, adjust as needed)
        String[][] daftarKamar = {
            {"JENIS KAMAR", "HARGA", "FASILITAS"},
            {"Standard", "Rp. 500.000,00 / Malam", "2x Single Bed\n1x TV\n1x Kipas\nPerlengkapan Mandi"},
            {"Superior", "Rp. 1.000.000,00 / Malam", "1x Double Bed\n1x AC\n1x TV 24 inch\nPerlengkapan Mandi\nMakan & Minum Pagi"},
            {"Deluxe", "Rp. 1.500.000,00 / Malam", "1x Queen Bed\n2x AC\n1x TV 48 inch\nPerlengkapan Mandi\nMakan & Minum 3x Sehari + Snack"},
        };

        System.out.println("======================================================================================");
        System.out.println("|                                  BOOKING HOTEL                                     |");
        System.out.println("|====================================================================================|");
        System.out.println("| SELAMAT DATANG !!!                                                                 |");
        System.out.println("| Ada yang bisa kami bantu ?                                                         |");
        System.out.println("| Berikut adalah opsi yang bisa anda pilih !                                         |");
        System.out.println("======================================================================================\n");

        // Menampilkan Pilihan Menu
        while (true) {
            System.out.println("=============================");
            System.out.println("|        MENU UTAMA         |");
            System.out.println("|===========================|");
            System.out.println("| 1. Check In               |");
            System.out.println("| 2. List Harga Kelas Kamar |");
            System.out.println("| 3. EXIT                   |");
            System.out.println("=============================");

            System.out.print("Masukkan Opsi : ");
            int opsi = input.nextInt();
            System.out.println();
            kembaliKeMenuCheckIn = false;
            switch (opsi) {

                // CHECK IN
                case 1:
                do{
                    System.out.println("===============================");
                    System.out.println("|        MENU CHECK IN        |");
                    System.out.println("|=============================|");
                    System.out.println("| 1. Check ketersediaan kamar |");
                    System.out.println("| 2. Daftar Tamu Menginap     |");
                    System.out.println("| 3. Pesan Kamar              |");
                    System.out.println("| 4. Checkout                 |");
                    System.out.println("===============================");

                    System.out.print("Masukkan Pilihan : ");
                    int pilihan = input.nextInt();
                    System.out.println();

                    kembaliKeMenuCheckIn = false;

                    switch (pilihan) {
                        // Menampilkan Ketersediaan Kamar
                        case 1:
                            System.out.println("Ketersediaan Kamar:");
                            for (int i = 0; i < kelasKamar.length; i++) {
                                String status = kamarTersedia[i] ? "Tersedia" : "Penuh";
                                System.out.println((i + 1) + ". " + kelasKamar[i] + " - Status: " + status);
                            }
                            break;
                        // Menampilkan daftar tamu yang menginap
                        case 2:
                            // Implement daftar tamu
                            
                                for (int i = 0; i < namaTamu.length; i++) {
                                    if (namaTamu[i] != null) {
                                        System.out.println("==================");
                                        System.out.println("Nama: " + namaTamu[i] + "\nAsal: " + asalTamu[i] + "\nUsia: " + usiaTamu[i] + " tahun");
                                        System.out.println("==================");
                                    }
                                }
                                break;
                            
                        // Melakukan Transaksi
                        case 3:
                            do {
                                System.out.println("===============================");
                                System.out.println("|         PESAN KAMAR         |");
                                System.out.println("===============================");
                                System.out.print("Masukkan nama: ");
                                String nama = input.next();
                                System.out.print("Masukkan usia: ");
                                int usia = input.nextInt();
                                System.out.print("Masukkan asal daerah/domisili anda: ");
                                String asal = input.next();
                                System.out.print("Masukkan waktu lama menginap anda (Malam): ");
                                int lama_menginap = input.nextInt();
                                System.out.print("Masukkan jumlah tamu dalam satu kamar: ");
                                int jmlTamu = input.nextInt();


                                if (jmlTamu <= 4) {
                                    // MENAMPILKAN OPSI PILIH KAMAR
                                    System.out.println("====================================");
                                    System.out.println("|Pilihan Kelas Kamar yang Tersedia:|");
                                    System.out.println("====================================");
                                    for (int i = 0; i < kelasKamar.length; i++) {
                                        System.out.println((i + 1) + ". " + kelasKamar[i] + " - Harga: Rp " + hargaKamar[i]);
                                    }
                                    System.out.println("====================================");
                                    System.out.print("Pilih jenis kamar: ");
                                    int menu = input.nextInt();

                                    if (menu >= 1 && menu <= kelasKamar.length) {
                                        if (kamarTersedia[menu - 1]) {
                                            kamarTersedia[menu - 1] = false;
                                            total = lama_menginap * hargaKamar[menu - 1];

                                            // Menambahkan data tamu
                                            for (int i = 0; i < namaTamu.length; i++) {
                                                if (namaTamu[i] == null) {
                                                    namaTamu[i] = nama;
                                                    asalTamu[i] = asal;
                                                    usiaTamu[i] = usia;
                                                    lamaMenginapTamu[i] = lama_menginap;
                                                    jmlTamuKamar[i] = jmlTamu;
                                                    totalPembayaran[i] = total;
                                                    break;
                                                }
                                            }

                                            // MENAMPILKAN DETAIL PESANAN
                                            System.out.println("============================================================================================");
                                            System.out.println("|                                     DETAIL PEMESANAN                                     |");
                                            System.out.println("============================================================================================");
                                            System.out.println("| Nama: " + nama);
                                            System.out.println("| Usia: " + usia + " Tahun");
                                            System.out.println("| Asal Daerah: " + asal);
                                            System.out.println("===========================================================================================|");
                                            System.out.println("| Total pembayaran selama " + lama_menginap + " malam: Rp " + total);
                                            System.out.println("|==========================================================================================|");
                                            System.out.println("|                       TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!!                       |");
                                            System.out.println("|==========================================================================================|");
                                            System.out.println("| *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel |");
                                            System.out.println("| *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan   |");
                                            System.out.println("============================================================================================");
                                        } else {
                                            System.out.println("Maaf, kamar sudah penuh. Silakan pilih kamar lain.");
                                        }
                                    } else {
                                        System.out.println("Pilihan tidak valid");
                                    }
                                } else {
                                    System.out.println("Pilihan tidak valid");
                                }

                                System.out.print("Apakah anda ingin Pesan Lagi? (Y/N): ");
                                pesanLagi = input.next().charAt(0);
                                if (pesanLagi == 'N' || pesanLagi == 'n'){
                                    kembaliKeMenuCheckIn = false;
                                    break;
                                }
                            } while (pesanLagi == 'Y' || pesanLagi == 'y');
                            break;

                        case 4:
                            System.out.println("Pelanggan "+ namaTamu +" telah di Checkout!");
                            kembaliKeMenuCheckIn = true;
                            break;

                        default:
                            System.out.println("Bukan Pilihan!");
                            break;
                    }
                } while (!kembaliKeMenuCheckIn);
                    break;

                // LIST HARGA KELAS KAMAR
                case 2:
                    for (String[] kelas : daftarKamar) {
                        for (String kamar : kelas) {
                            System.out.println(kamar + "");
                        }
                        System.out.println();
                    }
                    break;

                // EXIT
                case 3:
                    System.out.println("Terimakasih atas kunjungan anda!\nSilahkan Pulang!\n");
                    System.exit(0);
                    break;

             default:
                 System.out.println("Opsi Tidak Ada!");
                 break;
            }
        }
    }
}
