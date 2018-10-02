package methodEmbedding.Cookie_Clicker_Alpha.S.LYD373;

import java.io.*;
import java.util.*;
public class cookieclick{
   public static void main(String[] args) throws IOException{
      BufferedReader f = new BufferedReader(new FileReader("B-small.in"));
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gjc.out")));
      int Num=Integer.parseInt(f.readLine());
      for(int ind=0;ind<Num;ind++){
         String[] inar=f.readLine().split(" ");
         double C=Double.parseDouble(inar[0]);
         double F=Double.parseDouble(inar[1]);
         double X=Double.parseDouble(inar[2]);
         double min=X/2+1;
         double prevTimeToBuy=0;
         int x=0;
         while(true){
            if(min>prevTimeToBuy+X/(2+F*x)) min=prevTimeToBuy+X/(2+F*x);
            else 
               break;
            prevTimeToBuy+=C/(2+F*x);
            x+=1;
         }
         out.println("Case #"+(ind+1)+": "+min);
      }
      out.close();
   }
}
