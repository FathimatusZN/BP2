package FP_UTS;

public class cKasir {

   private String id;
   private String nama;

   //method
   //constructor
   cKasir(String i, String n) {
      id = i;
      nama = n;
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
