import java.util.Scanner;

public class hotelFinal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi array
        String[] namaTamu = new String[100];    // Array untuk nama tamu
        String[] asalTamu = new String[100];    // Array untuk asal tamu
        String[] jenisKelamin = new String[100];// Array untuk jenis kelamin tamu
        int[] usiaTamu = new int[100];          // Array untuk usia tamu
        int[] lamaMenginapTamu = new int[100];  // Array untuk lama menginap tamu
        int[] jmlTamuKamar = new int[100];      // Array untuk jumlah tamu dalam satu kamar
        long[] totalPembayaran = new long[100]; // Array untuk total pembayaran tamu
        String[] tanggalBook = new String[100]; // Array untuk tanggal Booking

        //deklarasi variabel char untuk opsi pemesanan ulang
        char pesanLagi;

        // Deklarasi dan inisialisasi variabel tarif
        long tarif1 = 500000, tarif2 = 1000000, tarif3 = 1500000, total;

        // Deklarasi dan Inisialisasi array kelas kamar
        String[] kelasKamar = {"Standard", "Superior", "Deluxe"};

        // Deklarasi dan Inisialisasi array harga kamar
        long[] hargaKamar = {tarif1, tarif2, tarif3};

        // Deklarasi dan Inisialisasi array kamarTersedia
        boolean[] kamarTersedia = {true, true, true}; // array ketersediaan kamar dengan kondisi awal true (tersedia)

        // Deklarasi dan Inisialisasi array daftar kamar (sample data, sesuai kebutuhan)
        String[][] daftarKamar = {
            {"Standard", "Rp. 500.000,00 / Malam", "2x Single Bed 1x TV 1x Kipas Perlengkapan Mandi"},
            {"Superior", "Rp. 1.000.000,00 / Malam", "1x Double Bed 1x AC 1x TV 24 inch Perlengkapan Mandi Makan & Minum Pagi"},
            {"Deluxe", "Rp. 1.500.000,00 / Malam", "1x Queen Bed 2x AC 1x TV 48 inch Perlengkapan Mandi Makan & Minum 3x Sehari + Snack"},
        };

        //Print SELAMAT DATANG DI BOOKING HOTEL
        System.out.println("======================================================================================");
        System.out.println("|                                  BOOKING HOTEL                                     |");
        System.out.println("|====================================================================================|");
        System.out.println("| SELAMAT DATANG !!!                                                                 |");
        System.out.println("| Ada yang bisa kami bantu ?                                                         |");
        System.out.println("| Berikut adalah opsi yang bisa anda pilih !                                         |");
        System.out.println("======================================================================================\n");

        //Print MENU berulang, selama kondisi dari setiap case bernilai true
        while (true) {
            System.out.println("======================================================================================");
            System.out.println("|                                        MENU                                        |");
            System.out.println("|====================================================================================|");
            System.out.println("| 1. List harga kelas kamar                                                          |");
            System.out.println("| 2. Check Ketersediaan Kamar                                                        |");
            System.out.println("| 3. Daftar tamu menginap                                                            |");
            System.out.println("| 4. Check-In                                                                        |");
            System.out.println("| 5. Reschedule                                                                      |");
            System.out.println("| 6. Check-Out                                                                       |");
            System.out.println("| 0. EXIT                                                                            |");
            System.out.println("======================================================================================\n");

            //Inputan untuk memilih opsi MENU
            System.out.print("Masukkan Opsi: ");
            int opsi = input.nextInt();
            System.out.println();

            //Switch case untuk MENU
            switch (opsi) {

                //Menu LIST HARGA KELAS KAMAR
                case 1:
                    for (String[] kelas : daftarKamar) {
                        for (String kamar : kelas) {
                            System.out.println(kamar + "");
                        }
                        System.out.println();
                    }

                    break;

                //Menu CHECK KETERSEDIAAN KAMAR
                case 2:
                    System.out.println("Ketersediaan Kamar:");
                            for (int i = 0; i < kelasKamar.length; i++) {
                                String status = kamarTersedia[i] ? "Tersedia" : "Terisi";
                                System.out.println((i + 1) + ". " + kelasKamar[i] + " - Status: " + status);
                            }

                    break;

                //Menu DAFTAR TAMU MENGINAP
                    case 3:
                        System.out.println("Daftar Tamu Menginap:");

                        //boolean kondisi default bernilai false
                        boolean adaTamu = false;
                        
                        //Menampilkan array dari inputan check-in tamu
                        for (int i = 0; i < namaTamu.length; i++) {
                            if (namaTamu[i] != null){

                                System.out.println("==================");
                                System.out.println("Nama: " + namaTamu[i]);
                                System.out.println("Asal: " + asalTamu[i]);
                                System.out.println("Jenis Kelamin: " + jenisKelamin[i]);
                                System.out.println("Usia: " + usiaTamu[i] + " Tahun");
                                System.out.println("Lama menginap: " + lamaMenginapTamu[i] + " Malam");
                                System.out.println("Tanggal: " + tanggalBook[i]);
                                System.out.println("==================");
                                
                                //boolean kondisi jika ada tamu maka bernilai true
                                adaTamu = true;

                            } 
                            //Kondisi apabila tidak ada tamu yang terdaftar
                                else if (!adaTamu) {
                                    System.out.println("Belum ada tamu yang menginap");
                                    break;
                            }
                        }

                    break;

                //Menu CHECK-IN
                case 4:
                    do {
                        System.out.println("===============================");
                        System.out.println("|         PESAN KAMAR         |");
                        System.out.println("===============================");

                        //inputan untuk nama tamu
                        System.out.print("Masukkan nama tamu: ");
                        String nama = input.next();

                        //inputan untuk usia tamu
                        System.out.print("Masukkan usia tamu: ");
                        int usia = input.nextInt();

                        //inputan untuk jenis kelamin tamu
                        System.out.print("Masukkan jenis kelamin tamu (Laki/Perempuan): ");
                        String gender = input.next();

                        //inputan untuk asal daerah tamu
                        System.out.print("Masukkan asal daerah/domisili tamu: ");
                        String asal = input.next();

                        //inputan untuk tanggal pemesanan tamu
                        System.out.print("Masukkan tanggal pemesanan (Dd-Mm-Yy) : ");
                        String tanggalBooking = input.next();

                        //inputan untuk waktu tamu menginap
                        System.out.print("Masukkan waktu lama menginap tamu (Malam): ");
                        int lama_menginap = input.nextInt();

                        //inputan untuk jumlah tamu dalam 1 kamar
                        System.out.print("Masukkan jumlah tamu dalam satu kamar: ");
                        int jmlTamu = input.nextInt();

                        //Kondisi apabila jumlah tamu yang dimasukkan <= 4 orang
                        if (jmlTamu <= 4) {

                            // MENAMPILKAN OPSI PILIH KAMAR
                            System.out.println("====================================");
                            System.out.println("|Pilihan Kelas Kamar yang Tersedia:|");
                            System.out.println("====================================");

                            //opsi pilih kamar dengan menampilkan kelas dan harga kamar 
                            for (int i = 0; i < kelasKamar.length; i++) {
                                System.out.println((i + 1) + ". " + kelasKamar[i] + " - Harga: Rp " + hargaKamar[i]);
                            }
                            System.out.println("====================================");

                            //inputan untuk memilih jenis kamar yang ingin dibooking
                            System.out.print("Pilih jenis kamar: ");
                            int menu = input.nextInt();

                            if (menu >= 1 && menu <= kelasKamar.length) {
                                if (kamarTersedia[menu - 1]) {
                                    kamarTersedia[menu - 1] = false;
                                    total = lama_menginap * hargaKamar[menu - 1];

                                    // Menambahkan data tamu dengan variabel inputan
                                    for (int i = 0; i < namaTamu.length; i++) {
                                        if (namaTamu[i] == null) {
                                            namaTamu[i] = nama;
                                            asalTamu[i] = asal;
                                            usiaTamu[i] = usia;
                                            jenisKelamin[i] = gender;
                                            lamaMenginapTamu[i] = lama_menginap;
                                            jmlTamuKamar[i] = jmlTamu;
                                            totalPembayaran[i] = total;
                                            tanggalBook[i] = tanggalBooking;

                                            break;
                                        }
                                    }

                                    // MENAMPILKAN DETAIL PESANAN (Struk struk an)
                                    System.out.println("============================================================================================");
                                    System.out.println("|                                     DETAIL PEMESANAN                                     |");
                                    System.out.println("============================================================================================");
                                    System.out.println("| Tanggal booking : " + tanggalBooking);
                                    System.out.println("| Nama: " + nama);
                                    System.out.println("| Usia: " + usia + " Tahun");
                                    System.out.println("| Jenis Kelamin: " + gender);
                                    System.out.println("| Asal Daerah: " + asal);
                                    System.out.println("===========================================================================================|");
                                    System.out.println("|                                    Detail Pembayaran                                     |");
                                    System.out.println("===========================================================================================|");
                                    System.out.println("| Pelanggan "+nama+" melakukan penginapan selama "+lama_menginap+" malam, ");
                                    System.out.println("| Total pembayaran selama " + lama_menginap + " malam: Rp " + total);
                                    System.out.println("| Total yang harus dibayar oleh pelanggan = Rp" + total +",00");
                                    System.out.println("|==========================================================================================|");
                                    System.out.println("|                       TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!!                       |");
                                    System.out.println("|==========================================================================================|");
                                    System.out.println("| *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel |");
                                    System.out.println("| *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan   |");
                                    System.out.println("============================================================================================");
                                } else {

                                    //Kondisi apabila kamar yang dipilih sudah terisi oleh tamu yang telah melakukan check-in sebelumnya
                                    System.out.println("Kamar sudah terisi, pilih kamar lain.");
                                }
                            } else {

                                //kondisi apabila opsi menu kamar tidak ditemukan
                                System.out.println("Pilihan tidak valid");
                            }
                        } else {

                            // kondisi apabila jumlah tamu lebih dari 4 orang
                            System.out.println("Tamu tidak boleh lebih dari 4!");
                        }
                        
                        //Konfirmasi check-in ulang atau tidak?
                        System.out.print("Lakukan Check-in lagi? (Y/N): ");
                        pesanLagi = input.next().charAt(0); //input an diambil index ke-0 / huruf pertama

                        //Kondisi apabila memilih opsi N/n/NO
                        if (pesanLagi == 'N' || pesanLagi == 'n') {
                            break;
                        }

                    //Kondisi apabila memilih opsi Y/y/YES
                    } while (pesanLagi == 'Y' || pesanLagi == 'y');

                break;

                //Menu RESCHEDULE
                case 5:

                    //inputan nama tamu yang ingin di reschedule
                    System.out.print("Masukkan nama tamu yang ingin direschedule: ");
                                String namaReschedule = input.next();

                                // boolean kondisi default dengan nilai false
                                boolean tamuDitemukan = false;

                                //cari tamu yang ingin di reschedule berdasarkan nama
                                for (int i = 0; i < namaTamu.length; i++) {
                                    if (namaTamu[i] != null && namaTamu[i].equalsIgnoreCase(namaReschedule)) {
                                        System.out.print("Masukkan tanggal booking baru (Mm-Dd-Yy): ");
                                        String tanggalBaru = input.next();

                                        // Update tanggal booking dengan variabel masukkan yang baru
                                        tanggalBook[i] = tanggalBaru;

                                        System.out.println("Reschedule berhasil untuk tamu dengan nama " + namaReschedule + ".");

                                        //boolean kondisi apabila tamu yang dicari bisa ditemukan, maka akan bernilai true
                                        tamuDitemukan = true;
                                        break;
                                    }
                                }

                                //kondisi apabila tamu yang dicari tidak ditemukan
                                if (!tamuDitemukan) {
                                    System.out.println("Tamu dengan nama " + namaReschedule + " tidak ditemukan.");
                                }
                    break;

                //Menu CHECK-OUT
                 case 6:
                     System.out.println("================================");
                     System.out.println("|           CHECKOUT!          |");
                     System.out.println("================================");

                     // Menampilkan Daftar Tamu yang check-in
                         System.out.println("Daftar Tamu Menginap:");
                        adaTamu = false;

                        //menampilkan isi array nama tamu
                         for (int i = 0; i < namaTamu.length; i++) {

                            //Kondisi apabila ada tamu yang check-in
                             if (namaTamu[i] != null){
                                 System.out.println("==================");

                                 System.out.println("Nama: " + namaTamu[i]);
                                 System.out.println("Asal: " + asalTamu[i]);
                                 System.out.println("Usia: " + usiaTamu[i]);
                                 System.out.println("Jenis kelamin: " + jenisKelamin[i]);
                                 System.out.println("Lama menginap: " + lamaMenginapTamu[i]);
                                 System.out.println("Tanggal: " + tanggalBook[i]);

                                 System.out.println("==================");
                                
                                 adaTamu = true;
                             }
                        
                         }

                         //Kondisi apabila tidak ada tamu yang check-in
                         if (!adaTamu) {
                             System.out.println("Belum ada tamu yang check-in.");
                         } else {

                             // Proses checkout, memasukkan nama tamu yang ingin di checkout
                             System.out.print("Masukkan nama tamu yang akan checkout: ");
                             String namaCheckout = input.next();
                             tamuDitemukan = false;

                            //Menampilkan nama tamu yang ada (yang masih check-in)
                             for (int i = 0; i < namaTamu.length; i++) {

                                //Proses Checkout, berdasarkan nama tamu, kemudian mengembalikan status kamar "terisi" menjadi "tersedia" kembali
                                 if (namaTamu[i] != null && namaTamu[i].equalsIgnoreCase(namaCheckout)) {
                                     kamarTersedia[i] = true; // Mengembalikan kamar menjadi tersedia
                                     System.out.println("Checkout berhasil untuk tamu dengan nama " + namaCheckout + ".");
                                     tamuDitemukan = true;

                                     // Menghapus data tamu yang checkout, dengan cara mengembalikan ke nilai default/kosongan array
                                     namaTamu[i] = null; 
                                     asalTamu[i] = null;
                                     tanggalBook[i] = null;
                                     jenisKelamin[i] = null;
                                     usiaTamu[i] = 0;
                                     lamaMenginapTamu[i] = 0;
                                     jmlTamuKamar[i] = 0;
                                     totalPembayaran[i] = 0;

                                     break;
                                 }
                             }

                            //Kondisi apabila nama tamu yang diinput dengan variabel nama checkout tidak ditemukan
                             if (!tamuDitemukan) {
                                 System.out.println("Tamu dengan nama " + namaCheckout + " tidak ditemukan.");
                             }
                         }
                 break;

                //Menu EXIT
                case 0:
                    System.out.println("|====================================================================================|");
                    System.out.println("|                   TERIMAKASIH SUDAH DATANG, SAMPAI JUMPA LAGI!                     |");
                    System.out.println("|====================================================================================|");

                    //Untuk menghentikan program / kondisi / switch case
                    System.exit(0);
                    break;

                //Kondisi jika case tidak terpenuhi / tidak ada dalam switch
                default:
                    System.out.println("Opsi tidak ada!");
                    break;
            }
        }
    }
}
