package FP_UTS;

import java.util.Scanner;

/*
Class provider: Kasir, Pembeli, Transaksi, Laporan, Menu -> extends : Makanan, Minuman, & Snack
Narasi: Dewi ingin memesan Chicken Pop Teriyaki dan Choco Oreo di Kedai UMKM KUQURUYUK 
 */

public class KUQURUYUK {

   public static Scanner input = new Scanner(System.in);
   public static int mkn2 = 9, mnm2 = 16, snc2 = 4, jenis;
   public static int pb2 = 2, ksr2 = 2;
   public static int co = 0, simpan = 0, urutan_menu = 28;
   public static int pesanan = 0;
   public static boolean match = false;
   public static int[][] data = new int[100][5];

   @SuppressWarnings("null")
   public static void main(String[] args) {

      System.out.println(" __________________________________");
      System.out.println("| Program ini dibuat oleh:         |");
      System.out.println("| 1.Azzahra R.       [22082010155] |");
      System.out.println("| 2.Fathimatus Z. N. [22082010156] |");
      System.out.println("| 3.Ganes Dwi F.     [22082010157] |");
      System.out.println("| 4.Navy Nurlyn A.   [22082010158] |");
      System.out.println("|__________________________________|");

      Scanner sc = new Scanner(System.in);
      int pilih = 0, pilih1 = 0, jmlm = 0;
      cTransaksi beli = new cTransaksi();
      cLaporan belii = new cLaporan();

      //Deklarasi daftar menu makanan
      cMakanan mkn[] = new cMakanan[100];
      mkn[0] = new cMakanan("CP01", "CP Blackpaper", 13000, 0);
      mkn[1] = new cMakanan("CP02", "CP Mozarella", 15000, 1);
      mkn[2] = new cMakanan("CP03", "CP Sambal Matah", 13000, 2);
      mkn[3] = new cMakanan("CP04", "CP Fire", 14000, 3);
      mkn[4] = new cMakanan("CP05", "CP Potato", 13000, 4);
      mkn[5] = new cMakanan("CP06", "CP Teriyaki", 13000, 5);
      mkn[6] = new cMakanan("CP07", "CP Indomie", 13000, 6);
      mkn[7] = new cMakanan("CP08", "CP Bolognese", 13000, 7);
      mkn[8] = new cMakanan("CP09", "CP Salted Egg", 14000, 8);

      //Deklarasi daftar menu minuman
      cMinuman mnm[] = new cMinuman[100];
      mnm[0] = new cMinuman("MI01", "Air Mineral", 3000, 9);
      mnm[1] = new cMinuman("MI02", "Choco Ovaltine", 10000, 10);
      mnm[2] = new cMinuman("MI03", "Matcha Latte", 10000, 11);
      mnm[3] = new cMinuman("MI04", "Choco Oreo", 10000, 12);
      mnm[4] = new cMinuman("MI05", "Taro Escape", 10000, 13);
      mnm[5] = new cMinuman("MI06", "Choco Hazelnut", 10000, 14);
      mnm[6] = new cMinuman("MI07", "Tiramisu", 10000, 15);
      mnm[7] = new cMinuman("MI08", "Lychee Latte", 10000, 16);
      mnm[8] = new cMinuman("MI09", "Choco Milo", 10000, 17);
      mnm[9] = new cMinuman("MI10", "Red Velvet Latte", 10000, 18);
      mnm[10] = new cMinuman("MI11", "Brown Sugar", 10000, 19);
      mnm[11] = new cMinuman("MI12", "Kopi LDR", 10000, 20);
      mnm[12] = new cMinuman("MI13", "Kopi Kangen", 10000, 21);
      mnm[13] = new cMinuman("MI14", "Tp Oreo", 3000, 22);
      mnm[14] = new cMinuman("MI15", "Tp Cheese Cream", 5000, 23);
      mnm[15] = new cMinuman("MI16", "Tp Macchiato", 5000, 24);

      //Deklarasi daftar menu snack
      cSnack snc[] = new cSnack[100];
      snc[0] = new cSnack("SN01", "Garlic Mushroom", 12000, 25);
      snc[1] = new cSnack("SN02", "French Fries", 10000, 26);
      snc[2] = new cSnack("SN03", "Mushroom Crispy", 10000, 27);
      snc[3] = new cSnack("SN04", "Wedges", 10000, 28);

      //Deklarasi daftar kasir
      cKasir ksr[] = new cKasir[10];
      ksr[0] = new cKasir("K01", "Lala");
      ksr[1] = new cKasir("K02", "Dodo");

      //Deklarasi daftar pembeli
      cPembeli pb[] = new cPembeli[100];
      pb[0] = new cPembeli("P01", "Dewi", "Rungkut Asri", 1, 0);
      pb[1] = new cPembeli("P02", "Dewa", "Rungkut Madya", 2, 0);

      //Deklarasi array untuk total terjual dan total harga terjual masing-masing menu
      for (int i = 0; i <= urutan_menu; i++) {
         data[i][0] = i; data[i][1] = 0; data[i][2] = 0; data[i][3] = 0; data[i][4] = 0;
      }

      System.out.println(" ");
      System.out.println("*********************************************");
      System.out.println("    Program Aplikasi Warung UMKM KUQURUYUK   ");
      System.out.println("*********************************************");

      login();
      if (match == true) {
         System.out.println("");
         System.out.println("=============================================");
         System.out.println("            WELCOME TO KUQURUYUK             ");
         System.out.println("             Korean Chicken Pop              ");
         System.out.println("=============================================");
         do {
            System.out.println("__________________________");
            System.out.println("       MENU PROGRAM");
            System.out.println("--------------------------");
            System.out.println("1.Menu \n2.Pembeli \n3.Kasir \n4.Transaksi Pembelian \n5.Laporan");
            System.out.println("6.Exit ");
            System.out.print("Pilih = ");
            pilih = sc.nextInt();
            System.out.println("__________________________");
            switch (pilih) {

               //SUBMENU MENU
               case 1 -> {
                  do {
                     System.out.println("");
                     System.out.println("  ---------------------");
                     System.out.println("      MENU KUQURUYUK   ");
                     System.out.println("  ---------------------");
                     System.out.println("  1.Tambah Menu");
                     System.out.println("  2.Update Menu");
                     System.out.println("  3.Delete Menu");
                     System.out.println("  4.Lihat Menu");
                     System.out.println("  5.Kembali");
                     System.out.print("  Pilih = ");
                     pilih1 = sc.nextInt();

                     switch (pilih1) {

                        // TAMBAH DAFTAR MENU
                        case 1 -> {
                           System.out.println("");
                           System.out.println("    =========== Tambah Daftar Menu ============");
                           System.out.println("    1. Makanan  ||   2. Minuman   ||   3. Snack");
                           System.out.print("    Jenis          = ");
                           int jns = sc.nextInt();

                           if (jns == 1) {
                              System.out.print("    Kode Makanan   = ");
                              String kd = sc.next();
                              boolean cari = false;
                              do {
                                 for (int i = 0; i < mkn2; i++) {
                                    if (mkn[i].getKode().equalsIgnoreCase(kd)) {
                                       System.out.println("    Kode sudah ada, buat kode lain!");
                                       System.out.print("    Kode Makanan   = ");
                                       kd = sc.next();
                                       cari = false;
                                    }
                                 }
                                 cari = true;
                              } while (cari != true);

                              sc = new Scanner(System.in);
                              System.out.print("    Nama Makanan   = ");
                              String nm = sc.nextLine();
                              System.out.print("    Harga          = ");
                              int h = sc.nextInt();
                              mkn[mkn2] = new cMakanan(kd, nm, h, urutan_menu + 1);
                              mkn2++; urutan_menu++;
                              System.out.println("");
                              System.out.println("     | Menu " + nm + " dibuat.. |");
                              break;
                           }

                           if (jns == 2) {
                              System.out.print("    Kode Minuman    = ");
                              String kd = sc.next();
                              boolean cari = false;
                              do {
                                 for (int i = 0; i < mnm2; i++) {
                                    if (mnm[i].getKode().equalsIgnoreCase(kd)) {
                                       System.out.println("    Kode sudah ada, buat kode lain!");
                                       System.out.print("    Kode Makanan   = ");
                                       kd = sc.next();
                                       cari = false;
                                    }
                                 }
                                 cari = true;
                              } while (cari != true);

                              sc = new Scanner(System.in);
                              System.out.print("    Nama Minuman    = ");
                              String nm = sc.nextLine();
                              System.out.print("    Harga           = ");
                              int h = sc.nextInt();
                              mnm[mnm2] = new cMinuman(kd, nm, h, urutan_menu + 1);
                              mnm2++; urutan_menu++;
                              System.out.println("");
                              System.out.println("     | Menu " + nm + " dibuat.. |");
                              break;

                           }

                           if (jns == 3) {
                              System.out.print("    Kode Snack      = ");
                              String kd = sc.next();
                              boolean cari = false;
                              do {
                                 for (int i = 0; i < snc2; i++) {
                                    if (snc[i].getKode().equalsIgnoreCase(kd)) {
                                       System.out.println("    Kode sudah ada, buat kode lain!");
                                       System.out.print("    Kode Snack      = ");
                                       kd = sc.next();
                                       cari = false;
                                    }
                                 }
                                 cari = true;
                              } while (cari != true);

                              sc = new Scanner(System.in);
                              System.out.print("    Nama Snack      = ");
                              String nm = sc.nextLine();
                              System.out.print("    Harga           = ");
                              int h = sc.nextInt();
                              snc[snc2] = new cSnack(kd, nm, h, urutan_menu + 1);
                              snc2++; urutan_menu++;
                              System.out.println("");
                              System.out.println("     | Menu " + nm + " dibuat.. |");
                              break;

                           }

                           if (jns != 1 || jns != 2 || jns != 3) {
                              System.out.println("    ! Jenis salah !");
                           }
                        }

                        // UPDATE DATA MENU
                        case 2 -> {
                           System.out.println("");
                           System.out.println("    ============ Update Menu ============");
                           System.out.println("    1. Makanan || 2. Minuman || 3. Snack");
                           System.out.print("    Jenis        = ");
                           int jns = sc.nextInt();

                           //MAKANAN
                           if (jns == 1) {
                              System.out.print("    Kode Makanan = ");
                              String kd = sc.next();
                              boolean carimkn = false;

                              for (int i = 0; i < mkn2; i++) {
                                 if (mkn[i].getKode().equalsIgnoreCase(kd)) {
                                    carimkn = true;
                                    System.out.println("    [" + mkn[i].getKode() + "] " + mkn[i].getNama() + "  Rp." + mkn[i].getHarga());
                                    System.out.println("    ------------[  Update  ]-------------");
                                    System.out.print("    Kode Baru  = ");
                                    kd = sc.next();
                                    sc = new Scanner(System.in);
                                    System.out.print("    Nama Baru  = ");
                                    String nm = sc.nextLine();
                                    System.out.print("    Harga Baru = ");
                                    int hg = sc.nextInt();
                                    int u = mkn[i].getUrutan();
                                    System.out.print("      !! Apakah yakin diupdate? [1.Ya / 2.Batal] = ");
                                    int ubah = sc.nextInt();

                                    if (ubah == 1) {
                                       mkn[i].setKode(kd); mkn[i].setNama(nm); mkn[i].setHarga(hg); mkn[i].setUrutan(u);
                                       System.out.println("      | Berhasil diupdate.. |");
                                       break;
                                    } else {
                                       System.out.println("      | Batal diupdate.. |");
                                    }
                                 }
                              }
                              if (carimkn == false) {
                                 System.out.println("    ! Menu tidak ada !");
                              }
                              break;
                           }

                           // MINUMAN
                           if (jns == 2) {
                              System.out.print("    Kode Minuman = ");
                              String kd = sc.next();
                              boolean carimnm = false;
                              for (int i = 0; i < mnm2; i++) {
                                 if (mnm[i].getKode().equalsIgnoreCase(kd)) {
                                    carimnm = true;
                                    System.out.println("    [" + mnm[i].getKode() + "] " + mnm[i].getNama() + "  Rp." + mnm[i].getHarga());
                                    System.out.println("    ------------[  Update  ]-------------");
                                    System.out.print("    Kode Baru  = ");
                                    kd = sc.next();
                                    sc = new Scanner(System.in);
                                    System.out.print("    Nama Baru  = ");
                                    String nm = sc.nextLine();
                                    System.out.print("    Harga Baru = ");
                                    int hg = sc.nextInt();
                                    int u = mnm[i].getUrutan();
                                    System.out.print("      !! Apakah yakin diupdate? [1.Ya / 2.Batal] = ");
                                    int ubah = sc.nextInt();

                                    if (ubah == 1) {
                                       mnm[i].setKode(kd); mnm[i].setNama(nm); mnm[i].setHarga(hg); mnm[i].setUrutan(u);
                                       System.out.println("      | Berhasil diupdate.. |");
                                       break;
                                    } else {
                                       System.out.println("      | Batal diupdate.. |");
                                    }
                                 }
                              }
                              if (carimnm == false) {
                                 System.out.println("    ! Menu tidak ada !");
                              }
                              break;
                           }
                           // SNACK
                           if (jns == 3) {
                              System.out.print("    Kode Snack   = ");
                              String kd = sc.next();
                              boolean carisnc = false;
                              for (int i = 0; i < mnm2; i++) {
                                 if (snc[i].getKode().equalsIgnoreCase(kd)) {
                                    carisnc = true;
                                    System.out.println("    [" + snc[i].getKode() + "] " + snc[i].getNama() + "  Rp." + snc[i].getHarga());
                                    System.out.println("    ------------[  Update  ]-------------");
                                    System.out.print("    Kode Baru  = ");
                                    kd = sc.next();
                                    sc = new Scanner(System.in);
                                    System.out.print("    Nama Baru  = ");
                                    String nm = sc.nextLine();
                                    System.out.print("    Harga Baru = ");
                                    int hg = sc.nextInt();
                                    int u = snc[i].getUrutan();
                                    System.out.print("      !! Apakah yakin diupdate? [1.Ya / 2.Batal] = ");
                                    int ubah = sc.nextInt();

                                    if (ubah == 1) {
                                       snc[i].setKode(kd); snc[i].setNama(nm); snc[i].setHarga(hg); snc[i].setUrutan(u);
                                       System.out.println("      | Berhasil diupdate.. |");
                                       break;
                                    } else {
                                       System.out.println("      | Batal diupdate.. |");
                                    }
                                 }
                              }
                              if (carisnc == false) {
                                 System.out.println("    ! Menu tidak ada !");
                              }
                              break;
                           } else {
                              System.out.println("    ! Jenis salah !");
                           }
                        }

                        // DELETE DATA MENU
                        case 3 -> {
                           System.out.println("");
                           System.out.println("    ============ Delete Menu ============");
                           System.out.println("    1. Makanan || 2. Minuman || 3. Snack");
                           System.out.print("    Jenis        = ");
                           int jns = sc.nextInt();

                           // MAKANAN
                           if (jns == 1) {
                              boolean carimkn = false;
                              System.out.print("    Kode Makanan = ");
                              String kd = sc.next();
                              for (int i = 0; i < mkn2; i++) {
                                 if (mkn[i].getKode().equalsIgnoreCase(kd)) {
                                    carimkn = true;
                                    System.out.println("    [" + mkn[i].getKode() + "] " + mkn[i].getNama() + "  Rp." + mkn[i].getHarga());
                                    System.out.print("      !! Yakin dihapus? [1.Ya / 2.Batal} = ");
                                    int hps = sc.nextInt();
                                    if (hps == 1) {
                                       int x = mkn[i].getUrutan();
                                       for (int j = i; j < mkn2; j++) {
                                          cMakanan temp;
                                          temp = mkn[j]; mkn[j] = mkn[j + 1]; mkn[j + 1] = temp;
                                       }
                                       mkn[mkn2] = null;
                                       mkn2--;
                                       for (int j = i; j < mkn2; j++) {
                                          mkn[j].setUrutan(x); x++;
                                       }
                                       for (int j = 0; j < mnm2; j++) {
                                          mnm[j].setUrutan(x); x++;
                                       }
                                       for (int j = 0; j < snc2; j++) {
                                          snc[j].setUrutan(x); x++;
                                       }
                                       geserData(data, i, urutan_menu);
                                       System.out.println("    | Penghapusan sukses.. |");
                                       urutan_menu--;
                                    }
                                    if (hps != 1) {
                                       System.out.println("    | Batal dihapus.. |");
                                    }
                                    break;
                                 }
                              }
                              if (carimkn == false) {
                                 System.out.println("    ! Menu tidak ada !");
                              }
                           }

                           //MINUMAN
                           if (jns == 2) {
                              boolean carimnm = false;
                              System.out.print("    Kode Minuman = ");
                              String kd = sc.next();
                              for (int i = 0; i < mnm2; i++) {
                                 if (mnm[i].getKode().equalsIgnoreCase(kd)) {
                                    carimnm = true;
                                    System.out.println("    [" + mnm[i].getKode() + "] " + mnm[i].getNama() + "  Rp." + mnm[i].getHarga());
                                    System.out.print("      !! Yakin dihapus? [1.Ya / 2.Batal] = ");
                                    int hps = sc.nextInt();
                                    if (hps == 1) {
                                       int x = mnm[i].getUrutan();
                                       for (int j = i; j < mnm2; j++) {
                                          cMinuman temp;
                                          temp = mnm[j]; mnm[j] = mnm[j + 1]; mnm[j + 1] = temp;
                                       }
                                       mnm[mnm2] = null;
                                       mnm2--;
                                       for (int j = i; j < mnm2; j++) {
                                          mnm[j].setUrutan(x); x++;
                                       }
                                       for (int j = 0; j < snc2; j++) {
                                          snc[j].setUrutan(x); x++;
                                       }
                                       geserData(data, i, urutan_menu);
                                       System.out.println("    | Penghapusan sukses.. |");
                                       urutan_menu--;
                                    }
                                    if (hps != 1) {
                                       System.out.println("    | Batal dihapus.. |");
                                    }
                                    break;
                                 }
                              }
                              if (carimnm == false) {
                                 System.out.println("    ! Menu tidak ada !");
                              }
                           }

                           //SNACK
                           if (jns == 3) {
                              boolean carisnc = false;
                              System.out.print("    Kode Snack   = ");
                              String kd = sc.next();
                              for (int i = 0; i < snc2; i++) {
                                 if (snc[i].getKode().equalsIgnoreCase(kd)) {
                                    carisnc = true;
                                    System.out.println("    [" + snc[i].getKode() + "] " + snc[i].getNama() + "  Rp." + snc[i].getHarga());
                                    System.out.print("      !! Yakin dihapus? [1.Ya / 2.Batal] = ");
                                    int hps = sc.nextInt();
                                    if (hps == 1) {
                                       int x = snc[i].getUrutan();
                                       for (int j = i; j < snc2; j++) {
                                          cSnack temp;
                                          temp = snc[j]; snc[j] = snc[j + 1]; snc[j + 1] = temp;
                                       }
                                       snc[snc2] = null;
                                       snc2--;
                                       for (int j = i; j < snc2; j++) {
                                          snc[j].setUrutan(x); x++;
                                       }
                                       geserData(data, i, urutan_menu);
                                       System.out.println("    | Penghapusan sukses.. |");
                                       urutan_menu--;
                                    }
                                    if (hps != 1) {
                                       System.out.println("    | Batal dihapus.. |");
                                    }
                                    break;
                                 }
                              }
                              if (carisnc == false) {
                                 System.out.println("    ! Menu tidak ada !");
                              }
                           } else {
                              System.out.println("    ! Jenis salah !");
                           }
                        }

                        //LIHAT DAFTAR MENU
                        case 4 -> {
                           System.out.println("");
                           System.out.println("    ==================== Daftar Menu ====================");
                           System.out.println("                       [   Makanan   ] ");
                           if (mkn != null) {
                              System.out.println("       Kode    Nama\t\t   Harga\tUrutan");
                              for (int i = 0; i < mkn2; i++) {
                                 System.out.print("    " + (i + 1) + ". ");
                                 mkn[i].info();
                              }
                           } else {
                              System.out.println("    Menu makanan kosong...");
                           }
                           System.out.println("    -----------------------------------------------------");
                           System.out.println("                       [   Minuman   ] ");
                           if (mnm != null) {
                              System.out.println("       Kode    Nama\t\t   Harga\tUrutan");
                              for (int i = 0; i < mnm2; i++) {
                                 System.out.print("    " + (i + 1) + ". ");
                                 mnm[i].info();
                              }
                           } else {
                              System.out.println("    Menu minuman kosong...");
                           }
                           System.out.println("    -----------------------------------------------------");
                           System.out.println("                       [    Snack    ] ");
                           if (snc != null) {
                              System.out.println("       Kode    Nama\t\t   Harga\tUrutan");
                              for (int i = 0; i < snc2; i++) {
                                 System.out.print("    " + (i + 1) + ". ");
                                 snc[i].info();
                              }
                           } else {
                              System.out.println("    Menu snack kosong...");
                           }
                           System.out.println("    =====================================================");
                        }

                        //KELUAR
                        case 5 ->
                           System.out.println("  ---------------------");
                     }
                  } while (pilih1 != 5);
               }

               //SUBMENU PEMBELI
               case 2 -> {
                  int pilih2 = 0;
                  do {
                     System.out.println(" ");
                     System.out.println("  ---------------------");
                     System.out.println("       MENU PEMBELI    ");
                     System.out.println("  ---------------------");
                     System.out.println("  1. Tambah");
                     System.out.println("  2. Ubah");
                     System.out.println("  3. Hapus");
                     System.out.println("  4. Lihat");
                     System.out.println("  5. Kembali");
                     System.out.print("  Pilih = ");
                     pilih2 = sc.nextInt();
                     switch (pilih2) {

                        // TAMBAH PEMBELI
                        case 1 -> {
                           System.out.println("");
                           System.out.println("    =========== Tambah Data Pembeli ============");
                           boolean ketemu;
                           do {
                              ketemu = false;
                              System.out.print("    ID     = ");
                              String id = sc.next();
                              for (int i = 0; i < pb2; i++) {
                                 if (pb[i].getId().equalsIgnoreCase(id)) {
                                    System.out.println("     Id sudah ada, buat id lain!");
                                    ketemu = true;
                                    break;
                                 }
                              }
                              if (ketemu == false) {
                                 sc = new Scanner(System.in);
                                 System.out.print("    Nama   = ");
                                 String nm = sc.nextLine();
                                 sc = new Scanner(System.in);
                                 System.out.print("    Alamat = ");
                                 String al = sc.nextLine();
                                 System.out.print("    Status [1.Member / 2.Non member] = ");
                                 int sts = sc.nextInt();
                                 int total = 0;
                                 pb[pb2] = new cPembeli(id, nm, al, sts, total);
                                 System.out.println("    | Pembeli " + nm + " dibuat.. |");
                                 pb2++;
                                 break;
                              }
                           } while (ketemu != false);
                        }

                        //UPDATE DATA PEMBELI
                        case 2 -> {
                           System.out.println("    =========== Update Data pembeli ============");
                           System.out.print("    Id pembeli = ");
                           String id = sc.next();
                           boolean caripb = false;

                           for (int i = 0; i < pb2; i++) {
                              if (pb[i].getId().equalsIgnoreCase(id)) {
                                 caripb = true;
                                 System.out.print("    " + pb[i].ToString() + "\n");
                                 System.out.println("    ------------[  Update  ]-------------");
                                 System.out.print("    Id baru     = ");
                                 id = sc.next();
                                 sc = new Scanner(System.in);
                                 System.out.print("    Nama baru   = ");
                                 String nm = sc.nextLine();
                                 sc = new Scanner(System.in);
                                 System.out.print("    Alamat baru = ");
                                 String al = sc.nextLine();
                                 System.out.print("    Status baru [1.Member / 2.Non member] = ");
                                 int sts = sc.nextInt();

                                 System.out.print("      Yakin update? [1.Ya / 2.Tidak] = ");
                                 int upd = sc.nextInt();
                                 if (upd == 1) {
                                    pb[i].setId(id); pb[i].setNama(nm); pb[i].setAlamat(al); pb[i].setStatus(sts);
                                    System.out.println("      | Berhasil diupdate.. |");
                                    break;
                                 }
                                 if (upd != 1) {
                                    System.out.println("      | Batal diupdate.. |");
                                 }
                                 break;
                              }
                           }
                           if (caripb == false) {
                              System.out.println("    ! Data pembeli tidak ada !");
                           }
                        }

                        // DELETE DATA PEMBELI
                        case 3 -> {
                           System.out.println("    =========== Delete Data pembeli ============");
                           System.out.print("    Id pembeli = ");
                           String id = sc.next();
                           boolean caripb = false;

                           for (int i = 0; i < pb2; i++) {
                              if (pb[i].getId().equalsIgnoreCase(id)) {
                                 caripb = true;
                                 System.out.print("    " + pb[i].ToString() + "[Total Belanja : Rp. " + pb[i].getTotal() + "]\n");
                                 pb[i].ToString();
                                 System.out.print("      Yakin hapus? [1.Ya / 2.Tidak] = ");
                                 int hps = sc.nextInt();
                                 if (hps == 1) {
                                    pb[i] = null;
                                    for (int j = i; j < pb2; j++) {
                                       cPembeli temp;
                                       temp = pb[j]; pb[j] = pb[j + 1]; pb[j + 1] = temp;
                                    }
                                    pb2--;
                                    System.out.println("      | Berhasil dihapus.. |");
                                    break;
                                 }
                                 if (hps != 1) {
                                    System.out.println("      | Batal dihapus.. |");
                                 }
                                 break;
                              }
                           }

                           if (caripb == false) {
                              System.out.println("    ! Data pembeli tidak ada !");
                           }
                        }

                        //LIHAT DAFTAR PEMBELI
                        case 4 -> {
                           System.out.println("    =========== Lihat Data pembeli ============");
                           System.out.println("    Data Pembeli : ");
                           if (pb2 != 0) {
                              for (int i = 0; i < pb2; i++) {
                                 System.out.println("    " + (i + 1) + ". " + pb[i].ToString());
                                 System.out.println("             Total Belanja : Rp. " + pb[i].getTotal());
                              }
                           } else {
                              System.out.println("    ! Data pembeli kosong !");
                           }
                           System.out.println("    ===========================================");
                           break;
                        }

                        //KELUAR
                        case 5 -> {
                           System.out.println("  ---------------------");
                           break;
                        }
                     }
                  } while (pilih2 != 5);
               }

               // SUBMENU KASIR
               case 3 -> {
                  int pilih3 = 0;
                  do {
                     System.out.println(" ");
                     System.out.println("  ---------------------");
                     System.out.println("        MENU KASIR     ");
                     System.out.println("  ---------------------");
                     System.out.println("  1. Tambah");
                     System.out.println("  2. Ubah");
                     System.out.println("  3. Hapus");
                     System.out.println("  4. Lihat");
                     System.out.println("  5. Kembali");
                     System.out.print("  Pilih = ");
                     pilih3 = sc.nextInt();
                     switch (pilih3) {

                        //TAMBAH DATA KASIR
                        case 1 -> {
                           System.out.println("");
                           System.out.println("    ============ Tambah Data Kasir =============");
                           boolean ketemu;
                           do {
                              ketemu = false;
                              System.out.print("    ID     = ");
                              String id = sc.next();
                              for (int i = 0; i < ksr2; i++) {
                                 if (ksr[i].getId().equalsIgnoreCase(id)) {
                                    System.out.println("     Id sudah ada, buat id lain!");
                                    ketemu = true;
                                    break;
                                 }
                              }
                              if (ketemu == false) {
                                 sc = new Scanner(System.in);
                                 System.out.print("    Nama   = ");
                                 String nm = sc.nextLine();
                                 ksr[ksr2] = new cKasir(id, nm);
                                 System.out.println("      | Kasir " + nm + " dibuat.. |");
                                 ksr2++;
                                 break;
                              }
                           } while (ketemu != false);
                        }

                        // UPDATE DATA KASIR
                        case 2 -> {
                           //update data kasir
                           System.out.println("    ============ Update Data Kasir =============");
                           System.out.print("    Id Kasir = ");
                           String id = sc.next();
                           boolean cariksr = false;

                           for (int i = 0; i < ksr2; i++) {
                              if (ksr[i].getId().equalsIgnoreCase(id)) {
                                 cariksr = true;
                                 System.out.print("    " + ksr[i].ToString()+"\n");
                                 System.out.println("    ------------[  Update  ]-------------");
                                 System.out.print("    Id baru     = ");
                                 id = sc.next();
                                 sc = new Scanner(System.in);
                                 System.out.print("    Nama baru   = ");
                                 String nm = sc.nextLine();
                                 System.out.print("      Yakin update? [1.Ya / 2.Tidak] = ");
                                 int upd = sc.nextInt();
                                 if (upd == 1) {
                                    ksr[i].setId(id);
                                    ksr[i].setNama(nm);
                                    System.out.println("      | Berhasil diupdate.. |");
                                    break;
                                 }
                                 if (upd != 1) {
                                    System.out.println("      | Batal diupdate.. |");
                                 }
                                 break;
                              }
                           }

                           if (cariksr == false) {
                              System.out.println("    ! Data kasir tidak ada !");
                           }
                        }

                        // DELETE DATA KASIR
                        case 3 -> {
                           System.out.println("    ============ Delete Data Kasir =============");
                           System.out.print("    Id Kasir = ");
                           String id = sc.next();
                           boolean cariksr = false;

                           for (int i = 0; i < ksr2; i++) {
                              if (ksr[i].getId().equalsIgnoreCase(id)) {
                                 cariksr = true;
                                 System.out.print("    " + ksr[i].ToString() + "\n");
                                 ksr[i].ToString();
                                 System.out.print("      !! Yakin hapus? [1.Ya / 2.Tidak] = ");
                                 int hps = sc.nextInt();
                                 if (hps == 1) {
                                    ksr[i] = null;
                                    for (int j = i; j < ksr2; j++) {
                                       cKasir temp;
                                       temp = ksr[j]; ksr[j] = ksr[j + 1]; ksr[j + 1] = temp;
                                    }
                                    ksr2--;
                                    System.out.println("      | Berhasil dihapus.. |");
                                    break;
                                 }
                                 if (hps != 1) {
                                    System.out.println("      | Batal dihapus.. |");
                                 }
                                 break;
                              }
                           }
                           if (cariksr == false) {
                              System.out.println("    ! Data kasir tidak ada !");
                           }
                        }

                        // LIHAT DAFTAR KASIR
                        case 4 -> {
                           System.out.println("    ============ Lihat Data Kasir =============");
                           System.out.println("    Data Kasir : ");
                           if (ksr2 != 0) {
                              for (int i = 0; i < ksr2; i++) {
                                 System.out.print("    " + (i + 1) + ". " + ksr[i].ToString() + "\n");
                              }
                           } else {
                              System.out.println("    ! Data kasir kosong !");
                           }
                           System.out.println("    ===========================================");
                           break;
                        }

                        // KELUAR
                        case 5 -> {
                           System.out.println("  ---------------------");
                           break;
                        }
                     }
                  } while (pilih3 != 5);
               }

               // MENU TRANSAKSI
               case 4 -> {
                  int ksr3 = 0, pilih4 = 0, choose = 0, jenispb, idb = 0, idpb = 0, a = 0, b = 0;
                  do {
                     System.out.println(" ");
                     System.out.println("  ---------------------");
                     System.out.println("  LOGIN KASIR TRANSAKSI  ");
                     System.out.println("  ---------------------");

                     // Input kasir sebelum masuk ke transaksi
                     System.out.print("  Id Kasir = ");
                     String id = sc.next();
                     boolean cariksr = false;
                     for (int i = 0; i < ksr2; i++) {
                        if (ksr[i].getId().equalsIgnoreCase(id)) {
                           System.out.println("  Kasir : [" + ksr[i].getId() + "] - " + ksr[i].getNama());
                           cariksr = true;
                           ksr3 = i;
                           break;
                        }
                     }

                     if (cariksr == true) {

                        do {
                           System.out.println(" ");
                           System.out.println("  ---------------------");
                           System.out.println("    TRANSAKSI PESANAN  ");
                           System.out.println("  ---------------------");
                           System.out.println("  1.Tambah Pesanan");
                           System.out.println("  2.Update Pesanan");
                           System.out.println("  3.Delete Pesanan");
                           System.out.println("  4.Lihat Pesanan");
                           System.out.println("  5.Kembali");
                           System.out.print("  Pilih = ");
                           int pilihh = sc.nextInt();

                           switch (pilihh) {

                              //Tambah Pesanan
                              case 1 -> {
                                 beli = new cTransaksi();
                                 beli.tambahKasir(ksr[ksr3]);
                                 System.out.println("");
                                 System.out.println("    =============== Tambah Pesanan ===============");
                                 jenispb = 0;
                                 //reset total sebelumnya
                                 for (int i = 0; i <= urutan_menu; i++) {
                                    data[idb][3] = 0;
                                    data[idb][4] = 0;
                                 }
                                 System.out.print("    Id Pembeli = ");
                                 String idp = sc.next();
                                 boolean caripb = false;
                                 for (int i = 0; i < pb2; i++) {
                                    if (pb[i].getId().equalsIgnoreCase(idp)) {
                                       caripb = true;
                                       idpb = i;
                                       beli.tambahPembeli(pb[i]);
                                       jenispb = pb[i].getStatus();
                                       break;
                                    }
                                 }

                                 if (caripb == true) {
                                    int tambah;
                                    do {
                                       boolean ada = false;
                                       sc = new Scanner(System.in);
                                       System.out.print("    >> Nama menu = ");
                                       String n = sc.nextLine();

                                       //cari makanan
                                       for (int i = 0; i < mkn2; i++) {
                                          if (n.equalsIgnoreCase(mkn[i].getNama())) {
                                             ada = true;
                                             System.out.print("    Jumlah = ");
                                             int qty = sc.nextInt();
                                             beli.tambahMakanan(mkn[i], qty);
                                             idb = mkn[i].getUrutan();
                                             a = qty;
                                             b = (qty * mkn[i].getHarga());
                                             jmlm++;
                                             break;
                                          }
                                       }
                                       //cari minuman
                                       for (int i = 0; i < mnm2; i++) {
                                          if (n.equalsIgnoreCase(mnm[i].getNama())) {
                                             ada = true;
                                             System.out.print("    Jumlah = ");
                                             int qty = sc.nextInt();
                                             beli.tambahMinuman(mnm[i], qty);
                                             idb = mnm[i].getUrutan();
                                             a = qty;
                                             b = (qty * mnm[i].getHarga());
                                             jmlm++;
                                             break;
                                          }
                                       }
                                       //cari snack
                                       for (int i = 0; i < snc2; i++) {
                                          if (n.equalsIgnoreCase(snc[i].getNama())) {
                                             ada = true;
                                             System.out.print("    Jumlah = ");
                                             int qty = sc.nextInt();
                                             beli.tambahSnack(snc[i], qty);
                                             idb = snc[i].getUrutan();
                                             a = qty;
                                             b = (qty * snc[i].getHarga());
                                             jmlm++;
                                             break;
                                          }
                                       }

                                       if (ada == false) {
                                          System.out.println("    ! Menu tidak ada !");
                                       }

                                       if (jenispb == 1) {
                                          //diskon member
                                          data[idb][3] = a;
                                          b = (int) (b * 0.9);
                                          data[idb][4] = b;
                                       } else {
                                          data[idb][3] = a;
                                          data[idb][4] = b;
                                       }

                                       System.out.print("\t\t\t\t  Total sementara: \n\t\t\t\t  Rp. " + beli.lihatHarga() + "\n");
                                       System.out.print("    Tambah? [1.Ya / 2.Tidak] = ");
                                       tambah = sc.nextInt();
                                    } while (tambah != 2);

                                    if (caripb == true) {
                                       System.out.println("");
                                       System.out.println("    --------------- [ Konfirmasi ] ---------------");
                                       System.out.println("    1. Simpan & Keluar  ||  2. Hapus & Batal Pesan");
                                       System.out.print("      >> Pilih = ");
                                       int plh = sc.nextInt();
                                       System.out.println("");

                                       if (plh == 1) {
                                          pesanan = 0;
                                       }

                                       if (plh == 2) {
                                          System.out.print("    !! Yakin batalkan? -> [1.Ya / 2.Simpan Sementara] = ");
                                          int smpn = sc.nextInt();
                                          if (smpn == 1) {
                                             beli.hapusPesanan();
                                             for (int i = 0; i <= urutan_menu; i++) {
                                                data[idb][3] = 0;
                                                data[idb][4] = 0;
                                             }
                                             System.out.println("    | Sukses hapus.. |\n");
                                          }
                                       }

                                       System.out.println("    ==============================================");
                                    }
                                 }
                                 if (caripb == false) {
                                    System.out.println("    Data pembeli tidak ada!");
                                 }
                              }

                              //Update Pesanan (Hapus salah satu menu)
                              case 2 -> {
                                 int jwb4;
                                 boolean ada2 = false;
                                 if (pesanan == 0) {
                                    System.out.println("    =============== Update Pesanan ===============");
                                    idb = 0;
                                    sc = new Scanner(System.in);
                                    System.out.print("    Menu Dihapus = ");
                                    String h = sc.nextLine();
                                    for (int i = 0; i < mkn2; i++) {
                                       if (h.equalsIgnoreCase(mkn[i].getNama())) {
                                          idb = mkn[i].getUrutan();
                                          ada2 = true;
                                          break;
                                       }
                                    }
                                    for (int i = 0; i < mnm2; i++) {
                                       if (h.equalsIgnoreCase(mnm[i].getNama())) {
                                          idb = mnm[i].getUrutan();
                                          ada2 = true;
                                          break;
                                       }
                                    }
                                    for (int i = 0; i < snc2; i++) {
                                       if (h.equalsIgnoreCase(snc[i].getNama())) {
                                          idb = snc[i].getUrutan();
                                          ada2 = true;
                                          break;
                                       }
                                    }

                                    if (ada2 == true) {
                                       System.out.println("    Apakah yakin dihapus? (1.Ya , 2.Tidak)");
                                       System.out.print("    Jawab = ");
                                       jwb4 = sc.nextInt();
                                       if (jwb4 == 1) {
                                          beli.hapusMenu(h);
                                          jmlm = jmlm - 1;
                                          beli.lihatHarga();
                                       } else {
                                          System.out.println("    Batal dihapus...");
                                       }
                                    } else {
                                       System.out.println("    ! Menu tidak ada !");
                                    }
                                 }
                                 else {
                                    System.out.println("    Data Pesanan Kosong..\n");
                                 }
                              }

                              //Hapus seluruh pesanan (dalam keranjang)
                              case 3 -> {
                                 if (pesanan == 0) {
                                    System.out.print("    ! Yakin Hapus? -> [1.Ya / 2.Tetap Simpan Sementara] : ");
                                    int smpn = sc.nextInt();
                                    if (smpn == 1) {
                                       simpan = 0;
                                       pesanan = 1;
                                       beli.hapusPesanan();
                                       for (int i = 0; i <= urutan_menu; i++) {
                                          data[idb][3] = 0; data[idb][4] = 0;
                                       }
                                       System.out.println("    Sukses hapus..\n");
                                    }
                                    if (smpn != 1) {
                                       System.out.println("    Batal hapus..\n");
                                       pesanan = 0;
                                    }
                                 } else {
                                    System.out.println("    Data pesanan tidak ada!");
                                 }
                              }

                              // Lihat Data Pemesanan
                              case 4 -> {
                                 if (pesanan == 0) {
                                    System.out.println("      ===============================================");
                                    System.out.println("                       Data Pemesanan");
                                    System.out.println("      ===============================================");
                                    beli.lihatMakanan();
                                    System.out.println("      ______________________________________________+");
                                    System.out.print("        " + beli.getJumlah() + " item(s)");
                                    beli.lihatHarga();
                                    beli.lihatTotal();
                                    System.out.print("\n      Kasir \t : ");
                                    beli.lihatKasir();
                                    System.out.print("      Hari/Tgl \t : ");
                                    beli.waktu();
                                    System.out.println("      Transaksi  : " + beli.kodets(co));

                                    System.out.println("      ===============================================\n");

                                    System.out.print("      Checkout? [1.Ya | 2.Tidak] : ");
                                    int plh = sc.nextInt();

                                    if (plh == 1) {
                                       //memasukkan ke array 
                                       belii.tambahCO(beli, co);
                                       co++;
                                       //mengupdate data array data jumlah terjual dan total harga
                                       for (int i = 0; i <= urutan_menu; i++) {
                                          data[i][1] = data[i][1] + data[i][3];
                                          data[i][2] = data[i][2] + data[i][4];

                                          data[i][3] = 0; data[i][4] = 0;
                                       }
                                       pb[idpb].setTotal(beli.lihatTotal2());
                                       System.out.println("      | Checkout sukses.. |\n");
                                       pesanan = 1;
                                    }
                                 }
                                 else {
                                    System.out.println("      Data Pesanan Kosong..");
                                 }
                              }

                              // Keluar
                              case 5 -> {
                                 System.out.println("  ---------------------");
                                 //reset total sebelumnya
                                 for (int i = 0; i <= urutan_menu; i++) {
                                    data[idb][3] = 0; data[idb][4] = 0;
                                 }
                                 pilih4 = 1; choose = 1;
                              }
                           }
                        } while (pilih4 != 1);
                     }

                     if (cariksr == false) {
                        System.out.println("  Data Kasir tidak ada!");
                     }
                  } while (choose == 0);
               }

               // MENU LAPORAN
               case 5 -> {
                  int pilih5 = 0;
                  System.out.println(" ");
                  do {
                     System.out.println("");
                     System.out.println("  ---------------------");
                     System.out.println("    TRANSAKSI LAPORAN  ");
                     System.out.println("  ---------------------");
                     System.out.println("  1.Total Pemasukan ");
                     System.out.println("  2.Rekap data per Menu");
                     System.out.println("  3.Rekap Belanja Pembeli");
                     System.out.println("  4.Keluar");
                     System.out.print("  Pilih = ");
                     pilih5 = sc.nextInt();

                     switch (pilih5) {
                        //Submenu Total Pemasukan
                        case 1 -> {
                           System.out.println("");
                           belii.rekapTotalharga(urutan_menu, beli, data);
                        }

                        //Submenu rekap data per menu
                        case 2 -> {
                           System.out.println("");
                           sorting(data, 2);
                           belii.rekapMenu(data, mkn, mkn2, mnm, mnm2, snc, snc2);
                        }

                        //Submenu rekap transaksi pembeli
                        case 3 -> {
                           System.out.println("");
                           sorting2(pb);
                           belii.rekapPembeli(pb, pb2);
                        }

                        //Keluar
                        case 4 -> {
                           System.out.println("  ---------------------");
                           break;
                        }
                     }
                  } while (pilih5 != 4);
               }

               //Keluar program, namun sebelumnya akan menampilkan laporan harian secara otomatis
               case 6 -> {
                  System.out.println("\n\n    <<<<<<<     REKAP PENJUALAN HARIAN   >>>>>>>\n");
                  //total pendapatan
                  belii.rekapTotalharga(urutan_menu, beli, data);
                  //rekap per menu
                  sorting(data, 2);
                  belii.rekapMenu(data, mkn, mkn2, mnm, mnm2, snc, snc2);
                  //rekap per pembeli
                  sorting2(pb);
                  belii.rekapPembeli(pb, pb2);
                  System.out.println("   <<<<<<<<<<<<<<<<<<<<<   >>>>>>>>>>>>>>>>>>>>>");
               }
            }
         } while (pilih != 6);
         System.out.println(" ");
         System.out.println("===================================================");
         System.out.println("<<<<               TERIMA KASIH                >>>>");
         System.out.println("===================================================");
      } else {
         System.out.println("Login telah gagal 3 kali. Gagal masuk ke program.");
      }
   }

