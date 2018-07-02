package methodEmbedding.Standing_Ovation.S.LYD1517;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Audience {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//Using scanner
				//Scanner sc=new Scanner(new FileReader("P:/test.txt"));
				
				//Print the answer
				 PrintWriter pw = new PrintWriter(new File("P:/output2.in"));
	
				 //using buffered reader
				// InputStream is = null; 
			     // InputStreamReader isr = null;
			     BufferedReader br =new BufferedReader(new FileReader("P:/test.in"));

			     
					
					//Initialisation
					int T,i=1,j=0,sum=0,smax;
					String s;
					int frnds = 0;
					int[] al;
					
					T=Integer.parseInt(br.readLine());
				
				
					while(i<=T) // checks for all test cases
					{
						s=br.readLine();
						
						
						String[] str=s.trim().split("\\s+");
						 smax=Integer.parseInt(str[0]);
						al=new int[smax+1]; //takes the arraylist
						
						String[] str1=str[1].trim().split("(?<=.)");
						
					

						
						                              while(j<(smax+1)) //inputs the elements
						                                   {
						                            	  al[j]=Integer.parseInt(str1[j]);
							                       
							                             j++;
						                                    }//End of while D>0
					for(j=0;j<smax+1;j++)
					{
						if(al[j]!=0)
						{
							if(j>sum)
							{
								frnds+=(j-sum);
								sum+=frnds;
							}
							
						}
						sum+=al[j];
					}
					pw.println("case #"+i+": "+frnds);
					sum=frnds=j=0;
					
					i++;
					}//end of main while	                              
	pw.close();
	br.close();
	}

	
}
