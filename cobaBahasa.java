import java.util.Scanner;

public class cobaBahasa {
    public static void main(String[] args) {

        //panggil fungsi selamat datang
        selamatDatang();
        
        boolean pilihBahasa = true;

        while (pilihBahasa) {
        System.out.println("======================================================================================");
        System.out.println("|                                 Bahasa/Language                                    |");
        System.out.println("|====================================================================================|");
        System.out.println("| 1. Bahasa Indonesia                                                                |");
        System.out.println("| 2. English                                                                         |");
        System.out.println("| 0. EXIT                                                                            |");
        System.out.println("|====================================================================================|\n");

        System.out.print("Pilih opsi bahasa/language: ");
        int menuUtama = input.nextInt();

        switch (menuUtama) {
            case 1:
                mainBahasa(args);
                break;

            case 2:
                mainenglish(args);
                break;

            case 0:
                pilihBahasa = false;
                System.out.println("|====================================================================================|");
                System.out.println("|                                PROGRAM DIHENTIKAN!                                 |");
                System.out.println("|====================================================================================|");
                break;
        
            default:
                System.out.println("======================================================================================");
                System.out.println("|                                 Opsi tidak ditemukan                               |");
                System.out.println("======================================================================================");
                break;
        }

        }
    }
        //Deklarasi scanner
        static Scanner input = new Scanner(System.in);

        // Deklarasi array
        static String[] namaTamu = new String[100];    // Array untuk nama tamu
        static String[] asalTamu = new String[100];    // Array untuk asal tamu
        static String[] jenisKelamin = new String[100];// Array untuk jenis kelamin tamu
        static int[] usiaTamu = new int[100];          // Array untuk usia tamu
        static int[] lamaMenginapTamu = new int[100];  // Array untuk lama menginap tamu
        static int[] jmlTamuKamar = new int[100];      // Array untuk jumlah tamu dalam satu kamar
        static long[] totalPembayaran = new long[100]; // Array untuk total pembayaran tamu
        static String[] tanggalBook = new String[100]; // Array untuk tanggal Booking

        //deklarasi variabel
        static char pesanLagi;
        static boolean adaTamu;

        // Deklarasi dan inisialisasi variabel tarif
        static long tarif1 = 500000, tarif2 = 1000000, tarif3 = 1500000, total;

        // Deklarasi dan Inisialisasi array kelas kamar
        static String[] kelasKamar = {"Standard", "Superior", "Deluxe"};

        // Deklarasi dan Inisialisasi array harga kamar
        static long[] hargaKamar = {tarif1, tarif2, tarif3};

        // Deklarasi dan Inisialisasi array kamarTersedia
        static boolean[] kamarTersedia = {true, true, true}; // array ketersediaan kamar dengan kondisi awal true (tersedia)

        // Deklarasi dan Inisialisasi array daftar kamar (sample data, sesuai kebutuhan)
        static String[][] daftarKamar = {
            {"Standard", "Rp. 500.000,00 / Malam", "2x Single Bed 1x TV 1x Kipas Perlengkapan Mandi"},
            {"Superior", "Rp. 1.000.000,00 / Malam", "1x Double Bed 1x AC 1x TV 24 inch Perlengkapan Mandi Makan & Minum Pagi"},
            {"Deluxe", "Rp. 1.500.000,00 / Malam", "1x Queen Bed 2x AC 1x TV 48 inch Perlengkapan Mandi Makan & Minum 3x Sehari + Snack"},
        };
    
        //Fungsi selamat datang
        static void selamatDatang(){
            System.out.println("======================================================================================");
            System.out.println("|                                  BOOKING HOTEL                                     |");
            System.out.println("|====================================================================================|");
            System.out.println("| Project Akhir Dasar Pemrograman                                                    |");
            System.out.println("| Anggota kelompok 3:                                                                |");
            System.out.println("| 1. Nadya Hapsari Putri         (NIM 2341760179)                                    |");
            System.out.println("| 2. Khuzaima FIlla Januartha    (NIM 2341760078)                                    |");
            System.out.println("| 3. Siti Alifia Azzahra Mustofa (NIM 2341760019)                                    |");
            System.out.println("|====================================================================================|");
            System.out.println("| SELAMAT DATANG !!!                                                                 |");
            System.out.println("| Ada yang bisa kami bantu ?                                                         |");
            System.out.println("| Berikut adalah opsi yang bisa anda pilih !                                         |");
            System.out.println("======================================================================================\n");
        }

