package FP_UTS;
public class cMenu {

   private String kode, nama;
   private int harga;

   cMenu(String kd, String nm, int h) {
      kode = kd;
      nama = nm;
      harga = h;
   }
   
   //setter
   void setKode(String k) { kode = k; }
   void setNama(String n) { nama = n; }
   void setHarga(int h) { harga = h; }

   //getter
   String getKode(){ return kode; }
   int getHarga() { return harga; }
   String getNama() { return nama; }
   
   //query
   public void info(){
      if(nama.length() < 10 ){
         System.out.print(""+kode + " - " + nama + "\t\t : Rp. " + harga + "\t ");
      }
      
      if(nama.length() >= 10){
         System.out.print(""+kode + " - " + nama + "\t : Rp. " + harga + "\t ");
      }
   }
}
