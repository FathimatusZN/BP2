package FP_UTS;

public class cPembeli {
   
   private String id, nama, alamat;
   private int status, total;  
   
   //method
   cPembeli(String i, String n, String a, int sts, int totalhg) {
      id = i;
      nama = n;
      alamat = a;
      status = sts;
      total = totalhg;
   }

   //setter 
   void setId(String i) {
      id = i;
   }

   void setNama(String nm) {
      nama = nm;
   }

   void setAlamat(String a) {
      alamat = a;
   }
   
   void setStatus(int i) {
      status = i;
   }
   
   void setTotal(int totalhg){
      total = total + totalhg;
   }

   //getter
   String getId() {
      return id;
   }
   
   int getStatus(){
      return status;
   }

   String getNama() {
      return nama;
   }

   String getAlamat() {
      return alamat;
   }
   
   int getTotal(){
      return total;
   }

   String ToString() {
      if(status==1){
         return id + " - " + nama + " - " + alamat + " [Member]  " ;
      }
      return id + " - " + nama + " - " + alamat + " [Non member]  ";
   }

}
