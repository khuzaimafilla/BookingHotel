import java.util.Scanner;
import java.util.Arrays;

public class bookinghotel2 {
    public static void main(String[] args) {
        
        //Deklarasi Scanner
        Scanner input = new Scanner(System.in);
        
        //Deklarasi Variable 
        String nama, asal;
        int usia, lama_menginap, jmlTamu;
        char pesanLagi;

        //Deklarasi dan inisialisasi untuk tarif
        long tarif1 = 500000, tarif2 = 1000000, tarif3 = 1500000, total;

        //Inisialisasi array kelas kamar
        String[] kelasKamar = {"Standard", "Superior", "Deluxe"};

        //Inisialisasi array harga kamar
        long[] hargaKamar = {tarif1, tarif2, tarif3};

        //inisialisasi array daftar kamar
        String[][] daftarKamar = {
            {"JENIS KAMAR\t", "HARGA\t", "FASILITAS"},
            {"Standard\t", "Rp. 500.000,00 / Malam\t", "1x Single Bed\n1x TV\n1x Kipas\nPerlengkapan Mandi"},
            {"Superior\t", "Rp. 1.000.000,00 / Malam\t", "1x Double Bed\n1x AC\n1x TV 24 inch\nPerlengkapan Mandi\nMakan & Minum Pagi"},
            {"Deluxe\t", "Rp. 1.500.000,00 / Malam\t", "1x Queen Bed\n2x AC\n1x TV 48 inch\nPerlengkapan Mandi\nMakan & Minum 3x Sehari + Snack"},
        };

        System.out.println("=================");
        System.out.println("| BOOKING HOTEL |");
        System.out.println("=================");
        System.out.println("SELAMAT DATANG!\nAda yang bisa kami bantu?\nBerikut adalah opsi yang bisa anda pilih..");

        //Menampilkan Pilihan Menu
        while (true) {
            System.out.println("");
            System.out.println("1. Check In");
            System.out.println("2. List Harga Kelas Kamar");
            System.out.println("3. EXIT");

            System.out.print("Masukkan Opsi : ");
            int opsi = input.nextInt();
            System.out.println();

            switch (opsi) {

                //CHECK IN
                case 1:
                    System.out.println("============");
                    System.out.println("| CHECK IN |");
                    System.out.println("============");
                    System.out.println("1. Check ketersediaan kamar");
                    System.out.println("2. Daftar Tamu Menginap");
                    System.out.println("3. Pesan Kamar");
                    System.out.println("4. Checkout");

                    System.out.print("Masukkan Pilihan : ");
                    int pilihan = input.nextInt();
                    System.out.println();

                    switch (pilihan) {
                        //Menampilkan Ketersediaan Kamar
                        case 1:
                            
                            break;
                        //Menampilkan daftar tamu yang menginap
                        case 2:
                            
                            break;
                        //Melakukan Transaksi
                        case 3:
                            do { 
                                System.out.print("Masukkan nama: ");
                                nama = input.next();
                                System.out.print("Masukkan usia: ");
                                usia = input.nextInt();
                                System.out.print("Masukkan asal daerah/domisili anda: ");
                                asal = input.next();
                                System.out.print("Masukkan waktu lama menginap anda (Malam): ");
                                lama_menginap = input.nextInt();
                                System.out.print("Masukkan jumlah tamu dalam satu kamar: ");
                                jmlTamu = input.nextInt();
                    
                                if (jmlTamu <= 4) {
                                    // MENAMPILKAN OPSI PILIH KAMAR
                                    System.out.println("Pilihan Kelas Kamar yang Tersedia: ");
                                    for (int i = 0; i < kelasKamar.length; i++) {
                                        System.out.println((i + 1) + ". " + kelasKamar[i] + " - Harga: Rp " + hargaKamar[i]);
                                    }
                    
                                    System.out.print("Pilih jenis kamar: ");
                                    int menu = input.nextInt();
                    
                                    if (menu >= 1 && menu <= kelasKamar.length) {
                                        total = lama_menginap * hargaKamar[menu - 1];
                                        // MENAMPILKAN DETAIL PESANAN
                                        System.out.println("===========================================================================================");
                                        System.out.println("|================================= DETAIL PEMESANAN ======================================|");
                                        System.out.println("===========================================================================================");
                                        System.out.println("Nama: " + nama + " \t\t|");
                                        System.out.println("Usia: " + usia + " Tahun \t\t|");
                                        System.out.println("Asal Daerah: " + asal + " \t\t|");
                                        System.out.println("=============================================");
                                        System.out.println("|Total pembayaran selama " + lama_menginap + " malam: Rp " + total + "|");
                                        System.out.println("=============================================");
                                        System.out.println("======================= TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!! =======================");
                                        System.out.println("| *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel |");
                                        System.out.println("| *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan   |");
                                        System.out.println("============================================================================================");
                                    } else {
                                        System.out.println("Pilihan tidak valid");
                                    }
                                } else {
                                    System.out.println("Dilarang membawa tamu lebih dari 4");
                                }
                    
                                System.out.println("Apakah anda ingin Reschedule? (Y/N): ");
                                pesanLagi = input.next().charAt(0);
                    
                            } while (pesanLagi == 'Y' || pesanLagi == 'y');
                            break;

                        case 4:
                            System.out.println("Pelanggan telah di Checkout!");
                            break;
                            
                        default:
                        System.out.println("Bukan Pilihan!");
                            break;
                    }

                    break;

                //LIST HARGA KELAS KAMAR
                case 2:
                    for (String[] kelas : daftarKamar) {
                        for (String kamar : kelas) {
                            System.out.println(kamar + "");
                        }
                        System.out.println();
                    }
                    break;

                //EXIT
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
