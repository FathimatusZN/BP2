package FP_UTS;

public class cLaporan {

   private cTransaksi checkout[];
   private int jmlCO;

   cLaporan() {
      checkout = new cTransaksi[100];
   }

   public void tambahCO(cTransaksi m, int co) {
      jmlCO = co;
      checkout[jmlCO] = m;
      jmlCO++;
   }

   public void rekapTotalharga(int urutan_menu, cTransaksi beli, int[][] data) {
      int total_pemasukan = 0;
      System.out.println("    ============= Total Pemasukan ==============");
      System.out.print("    ");
      beli.waktu();
      System.out.print("    Total Pemasukan hari ini : ");
      for (int i = 0; i <= urutan_menu; i++) {
         total_pemasukan = total_pemasukan + data[i][2];
      }
      System.out.println(total_pemasukan);
      System.out.println("    ============================================\n");   
   }
   
   public void rekapMenu(int[][] data, cMakanan[] mkn, int mkn2, cMinuman[] mnm, int mnm2, cSnack snc[], int snc2) {
      System.out.println("    =========== Rekap Data Per Menu ============");
      System.out.println("    Top 10 menu total harga penjualan terbanyak : ");
      for (int i = 0; i < 10; i++) {
         int x = data[i][0];

         for (int j = 0; j < mkn2; j++) {
            if (x == mkn[j].getUrutan()) {
               if (mkn[j].getNama().length() < 10) {
                  System.out.println("    " + (i + 1) + ". [" + mkn[j].getKode() + "] " + mkn[j].getNama() + "\t\t : Rp. " + data[i][2]);
               } else {
                  System.out.println("    " + (i + 1) + ". [" + mkn[j].getKode() + "] " + mkn[j].getNama() + "\t : Rp. " + data[i][2]);
               }
            }
         }
         for (int j = 0; j < mnm2; j++) {
            if (x == mnm[j].getUrutan()) {
               if (mnm[j].getNama().length() < 10) {
                  System.out.println("    " + (i + 1) + ". [" + mnm[j].getKode() + "] " + mnm[j].getNama() + "\t\t : Rp. " + data[i][2]);
               } else {
                  System.out.println("    " + (i + 1) + ". [" + mnm[j].getKode() + "] " + mnm[j].getNama() + "\t : Rp. " + data[i][2]);
               }
            }
         }
         for (int j = 0; j < snc2; j++) {
            if (x == snc[j].getUrutan()) {
               if (snc[j].getNama().length() < 10) {
                  System.out.println("    " + (i + 1) + ". [" + snc[j].getKode() + "] " + snc[j].getNama() + "\t\t : Rp. " + data[i][2]);
               } else {
                  System.out.println("    " + (i + 1) + ". [" + snc[j].getKode() + "] " + snc[j].getNama() + "\t : Rp. " + data[i][2]);
               }
            }
         }
      }

      System.out.println("    ============================================\n");
   }
   
   public void rekapPembeli(cPembeli [] pb, int pb2){
      
      System.out.println("    =========== Total Belanja Pembeli ==========");
      System.out.println("    Member : ");
      for (int i = 0; i < pb2; i++) {
         if (pb[i].getStatus() == 1) {
            if(pb[i].getNama().length()<=10){
               System.out.print("    [" + pb[i].getId() + "] - " + pb[i].getNama() + " \t\t: Rp. " + pb[i].getTotal() + "\n");
            }
            else{
               System.out.print("    [" + pb[i].getId() + "] - " + pb[i].getNama() + " \t: Rp. " + pb[i].getTotal() + "\n");
            }
         }
      }
      System.out.print("\n    Total Belanja Non Member : ");
      int total = 0;
      for (int i = 0; i < pb2; i++) {
         if (pb[i].getStatus() == 2) {
            total = total + pb[i].getTotal();
         }
      }
      System.out.println(total);
      System.out.println("    ============================================");
   }
   
}
