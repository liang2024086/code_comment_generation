package methodEmbedding.Magic_Trick.S.LYD355;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;


public class Code
{
	public static void main(String args[]) throws FileNotFoundException, UnsupportedEncodingException
	{
		URL url = Code.class.getClassLoader().getResource("input.txt");
        String filesPathAndName = url.getPath();
        FileInputStream fin = new FileInputStream(filesPathAndName);
        Scanner scanner = new Scanner(fin);
        PrintWriter writer = new PrintWriter("opNew.txt");
        
        
        while(scanner.hasNextLine())
        {
        	int numberOfTestCases = Integer.parseInt(scanner.nextLine());
        	int n=0;
        	Integer[] check1= new Integer[4];
            Integer[] check2= new Integer[4];
        	while(n<numberOfTestCases)
        	{
        		String firstBoardRow = null;
        		String secondBoardRow = null;
        		int firstInput = Integer.parseInt(scanner.nextLine());
        		for(int i=0;i<4;i++)
        		{
        			int j = i+1;
        			if(j==firstInput)
        			{
        				firstBoardRow =scanner.nextLine();
        			}
        			else
        			{
        				String irrelevantData = scanner.nextLine();
        			}
        			
        		}
        		
        		int secondInput = Integer.parseInt(scanner.nextLine());
        		for(int i=0;i<4;i++)
        		{
        			int j = i+1;
        			if(j==secondInput)
        			{
        				secondBoardRow =scanner.nextLine();
        			}
        			else
        			{
        				String irrelevantData = scanner.nextLine();
        			}
        		}
        		n++;
        		
        		StringTokenizer token1 = new StringTokenizer(firstBoardRow," ");
        		StringTokenizer token2 =  new StringTokenizer(secondBoardRow," ");
        		int k=0, m=0;
        		while(token1.hasMoreTokens())
        		{
        			check1[k]=Integer.parseInt(token1.nextToken());
        			k++;
        		}
        		while(token2.hasMoreTokens())
        		{
        			check2[m]=Integer.parseInt(token2.nextToken());
        			m++;
        		}
        		Arrays.sort(check1);
        		Arrays.sort(check2);
        		int matching=0;
        		int result=0;
        		int i1 = 0, j1 = 0;
        		  while(i1 < check1.length && j1 < check2.length)
        		  {
        		    if(check1[i1] < check2[j1])
        		      i1++;
        		    else if(check2[j1] < check1[i1])
        		      j1++;
        		    else /* if arr1[i] == arr2[j] */
        		    {
        		    	matching++;
        		    	result=check2[j1++];
        		        i1++;
        		    }
        		  }
        		 
        		  if(matching==1)
        		  {
        			  writer.println("Case #"+n+": "+result);
        			  System.out.println("Case #"+n+": "+result);
        		  }
        		  else if(matching>1)
        		  {
        			  writer.println("Case #"+n+": "+"Bad magician!");
        			  System.out.println("Case #"+n+": "+"Bad magician!");
        		  }
        		  else if(matching==0)
        		  {
        			  writer.println("Case #"+n+": "+"Volunteer cheated!");
        			  
        			  System.out.println("Case #"+n+": "+"Volunteer cheated!");
        		  }
        			
        		
        		
        	}
        	
        	
        }
   
        
        
        writer.close();
        
	
	 }
}
