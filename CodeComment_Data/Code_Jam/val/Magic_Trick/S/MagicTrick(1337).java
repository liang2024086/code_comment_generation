package methodEmbedding.Magic_Trick.S.LYD260;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class MagicTrick {
	public static void main(String args[]) throws IOException
	{
			   int[] valuessecondtime = new int[4];
			   int[] valuesfirsttime = new int[4];
			   File infile = new File("input/A-small-attempt3.in");
			   File outfile = new File("output/A-small-attempt3.out");
		       BufferedWriter output = new BufferedWriter(new FileWriter(outfile));
			   Scanner scanner = new Scanner(infile);
			   int noofTestcases=Integer.parseInt(scanner.next());
			   for(int m=0;m<noofTestcases;m++)
			   {
				   int firstrowselection =Integer.parseInt(scanner.next());
				   
				   for(int j=0;j<4;j++)
				   {
					   
						   for(int k=0;k<4;k++)
						   {
							   if(j==firstrowselection-1)
							   {
							   valuesfirsttime[k]=Integer.parseInt(scanner.next());
							   //System.out.println(valuesfirsttime[k]);
							   }
							   else
							   {
								   scanner.next();
							   }
						   }
					   }
				   int secondrowselection =Integer.parseInt(scanner.next());
				   
				   for(int j=0;j<4;j++)
				   {
					   
						   for(int k=0;k<4;k++)
						   {
							   if(j==secondrowselection-1)
							   {
							   valuessecondtime[k]=Integer.parseInt(scanner.next());
							//   System.out.println(valuessecondtime[k]);
							   }
							   else
							   {
								   scanner.next();
							   }
						   }
					   }
					 
			  
			  
			   ArrayList myList = new ArrayList();
			 
			   for(int j=0;j<4;j++)
			   {
				   for(int k=0;k<4;k++)
				   {
				  
					   	if(valuesfirsttime[j]==valuessecondtime[k])
					   	{
					   		myList.add(valuesfirsttime[j]);
					   		
				 
					   	}
				   }
			   }
			  if(myList.size()==1)
			   {
				   output.write("Case #"+(m+1)+": "+myList.get(0));
				   output.newLine();
			   }
			  	else if(myList.size()>1)
			   {
				   output.write("Case #"+(m+1)+": Bad magician!");
				   output.newLine();
			   }
			  	else if(myList.size()==0)
			   {
				   output.write("Case #"+(m+1)+": Volunteer cheated!");
				   output.newLine();
			   }
			  
			  
			   }

			   scanner.close();
			   output.close();
	

	}

}