        //fungsi bahasa indonesia
        static void mainBahasa(String[] args){

            //Print MENU berulang, selama kondisi dari setiap case bernilai true
            while (true) {
                System.out.println("======================================================================================");
                System.out.println("|                                      MENU                                          |");
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
                System.out.print(" Masukkan Opsi: ");
                int opsi = input.nextInt();
                System.out.println();

                //Switch case untuk MENU
                switch (opsi) {

                    //Menu LIST HARGA KELAS KAMAR
                    case 1:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                               LIST HARGA KELAS KAMAR                               |");
                        System.out.println("|====================================================================================|");

                        for (String[] kelas : daftarKamar) {
                            for (String kamar : kelas) {
                                System.out.println("| " + kamar + " ");
                            }
                            System.out.println("======================================================================================");
                        }
                        System.out.println();

                        break;

                    //Menu CHECK KETERSEDIAAN KAMAR
                    case 2:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                               KETERSEDIAAN KAMAR                                   |");
                        System.out.println("|====================================================================================|");
                                for (int i = 0; i < kelasKamar.length; i++) {
                                    String status = kamarTersedia[i] ? "Tersedia" : "Terisi";
                                    System.out.println("| " + (i + 1) + ". " + kelasKamar[i] + " - Status: " + status);
                                }
                        System.out.println("|====================================================================================|");
                        System.out.println();

                        break;

                    //Menu DAFTAR TAMU MENGINAP
                        case 3:
                            System.out.println("|====================================================================================|");
                            System.out.println("|                               DAFTAR TAMU MENGINAP                                 |");
                            System.out.println("|====================================================================================|");
                            
                            //Menampilkan array dari inputan check-in tamu
                            for (int i = 0; i < namaTamu.length; i++) {
                                if (namaTamu[i] != null){

                                    System.out.println("| Nama: " + namaTamu[i]);
                                    System.out.println("| Asal: " + asalTamu[i]);
                                    System.out.println("| Jenis Kelamin: " + jenisKelamin[i]);
                                    System.out.println("| Usia: " + usiaTamu[i] + " Tahun");
                                    System.out.println("| Lama menginap: " + lamaMenginapTamu[i] + " Malam");
                                    System.out.println("| Tanggal: " + tanggalBook[i]);
                                    System.out.println("|====================================================================================|");
                                    
                                    //boolean kondisi jika ada tamu maka bernilai true
                                    adaTamu = true;

                                } 
                                //Kondisi apabila tidak ada tamu yang terdaftar
                                    else if (!adaTamu) {
                                        System.out.println("|                            Belum ada tamu yang menginap!                           |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();
                                        break;
                                }
                            }

                        break;

                    //Menu CHECK-IN
                    case 4:
                        do {
                            System.out.println("|====================================================================================|");
                            System.out.println("|                                    PESAN KAMAR                                     |");
                            System.out.println("|====================================================================================|");

                            //inputan untuk nama tamu
                            System.out.print("| Masukkan nama tamu: ");
                            String nama = input.next();

                            //inputan untuk usia tamu
                            System.out.print("| Masukkan usia tamu: ");
                            int usia = input.nextInt();

                            //inputan untuk jenis kelamin tamu
                            System.out.print("| Masukkan jenis kelamin tamu (Laki/Perempuan): ");
                            String gender = input.next();

                            //inputan untuk asal daerah tamu
                            System.out.print("| Masukkan asal daerah/domisili tamu: ");
                            String asal = input.next();

                            //inputan untuk tanggal pemesanan tamu
                            System.out.print("| Masukkan tanggal pemesanan (Dd-Mm-Yy) : ");
                            String tanggalBooking = input.next();

                            //inputan untuk waktu tamu menginap
                            System.out.print("| Masukkan waktu lama menginap tamu (Malam): ");
                            int lama_menginap = input.nextInt();

                            //inputan untuk jumlah tamu dalam 1 kamar
                            System.out.print("| Masukkan jumlah tamu dalam satu kamar: ");
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

                                //Kondisi saat memilih kamar
                                if (menu >= 1 && menu <= kelasKamar.length) {

                                    // menu -1, artinya saat memilih menu kamar, array akan dipanggil sesuai indexnya, yaitu dimulai dari index 0
                                    // ketika kita memilih opsi kamar 1, maka yang terpanggil adalah array di index 0
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
                                        System.out.println("| Jenis kelas kamar : " + kelasKamar[menu-1]);
                                        System.out.println("| Nama: " + nama);
                                        System.out.println("| Usia: " + usia + " Tahun");
                                        System.out.println("| Jenis Kelamin: " + gender);
                                        System.out.println("| Asal Daerah: " + asal);
                                        System.out.println("===========================================================================================|");
                                        System.out.println("|                                    Detail Pembayaran                                     |");
                                        System.out.println("===========================================================================================|");
                                        System.out.println("| Pelanggan "+nama+" melakukan penginapan selama "+lama_menginap+" malam, ");
                                        System.out.println("| Total pembayaran selama " + lama_menginap + " malam: " + total);
                                        System.out.println("| Total yang harus dibayar oleh pelanggan = Rp." + total +",00");
                                        System.out.println("|==========================================================================================|");
                                        System.out.println("|                       TERIMAKASIH TELAH MENGINAP DI HOTEL KAMI !!!                       |");
                                        System.out.println("|==========================================================================================|");
                                        System.out.println("| *pastikan semua barang dan perlengkapan anda tidak tertinggal di kamar maupun area hotel |");
                                        System.out.println("| *pihak hotel tidak akan bertanggungjawab atas segala kehilangan yang dialami pelanggan   |");
                                        System.out.println("============================================================================================");
                                        System.out.println();
                                    } else {

                                        //Kondisi apabila kamar yang dipilih sudah terisi oleh tamu yang telah melakukan check-in sebelumnya
                                        System.out.println("|====================================================================================|");
                                        System.out.println("|                       KAMAR SUDAH TERISI, PILIH KAMAR LAIN!                        |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();
                                    }
                                } else {

                                    //kondisi apabila opsi menu kamar tidak ditemukan
                                    System.out.println("|====================================================================================|");
                                    System.out.println("|                               PILIHAN TIDAK VALID!                                 |");
                                    System.out.println("|====================================================================================|");
                                    System.out.println();
                                }
                            } else {

                                // kondisi apabila jumlah tamu lebih dari 4 orang
                                System.out.println("|====================================================================================|");
                                System.out.println("|                          TAMU TIDAK BOLEH LEBIH DARI 4!                            |");
                                System.out.println("|====================================================================================|");
                                System.out.println();
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
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                  MENU RESCHEDULE                                   |");
                        System.out.println("|====================================================================================|");

                        //inputan nama tamu yang ingin di reschedule
                        System.out.print("| Masukkan nama tamu yang ingin direschedule: ");
                                    String namaReschedule = input.next();

                                    // boolean kondisi default dengan nilai false
                                    boolean tamuDitemukan = false;

                                    //cari tamu yang ingin di reschedule berdasarkan nama
                                    for (int i = 0; i < namaTamu.length; i++) {
                                        if (namaTamu[i] != null && namaTamu[i].equalsIgnoreCase(namaReschedule)) {
                                            System.out.print("| Masukkan tanggal booking baru (Mm-Dd-Yy): ");
                                            String tanggalBaru = input.next();

                                            // Update tanggal booking dengan variabel masukkan yang baru
                                            tanggalBook[i] = tanggalBaru;
                                            
                                            System.out.println("|====================================================================================|");
                                            System.out.println("| Reschedule berhasil untuk tamu dengan nama " + namaReschedule + "!  |");
                                            System.out.println("|====================================================================================|");
                                            System.out.println();

                                            //boolean kondisi apabila tamu yang dicari bisa ditemukan, maka akan bernilai true
                                            tamuDitemukan = true;
                                            break;
                                        }
                                    }

                                    //kondisi apabila tamu yang dicari tidak ditemukan
                                    if (!tamuDitemukan) {
                                        System.out.println("|====================================================================================|");
                                        System.out.println("| Tamu dengan nama " + namaReschedule + " tidak ditemukan!  |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();
                                    }
                        break;

                    //Menu CHECK-OUT
                    case 6:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                     CHECKOUT                                       |");
                        System.out.println("|====================================================================================|");

                        // Menampilkan Daftar Tamu yang check-in
                            System.out.println("| Daftar Tamu Menginap:");
                            System.out.println("| ");
                            adaTamu = false;

                            //menampilkan isi array nama tamu
                            for (int i = 0; i < namaTamu.length; i++) {

                                //Kondisi apabila ada tamu yang check-in
                                if (namaTamu[i] != null){

                                    System.out.println("| Nama: " + namaTamu[i]);
                                    System.out.println("| Asal: " + asalTamu[i]);
                                    System.out.println("| Usia: " + usiaTamu[i]);
                                    System.out.println("| Jenis kelamin: " + jenisKelamin[i]);
                                    System.out.println("| Lama menginap: " + lamaMenginapTamu[i]);
                                    System.out.println("| Tanggal: " + tanggalBook[i]);

                                    System.out.println("|====================================================================================|");
                                    
                                    adaTamu = true;
                                }
                            
                            }

                            //Kondisi apabila tidak ada tamu yang check-in
                            if (!adaTamu) {
                                System.out.println("|====================================================================================|");
                                System.out.println("|                          BELUM ADA TAMU YANG CHECK-IN!                             |");
                                System.out.println("|====================================================================================|");
                                System.out.println();
                            } else {

                                // Proses checkout, memasukkan nama tamu yang ingin di checkout
                                System.out.print("| Masukkan nama tamu yang akan checkout: ");
                                String namaCheckout = input.next();
                                tamuDitemukan = false;

                                //Menampilkan nama tamu yang ada (yang masih check-in)
                                for (int i = 0; i < namaTamu.length; i++) {

                                    //Proses Checkout, berdasarkan nama tamu, kemudian mengembalikan status kamar "terisi" menjadi "tersedia" kembali
                                    if (namaTamu[i] != null && namaTamu[i].equalsIgnoreCase(namaCheckout)) {
                                        kamarTersedia[i] = true; // Mengembalikan kamar menjadi tersedia

                                        System.out.println("|====================================================================================|");
                                        System.out.println("| Checkout berhasil untuk tamu dengan nama " + namaCheckout + "!   |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();

                                        // Menghapus data tamu yang checkout, dengan cara mengembalikan ke nilai default/kosongan array
                                        namaTamu[i] = null; 
                                        asalTamu[i] = null;
                                        tanggalBook[i] = null;
                                        jenisKelamin[i] = null;
                                        usiaTamu[i] = 0;
                                        lamaMenginapTamu[i] = 0;
                                        jmlTamuKamar[i] = 0;
                                        totalPembayaran[i] = 0;

                                        tamuDitemukan = true;
                                        break;
                                    }
                                }

                                //Kondisi apabila nama tamu yang diinput dengan variabel nama checkout tidak ditemukan
                                if (!tamuDitemukan) {
                                    System.out.println("|====================================================================================|");
                                    System.out.println("| Tamu dengan nama " + namaCheckout + " tidak ditemukan!  |");
                                    System.out.println("|====================================================================================|");
                                    System.out.println();
                                }
                            }
                    break;

                    //Menu EXIT
                    case 0:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                PROGRAM DIHENTIKAN!                                 |");
                        System.out.println("|====================================================================================|");
                        System.out.println();

                        //Untuk menghentikan program / kondisi / switch case
                        System.exit(0);
                        break;

                    //Kondisi jika case tidak terpenuhi / tidak ada dalam switch
                    default:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                 OPSI TIDAK ADA!                                    |");
                        System.out.println("|====================================================================================|");
                        System.out.println();
                        break;
                }
            }
        }

//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        //fungsi bahasa inggris
        static void mainenglish(String[] args){
            //Print MENU berulang, selama kondisi dari setiap case bernilai true
            while (true) {
                System.out.println("======================================================================================");
                System.out.println("|                                      MENU                                          |");
                System.out.println("|====================================================================================|");
                System.out.println("| 1. Room Price List                                                                 |");
                System.out.println("| 2. Check Room Availability                                                         |");
                System.out.println("| 3. Guest List                                                                      |");
                System.out.println("| 4. Check-In                                                                        |");
                System.out.println("| 5. Reschedule                                                                      |");
                System.out.println("| 6. Check-Out                                                                       |");
                System.out.println("| 0. EXIT                                                                            |");
                System.out.println("======================================================================================\n");

                //Inputan untuk memilih opsi MENU
                System.out.print(" Input Option: ");
                int opsi = input.nextInt();
                System.out.println();

                //Switch case untuk MENU
                switch (opsi) {

                    //Menu LIST HARGA KELAS KAMAR
                    case 1:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                 ROOM PRICE LIST                                    |");
                        System.out.println("|====================================================================================|");

                        for (String[] kelas : daftarKamar) {
                            for (String kamar : kelas) {
                                System.out.println("| " + kamar + " ");
                            }
                            System.out.println("======================================================================================");
                        }
                        System.out.println();

                        break;

                    //Menu CHECK KETERSEDIAAN KAMAR
                    case 2:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                ROOM AVAILABILITY                                   |");
                        System.out.println("|====================================================================================|");
                                for (int i = 0; i < kelasKamar.length; i++) {
                                    String status = kamarTersedia[i] ? "Available" : "Occupied";
                                    System.out.println("| " + (i + 1) + ". " + kelasKamar[i] + " - Status: " + status);
                                }
                        System.out.println("|====================================================================================|");
                        System.out.println();

                        break;

                    //Menu DAFTAR TAMU MENGINAP
                        case 3:
                            System.out.println("|====================================================================================|");
                            System.out.println("|                                     GUEST LIST                                     |");
                            System.out.println("|====================================================================================|");
                            
                            //Menampilkan array dari inputan check-in tamu
                            for (int i = 0; i < namaTamu.length; i++) {
                                if (namaTamu[i] != null){

                                    System.out.println("| Name : " + namaTamu[i]);
                                    System.out.println("| Guest's Origin : " + asalTamu[i]);
                                    System.out.println("| Gender : " + jenisKelamin[i]);
                                    System.out.println("| Age : " + usiaTamu[i] + " Years Old");
                                    System.out.println("| Duration of Stay : " + lamaMenginapTamu[i] + " Night");
                                    System.out.println("| Date : " + tanggalBook[i]);
                                    System.out.println("|====================================================================================|");
                                    
                                    //boolean kondisi jika ada tamu maka bernilai true
                                    adaTamu = true;

                                } 
                                //Kondisi apabila tidak ada tamu yang terdaftar
                                    else if (!adaTamu) {
                                        System.out.println("|                                 NO GUEST STAYED!                                   |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();
                                        break;
                                }
                            }

                        break;

                    //Menu CHECK-IN
                    case 4:
                        do {
                            System.out.println("|====================================================================================|");
                            System.out.println("|                                    CHECK - IN                                      |");
                            System.out.println("|====================================================================================|");

                            //inputan untuk nama tamu
                            System.out.print("| Input Guest's Name : ");
                            String nama = input.next();

                            //inputan untuk usia tamu
                            System.out.print("| Input Guest's Age : ");
                            int usia = input.nextInt();

                            //inputan untuk jenis kelamin tamu
                            System.out.print("| Input Guest's Gender (Male/Female) : ");
                            String gender = input.next();

                            //inputan untuk asal daerah tamu
                            System.out.print("| Input Guest's Origin / Domicile : ");
                            String asal = input.next();

                            //inputan untuk tanggal pemesanan tamu
                            System.out.print("| Input Staying Overnight Date (Dd-Mm-Yy) : ");
                            String tanggalBooking = input.next();

                            //inputan untuk waktu tamu menginap
                            System.out.print("| Input Guest's Duration of Stay (Night) : ");
                            int lama_menginap = input.nextInt();

                            //inputan untuk jumlah tamu dalam 1 kamar
                            System.out.print("| Input Guest Quantity per Room : ");
                            int jmlTamu = input.nextInt();

                            //Kondisi apabila jumlah tamu yang dimasukkan <= 4 orang
                            if (jmlTamu <= 4) {

                                // MENAMPILKAN OPSI PILIH KAMAR
                                System.out.println("====================================");
                                System.out.println("| Available Room Class :           |");
                                System.out.println("====================================");

                                //opsi pilih kamar dengan menampilkan kelas dan harga kamar 
                                for (int i = 0; i < kelasKamar.length; i++) {
                                    System.out.println((i + 1) + ". " + kelasKamar[i] + " - Price : Rp " + hargaKamar[i]);
                                }
                                System.out.println("====================================");

                                //inputan untuk memilih jenis kamar yang ingin dibooking
                                System.out.print("Choose Room Class : ");
                                int menu = input.nextInt();

                                //Kondisi saat memilih kamar
                                if (menu >= 1 && menu <= kelasKamar.length) {

                                    // menu -1, artinya saat memilih menu kamar, array akan dipanggil sesuai indexnya, yaitu dimulai dari index 0
                                    // ketika kita memilih opsi kamar 1, maka yang terpanggil adalah array di index 0
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
                                        System.out.println("|                                     BOOKING DETAILS                                      |");
                                        System.out.println("============================================================================================");
                                        System.out.println("| Booking Date : " + tanggalBooking);
                                        System.out.println("| Class : " + kelasKamar[menu-1]);
                                        System.out.println("| Name : " + nama);
                                        System.out.println("| Age : " + usia + " YO");
                                        System.out.println("| Gender : " + gender);
                                        System.out.println("| Origin : " + asal);
                                        System.out.println("===========================================================================================|");
                                        System.out.println("|                                      Payment Details                                     |");
                                        System.out.println("===========================================================================================|");
                                        System.out.println("| Guest "+nama+" have staying for "+lama_menginap+" Nights, ");
                                        System.out.println("| Payment total for " + lama_menginap + " Nights : " + total);
                                        System.out.println("| Total should be paid = IDR." + total +",00");
                                        System.out.println("|==========================================================================================|");
                                        System.out.println("|                           THANK YOU FOR STAYING OVERNIGHT !!!                            |");
                                        System.out.println("|==========================================================================================|");
                                        System.out.println("| *MAKE SURE NOTHING IS LEFT BEHIND !!!                                                    |");
                                        System.out.println("| *THE HOTEL IS NOT RESPONSIBLE FOR ANY LOSSES !!!                                         |");
                                        System.out.println("============================================================================================");
                                        System.out.println();
                                    } else {

                                        //Kondisi apabila kamar yang dipilih sudah terisi oleh tamu yang telah melakukan check-in sebelumnya
                                        System.out.println("|====================================================================================|");
                                        System.out.println("|                       ROOM OCCUPIED, CHOOSE ANOTHER ROOM !                         |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();
                                    }
                                } else {

                                    //kondisi apabila opsi menu kamar tidak ditemukan
                                    System.out.println("|====================================================================================|");
                                    System.out.println("|                                 OPTION INVALID !                                   |");
                                    System.out.println("|====================================================================================|");
                                    System.out.println();
                                }
                            } else {

                                // kondisi apabila jumlah tamu lebih dari 4 orang
                                System.out.println("|====================================================================================|");
                                System.out.println("|                          MAXIMUM GUEST CAPACITY IS 4  !                            |");
                                System.out.println("|====================================================================================|");
                                System.out.println();
                            }
                            
                            //Konfirmasi check-in ulang atau tidak?
                            System.out.print("Re-Check in? (Y/N): ");
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
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                  RESCHEDULE MENU                                   |");
                        System.out.println("|====================================================================================|");

                        //inputan nama tamu yang ingin di reschedule
                        System.out.print("| Input Guest's Name To Reschedule : ");
                                    String namaReschedule = input.next();

                                    // boolean kondisi default dengan nilai false
                                    boolean tamuDitemukan = false;

                                    //cari tamu yang ingin di reschedule berdasarkan nama
                                    for (int i = 0; i < namaTamu.length; i++) {
                                        if (namaTamu[i] != null && namaTamu[i].equalsIgnoreCase(namaReschedule)) {
                                            System.out.print("| Input New Staying Date (Mm-Dd-Yy): ");
                                            String tanggalBaru = input.next();

                                            // Update tanggal booking dengan variabel masukkan yang baru
                                            tanggalBook[i] = tanggalBaru;
                                            
                                            System.out.println("|====================================================================================|");
                                            System.out.println("| Guest " + namaReschedule + "Has Been Rescheduled !  |");
                                            System.out.println("|====================================================================================|");
                                            System.out.println();

                                            //boolean kondisi apabila tamu yang dicari bisa ditemukan, maka akan bernilai true
                                            tamuDitemukan = true;
                                            break;
                                        }
                                    }

                                    //kondisi apabila tamu yang dicari tidak ditemukan
                                    if (!tamuDitemukan) {
                                        System.out.println("|====================================================================================|");
                                        System.out.println("| Guest " + namaReschedule + " Not Found !  |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();
                                    }
                        break;

                    //Menu CHECK-OUT
                    case 6:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                     CHECKOUT                                       |");
                        System.out.println("|====================================================================================|");

                        // Menampilkan Daftar Tamu yang check-in
                            System.out.println("| Stayed Guest List :");
                            System.out.println("| ");
                            adaTamu = false;

                            //menampilkan isi array nama tamu
                            for (int i = 0; i < namaTamu.length; i++) {

                                //Kondisi apabila ada tamu yang check-in
                                if (namaTamu[i] != null){

                                    System.out.println("| Name : " + namaTamu[i]);
                                    System.out.println("| Origin : " + asalTamu[i]);
                                    System.out.println("| Age : " + usiaTamu[i]);
                                    System.out.println("| Gender : " + jenisKelamin[i]);
                                    System.out.println("| Duration Of Staying : " + lamaMenginapTamu[i]);
                                    System.out.println("| Date : " + tanggalBook[i]);

                                    System.out.println("|====================================================================================|");
                                    
                                    adaTamu = true;
                                }
                            
                            }

                            //Kondisi apabila tidak ada tamu yang check-in
                            if (!adaTamu) {
                                System.out.println("|====================================================================================|");
                                System.out.println("|                                 NO GUEST CHECKED YET !                             |");
                                System.out.println("|====================================================================================|");
                                System.out.println();
                            } else {

                                // Proses checkout, memasukkan nama tamu yang ingin di checkout
                                System.out.print("| Input Guest Name to Check-Out : ");
                                String namaCheckout = input.next();
                                tamuDitemukan = false;

                                //Menampilkan nama tamu yang ada (yang masih check-in)
                                for (int i = 0; i < namaTamu.length; i++) {

                                    //Proses Checkout, berdasarkan nama tamu, kemudian mengembalikan status kamar "terisi" menjadi "tersedia" kembali
                                    if (namaTamu[i] != null && namaTamu[i].equalsIgnoreCase(namaCheckout)) {
                                        kamarTersedia[i] = true; // Mengembalikan kamar menjadi tersedia

                                        System.out.println("|====================================================================================|");
                                        System.out.println("| Guest " + namaCheckout + "Has Been Checked Out !   |");
                                        System.out.println("|====================================================================================|");
                                        System.out.println();

                                        // Menghapus data tamu yang checkout, dengan cara mengembalikan ke nilai default/kosongan array
                                        namaTamu[i] = null; 
                                        asalTamu[i] = null;
                                        tanggalBook[i] = null;
                                        jenisKelamin[i] = null;
                                        usiaTamu[i] = 0;
                                        lamaMenginapTamu[i] = 0;
                                        jmlTamuKamar[i] = 0;
                                        totalPembayaran[i] = 0;

                                        tamuDitemukan = true;
                                        break;
                                    }
                                }

                                //Kondisi apabila nama tamu yang diinput dengan variabel nama checkout tidak ditemukan
                                if (!tamuDitemukan) {
                                    System.out.println("|====================================================================================|");
                                    System.out.println("| Guest " + namaCheckout + " Not Found !  |");
                                    System.out.println("|====================================================================================|");
                                    System.out.println();
                                }
                            }
                    break;

                    //Menu EXIT
                    case 0:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                PROGRAM STOPPED !!!                                 |");
                        System.out.println("|====================================================================================|");
                        System.out.println();

                        //Untuk menghentikan program / kondisi / switch case
                        System.exit(0);
                        break;

                    //Kondisi jika case tidak terpenuhi / tidak ada dalam switch
                    default:
                        System.out.println("|====================================================================================|");
                        System.out.println("|                                 OPTION INVALID !                                   |");
                        System.out.println("|====================================================================================|");
                        System.out.println();
                        break;
                }
            }
        }
}
