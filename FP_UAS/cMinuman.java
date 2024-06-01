package bp2_fp;
public class cMinuman extends cMenu {
   int sold;
   
   cMinuman(String kd, String nm, int hg, int so){
      super(kd, nm, hg);
      sold = so;
   }
   
   void setTerjual(int so) {
      sold = so;
   }
   
   int getSold() {
      return sold;
   }
   
   @Override
   public void info(){
   super.info();
      System.out.println(" "+sold);
   }
}


