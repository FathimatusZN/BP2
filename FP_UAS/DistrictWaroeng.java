package bp2_fp;

import java.util.Scanner;
/*class provider: Menu, kasir, pembeli, transaksi
narasi: Juni ingin memesan Soto di WaroengKu */
public class DistrictWaroeng {

   public static int mkn2 = 5;
   public static int mnm2 = 5;
   public static int pb2 = 0;
   public static int ksr2 = 2;
   public static int ksr3 = 0;
   public static int co = 0;
   public static int simpan = 0;
   
   public static void main(String[] args) {

      System.out.println("_________________________________");
      System.out.println("Program ini dibuat oleh:");
      System.out.println("1.Azzahra R.       [22082010155]");
      System.out.println("2.Fathimatus Z. N. [22082010156]");
      System.out.println("3.Ganes Dwi F.     [22082010157]");
      System.out.println("4.Navy Nurlyn A.   [22082010158]");
      System.out.println("_________________________________");

      Scanner sc = new Scanner(System.in);
      int pilih = 0, pilih1 = 0, jmlm = 0;
      cPembeli pb[] = new cPembeli[100];
      cTransaksi beli = new cTransaksi();
      cTransaksi belii[] = new cTransaksi[100];

      //Deklarasi daftar kasir
      cKasir ksr[] = new cKasir[10];
      ksr[0] = new cKasir("K001", "Lala");
      ksr[1] = new cKasir("K002", "Dodo");

      //Deklarasi daftar menu makanan
      cMakanan mkn[] = new cMakanan[100];
      mkn[0] = new cMakanan("MA001", "Soto", 15000, 0);
      mkn[1] = new cMakanan("MA002", "Rawon", 17000, 0);
      mkn[2] = new cMakanan("MA003", "Bakso", 10000, 0);
      mkn[3] = new cMakanan("MA004", "Ketoprak", 13000, 0);
      mkn[4] = new cMakanan("MA005", "Nasi", 5000, 0);

      //Deklarasi daftar menu minuman
      cMinuman mnm[] = new cMinuman[100];
      mnm[0] = new cMinuman("MI001", "Air", 3000, 0);
      mnm[1] = new cMinuman("MI002", "Teh", 3000, 0);
      mnm[2] = new cMinuman("MI003", "Jus", 10000, 0);
      mnm[3] = new cMinuman("MI004", "Kopi", 5000, 0);
      mnm[4] = new cMinuman("MI005", "Susu", 6000, 0);

      System.out.println(" ");
      System.out.println("=============================================");
      System.out.println("<<<<  Aplikasi Kuliner District Waroeng  >>>>");
      System.out.println("=============================================");

      do {
         System.out.println("");
         System.out.println("__________________________");
         System.out.println("Menu Program");
         System.out.println("1.Menu \n2.Pembeli \n3.Kasir \n4.Transaksi Pembelian");
         System.out.println("5.Exit ");
         System.out.print("Pilih = ");
         pilih = sc.nextInt();
         System.out.println("__________________________");
         switch (pilih) {
            case 1 -> {
               do {
                  System.out.println("");
                  System.out.println("  ---------------------");
                  System.out.println("  Submenu Menu Waroeng");
                  System.out.println("  1.Tambah Menu");
                  System.out.println("  2.Update Menu");
                  System.out.println("  3.Delete Menu");
                  System.out.println("  4.Lihat Menu");
                  System.out.println("  5.Kembali");
                  System.out.print("  Pilih = ");
                  pilih1 = sc.nextInt();
                  switch (pilih1) {
                     case 1 -> {
                        //input kode, nama, harga, jenis, stok Menu
//                        mn = new cMenu (" ", " ", 0, " ");
                        System.out.println("    =========== Tambah Daftar Menu ============");
                        System.out.println("    1. Makanan   ||   2. Minuman");
                        System.out.print("    Jenis = ");
                        int jns = sc.nextInt();

                        if (jns == 1) {
                           System.out.print("    Kode Makanan   = ");
                           String kd = sc.next();
                           boolean cari = false;
                           do {
                              for (int i = 0; i < mkn2; i++) {
                                 if (mkn[i].getKode().equalsIgnoreCase(kd)) {
                                    System.out.println("    Kode sudah ada, silahkan masukkan kode lain!");
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
                           int st = 0;
                           mkn[mkn2] = new cMakanan(kd, nm, h, st);
                           mkn2++;
                           System.out.println("");
                           System.out.println("     | Menu " + nm + " dibuat.. |");
                           break;

                        }

                        if (jns == 2) {
                           System.out.print("    Kode Minuman   = ");
                           String kd = sc.next();
                           sc = new Scanner(System.in);
                           System.out.print("    Nama Minuman   = ");
                           String nm = sc.nextLine();
                           System.out.print("    Harga          = ");
                           int h = sc.nextInt();
                           int st = 0;
                           mnm[mnm2] = new cMinuman(kd, nm, h, st);
                           mnm2++;
                           System.out.println("");
                           System.out.println("     | Menu " + nm + " dibuat.. |");
                           break;
                        }

                        if (jns != 1 || jns != 2) {
                           System.out.println("    ! Jenis salah !");
                        }
                     }

                     case 2 -> {
                        //update data menu
                        System.out.println("    ========= Menu Update Menu ==========");
                        System.out.println("    1. Makanan    ||    2. Minuman");
                        System.out.print("    Pilih jenis = ");
                        int jns = sc.nextInt();

                        if (jns == 1) {
                           System.out.print("    Cari Kode Makanan   = ");
                           String kd = sc.next();
                           boolean carimkn = false;
                           for (int i = 0; i < mkn2; i++) {
                              if (mkn[i].getKode().equalsIgnoreCase(kd)) {
                                 carimkn = true;
                                 System.out.println("    [" + mkn[i].getKode() + "] " + mkn[i].getNama() + "  Rp." + mkn[i].getHarga() + "  Terjual = " + mkn[i].getSold());
                                 System.out.println("    --Update--");
                                 System.out.print("    Kode Baru  = ");
                                 kd = sc.next();
                                 sc = new Scanner(System.in);
                                 System.out.print("    Nama Baru  = ");
                                 String nm = sc.nextLine();
                                 System.out.print("    Harga Baru = ");
                                 int hg = sc.nextInt();
                                 System.out.print("    Terjual    = ");
                                 int st = sc.nextInt();
                                 System.out.println("      !! Apakah yakin diupdate?");
                                 System.out.println("      1. Ya    ||   2. Batal");
                                 System.out.print("      Pilih = ");
                                 int ubah = sc.nextInt();

                                 if (ubah == 1) {
                                    mkn[i] = new cMakanan(kd, nm, hg, st);
                                    System.out.println("      [Berhasil diupdate..]");
                                    break;
                                 } else {
                                    System.out.println("      [Batal diupdate..");
                                 }
                              }
                           }
                           if (carimkn == false) {
                              System.out.println("    Menu tidak ada!");
                           }
                           break;
                        }

                        if (jns == 2) {
                           System.out.print("    Cari Kode Minuman   = ");
                           String kd = sc.next();
                           boolean carimnm = false;
                           for (int i = 0; i < mnm2; i++) {
                              if (mnm[i].getKode().equalsIgnoreCase(kd)) {
                                 carimnm = true;
                                 System.out.println("    [" + mnm[i].getKode() + "] " + mnm[i].getNama() + "  Rp." + mnm[i].getHarga() + "  Terjual = " + mnm[i].getSold());
                                 System.out.println("    --Update--");
                                 System.out.print("    Kode Baru  = ");
                                 kd = sc.next();
                                 sc = new Scanner(System.in);
                                 System.out.print("    Nama Baru  = ");
                                 String nm = sc.nextLine();
                                 System.out.print("    Harga Baru = ");
                                 int hg = sc.nextInt();
                                 System.out.print("    Terjual    = ");
                                 int st = sc.nextInt();
                                 System.out.println("      !! Apakah yakin diupdate?");
                                 System.out.println("      1. Ya    ||   2. Batal");
                                 System.out.print("      Pilih = ");
                                 int ubah = sc.nextInt();

                                 if (ubah == 1) {
                                    mnm[i] = new cMinuman(kd, nm, hg, st);
                                    System.out.println("      [Berhasil diupdate..]");
                                    break;
                                 } else {
                                    System.out.println("      [Batal diupdate..");
                                 }
                              }
                           }
                           if (carimnm == false) {
                              System.out.println("    Menu tidak ada!");
                           }
                           break;
                        } else {
                           System.out.println("    Jenis salah!");
                        }
                     }

                     case 3 -> {
                        System.out.println("    ========= Menu Delete Menu ==========");
                        System.out.println("    1. Makanan    ||    2. Minuman");
                        System.out.print("    Pilih jenis = ");
                        int jns = sc.nextInt();

                        if (jns == 1) {
                           boolean carimkn = false;
                           System.out.print("    Kode Makanan = ");
                           String kd = sc.next();
                           for (int i = 0; i < mkn2; i++) {
                              if (mkn[i].getKode().equalsIgnoreCase(kd)) {
                                 carimkn = true;
                                 System.out.println("    [" + mkn[i].getKode() + "] " + mkn[i].getNama() + "  Rp." + mkn[i].getHarga() + "  Terjual = " + mkn[i].getSold());
                                 System.out.println("      !! Yakin dihapus?");
                                 System.out.println("      1. Ya   ||   2. Batal");
                                 System.out.print("      Hapus = ");
                                 int hps = sc.nextInt();
                                 if (hps == 1) {
                                    mkn[i] = null;
                                    for (int j = i; j < mkn2; j++) {
                                       cMakanan temp;
                                       temp = mkn[j];
                                       mkn[j] = mkn[j + 1];
                                       mkn[j + 1] = temp;
                                    }

                                    System.out.println("    Penghapusan sukses!");
                                    mkn2--;
                                 }

                                 if (hps != 1) {
                                    System.out.println("    Batal dihapus..");
                                 }
                                 break;
                              }
                           }

                           if (carimkn == false) {
                              System.out.println("    Menu makanan tidak ada!");
                           }
                        }

                        if (jns == 2) {
                           boolean carimnm = false;
                           System.out.print("    Kode Minuman = ");
                           String kd = sc.next();
                           for (int i = 0; i < mnm2; i++) {
                              if (mnm[i].getKode().equalsIgnoreCase(kd)) {
                                 carimnm = true;
                                 System.out.println("    [" + mnm[i].getKode() + "] " + mnm[i].getNama() + "  Rp." + mnm[i].getHarga() + "  Terjual = " + mnm[i].getSold());
                                 System.out.println("      !! Yakin dihapus?");
                                 System.out.println("      1. Ya   ||   2. Batal");
                                 System.out.print("      Hapus = ");
                                 int hps = sc.nextInt();
                                 if (hps == 1) {
                                    mnm[i] = null;
                                    for (int j = i; j < mnm2; j++) {
                                       cMinuman temp;
                                       temp = mnm[j];
                                       mnm[j] = mnm[j + 1];
                                       mnm[j + 1] = temp;
                                    }

                                    System.out.println("    Penghapusan sukses!");
                                    mkn2--;
                                 }

                                 if (hps != 1) {
                                    System.out.println("    Batal dihapus..");
                                 }
                                 break;
                              }
                           }

                           if (carimnm == false) {
                              System.out.println("    Menu minuman tidak ada!");
                           }
                        }

                     }
                     case 4 -> {
                        System.out.println("    ==================== Daftar Menu ====================");
                        System.out.println("    Makanan : ");
                        if (mkn != null) {
                           System.out.println("       Kode    Nama\t\t   Harga\tTerjual");
                           for (int i = 0; i < mkn2; i++) {
                              System.out.print("    " + (i + 1) + ". ");
                              mkn[i].info();
                           }
                        } else {
                           System.out.println("    Menu makanan kosong...");
                        }
                        System.out.println("    -----------------------------------------------------");
                        System.out.println("    Minuman : ");
                        if (mnm != null) {
                           System.out.println("       Kode    Nama\t\t   Harga\tTerjual");
                           for (int i = 0; i < mnm2; i++) {
                              System.out.print("    " + (i + 1) + ". ");
                              mnm[i].info();
                           }
                        } else {
                           System.out.println("    Menu minuman kosong...");
                        }
                        System.out.println("    =====================================================");
                     }

                     case 5 ->
                        System.out.println("  ---------------------");
                  }
               } while (pilih1 != 5);
            }
            case 2 -> {
               int pilih2 = 0;
               do {
                  System.out.println(" ");
                  System.out.println("  ---------------------");
                  System.out.println("  Submenu Pembeli ");
                  System.out.println("  1. Tambah");
                  System.out.println("  2. Ubah");
                  System.out.println("  3. Hapus");
                  System.out.println("  4. Lihat");
                  System.out.println("  5. Kembali");
                  System.out.print("  Pilih = ");
                  pilih2 = sc.nextInt();
                  switch (pilih2) {
                     case 1 -> {
                        //input id, nama, alamat pembeli
                        System.out.println("    =========== Tambah Data pembeli ============");
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
                              System.out.print("    Nama   = ");
                              String nm = sc.next();
                              sc = new Scanner(System.in);
                              System.out.print("    Alamat = ");
                              String al = sc.nextLine();
                              pb[pb2] = new cPembeli(id, nm, al);
                              pb2++;
                              break;
                           }
                        } while (ketemu != false);
                     }

                     case 2 -> {
                        //update data pembeli
                        System.out.println("    =========== Update Data pembeli ============");
                        System.out.println("    Id pembeli = ");
                        String id = sc.next();
                        boolean caripb = false;

                        for (int i = 0; i < pb2; i++) {
                           if (pb[i].getId().equalsIgnoreCase(id)) {
                              caripb = true;
                              System.out.print("    Id baru     = ");
                              id = sc.next();
                              sc = new Scanner(System.in);
                              System.out.print("    Nama baru   = ");
                              String nm = sc.nextLine();
                              sc = new Scanner(System.in);
                              System.out.print("    Alamat baru = ");
                              String al = sc.nextLine();

                              System.out.println("      Yakin update? [1.Ya / 2.Tidak]");
                              System.out.print("      Update = ");
                              int upd = sc.nextInt();
                              if (upd == 1) {
                                 pb[i] = new cPembeli(id, nm, al);
                                 System.out.println("      Berhasil diupdate...");
                                 break;
                              }
                              if (upd != 1) {
                                 System.out.println("      Batal diupdate...");
                              }
                              break;
                           }
                        }

                        if (caripb == false) {
                           System.out.println("    Data pembeli tidak ada!");
                        }
                     }

                     case 3 -> {
                        System.out.println("    =========== Delete Data pembeli ============");
                        System.out.println("    Id pembeli = ");
                        String id = sc.next();
                        boolean caripb = false;

                        for (int i = 0; i < pb2; i++) {
                           if (pb[i].getId().equalsIgnoreCase(id)) {
                              caripb = true;
                              pb[i].ToString();
                              System.out.println("      Yakin hapus? [1.Ya / 2.Tidak]");
                              System.out.print("      Hapus = ");
                              int hps = sc.nextInt();
                              if (hps == 1) {
                                 pb[i] = null;
                                 for (int j = i; j < pb2; j++) {
                                    cPembeli temp;
                                    temp = pb[j];
                                    pb[j] = pb[j + 1];
                                    pb[j + 1] = temp;
                                 }
                                 System.out.println("      Berhasil dihapus...");
                                 break;
                              }
                              if (hps != 1) {
                                 System.out.println("      Batal dihapus...");
                              }
                              break;
                           }
                        }

                        if (caripb == false) {
                           System.out.println("    Data pembeli tidak ada!");
                        }
                     }
                     case 4 -> {
                        System.out.println("    =========== Lihat Data pembeli ============");
                        System.out.println("    Data Pembeli : ");
                        if (pb2 != 0) {
                           for (int i = 0; i < pb2; i++) {
                              System.out.print("    " + (i + 1) + ". " + pb[i].ToString());
                           }
                        } else {
                           System.out.println("    Data kosong..");
                        }
                        System.out.println("    ===========================================");
                        break;
                     }

                     case 5 -> {
                        System.out.println("  ---------------------");
                        break;
                     }
                  }
               } while (pilih2 != 5);
            }

            case 3 -> {
               int pilih3 = 0;
               do {
                  System.out.println(" ");
                  System.out.println("  ---------------------");
                  System.out.println("  Submenu Kasir");
                  System.out.println("  1. Tambah");
                  System.out.println("  2. Ubah");
                  System.out.println("  3. Hapus");
                  System.out.println("  4. Lihat");
                  System.out.println("  5. Kembali");
                  System.out.print("  Pilih = ");
                  pilih3 = sc.nextInt();
                  switch (pilih3) {
                     case 1 -> {
                        //input id dan nama kasir
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
                              System.out.print("    Nama   = ");
                              String nm = sc.next();
                              ksr[ksr2] = new cKasir(id, nm);
                              ksr2++;
                              break;
                           }
                        } while (ketemu != false);
                     }

                     case 2 -> {
                        //update data kasir
                        System.out.println("    ============ Update Data Kasir =============");
                        System.out.println("    Id Kasir = ");
                        String id = sc.next();
                        boolean cariksr = false;

                        for (int i = 0; i < ksr2; i++) {
                           if (ksr[i].getId().equalsIgnoreCase(id)) {
                              cariksr = true;
                              System.out.print("    Id baru     = ");
                              id = sc.next();
                              sc = new Scanner(System.in);
                              System.out.print("    Nama baru   = ");
                              String nm = sc.nextLine();
                              System.out.println("      Yakin update? [1.Ya / 2.Tidak]");
                              System.out.print("      Update = ");
                              int upd = sc.nextInt();
                              if (upd == 1) {
                                 ksr[i] = new cKasir(id, nm);
                                 System.out.println("      Berhasil diupdate...");
                                 break;
                              }
                              if (upd != 1) {
                                 System.out.println("      Batal diupdate...");
                              }
                              break;
                           }
                        }

                        if (cariksr == false) {
                           System.out.println("    Data kasir tidak ada!");
                        }
                     }

                     case 3 -> {
                        System.out.println("    ============ Delete Data Kasir =============");
                        System.out.println("    Id Kasir = ");
                        String id = sc.next();
                        boolean cariksr = false;

                        for (int i = 0; i < ksr2; i++) {
                           if (ksr[i].getId().equalsIgnoreCase(id)) {
                              cariksr = true;
                              ksr[i].ToString();
                              System.out.println("      Yakin hapus? [1.Ya / 2.Tidak]");
                              System.out.print("      Hapus = ");
                              int hps = sc.nextInt();
                              if (hps == 1) {
                                 ksr[i] = null;
                                 for (int j = i; j < ksr2; j++) {
                                    cKasir temp;
                                    temp = ksr[j];
                                    ksr[j] = ksr[j + 1];
                                    ksr[j + 1] = temp;
                                 }
                                 System.out.println("      Berhasil dihapus...");
                                 break;
                              }
                              if (hps != 1) {
                                 System.out.println("      Batal dihapus...");
                              }
                              break;
                           }
                        }

                        if (cariksr == false) {
                           System.out.println("    Data kasir tidak ada!");
                        }
                     }
                     case 4 -> {
                        System.out.println("    ============ Lihat Data Kasir =============");
                        System.out.println("    Data Kasir : ");
                        if (ksr2 != 0) {
                           for (int i = 0; i < ksr2; i++) {
                              System.out.print("    " + (i + 1) + ". " + ksr[i].ToString());
                           }
                        } else {
                           System.out.println("    Data kosong..");
                        }
                        System.out.println("    ===========================================");
                        break;
                     }

                     case 5 -> {
                        System.out.println("  ---------------------");
                        break;
                     }
                  }
               } while (pilih3 != 5);
            }

            case 4 -> {
               int pilih4 = 0;
               int choose = 0;
               do {
                  belii[0] = beli;
                  
                  System.out.println(" ");
                  System.out.println("  ---------------------");
                  System.out.println("  Transaksi Pesanan");
                  System.out.print("  Id Kasir = ");
                  String id = sc.next();
                  boolean cariksr = false;
                  for (int i = 0; i < ksr2; i++) {
                     if (ksr[i].getId().equalsIgnoreCase(id)) {
                        System.out.println("    ________________________________");
                        System.out.println("    Kasir : [" + ksr[i].getId() + "] - " + ksr[i].getNama());
                        cariksr = true;
                        ksr3 = i;
                        break;
                     }
                  }

                  if (cariksr == true) {
                     
                     do {
                        System.out.println("    1.Tambah Pesanan");
                        System.out.println("    2.Update Pesanan");
                        System.out.println("    3.Delete Pesanan");
                        System.out.println("    4.Lihat Pesanan");
                        System.out.println("    5.Kembali");
                        System.out.print("    Pilih = ");
                        int pilihh = sc.nextInt();

                        switch (pilihh) {
                           case 1 -> {
                              System.out.println("      =============== Tambah Pesanan ===============");
                              System.out.print("      Id Pembeli = ");
                              String idp = sc.next();
                              boolean caripb = false;
                              for (int i = 0; i < pb2; i++) {
                                 if (pb[i].getId().equalsIgnoreCase(idp)) {
                                    caripb = true;

                                    beli.tambahPembeli(pb[i]);
                                    break;
                                 }
                              }

                              if (caripb == true) {
                                 int tambah;
                                 do {
                                    boolean ada = false;
                                    System.out.print("      >> Nama menu = ");
                                    String n = sc.next();
                                    for (int i = 0; i < mkn2; i++) {
                                       if (n.equalsIgnoreCase(mkn[i].getNama())) {
                                          ada = true;
                                          beli.tambahMakanan(mkn[i]);
                                          jmlm++;
                                          break;
                                       }
                                    }
                                    for (int i = 0; i < mnm2; i++) {
                                       if (n.equalsIgnoreCase(mnm[i].getNama())) {
                                          ada = true;
                                          beli.tambahMinuman(mnm[i]);
                                          jmlm++;
                                          break;
                                       }
                                    }

                                    if (ada == false) {
                                       System.out.println("      ! Menu tidak ada !");
                                    }

                                    System.out.print("\t\t\t\tTotal : Rp. ");
                                    beli.lihatharga();
                                    System.out.print("      Tambah lagi? \n      [1.Ya / 2.Tidak] = ");
                                    tambah = sc.nextInt();
                                 } while (tambah != 2);

                                 if (caripb == true) {
                                    System.out.println("");
                                    System.out.println("      |> 1. Simpan & Keluar");
                                    System.out.println("      |> 2. Hapus dan batalkan pesanan");
                                    System.out.print("      >>Pilih = ");
                                    int plh = sc.nextInt();

                                    if (plh == 2) {
                                       System.out.print("      ! Yakin batalkan? -> [1.Ya / 2.Simpan Sementara] : ");
                                       int smpn = sc.nextInt();
                                       if (smpn == 1) {
                                          beli = null;
                                          System.out.println("      Sukses hapus..\n");
                                       }
                                    }
                                 }
                              }
                              if (caripb == false) {
                                 System.out.println("      Data pembeli tidak ada!");
                              }
                           }

                           case 2 -> {
                              //Update Pesanan (Hapus makanan)
                              int jwb4;
                              boolean ada2 = false;

                              System.out.println("      =============== Update Pesanan ===============");
                              System.out.print("      Menu Dihapus = ");
                              String h = sc.next();
                              for (int i = 0; i < mkn2; i++) {
                                 if (h.equalsIgnoreCase(mkn[i].getNama())) {
                                    ada2 = true;
                                    break;
                                 }
                              }
                              for (int i = 0; i < mnm2; i++) {
                                 if (h.equalsIgnoreCase(mnm[i].getNama())) {
                                    ada2 = true;
                                    break;
                                 }
                              }

                              if (ada2 == true) {
                                 System.out.println("      Apakah yakin dihapus? (1.Ya , 2.Tidak)");
                                 System.out.print("      Jawab = ");
                                 jwb4 = sc.nextInt();
                                 if (jwb4 == 1) {
                                    beli.hapusMenu(h);
                                    jmlm = jmlm - 1;
                                 } else {
                                    System.out.println("      Batal dihapus...");
                                 }
                              } else {
                                 System.out.println("      ! Menu tidak ada !");
                              }
                           }

                           case 3 -> {
                              if (beli != null) {
                                 System.out.print("      ! Yakin Hapus? -> [1.Ya / 2.Tetap Simpan Sementara] : ");
                                 int smpn = sc.nextInt();
                                 if (smpn == 1) {
                                    simpan = 0;
                                    beli = null;
                                    System.out.println("      Sukses hapus..\n");
                                 }
                              } else {
                                 System.out.println("      Data tidak ada!");
                              }
                           }

                           case 4 -> {
                              if (beli != null) {
                                 System.out.println("      ===============================================");
                                 System.out.println("                       Data Pemesanan");
                                 System.out.println("      ===============================================");
                                 beli.lihatMakanan();
                                 System.out.println("      ______________________________________________+");
                                 System.out.print("      Total \t\t : Rp. ");
                                 beli.lihatharga();
                                 System.out.println("\n      Kasir \t : " + ksr[ksr3].getNama());
                                 System.out.print("      Hari/Tgl \t : "); beli.waktu();
                                 System.out.println("      ===============================================\n");
                              } else {
                                 System.out.println("    Data Pesanan Kosong..");
                              }
                           }

                           case 5 -> {
                              System.out.println("  ---------------------");
                              pilih4 = 1;
                              choose = 1;
                           }
                        }
                     }while(pilih4!=1); 
                  }

                  if (cariksr == false) {
                     System.out.println("  Data Kasir tidak ada!");
                  }
               } while (choose==0);
            }
         }
      } while (pilih != 5);
      System.out.println(" ");
      System.out.println("=============================================");
      System.out.println("<<<<            Terima Kasih            >>>>");
      System.out.println("=============================================");
   }

}
