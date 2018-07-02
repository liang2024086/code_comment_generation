package methodEmbedding.Counting_Sheep.S.LYD1080;

import java.util.*;
import java.io.*;

public class Main {
  public static  void main(String[]args){
    try{
  Scanner sc=new Scanner(new File("A-small-attempt10.in.txt"));

  int t=sc.nextInt();
  String []s=new String[t];
    for(int i=1;i<=t;i++)
    {long c=1;boolean b=true;
    long n=sc.nextShort();
    int[]x=new int[10];
    if(n<=200&&n>=0){
    if(n==0){

     s[i-1]="Case #"+i+": INSOMNIA";
       }
      else {
      b=true;
      long n2=n;
      while(b)
    {long n1=n2;
      while(n1!=0){
        if(x[(int)(n1%10)]==0)
    x[(int)(n1%10)]++;
    
    n1=(n1/10); }
    if(x[0]+x[1]+x[2]+x[3]+x[4]+x[5]+x[6]+x[7]+x[8]+x[9]==10)
    {
 s[i-1]="Case #"+i+": "+n2;
    
    b=false;
    break;
    }
    else{
      c++;
      n2=(n*c);
     }}
      } 
    }
    else
      s[i-1]="Case #"+i+": INSOMNIA";}
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
