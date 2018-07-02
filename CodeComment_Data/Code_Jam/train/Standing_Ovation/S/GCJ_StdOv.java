package methodEmbedding.Standing_Ovation.S.LYD977;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

class GCJ_StdOv
{
   public static void main(String args[]) throws IOException
   {
      int n,i,j,k,r,l,t;
      int max,sum,extra;
      char s[]=new char[1000];
      char cpy[]=new char[1000];
      char d[]=new char[1000];
      String str;
      //Scanner in=new Scanner(System.in);
      Scanner in=new Scanner(new File("C:\\Users\\Apoorva\\Downloads\\A-small-attempt0.in"));
      PrintWriter writer = new PrintWriter("GCJ1_small_out1.txt", "UTF-8");
      
      //System.out.println(""+(int)('1'-'0'));
      
      t=in.nextInt();
      //writer.println(""+n);
      //in.nextLine();
      int n1=1;
      while(t>0)
      {
         sum=0;
         extra=0;
         max=in.nextInt();
         
         //in.nextChar();
         str=in.nextLine();
         
         s=str.toCharArray();
         
         l=s.length;
         //System.out.println(""+l+"  "+Arrays.toString(s));
         
         char sa[]=Arrays.copyOfRange(s, 1, l);
         //System.out.println(""+--l+"  "+Arrays.toString(sa));
         l=sa.length;
         sum=sum+(int)(sa[0]-'0');
         //System.out.println(""+sum);
         for(i=1;i<l;i++)
         {
            if(sum>=i)
            {
                sum=sum+(int)(sa[i]-'0');
            }
            else
            {
                extra+=1;
                sum=sum+(int)(sa[i]-'0')+1;
            }
            
         }
         
         
         //System.out.println(""+extra);
         writer.println("Case #"+n1+++": "+extra);
         /*
         for(i=0;d[i]!='\0';i++)
            writer.print(d[i]);
         writer.println();
         */
        /* 
        System.out.print("Case #"+n1+++": ");
         for(i=0;d[i]!='\0';i++)
            System.out.print(d[i]);
         System.out.println();
        */ 
         t--;
      }
      //writer.println(""+n);
      writer.close();
   }
}
