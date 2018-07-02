package methodEmbedding.Standing_Ovation.S.LYD1791;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
  public class Google1{
  
  public static void main(String args[]) throws IOException,NumberFormatException{
    
    BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\AKSHANSH\\Downloads\\A-small-attempt3.in"));
    PrintWriter pw=new PrintWriter("C:\\Users\\AKSHANSH\\Downloads\\A-smallans.txt");
    int T = Integer.parseInt(br.readLine());

    int t =T;

while(t>0){
    int ka= T-t+1;
    int count =0;
    int alt =0;
    int count2=0;
  String s[]=br.readLine().split(" ");
  int N= Integer.parseInt(s[0]);
  int ar[] = new int[N+1];
  
  int i;
  for(i=N;i>-1;i--){
	ar[i]=Character.getNumericValue(s[1].charAt(i));
  }
   
    for(i=0;i<N+1;i++){
        
        alt = i-count;
        
          if(alt>0){
              count2 = count2+alt;
              count = count+alt;
          }  
            
        count =count +ar[i];
            
       
        
        
        
       
        
        
    }
   
    System.out.println("Case #" +ka+": "+count2);
    count2 =0;
    t--;
}

br.close();
    pw.close();
  }
  }
