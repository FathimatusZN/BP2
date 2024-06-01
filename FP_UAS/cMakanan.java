package bp2_fp;
public class cMakanan extends cMenu {
   int sold;
   
   cMakanan(String kd, String nm, int hg, int so){
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
