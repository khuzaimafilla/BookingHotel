import java.util.Scanner;

public class bookinghotel2 {
    public static void main(String[] args) {

        // Deklarasi Scanner
        Scanner input = new Scanner(System.in);

        // Deklarasi Variable
        String[] namaTamu = new String[100]; // Array untuk nama tamu
        String[] asalTamu = new String[100]; // Array untuk asal tamu
        int[] usiaTamu = new int[100]; // Array untuk usia tamu
        int[] lamaMenginapTamu = new int[100]; // Array untuk lama menginap tamu
        int[] jmlTamuKamar = new int[100]; // Array untuk jumlah tamu dalam satu kamar
        long[] totalPembayaran = new long[100]; // Array untuk total pembayaran tamu
        String[] tanggalBook = new String[100]; // Array untuk tanggal Booking
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
                {"Standard", "Rp. 500.000,00 / Malam", "2x Single Bed 1x TV 1x Kipas Perlengkapan Mandi"},
                {"Superior", "Rp. 1.000.000,00 / Malam", "1x Double Bed 1x AC 1x TV 24 inch Perlengkapan Mandi Makan & Minum Pagi"},
                {"Deluxe", "Rp. 1.500.000,00 / Malam", "1x Queen Bed 2x AC 1x TV 48 inch Perlengkapan Mandi Makan & Minum 3x Sehari + Snack"},
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
            System.out.println("| 1. Masuk menu Check In    |");
            System.out.println("| 2. List Harga Kelas Kamar |");
            System.out.println("| 3. Daftar Tamu Menginap   |");
            System.out.println("| 4. EXIT                   |");
            System.out.println("=============================");

            System.out.print("Masukkan Opsi : ");
            int opsi = input.nextInt();
            System.out.println();
            kembaliKeMenuCheckIn = false;
            switch (opsi) {

                // CHECK IN
                case 1:
                    do {
                        System.out.println("===============================");
                        System.out.println("|        MENU CHECK IN        |");
                        System.out.println("|=============================|");
                        System.out.println("| 1. Check ketersediaan kamar |");
                        System.out.println("| 2. Pesan Kamar              |");
                        System.out.println("| 3. Reschedule Booking       |"); // Tambahkan opsi reschedule
                        System.out.println("| 4. Checkout                 |");
                        System.out.println("| 0. Kembali ke Menu Awal     |");
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
                                    String status = kamarTersedia[i] ? "Tersedia" : "Terisi";
                                    System.out.println((i + 1) + ". " + kelasKamar[i] + " - Status: " + status);
                                }
                                break;

                            // Melakukan Transaksi
                            case 2:
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
                                    System.out.print("Masukkan tanggal (Mm-Dd-Yy) : ");
                                    String tanggalBooking = input.next();
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
                                                        tanggalBook[i] = tanggalBooking;
                                                        break;
                                                    }
                                                }

                                                // MENAMPILKAN DETAIL PESANAN
                                                System.out.println("============================================================================================");
                                                System.out.println("|                                     DETAIL PEMESANAN                                     |");
                                                System.out.println("============================================================================================");
                                                System.out.println("| Tanggal booking : " + tanggalBooking);
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
                                    if (pesanLagi == 'N' || pesanLagi == 'n') {
                                        kembaliKeMenuCheckIn = false;
                                        break;
                                    }
                                } while (pesanLagi == 'Y' || pesanLagi == 'y');
                                break;

                            // Reschedule Booking
                            case 3:
                                System.out.print("Masukkan nama tamu yang ingin direschedule: ");
                                String namaReschedule = input.next();

                                // Cari tamu yang ingin direschedule
                                boolean tamuDitemukan = false;
                                for (int i = 0; i < namaTamu.length; i++) {
                                    if (namaTamu[i] != null && namaTamu[i].equalsIgnoreCase(namaReschedule)) {
                                        System.out.print("Masukkan tanggal baru (Mm-Dd-Yy): ");
                                        String tanggalBaru = input.next();

                                        // Update tanggal booking
                                        tanggalBook[i] = tanggalBaru;

                                        System.out.println("Reschedule berhasil untuk tamu dengan nama " + namaReschedule + ".");
                                        tamuDitemukan = true;
                                        break;
                                    }
                                }

                                if (!tamuDitemukan) {
                                    System.out.println("Tamu dengan nama " + namaReschedule + " tidak ditemukan.");
                                }
                                break;

                            // Checkout
                            case 4:
                                // Implementasi checkout (sama seperti sebelumnya)
                                break;

                            // Kembali ke Menu Awal
                            case 0:
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

                // Daftar tamu menginap
                case 3:
                    for (int i = 0; i < namaTamu.length; i++) {
                        if (namaTamu[i] != null) {
                            System.out.println("==================");
                            System.out.println("Nama: " + namaTamu[i]);
                            System.out.println("Asal: " + asalTamu[i]);
                            System.out.println("Usia: " + usiaTamu[i]);
                            System.out.println("Lama menginap: " + lamaMenginapTamu[i]);
                            System.out.println("Tanggal: " + tanggalBook[i]);
                            System.out.println("==================");
                        } else if (namaTamu[i] == null) {
                            System.out.println("Tidak ada tamu");
                            break;
                        }
                    }
                    break;

                // EXIT
                case 4:
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
