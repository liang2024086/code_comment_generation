package methodEmbedding.Counting_Sheep.S.LYD1680;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class sheep {

   
    public static void main(String[] args) throws Exception
    {
        BufferedReader input = null;
        File ss = null;
        BufferedWriter bw = null;
        System.out.println("start processing");
          try{
            ss = new File("/home/gunjan/sheepOutput.txt");
            FileWriter fw = new FileWriter(ss);
            bw = new BufferedWriter(fw);
           } catch(Exception e) {
            System.out.println("File creation error");
            e.printStackTrace();
          }
          String ch = ": ";
            input = new BufferedReader(new FileReader("input.txt"));
            int cases = Integer.parseInt(input.readLine());
            System.out.println("----------" + cases);
            int r, d, k = 0;
            for (int t= 0; t< cases; t++) 
            { 
                int n = Integer.parseInt(input.readLine());
                d = 1;
                int inc,i;
                int a[] = {11,11,11,11,11,11,11,11,11,11};
                 inc=1;
                 if(n != 0) {
                     while (a[9]==11){
                     k = n*inc;
                     d = k;
                     while(d != 0){
                      r = d%10;
                      d = d/10;
                      for(i=0;i<10;i++){
                         if(a[i] == r) break;
                         if(a[i]!=r && a[i] == 11){
                             a[i]=r;
                             break;
                         }
                      }
                     }
                      inc++;
                     }
                     System.out.println("number:"+ n + " val: "+ k);
                     bw.write("Case #"+ (t+1) + ch + k);
                     bw.newLine();
                     bw.flush();
               } else {
                   System.out.println("number:"+ n +" INSOMNIA");
                   bw.write("Case #"+ (t+1) + ch + "INSOMNIA");
                   bw.newLine();
                   bw.flush();
               }
            }
       
    
    }

}
