package methodEmbedding.Magic_Trick.S.LYD191;

import java.io.*;
import java.util.*;
public class magictrick{
   public static void main(String[] args) throws IOException{
      BufferedReader f = new BufferedReader(new FileReader("A-small.in"));
      PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter("gjc.out")));
      int Num=Integer.parseInt(f.readLine());
      for(int ind=0;ind<Num;ind++){
         int[][] ar=new int[4][4];
         int r1=Integer.parseInt(f.readLine());
         Set<Integer> iset=new HashSet<Integer>();
         for(int ch=0;ch<4;ch++)
         {
            String[] temp=f.readLine().split(" ");
            for(int ch1=0;ch1<4;ch1++)
               ar[ch][ch1]=Integer.parseInt(temp[ch1]);
         }
         for(int x=0;x<4;x++)
            iset.add(ar[r1-1][x]);
         
         Set<Integer> fset=new HashSet<Integer>();
         int[][] ar2=new int[4][4];
         int r2=Integer.parseInt(f.readLine());
         for(int ch=0;ch<4;ch++)
         {
            String[] temp=f.readLine().split(" ");
            for(int ch1=0;ch1<4;ch1++)
               ar2[ch][ch1]=Integer.parseInt(temp[ch1]);
         }
         for(int x=0;x<4;x++)
            if(iset.contains(ar2[r2-1][x]))
               fset.add(ar2[r2-1][x]);
        
        
        out.print("Case #"+(ind+1)+": ");
        if(fset.size()==0) out.print("Volunteer Cheated!");
        else if(fset.size()>1) out.print("Bad Magician!");
        else for(Integer x:fset) out.print(x);
        
        out.println();
      }
      out.close();
   }
}
