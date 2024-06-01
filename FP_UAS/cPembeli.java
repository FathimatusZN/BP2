package bp2_fp;

public class cPembeli {
   private String id, nama, alamat;  
   
   //method
   cPembeli(String i, String n, String a) {
      id = i;
      nama = n;
      alamat = a;
      System.out.println("    Data pembeli " + nama + " dibuat...");
   }

   //setter 
   void setId(String i) {
      String id = i;
   }

   void setNama(String nm) {
      String Nama = nm;
   }

   void setAlamat(String a) {
      String Alamat = a;
   }

   //getter
   String getId() {
      return id;
   }

   String getNama() {
      return nama;
   }

   String getAlamat() {
      return alamat;
   }

   String ToString() {
      return id + " - " + nama + " [" + alamat + "] \n";
   }

}
