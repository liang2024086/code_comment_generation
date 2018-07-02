package methodEmbedding.Cookie_Clicker_Alpha.S.LYD1386;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	  FileInputStream is = null;
      int i;
      char c;

      
      try{
         // new input stream created
         is = new FileInputStream("/Users/zixiangzhu/Documents/ACM/Q2/B-small-attempt0.txt");
         Scanner scan = new Scanner(is);

         String s = scan.nextLine();
         int quant = Integer.parseInt(s);
         for (int k = 1; k<=quant; k++) {
            System.out.print("Case #" + k + ": ");
            String str = scan.nextLine();
            Scanner scan2 = new Scanner(str);
            double cc = Double.parseDouble(scan2.next());
            double ff = Double.parseDouble(scan2.next());
            double xx = Double.parseDouble(scan2.next());

            int factoryNum = 0;
            double f0 = 2;
            double addTime0 = xx/f0;
            double f1 = f0 + ff;
            double addTime1 = (cc/f0) + (xx/f1);
            while (addTime0>addTime1) {
               factoryNum++;
               f0 = f1;
               addTime0 = xx/f0;
               f1 = f0 + ff;
               addTime1 = (cc/f0) + (xx/f1);
            }
            //System.out.println(factoryNum);

            double rate = 2;
            double time = 0;
            for (int y = 1; y<=factoryNum; y++) {
               time = time + cc/rate;
               //System.out.println("buildtime: " + time);
               rate += ff;
            }
            double addTime = xx/rate;
            double totalTime = time+addTime;
            System.out.println(totalTime);


         }
         
         

      }catch(Exception e){
         
         // if any I/O error occurs
         e.printStackTrace();
      }finally{
         
         // releases system resources associated with this stream
         if(is!=null)
            is.close();
      }
	}
}
