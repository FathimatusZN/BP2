package bp2_fp;

public class cKasir {

   private String id;
   private String nama;

   //method
   //constructor
   cKasir(String i, String n) {
      id = i;
      nama = n;
      System.out.println("    Kasir " + nama + " dibuat...");
   }

   //setter 
   void setId(String i) {
      id = i;
   }

   void setNama(String nm) {
      nama = nm;
   }

   //getter
   String getId() {
      return id;
   }

   String getNama() {
      return nama;
   }

   //ToString
   String ToString() {
      return id + " - " + nama ;
   }
}
