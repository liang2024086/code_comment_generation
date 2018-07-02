package methodEmbedding.Magic_Trick.S.LYD1729;

import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	  FileInputStream is = null;
      int i;
      char c;

      
      try{
         // new input stream created
         is = new FileInputStream("/Users/zixiangzhu/Documents/ACM/Q1/A-small-attempt0.txt");
         
         Scanner scan = new Scanner(is);
         int quant = Integer.parseInt(scan.nextLine());
         int firstR, secondR;
         for (int t = 1; t <= quant; t++) {
         	System.out.print("Case #" + t + ": ");
            String firstRString = scan.nextLine();
			firstR = Integer.parseInt(firstRString);
            String line = "";
            String str1 = "";
            int count = 0;
			for (int g=0; g<4; g++) {
				line = scan.nextLine();
				count++;
				if (count == firstR) {
					str1 = line;
				}
			}
			Scanner scan2 = new Scanner(str1);
            
            int[] arr1 = new int[4];
            arr1[0] = Integer.parseInt(scan2.next());
            
            arr1[1] = Integer.parseInt(scan2.next());
            
            arr1[2] = Integer.parseInt(scan2.next());
            
            arr1[3] = Integer.parseInt(scan2.next());
           
            
            String secondRString = scan.nextLine();
			secondR = Integer.parseInt(secondRString);
            line = "";
            String str2 = "";
            count = 0;
			for (int g=0; g<4; g++) {
				line = scan.nextLine();
				count++;
				if (count == secondR) {
					str2 = line;
				}
			}
            Scanner scan3 = new Scanner(str2);
            int[] arr2 = new int[4];
            arr2[0] = Integer.parseInt(scan3.next());
            arr2[1] = Integer.parseInt(scan3.next());
            arr2[2] = Integer.parseInt(scan3.next());
            arr2[3] = Integer.parseInt(scan3.next());

            int count3 = 0;
            int temp = -1;
            for (int z=0; z<4; z++) {
            	for (int y=0; y<4; y++) {
            		if (arr1[z]==arr2[y]) {
            			temp = arr1[z];
            			count3++;
            		}
            	}
            }

            if (count3>1) {
            	System.out.println("Bad magician!");
            } else if (count3 == 0) {
            	System.out.println("Volunteer cheated!");
            } else {
            	System.out.println(temp);
            }


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
