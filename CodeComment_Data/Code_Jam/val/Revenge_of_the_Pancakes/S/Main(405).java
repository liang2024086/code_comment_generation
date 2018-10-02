package methodEmbedding.Revenge_of_the_Pancakes.S.LYD1198;

import java.util.*;
import java.io.*;

public class Main {
  public static  void main(String[]args){
    try{
  Scanner sc=new Scanner(new File("B-small-attempt1.in.txt"));

  int t=sc.nextInt();
  String []s=new String[t];
    for(int i=1;i<=t;i++)
    {int cnt=0;
      boolean h=true;
    String n=sc.next();
    char[]c=n.toCharArray();
    int k=c.length-1;
   while(h){
    if(c[k]=='+')
      k--;
    else
    {
      cnt++;
    for(int b=k;b>=0;b--)
    {
      if(c[b]=='-')
        c[b]='+';
      else
        c[b]='-';
    }
    k--;
    }
    if(k<0)
      break;
    }
      s[i-1]="Case #"+i+": "+cnt;
      
      
      
    }
      
    try{
  PrintStream out = new PrintStream(new FileOutputStream("java.txt"));
System.setOut(out);
for(int i=0;i<t;i++)
{
   out.println(s[i]);
}}
    catch(IOException fx) {
      System.out.println(fx);
    }  
    
    }
     catch(IOException fx) {
      System.out.println(fx);
    }  
  }
}
