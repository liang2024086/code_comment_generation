package methodEmbedding.Standing_Ovation.S.LYD264;


import java.util.*;
import java.io.*;


public class CopyOfabc {
	static int temp3;
	
	public static void main (String args[]) throws Exception
	{
		List<Integer> list = new ArrayList<Integer>();
		int maxentries, entries,i=1,j=1;
		String input;
		int total=0;
		int maxshyness;
		String[] words;
		String shyness1[]=new String[10];
		int shyness2[]= new int[10];
		int addition=0,present=0;
		
		
		
		String scan;
        FileReader file = new FileReader("/home/prakash/workspace/googlecodejam/src/googlecodejam/abc.txt");
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("/home/prakash/workspace/googlecodejam/src/googlecodejam/output.txt"));
 
        BufferedReader br = new BufferedReader(file);
        scan=br.readLine();
        maxentries=Integer.parseInt(scan);
       // maxentries=3;
        while (i<=maxentries) {
        	
        	 scan=br.readLine();
        	words = scan.split(" ");  
        	maxshyness =Integer.parseInt(words[0]);
        	present=0;
        	addition=0;
        
        	
        	for (j=0;j<=maxshyness;j++)  
        	{  
        		shyness2[j]=Integer.parseInt(words[1].charAt(j)+"");
        		if(j==0)
        		{
        			present=present+shyness2[j];
        		}
        		else
        		{
        			if(shyness2[j]==0)
        			{
        				
        			}
        		    else if (j>present)
        			{
        				addition=addition+j-present;
        				present=shyness2[j]+j;
        			}
        			else 
        			{
        				present=present+shyness2[j];
        			}
        		}
        		
        		
        	}  
        	  if(i>=2)
              {
                bw.newLine();
          	 
                
              }
              
        	 bw.write("Case #"+i+": "+addition);
        	 i++;
       }

        
            
        br.close();
        bw.close();
		
		
	}
	
}