   //Untuk login program
   public static void login() {
      //Deklarasi Password
      String username = "KUQURUYUK";
      String password = "pw123456";

      int loop = 3;
      match = false;

      do {
         System.out.print("Username : ");
         String user = input.next();
         System.out.print("Password : ");
         String pswd = input.next();

         if (user.equals(username) && pswd.equals(password)) {
            match = true;
            break;
         } else {
            System.out.println("Username atau Password SALAH!");
            System.out.println("Kesempatan login tersisa : " + (loop - 1));
         }

         loop--;
      } while (loop > 0);
   }

   //mengurutkan data rekap penjualan per menu berdasarkan total terbanyak
   public static void sorting(int[][] arr, int n) {
      int m = arr.length;
      for (int i = 0; i < m - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < m; j++) {
            if (arr[j][n] > arr[minIndex][n]) {
               minIndex = j;
            }
         }
         int[] temp = arr[minIndex];
         arr[minIndex] = arr[i];
         arr[i] = temp;
      }
   }

   //mengurutkan data total belanja per pembeli berdasarkan total terbanyak
   public static void sorting2(cPembeli[] pb) {
      int n = pb2;

      for (int i = 0; i < n - 1; i++) {
         int minIndex = i;
         for (int j = i + 1; j < n; j++) {
            if (pb[j].getTotal() > pb[minIndex].getTotal()) {
               minIndex = j;
            }
         }
         cPembeli temp = pb[minIndex];
         pb[minIndex] = pb[i];
         pb[i] = temp;
      }
   }

   //menggeser data array data jika ada salah satu menu yang dihapus
   public static void geserData(int[][] data, int y, int z) {
      // x adalah variabel urutan_menu yang digeser
      // y adalah variabel menu yang dihapus

      for (int i = y; i <= z; i++) {
         data[i][1] = data[i + 1][1];
         data[i][2] = data[i + 1][2];
      }

      data[z - 1][1] = 0;
      data[z - 1][2] = 0;
   }

}
