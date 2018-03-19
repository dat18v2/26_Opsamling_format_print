import java.util.Random;

public class FormateretPrint{

   public static void main(String[] args){
      for (int i=1;i<=10;i++){
         for (int j=1;j<=10;j++){
            System.out.printf(" %3d", i*j);
         }
         System.out.println();
      }
      
      for (int i=0;i<10;i++){
         System.out.printf("%1.2f\n", Math.random());
      }
      
      int q;
      Random r = new Random();
      for (int i=0;i<10;i++){
         q = r.nextInt(100);
         System.out.printf("%2d\n", q);
      }
   }
   
}