package methodEmbedding.Magic_Trick.S.LYD745;

import java.util.*;

import java.io.*;

public class Magician {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
	        // TODO Auto-generated method stub
	        Scanner input = new Scanner (new File("src/A-small-attempt1.in"));
	        int m = 4;
	        int n = 4;
	        int key;
	        String s = new String();
	        int count = 0;
	        int[][] a = new int [m][n];
	        int[] b = new int [4];
	        while (input.hasNext()){
	        	
	        	key = input.nextInt();
	        	
	        	for(int k=1;k<=2*key;k++)
	        	{
	        		int r1 = input.nextInt();
	        		
	        		for (int i=0;i<m;i++)
	        		{
	        			for (int j=0;j<n;j++)
	        			{
	        				a[i][j]= input.nextInt();
	        				
	        				if(i==(r1-1)&&count==0)
	        				{
	        					b[j] = a[i][j];
	        				}
	        				
	        			}  
	        		}
	        		
	        		count++;
	        		if(count==2)
	        		{
	        			int test = 0;
	        			for(int i=0;i<m;i++)
	        			{
	        				for(int j=0;j<n;j++)
	        				{
	        					if(b[i]==a[r1-1][j])
	        					{
	        						test++;
	        						b[0] = b[i];
	        					}
	        				}
	        			}
	        			if(test==1)
	        				s = "" + b[0];
	        			else if(test==0)
	        				s = "Volunteer cheated!";
	        			else if(test>1)
	        				s = "Bad magician!";
	        			try{
	        				 FileWriter fstream = new FileWriter("src/out.txt",true);
	        				 BufferedWriter out = new BufferedWriter(fstream);
	        				 out.write("Case #");
	        				 out.write("" + k/2);
	        				 out.write(": ");
	        				 out.write(s);
	        				 out.newLine();
	        				 out.close();
	        				 }catch (Exception e){
	        				  System.err.println("Error: " + e.getMessage());
	        				 }
	        			count = 0;
	        				
	        		}
	        		
	        	
	        }
		

	}

	}
}
