package FP_UTS;
public class cSnack extends cMenu {
   int urutan_menu;
   
   cSnack(String kd, String nm, int hg, int u){
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


