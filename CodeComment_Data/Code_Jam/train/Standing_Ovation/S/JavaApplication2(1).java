package methodEmbedding.Standing_Ovation.S.LYD1022;



import java.util.*;
import java.io.*;
public class JavaApplication2 {

    public static void main(String[] args)  throws FileNotFoundException {
        File d = new File("A-small-attempt0.in");
        File f = new File("A-small-attempt0.out");
        Scanner in = new Scanner(d);
        PrintWriter out = new PrintWriter (f);
 int T,V[] = new int [1006],k=0,i=0,Smax=0,j=0,tot,agg;
 String s;
 T = in.nextInt();
 for(i=0;i<T;i++)
 {
     tot=0;
     agg=0;
  do{
  Smax=in.nextInt();    
  }while(Smax<0||Smax>1005);
  s=in.nextLine();
  for(j=0;j<s.length()-1;j++)
  V[j]=(int)s.charAt(j+1)-48;
  tot=V[0];
  for(j=1;j<s.length();j++){
 if(V[j]!=0)
  if(tot<j){
  agg=agg+j-tot;
  tot=j;}
  tot+=V[j];
  }
  
  
  out.println("Case #"+(i+1)+": "+agg);
 }
        
        
        
        out.close();
        
    }
    
}
