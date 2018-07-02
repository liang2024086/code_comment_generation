package methodEmbedding.Standing_Ovation.S.LYD458;

import java.util.*;
import java.io.*;
class CodeJam
{
        
        public static void main(String args[]) throws Exception
        {           
        int sum=0,k=1,count = 0,n1,n2;
        char c;
        
        Scanner s1 = new Scanner(new FileReader("A-small-attempt3.in"));
	PrintWriter pw = new PrintWriter(new FileWriter("Asmall3.out"));
	
	
		
	int t = s1.nextInt();
        
        
        
                 while(k<=t)
                {
                        
                        int smax = s1.nextInt();
                        String s = s1.next();
                        count = 0;
                        sum = 0;
                       for(int i = 0;i<smax;i++)
                       {
                                String c1 = Character.toString(s.charAt(i));
                                String c2 = Character.toString(s.charAt(i+1));
                                n1 = Integer.parseInt(c1);
                                n2 = Integer.parseInt(c2);
                                sum = sum + n1;
                                
                                if((i+1)>sum&&n2!=0)
                                {
                                        count = count+(i+1)-sum;
                                        sum = sum+count;
                                }        
                       } 
                       pw.print("Case #" + k + ": ");
		       pw.print(count);
                       pw.println();
                       k++;
                }
                
        pw.close();
		s1.close();
         }
         
}        
        
