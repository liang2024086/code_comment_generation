package methodEmbedding.Standing_Ovation.S.LYD2072;

import java.io.*;
class main
{
 public static void main(String arg[]) throws IOException{
  BufferedReader bb=new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/Raju/Desktop/A-small-attempt0.in")));
  PrintWriter pp=new PrintWriter(new OutputStreamWriter(new FileOutputStream("C:/Users/Raju/Desktop/output.txt")));
 
  int t=Integer.parseInt(bb.readLine());
  for(int o=1;o<=t;o++){
   String s[];
   s=bb.readLine().split(" ");
   int p=Integer.parseInt(s[0]);					
   for(int i=s[1].length()-1;i>=0;i--)
{

   if(s[1].charAt(i)=='0')
    p=p-1;
   else
    break;
}
   int a=0,b=0;
   for(int i=0;i<=p;i++)
    {
       if(a<i){
        b=b+1;
        a=a+1;
        a=a+Integer.parseInt(String.valueOf(s[1].charAt(i)));
       }
       else{
      a=a+Integer.parseInt(String.valueOf(s[1].charAt(i)));
      }
     } 
   pp.println("Case #"+o+": "+b); 
   }
pp.close();
 }

}
