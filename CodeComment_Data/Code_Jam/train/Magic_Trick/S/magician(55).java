package methodEmbedding.Magic_Trick.S.LYD964;

import java.io.*;
import java.util.*;
public class magician {

	
	public static void main(String[] args) throws Exception {
		String WORK_DIR="C:\\Users\\prishriv.ORADEV\\";
        Scanner sc = new Scanner(new FileReader(WORK_DIR + "input.txt"));
        PrintWriter pw = new PrintWriter(new FileWriter(WORK_DIR + "output.txt"));
        int T=sc.nextInt();
        int count,ans=0;
        int arr1[][]=new int[4][4];
        int arr2[][]=new int[4][4];
        for (int i=0;i<T;i++)
        {
        	count=0;
        	int a1=sc.nextInt()-1;
        	for(int j=0;j<4;j++)
        	{
        		for(int k=0;k<4;k++)
        		{
            		arr1[j][k]=sc.nextInt();	
        		}
        	}
        	
        	int a2=sc.nextInt()-1;
        	for(int j=0;j<4;j++)
        	{
        		for(int k=0;k<4;k++)
        		{
            		arr2[j][k]=sc.nextInt();	
        		}
        	}
        	
        	for(int j=0;j<4;j++){
        		for(int k=0;k<4;k++){
        			if(arr1[a1][j]==arr2[a2][k])
        			{
        				count++;
        				ans=arr1[a1][j];
        			}
        		}
        	}
        	
        	if(count==1)
        		pw.println("Case #"+(i+1)+": "+ans);
        	if(count==0)
            	pw.println("Case #"+(i+1)+": Volunteer Cheated!");
        	if(count>1)
            	pw.println("Case #"+(i+1)+": Bad Magician!");
            	
            		
       }

    	pw.flush();
    	pw.close();
    	sc.close();
	}
}
