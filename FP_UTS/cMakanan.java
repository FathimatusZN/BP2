package FP_UTS;
public class cMakanan extends cMenu {
   int urutan_menu;
   
   cMakanan(String kd, String nm, int hg, int u){
      super(kd, nm, hg);
      urutan_menu = u;
   }
   
   void setUrutan(int u) {
      urutan_menu = u;
   }
   
   int getUrutan() {
      return urutan_menu;
   }
   
   @Override
   public void info(){
   super.info();
      System.out.println(" ["+urutan_menu+"]");
   }
}