package bp2_fp;
//satu pembeli dapat memesan beberapa makanan
//Transaksi menjadi container

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class cTransaksi {
   String jam, tanggal;
   private cPembeli pembeli;
   private cMenu menu[]; //array of object
   private cTransaksi checkout[];
   private int jml, maksmkn, harga, total;
   public static String time;
   public static LocalDateTime mytime;
   public static DateTimeFormatter mytime2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

   cTransaksi() {
      maksmkn = 10;
      menu = new cMenu[maksmkn];
      jml = 0;
      total = 0;
   }

   public void tambahPembeli(cPembeli p) {
      pembeli = p;
      System.out.println("      " + pembeli.ToString());
   }

   public void tambahMakanan(cMakanan m) {
      if (jml >= maksmkn) {
         System.out.println("      Kapasitas penuh...");
      } else {
         menu[jml] = m;
         jml++;
      }
   }
   
   public void tambahMinuman(cMinuman m) {
      if (jml >= maksmkn) {
         System.out.println("      Kapasitas penuh...");
      } else {
         menu[jml] = m;
         jml++;
      }
   }
   
   public void tambahPesanan(cTransaksi co){
      checkout[total] = co;
      total++;
   }

   public void lihatMakanan() {
      System.out.println("      " + pembeli.ToString());
      for (int i = 0; i < jml; i++) {
         System.out.println("      " + (i + 1) + ". " + menu[i].ToString());
      }
   }
   
   public void lihatharga() {
      harga = 0;
      for (int i = 0; i < jml; i++) {
         harga = harga + menu[i].getHarga();
      }
      System.out.println(harga);
   }

   public void hapusMenu(String m) {
      cMenu temp;
      if (jml - 1 <= 0) {
         System.out.println("      Menu pesanan kosong!");
      } else {
         boolean ada = false;
         for (int i = 0; i < jml; i++) {
            if (m.equalsIgnoreCase(menu[i].getNama())) {
               ada = true;
               menu[i] = null;
               //geser maju elemen
               for (int j = i; j < jml; j++) {
                  temp = menu[j];
                  menu[j] = menu[j + 1];
                  menu[j + 1] = temp;
               }
               System.out.println("      Penghapusan sukses...");
               jml--;
               break;
            }
         }
         if (ada == false) {
            System.out.println("      Menu yang dicari tidak ada...");
         }
      }
   }

   public void hapusPesanan(){
      for (int i = 0; i < jml; i++) {
         menu[i] = null;
      }
      jml = 0;
   }
   
   public void hapusPembeli(){
      pembeli = null;
   }
   
   public void waktu(){
      mytime = LocalDateTime.now();
      time = mytime.format(mytime2);
      System.out.println(time);
   }

   String getWaktu() {
      return time;
   }

}
