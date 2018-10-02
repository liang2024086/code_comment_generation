package methodEmbedding.Counting_Sheep.S.LYD638;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author NIRAJ
 */
public class CodeJam {

   public static void main(String[] args) throws IOException {
	int n;
        int n1;
        int sleep=0;
        int t;
        int mul=2;
        int ext;
        int check1[]={10,10,10,10,10,10,10,10,10,10};
      
        int z= 0;
      // Scanner sc = new Scanner(System.in);
     //  t=sc.nextInt();
     DataInputStream in=new DataInputStream(System.in);
     t=Integer.parseInt(in.readLine());
       String ans[]=new String[t];
       
       for(int i=1;i<=t;++i)
                {
                    // n=sc.nextInt();
                    n=Integer.parseInt(in.readLine()); 
                    n1=n;
                     
                while(mul<=1001)
                {
                   
                while (n1 > 0) 
               {
                ext=n1%10;
             
               check1[ext]=ext;
                
                n1 = n1 / 10;
               
                }
                
               
                
                for(int k=0;k<10;k++)
                {
                    for(int q=0;q<10;q++)
                {
                if(check1[k]==q)
                {
                sleep++;
                }
                }
                }
                
                if(sleep==10)
                {
                    ans[z++]=String.valueOf((n*(mul-1))); 
                     break;
                }
                else
                {
                sleep=0;
                }
                
               
                if(mul>1000)
                {
                    ans[z++]="INSOMNIA";
                    break;
                } 
                
                n1=n*mul;
                mul++;
                
                
                }
                
                
                
               
         n1=0;
         sleep=0;
    
         mul=2;
        ext=0;
         for(int k=0;k<10;k++)
                {
        check1[k]=10;
                }
               }
                
                for(int i=0;i<t;++i)
               	System.out.println("Case #"+(i+1)+": "+ans[i]);
	}
   
    
}
