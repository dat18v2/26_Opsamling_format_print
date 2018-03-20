import java.util.Random;
public class Formater{

   public static void main(String[] args){
      Random r = new Random();
      String[] s = {"lige", "ulige"};
      for (int i=0;i<10;i++){
         //System.out.println(i);
         System.out.printf("%3d %2.4f %3d", i, Math.random(), r.nextInt(1000));
         System.out.printf(" %-5s\n", s[i%2]);
      }
      int x = 1;
      int y = 42;
      //byt x og y
      int bytter;
      bytter = y;
      y = x;
      x = bytter;
      System.out.printf("x: %d, y: %d", x, y);
   
      //find index i array
      int[] mineInts = {1,2,3,4,7};
      //findIndex(mineInts, 7) -> 4
      //findIndex(mineInts, 27) -> -1
   }


}