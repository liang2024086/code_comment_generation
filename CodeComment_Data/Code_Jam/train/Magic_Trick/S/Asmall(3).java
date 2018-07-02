package methodEmbedding.Magic_Trick.S.LYD734;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Asmall {
     public static void main(String[] args) throws IOException{
          FileReader in = new FileReader("A-small-attempt0.in");
          Scanner read = new Scanner(in);
          String lineR = read.nextLine();
          int loopC = Integer.parseInt(lineR);
          for(int i=1;i<=loopC;i++){
               int a = Integer.parseInt(read.nextLine());
               String lineX ="";
               int j;
               for (j=1;j<=a;j++){
                    lineX = read.nextLine();
               }           
               for(;j<5;j++){
                    String lineY = read.nextLine();
               }
               StringTokenizer cutter = new StringTokenizer(lineX);
               int[] keeper= new int[4];
               for (int k=1;k<=4;k++){
                    keeper[k-1] = Integer.parseInt(cutter.nextToken());
                    //System.out.println("keeper "+k +" = "+keeper[k-1]);
               }
               a = Integer.parseInt(read.nextLine());
               for (j=1;j<=a;j++){
                    lineX = read.nextLine();
               } 
               for(;j<5;j++){
                    String lineY = read.nextLine();
               }
               cutter = new StringTokenizer(lineX);
               int x = -1;
               int count = 0;
               for (int l=1;l<=4;l++){
                    int chk = Integer.parseInt(cutter.nextToken());
                    
                    for (int c=0;c<4;c++){
                         if (chk == keeper[c] && x==-1){
                              x = chk;
                              count++;
                         }
                         else if (chk == keeper[c]){
                              count++;
                         }
                    }

               }
               if (count > 1){
                    System.out.println("Case #"+i+": Bad magician!");
               }
               else if (x == -1){
                    System.out.println("Case #"+i+": Volunteer cheated!");         
               }
               else{
                    System.out.println("Case #"+i+": "+x);
               }
          }

    
     }
}
