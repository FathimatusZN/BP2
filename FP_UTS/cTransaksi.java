package FP_UTS;
//satu pembeli dapat memesan beberapa makanan
//Transaksi menjadi container

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class cTransaksi {

   private cPembeli pembeli;
   private cKasir kasir;
   private cMenu menu[]; //array of object
   private int jml, maksmkn;
   private int subtotal, diskon, total;
   public int quantity[][] = new int[100][2];
   public static String time, kodets;
   public static LocalDateTime mytime;
   public static DateTimeFormatter mytime2 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

   cTransaksi() {
      maksmkn = 10;
      menu = new cMenu[maksmkn];
      jml = 0;
   }

   public void tambahKasir(cKasir k) {
      kasir = k;
   }
   
   public void tambahPembeli(cPembeli p) {
      pembeli = p;
      System.out.println("    " + pembeli.ToString());
   }

   public void tambahMakanan(cMakanan m, int qty) {
      if (jml >= maksmkn) {
         System.out.println("      Kapasitas penuh...");
      } else {
         menu[jml] = m;
         quantity[jml][0] = qty;
         jml++;
      }
   }

   public void tambahMinuman(cMinuman m, int qty) {
      if (jml >= maksmkn) {
         System.out.println("      Kapasitas penuh...");
      } else {
         menu[jml] = m;
         quantity[jml][0] = qty;
         jml++;
      }
   }

   public void tambahSnack(cSnack m, int qty) {
      if (jml >= maksmkn) {
         System.out.println("      Kapasitas penuh...");
      } else {
         menu[jml] = m;
         quantity[jml][0] = qty;
         jml++;
      }
   }

   String kodets(int total) {
      kodets = "TS0" + (total+1);
      total++;
      return kodets;
   }

   public void lihatMakanan() {
      System.out.println("      " + pembeli.ToString());
      System.out.println("      Nama Menu \tQty\tHarga\tTotal");
      System.out.println("      _______________________________________________");

      for (int i = 0; i < jml; i++) {
         if (menu[i].getNama().length() < 10) {
            System.out.println("      " + menu[i].getNama() + "\t\t" + (quantity[i][0]) + "\t" + menu[i].getHarga() + "\t" + quantity[i][1]);
         }

         if (menu[i].getNama().length() >= 10) {
            System.out.println("      " + menu[i].getNama() + "\t" + (quantity[i][0]) + "\t" + menu[i].getHarga() + "\t" + quantity[i][1]);
         }
      }
   }

   public void lihatKasir(){
      System.out.println(kasir.ToString());
   }
   
   int lihatHarga(){
      subtotal = 0;
      for (int i = 0; i < jml; i++) {
         quantity[i][1] = menu[i].getHarga() * quantity[i][0];
         subtotal = subtotal + quantity[i][1];
      }
      return subtotal;
   }
   
   public void lihatTotal() {
      diskon = 0; total = 0;
      
      //member
      if (pembeli.getStatus() == 1) {
         diskon = (int) (subtotal * 0.1);
         total = subtotal - diskon;
         System.out.println("\t SubTotal : Rp. " + subtotal);
         System.out.println("       \t\t\t   Diskon : Rp. " + diskon);
         System.out.println("       \t\t\t    Total : Rp. " + total);
      }
      
      //non member
      else{
         total = subtotal;
         System.out.println("\t    Total : Rp. " +total);
      }
   }

   int lihatTotal2() {
      diskon = 0; total = 0;
      
      //member
      if (pembeli.getStatus() == 1) {
         diskon = (int) (subtotal * 0.1);
         total = subtotal - diskon;
      }
      
      //non member
      else{
         total = subtotal;
      }
      
      return total;
   }
   
   public void hapusMenu(String m) {
      cMenu temp; int temp2, temp3;
      if (jml - 1 <= 0) {
         System.out.println("      Menu pesanan kosong!");
      } else {
         boolean ada = false;
         for (int i = 0; i < jml; i++) {
            if (m.equalsIgnoreCase(menu[i].getNama())) {
               ada = true;
               menu[i] = null;
               quantity[i][0] = 0; quantity[i][1] = 0;
               //geser maju elemen
               for (int j = i; j < jml; j++) {
                  temp = menu[j];
                  menu[j] = menu[j + 1];
                  menu[j + 1] = temp;
                  
                  temp2 = quantity[j][0];
                  quantity[j][0] = quantity[j+1][0];
                  quantity[j+1][0] = temp2;
                  
                  temp3 = quantity[j][1];
                  quantity[j][1] = quantity[j+1][1];
                  quantity[j+1][1] = temp3;
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

   public void hapusPesanan() {
      for (int i = 0; i < jml; i++) {
         menu[i] = null;
         quantity[i][0] = 0; quantity[i][1] = 0;
      }
      jml = 0;
   }

   public void hapusPembeli() {
      pembeli = null;
   }

   String waktu() {
      mytime = LocalDateTime.now();
      time = mytime.format(mytime2);
      System.out.println(time);
      return time;
   }

   int getJumlah (){
      return jml;
   }
   
}
