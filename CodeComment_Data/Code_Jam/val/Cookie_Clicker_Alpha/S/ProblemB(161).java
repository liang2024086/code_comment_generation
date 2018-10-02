package methodEmbedding.Cookie_Clicker_Alpha.S.LYD931;

import java.io.*;
import java.util.*;

public class ProblemB{

 public static void main(String Args[])throws IOException{
  
  BufferedReader br= new BufferedReader(new FileReader("B-small-attempt0.in"));
  int T=Integer.parseInt(br.readLine());
  double reqRate=0, C=0,F=0,X=0;
  FileWriter fw = new FileWriter ("OutputB.txt");
  BufferedWriter bw = new BufferedWriter (fw);
  PrintWriter pw = new PrintWriter (bw);
  for(int i=0;i<T;i++){
   StringTokenizer st= new StringTokenizer(br.readLine());
   C=Double.parseDouble(st.nextToken());
   F=Double.parseDouble(st.nextToken());
   X=Double.parseDouble(st.nextToken());
   reqRate=X*F/C-F;
   double rate=2, time=0;
   while(rate<reqRate){
    time+=C/rate;
    rate+=F;
   }
   time+=X/rate;
   pw.println("Case #"+(i+1)+": "+time);
  }
  pw.close();
  bw.close();
  fw.close();
 }
}
    
