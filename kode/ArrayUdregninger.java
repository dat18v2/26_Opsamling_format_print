import java.util.Scanner;
public class ArrayUdregninger{

   public static void main(String[] args){
      
      Scanner scan = new Scanner(System.in);
      int antalTal;
      
      //læs hvor mange tal
      System.out.print("Hvor mange tal: ");
      antalTal = scan.nextInt();
      
      int[] arrayTal = new int[antalTal];
      //forløkke
      for (int i=0;i<antalTal;i++){
         //læs næste tal
         //gem mitTal i ArrayTal
         System.out.print("Indtast tal nr " + i + ": ");
         arrayTal[i] = scan.nextInt();
      }

      int total = 0; //hold styr på sum til gennemsnit
      int stoerst = arrayTal[0]; //et gæt på største tal
      int mindst = arrayTal[0]; //et gæt på mindste tal

      //forløkke, hvor vi regner
      for (int i=0;i<antalTal;i++){
         //hvis arrayTal[i]<mindst så mindst=arrayTal[i]
         if (arrayTal[i] < mindst){
            mindst = arrayTal[i];
         }
         
         //hvis arrayTal[i]>stoerst så stoerst=arrayTal[i]
         if (arrayTal[i] > stoerst){
            stoerst = arrayTal[i];
         }
         
         total+=arrayTal[i]; // hold styr på sum
      }
      
      //efter løkke beregn gennemsnit - konverter til double for større præcision - ellers er det heltal
      // gennemsnit = total / antalTal; //heltalsdivision
      double gennemsnit = (double) total / (double) antalTal;
      
      //Udskriv resultater
      System.out.println("Min: " + mindst);
      System.out.println("Max: " + stoerst);
      System.out.println("Gennemsnit: " + gennemsnit);
   }

}