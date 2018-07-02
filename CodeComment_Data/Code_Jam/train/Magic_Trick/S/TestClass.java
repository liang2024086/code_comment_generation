package methodEmbedding.Magic_Trick.S.LYD1257;

/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
 import java.io.BufferedReader;
 import java.io.InputStreamReader;
 */
import java.util.*;
import java.math.BigInteger;

public class TestClass {
	public static void main(String args[]) {
		Scanner readInput = new Scanner(System.in);
        int testCase=readInput.nextInt();
        int i,j,k;
        int rowIndex1,rowIndex2;
        int arr1[][]=new int[4][4],arr2[][]=new int[4][4];
        for(i=0;i<testCase;i++)
        {
        	rowIndex1=readInput.nextInt()-1;
        	for(j=0;j<4;j++)
        	{
        		for(k=0;k<4;k++)
        		{
        			arr1[j][k]=readInput.nextInt();
        		}
        	}
        	
        	
        	
        	rowIndex2=readInput.nextInt()-1;
        	for(j=0;j<4;j++)
        	{
        		for(k=0;k<4;k++)
        		{
        			arr2[j][k]=readInput.nextInt();
        		}
        	}
        	
        	int count=0;
        	int pos=0;
        	for(j=0;j<4;j++)
        	{
        		for(k=0;k<4;k++)
        		{
        	    if(arr1[rowIndex1][j]==arr2[rowIndex2][k])
        	    {
        	    	count++;
        	    	pos=j;
        	    }
        		}
        	}
        	if(count>1)
        	{
        		System.out.println("Case #"+(i+1)+": "+"Bad magician!");
        	}
        	else if(count==0)
        	{
        		System.out.println("Case #"+(i+1)+": "+"Volunteer cheated!");
        	}
        	else
        	{
        		System.out.println("Case #"+(i+1)+": "+arr1[rowIndex1][pos]);
        	}
        	
        }
		
	}
}
